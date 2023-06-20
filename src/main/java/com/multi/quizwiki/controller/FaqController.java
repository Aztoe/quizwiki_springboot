package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FaqController {
	@RequestMapping("/use")
	public String use() {
		return "thymeleaf/useinfor/use";
	}
	@RequestMapping("/infor")
	public String infor() {
		return "thymeleaf/useinfor/infor";
	}
	@RequestMapping("/faqt")
	public String faqt() {
		return "thymeleaf/faq/total1";
	}
	@RequestMapping("/total2")
	public String total2() {
		return "thymeleaf/faq/total2";
	}
	@RequestMapping("/total3")
	public String total3() {
		return "thymeleaf/faq/total3";
	}
	@RequestMapping("/usecredit")
	public String usecredit() {
		return "thymeleaf/faq/useCredit";
	}
	@RequestMapping("/contentquestion")
	public String contentquestion() {
		return "thymeleaf/faq/contentQuestion";
	}
	@RequestMapping("/siteuse")
	public String siteuse() {
		return "thymeleaf/faq/siteUse";
	}
	@RequestMapping("/etc")
	public String etc() {
		return "thymeleaf/faq/etc";
	}
	@RequestMapping("/oto")
	public String oto() {
		return "thymeleaf/faq/oneToOne";
	}
	@RequestMapping("/dash")
	public String dash() {
		return "FAQ/dash";
	}
}
