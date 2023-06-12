package com.multi.quizwiki.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.multi.quizwiki.entity.pboard.PboardEntity;
import com.multi.quizwiki.entity.problem.ProblemChoiseEntity;
import com.multi.quizwiki.entity.problem.ProblemEntity;

@Repository
public class PboardDAOImpl implements PboardDAO{
	
	EntityManager em;
	
	public PboardDAOImpl() {
		
	}
	
	public PboardDAOImpl(EntityManager em) {
		this.em = em;
	}
	
	
	

	@Override
	public void pboard_insert(PboardEntity pboard) {
		em.persist(pboard);
	}

	@Override
	public void problem_insert(ProblemEntity problem) {
		em.persist(problem);
	}

	@Override
	public void problemChoise_insert(ProblemChoiseEntity problemChoise) {
		em.persist(problemChoise);
	}
	
}
