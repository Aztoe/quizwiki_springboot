package com.multi.quizwiki.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.multi.quizwiki.dto.QboardDTO;
import com.multi.quizwiki.service.QboardService;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;
@Controller
@RequestMapping("quizwiki")
@RequiredArgsConstructor
public class QBoardController {
	QboardService qboardservice;

	@RequestMapping("/qboard/list")
	public String show_qboard_list() {
		return "thymeleaf/qboard/qboard_list";
	}
	
	@GetMapping("/qboard/write")
	public String show_qboard_write() {
		return "thymeleaf/qboard/qboard_write";
	}
	@GetMapping("/freeboard/list")
	public String show_freeboard_list() {
		return "thymeleaf/qboard/freeboard_list	";
	}
	
	@GetMapping("/qboard/read")
	public String show_qboard_read() {
		return "thymeleaf/qboard/qboard_read";
	}
	@PostMapping("/qboard/write.do")
	public String QboardWrite(QboardDTO qboard, Model model) {
			qboardservice.insert(qboard);
			model.addAttribute("qboard", new QboardDTO());
			System.out.println("write.do 실행");
			/*
			 * else { QboardDTO qboard = qboardservice.getQboardDetail(qboard_id); if
			 * (qboard == null) { return "redirect:/qboard/list.do"; }
			 * model.addAttribute("qboard",qboard); }
			 */
		return "qboard/write";
	}
	
	/*
	 * @GetMapping("/qboard/list.do") public String QboardList(Model model) {
	 * List<QboardDTO> qboardList = qboardservice.getBoardList();
	 * model.addAttribute("qboardlist",qboardList); return "qboard/qboard_list"; }
	 */
	
	


}
