package com.multi.quizwiki.problem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.problem.entity.ProblemEntity;

public interface ProblemRepository extends JpaRepository<ProblemEntity, Integer>{
	public List<ProblemEntity> findAllByPboardId(int pboardId);
	
	public List<ProblemEntity> findAllByPboardIdAndProblemStatusNot(int pboardId,String status);
}
