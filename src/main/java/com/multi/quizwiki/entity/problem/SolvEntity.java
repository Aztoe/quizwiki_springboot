package com.multi.quizwiki.entity.problem;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "solv")
public class SolvEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int solvId;
	int problemId;
	String memberId;
	String answer;
	@UpdateTimestamp 
	Timestamp editDate;
	
	
	public SolvEntity(int problemId, String memberId, String answer) {
		this.problemId = problemId;
		this.memberId = memberId;
		this.answer = answer;
	}
	
	
	
}
