package com.multi.quizwiki.pboard.dto;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Alias("problem")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDTO {
	private int problem_id;
	private int pboard_id;
	private String type;
	private String content;
	private int index;
	private String answer;
	private String print;
	private String desc;
	private Timestamp editdate;
	
	
	//insert 등록용
	public ProblemDTO(int pboard_id, String type, String content, int index, String answer, String print, String desc,
			Timestamp editdate) {
		this.pboard_id = pboard_id;
		this.type = type;
		this.content = content;
		this.index = index;
		this.answer = answer;
		this.print = print;
		this.desc = desc;
		this.editdate = editdate;
	}
	
	
}
