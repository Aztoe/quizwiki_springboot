package com.multi.quizwiki.dao;


import com.multi.quizwiki.dto.PboardDTO;
import com.multi.quizwiki.entity.pboard.PboardEntity;
import com.multi.quizwiki.entity.problem.ProblemChoiseEntity;
import com.multi.quizwiki.entity.problem.ProblemEntity;

public interface PboardDAO {

	public int insert(PboardDTO pboard);
	

	public void pboard_insert(PboardEntity pboard);
	public void problem_insert(ProblemEntity problem);
	public void problemChoise_insert(ProblemChoiseEntity problemChoise);

}
