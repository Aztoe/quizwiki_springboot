package com.multi.quizwiki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.quizwiki.dao.PboardDAO;
import com.multi.quizwiki.dto.PboardDTO;

@Service
public class PboardServiceImpl implements PboardService{

	PboardDAO pboardDao;
	
	public PboardServiceImpl() {
		
	}
	
	@Autowired
	public PboardServiceImpl(PboardDAO pboardDao) {
		this.pboardDao = pboardDao;
	}
	
	@Override
	public int insert(PboardDTO pboard) {
		int result = pboardDao.insert(pboard);
		return result;
	}
	
}
