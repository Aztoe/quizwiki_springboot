package com.multi.quizwiki.email;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletResponse;

import com.multi.quizwiki.dto.MemberDTO;

public interface MailServiceInter {
	// 회원가입 메일 내용 작성
    MimeMessage createMessage(String to) throws MessagingException, UnsupportedEncodingException;
    // 랜덤 인증 코드 전송
    String createKey();
    // 회원가입 메일 발송
    String sendSimpleMessage(String to) throws Exception;

   
    
}
