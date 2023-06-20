package com.multi.quizwiki.pboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.pboard.entity.ProblemCateEntity;

public interface ProblemCateRepository extends JpaRepository<ProblemCateEntity, Integer>{
	
}
