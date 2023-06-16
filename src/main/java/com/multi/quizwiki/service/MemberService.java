package com.multi.quizwiki.service;

import com.multi.quizwiki.dto.MemberDTO;

public interface MemberService {
	
	//로그인
	MemberDTO login(MemberDTO loginUser);
	
	//아이디 중복
	public int idCheck(MemberDTO member_id) throws Exception;
	
	//sms
	public void certifiedPhoneNumber(String telnum, String numStr);
	
}
