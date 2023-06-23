package com.multi.quizwiki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.multi.quizwiki.email.RegisterMail;


@Controller
public class AccountController {

	@Autowired
	private RegisterMail registerMail; // RegisterMail 클래스의 인스턴스를 주입

	// 이메일 인증 - 회원가입
	@PostMapping("/login/mailConfirm")
	@ResponseBody
	String mailConfirm(@RequestParam("email") String email) throws Exception {

		String code = registerMail.sendSimpleMessage(email);
		System.out.println("인증코드 : " + code);
		return code;
	}
	
	

}
