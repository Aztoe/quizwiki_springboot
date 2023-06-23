package com.multi.quizwiki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.quizwiki.dto.InquryDTO;
import com.multi.quizwiki.dto.InquryReplyDTO;
import com.multi.quizwiki.dto.NoteDTO;
import com.multi.quizwiki.dto.PboardDTO;
import com.multi.quizwiki.dto.PointDTO;
import com.multi.quizwiki.mypage.MypageService;
import com.multi.quizwiki.qboard.dto.QboardDTO;

@Controller
public class MypageController {
	MypageService service;

	public MypageController() {

	}

	@Autowired
	public MypageController(MypageService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/mypage/mycontentroom")
	public String mycontentroom() {
		return "thymeleaf/mypage/mycontentroom";
	}

	// 내문제리스트, 갯수
	@RequestMapping("/mypage/myproblem")
	public String cash(String member_id, Model model) {
		List<PboardDTO> pboardlist = service.pboardread(member_id);
		String pboardcount = service.pboardcount(member_id);
		model.addAttribute("pboardlist", pboardlist);
		model.addAttribute("pboardcount", pboardcount);
		return "thymeleaf/mypage/myproblem";
	}
	
	// 마이페이지 - 회원 정보 수정 뷰
	@RequestMapping("/mypage/modify")
	public String modify() {
		return "thymeleaf/mypage/modify";
	}

	// 내질문
	@RequestMapping("/mypage/myquestion")
	public String myquestion(String member_id, Model model) {
		List<QboardDTO> qboardlist = service.qboardread(member_id);
		model.addAttribute("qboardlist", qboardlist);
		System.out.println(qboardlist);
		return "thymeleaf/mypage/myquestion";
	}

	@RequestMapping("/mypage/note")
	public String payment(String member_id, Model model) {
		List<NoteDTO> notelist = service.noteread(member_id);
		String notecount = service.notecount(member_id);
		model.addAttribute("notelist", notelist);
		model.addAttribute("notecount", notecount);
		return "thymeleaf/mypage/note";
	}

	// 포인트 내역보기
	@RequestMapping("/mypage/point")
	public String point(String member_id, Model model) {
		List<PointDTO> pointlist = service.pointread(member_id);
		String pointtotal = service.pointtotal(member_id);
		model.addAttribute("pointlist", pointlist);
		model.addAttribute("pointtotal", pointtotal);
		return "thymeleaf/mypage/point";
	}

	// 문의 사항
	@RequestMapping("/mypage/ask")
	public String ask(String member_id, String inqury_category, Model model) {
		List<InquryDTO> inqurylist = service.inquryread(member_id, inqury_category);
		model.addAttribute("inqurylist", inqurylist);
		System.out.println("컨트롤러" + inqurylist);
		return "thymeleaf/mypage/ask";
	}

	@RequestMapping("/mypage/suggest")
	public String suggest(String member_id, String inqury_category, Model model) {
		List<InquryDTO> inqurylist = service.inquryread(member_id, inqury_category);
		model.addAttribute("inqurylist", inqurylist);
		return "thymeleaf/mypage/suggest";
	}

	@RequestMapping("/mypage/wronganserWrite")
	public String wronganserWrite() {
		return "thymeleaf/mypage/wronganserWrite";
	}

	@RequestMapping("/mypage/otoWrite")
	public String otoWrite() {
		return "thymeleaf/mypage/otoWrite";
	}

	@RequestMapping("/mypage/oto2") // 1:1문의내역 자세히보기, 답변
	public String oto2(String inqury_id, Model model) {
		InquryDTO oto = service.inqurydetail(inqury_id);
		InquryReplyDTO inquryreply = service.inquryreply(inqury_id);
		model.addAttribute("oto", oto);
		model.addAttribute("inquryreply", inquryreply);
		return "thymeleaf/mypage/oto";
	}

	@RequestMapping("/mypage/wronganser") // 오답신고 자세히보기,답변
	public String wronganser(String inqury_id, Model model) {
		InquryDTO wronganser = service.inqurydetail(inqury_id);
		InquryReplyDTO inquryreply = service.inquryreply(inqury_id);
		model.addAttribute("wronganser", wronganser);
		model.addAttribute("inquryreply", inquryreply);
		return "thymeleaf/mypage/wronganser";
	}
}
