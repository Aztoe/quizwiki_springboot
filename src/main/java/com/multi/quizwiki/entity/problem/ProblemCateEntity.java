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
@Table(name="problem_cate")
public class ProblemCateEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int problemCateId;
	int subjectId;
	String name;
	String desc;
	String grade;
	
	public ProblemCateEntity(int subjectId, String name, String desc, String grade) {
		this.subjectId = subjectId;
		this.name = name;
		this.desc = desc;
		this.grade = grade;
	}

	
}


