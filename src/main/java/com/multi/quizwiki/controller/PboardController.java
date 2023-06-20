package com.multi.quizwiki.controller;

import java.net.MalformedURLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.multi.quizwiki.common.FileUploadLogicService;
import com.multi.quizwiki.pboard.entity.PboardEntity;
import com.multi.quizwiki.pboard.entity.PboardReplyEntity;
import com.multi.quizwiki.pboard.entity.PrintFileEntity;
import com.multi.quizwiki.pboard.entity.ProblemEntity;
import com.multi.quizwiki.pboard.entity.ProblemLikeEntity;
import com.multi.quizwiki.pboard.entity.SolvEntity;
import com.multi.quizwiki.pboard.service.PboardService;


@Controller
public class PboardController {
	
	PboardService pboardService;
	FileUploadLogicService fileUpload;
	
	public PboardController() {
		
	}
	
	@Autowired
	public PboardController(PboardService pboardService , FileUploadLogicService fileUpload) {
		this.pboardService = pboardService;
		this.fileUpload = fileUpload;
	}

	@GetMapping("/pboard/list")
	public String show_pboard_list(Model model, 
			int cate,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size,
			
			@RequestParam(value="stype", required = false) String stype,
			@RequestParam(value="keyword", required = false) String keyword
			) {
		
		PageRequest pageReq = PageRequest.of(page-1, size, Sort.by("pboardRegDate").descending());
		
		Page<PboardEntity> pboardPage = null;
		
		System.out.println(stype);
		System.out.println(keyword);
		if(stype != null && keyword != null) {
			
			if(stype.equals("title")) {
				pboardPage = pboardService.pboard_findByCateTitleContaining(cate, keyword, pageReq);
			}else if(stype.equals("id")){
				pboardPage = pboardService.pboard_findByCateMemberIdContaining(cate, keyword, pageReq);
			}
			
		}else {
			pboardPage = pboardService.pboard_findByCate(cate, pageReq);
		}
		
		
		int totalPage = pboardPage.getTotalPages();
		
		model.addAttribute("pages",util.CalcUtil.makePagingSeq(page, 5, totalPage));
		model.addAttribute("currentPage",page);
		model.addAttribute("totalPage",totalPage);
		model.addAttribute("pboardList",pboardPage);
		
		Timestamp today = Timestamp.valueOf(LocalDateTime.of(LocalDate.now(), LocalTime.MIN));
		model.addAttribute("today",today);
		return "thymeleaf/pboard/pboard_list";
	}
	
	
	@GetMapping("/pboard/write")
	public String show_pboard_write(Model model) {
		model.addAttribute("problemCateList",pboardService.problemCate_findAll());
		model.addAttribute("state","w");
		return "thymeleaf/pboard/pboard_write";
	}
	
	//write 메소드안에서 파라미터값으로 분기처리해도 되지만 그냥 따로 만듬
	@GetMapping("/pboard/edit")
	public String show_pboard_edit(Model model, int no) {
		model.addAttribute("problemCateList",pboardService.problemCate_findAll());
		model.addAttribute("pboard",pboardService.pboard_findById(no));
		model.addAttribute("state","e");
		return "thymeleaf/pboard/pboard_write";
	}
	
	@GetMapping("/pboard/read")
	public String show_pboard_read(Model model , int no) {
		
		PboardEntity pboard = pboardService.pboard_findById(no);
		model.addAttribute("pboard",pboard);
		model.addAttribute("cate",pboard.getPboardCateId());
		return "thymeleaf/pboard/pboard_read";
	}
	
	@GetMapping("/pboard/cbt")
	public String show_pboard_cbt(int no , Model model) {
		PboardEntity pboard = pboardService.pboard_findById(no);
		model.addAttribute("pboard",pboard);
		
		return "thymeleaf/pboard/cbt";
	}
	 
	
	
	@PostMapping(value="/pboard/write")
	@ResponseBody
	public int pboard_write(
		@RequestPart(name= "sendData") String sendData, 
		@RequestPart(name = "printfile", required = false) List<MultipartFile> printfileList) throws JsonMappingException, JsonProcessingException{
		
		PboardParseStructure pps = new PboardParseStructure(sendData);
		
		pboardService.pboard_insert(pps.getPboard(), pps.getProblemList(), 
				pps.getProblemChoiseList() ,printfileList, pps.getPrintfileArr());
		
		return pps.getPboard().getPboardId();
	}
	
	@PostMapping(value="/pboard/edit")
	@ResponseBody
	public int pboard_edit(
		@RequestPart(name= "sendData") String sendData, 
		@RequestPart(name = "printfile", required = false) List<MultipartFile> printfileList) throws JsonMappingException, JsonProcessingException{

		PboardParseStructure pps = new PboardParseStructure(sendData);
		
		pboardService.pboard_edit(pps.getPboard(), pps.getProblemList(), 
				pps.getProblemChoiseList() ,printfileList, pps.getPrintfileArr());
		
		return pps.getPboard().getPboardId();
	}
	
	private class PboardParseStructure{
		PboardEntity pboard;
		List<ProblemEntity> problemList;
		List<List<String>> problemChoiseList;
		List<Integer> printfileArr;
		
		private PboardParseStructure(String sendData) throws JsonMappingException, JsonProcessingException {
			ObjectMapper mapper = new ObjectMapper();
			Map<String,String> map = mapper.readValue(sendData, Map.class);
			this.pboard =  mapper.convertValue(map.get("pboard"), PboardEntity.class);
			this.problemList = mapper.convertValue(map.get("problem"), new TypeReference<List<ProblemEntity>>() {});
			this.problemChoiseList = mapper.convertValue(map.get("problemChoiseList"), new TypeReference<List<List<String>>>() {});
			this.printfileArr = mapper.convertValue(map.get("printfileArr"), new TypeReference<List<Integer>>() {});
		}
		
		private PboardEntity getPboard() {
			return this.pboard;
		}
		private List<ProblemEntity> getProblemList() {
			return this.problemList;
		}
		private List<List<String>> getProblemChoiseList() {
			return this.problemChoiseList;
		}
		private List<Integer> getPrintfileArr() {
			return this.printfileArr;
		}
		
	}
	
	
	@PostMapping(value="/pboard/reply/write")
	public String pboard_reply_write(PboardReplyEntity pboardReply , int cate) {
		pboardService.reply_insert(pboardReply);
		
		return "redirect:/pboard/read?no="+pboardReply.getPboardId()+"&cate="+cate;
	}
	
	
	@PostMapping(value="/get/pboard")
	@ResponseBody
	public PboardEntity pboard_get(int no) {
		return pboardService.pboard_findById(no);
	}
	
	@RequestMapping("/printfile/find/{problemId}")
	public ResponseEntity<UrlResource> printfile_fild(@PathVariable int problemId) throws MalformedURLException{
		PrintFileEntity printfile = pboardService.printfile_findByProblemId(problemId);
		UrlResource resource = new UrlResource("file:"+fileUpload.getUploadpath(printfile.getPrintfileStore()));
		
		//String encoded = UriUtils.encode(printfile.getPrintfileOrigin(),"UTF-8");
		//String contentType = "attachment; filename=\"" + encoded +"\"";
		
		return ResponseEntity.ok()
				.contentType(MediaType.IMAGE_JPEG)
				.body(resource);
	}
	
	@GetMapping(value="/get/problemlike")
	@ResponseBody
	public JsonNode problem_like_get(int problemId , HttpSession session) throws JsonProcessingException {
		
		String memberId = "test";//세션에서 받아와야함.
		String msg = "false";
		
		ProblemLikeEntity problemLike = pboardService.problemlike_findByMemberIdAndProblemId(memberId, problemId);
		if(problemLike != null) {
			msg = "true";
		}
		return util.CalcUtil.getJsonStringAsResForm(problemLike, msg);
	}
	
	@PostMapping(value="/post/problemlike")
	@ResponseBody
	public JsonNode problem_like_post(int problemId , HttpSession session) throws JsonProcessingException {
		
		String memberId = "test";//세션에서 받아와야함.
		String msg = "false";
		
		ProblemLikeEntity problemLike = pboardService.problemlike_insert(new ProblemLikeEntity(problemId, memberId));
		if(problemLike != null) {
			msg = "true";
		}
		return util.CalcUtil.getJsonStringAsResForm(problemLike, msg);
	}
	
	@PostMapping(value="/post/solv")
	@ResponseBody
	public JsonNode solv_post(@RequestBody List<SolvEntity> solvList , HttpSession session) {
		System.out.println(solvList);
		String memberId = "test";//세션에서 받아와야함.
		String msg = "false";
		
		List<SolvEntity> savedList = pboardService.solv_insertAll(solvList);
		
		if(savedList != null) {
			msg="true";
		}
		
		return util.CalcUtil.getJsonStringAsResForm(savedList, msg);
	}

}
