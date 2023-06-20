package com.multi.quizwiki.qboard.dto;

import java.sql.Timestamp;

import com.multi.quizwiki.qboard.entity.QboardEntity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class QboardRequestDTO {
	private Long qboard_id;
	private String member_id;

	private String title; // //게시물 제목
	private String content; //게시물내용 text
	private Timestamp regdate; // 게시물등록시간 datetime
	private Timestamp editDate;
	int comment_Count;
	int like_Count;
	int view_Count;
	
	public QboardEntity toEntity() {
		return QboardEntity.builder()
				.title(title)
				.content(content)
				.memberId(member_id)
				.build();
				
	}
	
}
