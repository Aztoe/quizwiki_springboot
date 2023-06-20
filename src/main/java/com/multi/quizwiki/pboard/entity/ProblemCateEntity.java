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
@Table(name="problem_cate")
public class ProblemCateEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int problemCateId;
	int subjectId;
	String problemCateName;
	String problemCateDesc;
	String problemCateType;
	
	public ProblemCateEntity(int subjectId, String problemCateName, String problemCateDesc, String problemCateType) {
		this.subjectId = subjectId;
		this.problemCateName = problemCateName;
		this.problemCateDesc = problemCateDesc;
		this.problemCateType = problemCateType;
	}

	
}


