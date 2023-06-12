package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MypageController {
	@RequestMapping("/mypage/mycontentroom")
	public String mycontentroom() {
		return "thymeleaf/mypage/mycontentroom";
	}
	@RequestMapping("/mypage/ask")
	public String ask() {
		return "thymeleaf/mypage/ask";
	}
	@RequestMapping("/mypage/myproblem")
	public String cash() {
		return "thymeleaf/mypage/myproblem";
	}
	@RequestMapping("/mypage/modify")
	public String modify() {
		return "thymeleaf/mypage/modify";
	}
	@RequestMapping("/mypage/myquestion")
	public String myquestion() {
		return "thymeleaf/mypage/myquestion";
	}
	@RequestMapping("/mypage/note")
	public String payment() {
		return "thymeleaf/mypage/note";
	}
	@RequestMapping("/mypage/point")
	public String point() {
		return "thymeleaf/mypage/point";
	}
	@RequestMapping("/mypage/suggest")
	public String suggest() {
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
	@RequestMapping("/mypage/oto2")
	public String oto() {
		return "thymeleaf/mypage/oto";
	}
	@RequestMapping("/mypage/wronganser")
	public String wronganser() {
		return "thymeleaf/mypage/wronganser";
	}
}
