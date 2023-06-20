package com.multi.quizwiki.qboard.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import com.multi.quizwiki.qboard.entity.QboardEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Alias("qboard")
@AllArgsConstructor
@NoArgsConstructor
public class QboardDTO {
	private Long qboard_id;
	private String member_id;
	private String category;
	private String title; // //게시물 제목
	private String content; //게시물내용 text
	private Timestamp regdate; // 게시물등록시간 datetime
	private Timestamp editDate;
	int comment_Count;
	int like_Count;
	int view_Count;
	
	
	
}
	