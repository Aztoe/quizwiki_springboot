package com.multi.quizwiki.pboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.pboard.entity.ProblemLikeEntity;

public interface ProblemLikeRepository extends JpaRepository<ProblemLikeEntity, Integer>{
	public ProblemLikeEntity findByMemberIdAndProblemId(String memberId, int problemId);
}
