package com.multi.quizwiki.entity.problem;

import java.sql.Timestamp;

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
@Table(name="problem")
public class ProblemEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int problemId;
	int problemCateId;
	int pboardId;
	String type;
	String content;
	int index;
	String answer;
	String print;
	String desc;
	

	public ProblemEntity(int problemCateId, int pboardId, String type, String content, int index, String answer,
			String print, String desc) {
		this.problemCateId = problemCateId;
		this.pboardId = pboardId;
		this.type = type;
		this.content = content;
		this.index = index;
		this.answer = answer;
		this.print = print;
		this.desc = desc;
	}

	public ProblemEntity(String desc) {
		this.desc = desc;
	}
	
	
	
}
