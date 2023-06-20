package com.multi.quizwiki.qboard.dto;

import java.sql.Timestamp;

import com.multi.quizwiki.qboard.entity.QboardEntity;

import lombok.Getter;

@Getter
public class QboardResponseDTO {
	
	private Long qboard_id;
	private String member_id;

	private String title; // //게시물 제목
	private String content; //게시물내용 text
	private Timestamp regdate; // 게시물등록시간 datetime
	private Timestamp editDate;
	private int comment_Count;
	private int like_Count;
	private int view_Count;
	
	public QboardResponseDTO(QboardEntity entity) {
		this.qboard_id = entity.getQboardId();
		this.member_id = entity.getMemberId();
		this.title = entity.getTitle();
		this.content = entity.getContent();
		this.regdate = entity.getRegDate();
		this.editDate = entity.getEditDate();
		this.comment_Count = entity.getComment_Count();
		this.like_Count = entity.getLike_Count();
		this.view_Count = entity.getView_Count();
	}
	
}
