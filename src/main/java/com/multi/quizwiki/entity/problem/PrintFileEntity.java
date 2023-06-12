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
@Table(name = "print_file")
public class PrintFileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int printFileId;
	int problemId;
	String origin;
	String store;
	
	
	public PrintFileEntity(int problemId, String origin, String store) {
		this.problemId = problemId;
		this.origin = origin;
		this.store = store;
	}
	
	
}
