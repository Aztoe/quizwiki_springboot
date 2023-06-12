package com.multi.quizwiki.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.quizwiki.dao.PboardDAO;
import com.multi.quizwiki.entity.pboard.PboardEntity;
import com.multi.quizwiki.entity.problem.ProblemChoiseEntity;
import com.multi.quizwiki.entity.problem.ProblemEntity;

@Service
@Transactional
public class PboardServiceImpl implements PboardService{

	PboardDAO pboardDao;
	
	public PboardServiceImpl() {
		
	}
	
	@Autowired
	public PboardServiceImpl(PboardDAO pboardDao) {
		this.pboardDao = pboardDao;
	}
	
	@Override
	public void insert(PboardEntity pboard,ProblemEntity problem, ProblemChoiseEntity problemChoise) {
		pboardDao.pboard_insert(pboard);
		pboardDao.problem_insert(problem);
		pboardDao.problemChoise_insert(problemChoise);
	}
	
}
