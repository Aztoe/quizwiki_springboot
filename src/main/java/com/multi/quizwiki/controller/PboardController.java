package com.multi.quizwiki.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.multi.quizwiki.entity.pboard.PboardEntity;
import com.multi.quizwiki.entity.problem.ProblemEntity;
import com.multi.quizwiki.service.PboardService;


@Controller
public class PboardController {
	
	PboardService pboardService;
	
	
	public PboardController() {
		
	}
	
	@Autowired
	public PboardController(PboardService pboardService) {
		this.pboardService = pboardService;
	}
	

	@RequestMapping("/pboard/list")
	public String show_pboard_list() {
		return "thymeleaf/pboard/pboard_list";
	}
	@GetMapping("/pboard/write")
	public String show_pboard_write() {
		return "thymeleaf/pboard/pboard_write";
	}
	
	@GetMapping("/pboard/read")
	public String show_pboard_read() {
		return "thymeleaf/pboard/pboard_read";
	}
	
	@GetMapping("/cbt")
	public String show_cbt() {
		return "thymeleaf/pboard/cbt";
	}
	
	
	
	@PostMapping(value="/pboard/write")
	@ResponseBody
	public String pboard_write(
		@RequestPart(name= "sendData") String sendData, 
		@RequestPart(name = "printfile", required = false) List<MultipartFile> printfileList) throws JsonMappingException, JsonProcessingException{
		
		ObjectMapper mapper = new ObjectMapper();
		Map<String,String> map = mapper.readValue(sendData, Map.class);
		
		PboardEntity pboard = mapper.convertValue(map.get("pboard"), PboardEntity.class);
		List<ProblemEntity> problemList = mapper.convertValue(map.get("problem"), new TypeReference<List<ProblemEntity>>() {});
		
		
		System.out.println(pboard);
		System.out.println(problemList.size());
		System.out.println(printfileList.size());
		
		return "dd";
	}
}
