package com.multi.quizwiki.entity.problem;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="problem")
public class ProblemEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String problemId;
	String problemCateId;
	String pboardId;
	String problemType;
	String problemContent;
	int problemIndex;
	String problemAnswer;
	String problemPrint;
	String problemDesc;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "problemId")
	private List<ProblemChoiseEntity> problemChoiseList = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "problemId")
	private List<PrintFileEntity> problemFileList = new ArrayList<>();
}
