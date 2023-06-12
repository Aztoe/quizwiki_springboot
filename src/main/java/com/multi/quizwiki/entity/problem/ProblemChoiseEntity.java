package com.multi.quizwiki.entity.problem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "problem_choise")
public class ProblemChoiseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int problemChoiseId;
	int problemId;
	String index;
	String content;
	
	public ProblemChoiseEntity(int problemId, String index, String content) {
		this.problemId = problemId;
		this.index = index;
		this.content = content;
	}
	
	
}
