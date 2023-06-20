package com.multi.quizwiki.pboard.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "solv")
public class SolvEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int solvId;
	int problemId;
	String memberId;
	String solvAnswer;
	@UpdateTimestamp 
	Timestamp solvEditDate;
	boolean solvRight;
	
	
	public SolvEntity(int problemId, String memberId, String solvAnswer, boolean solvRight) {
		this.problemId = problemId;
		this.memberId = memberId;
		this.solvAnswer = solvAnswer;
		this.solvRight = solvRight;
	}
	
	
	
}
