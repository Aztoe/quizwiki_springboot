package com.multi.quizwiki.dto;



import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("solv")
public class SolvDTO {
	private String solv_id;
	private String problem_id;
	private String solv_anser;
	private String solv_edit_date;
}

