package com.multi.quizwiki.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("email")
public class EmailRequestDTO {

	private String to;
	private String subject;
	private String text;

}
