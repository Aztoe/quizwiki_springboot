package com.multi.quizwiki.service;

import com.multi.quizwiki.entity.pboard.PboardEntity;
import com.multi.quizwiki.entity.problem.ProblemChoiseEntity;
import com.multi.quizwiki.entity.problem.ProblemEntity;

public interface PboardService {
	public void insert(PboardEntity pboard,ProblemEntity problem, ProblemChoiseEntity problemChoise);
}
