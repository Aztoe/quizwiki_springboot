package com.multi.quizwiki.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.quizwiki.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	SqlSession sqlSession;
	
	
	@Autowired
	public MemberDAOImpl(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}

	public MemberDAOImpl() {
		
	}

	// 로그인
	@Override
	public MemberDTO login(MemberDTO loginUser) {
		 MemberDTO user = sqlSession.selectOne("com.multi.quizwiki.member.login", loginUser);
		 System.out.println("loginUser"+loginUser);
		 System.out.println("user"+user);
		return user;
	}


	// 아이디 중복 체크
	@Override
	public int idCheck(MemberDTO member_id) {
		int result = sqlSession.selectOne("com.multi.quizwiki.member.idcheck", member_id);
		return result;
	}

	@Override
	public void certifiedPhone(String telnum) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void certifiedNum(String numStr) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
