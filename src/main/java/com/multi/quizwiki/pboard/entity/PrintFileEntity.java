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
@Table(name = "print_file")
public class PrintFileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int printFileId;
	int problemId;
	String printfileOrigin;
	String printfileStore;
	
	
	public PrintFileEntity(int problemId, String printfileOrigin, String printfileStore) {
		this.problemId = problemId;
		this.printfileOrigin = printfileOrigin;
		this.printfileStore = printfileStore;
	}
	
	
}
