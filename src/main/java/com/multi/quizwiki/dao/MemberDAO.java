package com.multi.quizwiki.dao;

import com.multi.quizwiki.dto.MemberDTO;

public interface MemberDAO {
	
	// 로그인
	MemberDTO login(MemberDTO loginUser);
	
	// 아이디 중복 체크
	int idCheck(MemberDTO member_id) throws Exception;
	
	// 비밀번호 체크
	
	
	
	
	
	public void certifiedPhone(String telnum);
	public void certifiedNum(String numStr);
}
