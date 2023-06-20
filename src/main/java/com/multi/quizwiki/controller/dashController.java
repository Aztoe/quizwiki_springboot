package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dashController {
	@RequestMapping("/dash1")
	public String dash1() {
		return "thymeleaf/dash/index";
	}
}
