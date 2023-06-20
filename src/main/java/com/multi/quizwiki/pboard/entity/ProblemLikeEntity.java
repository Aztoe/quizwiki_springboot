package com.multi.quizwiki.pboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="problem_like")
public class ProblemLikeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int problemLikeId;
	int problemId;
	String memberId;
	
	public ProblemLikeEntity(int problemId , String memberId) {
		this.problemId = problemId;
		this.memberId = memberId;
	}
}
