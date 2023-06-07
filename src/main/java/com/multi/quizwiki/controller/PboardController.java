package com.multi.quizwiki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.multi.quizwiki.dto.PboardDTO;
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
	

	@GetMapping("/pboard/list")
	public String show_pboard_list() {
		return "thymeleaf/pboard/pboard_list";
	}
	
	@GetMapping("/pboard/write")
	public String show_pboard_write() {
		return "thymeleaf/pboard/pboard_write";
	}
	
	@ResponseBody
	@PostMapping("/pboard/write")
	public String pboard_write(PboardDTO pboard) {
		int result = pboardService.insert(pboard);
		return "";
	}
	
	@GetMapping("/pboard/read")
	public String show_pboard_read() {
		return "thymeleaf/pboard/pboard_read";
	}
	
	@GetMapping("/cbt")
	public String show_cbt() {
		return "thymeleaf/pboard/cbt";
	}
}
