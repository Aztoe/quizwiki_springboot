package com.multi.quizwiki.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.multi.quizwiki.dto.PboardDTO;

@Repository
public class PboardDAOImpl implements PboardDAO{
	
	SqlSession tem;
	
	public PboardDAOImpl() {
		
	}
	
	public PboardDAOImpl(SqlSession tem) {
		this.tem = tem;
	}

	@Override
	public int insert(PboardDTO pboard) {
		int result = 
				tem.insert("com.multi.quizwiki.pboard.insert", pboard);
		return result;
	}
	
}
