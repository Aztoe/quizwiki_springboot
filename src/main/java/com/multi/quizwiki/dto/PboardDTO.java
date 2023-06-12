package com.multi.quizwiki.dto;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("pboard")
@Data
public class PboardDTO {
	private int pboard_id; //문제게시물ID int
	private String member_id; //FK 회원아이디 varchar(20)
	private int scate_id; // FK 문제분류ID int
	private String content; //게시물내용 text
	private Timestamp regdate; // 게시물등록시간 datetime
	private Timestamp editdate; // 게시물 수정시간 datetime
	private int show_count; // 조회수 int
	private int like_count; // 좋아요수 int
	private String status; //게시물상태flag varchar(1)
	
	
	private List<ProblemDTO> plist; //문제리스트 list
	
	//insert용 (문제게시물 작성)
	public PboardDTO(String member_id, int scate_id, String content, Timestamp regdate) {
		this.member_id = member_id;
		this.scate_id = scate_id;
		this.content = content;
		this.regdate = regdate;
	}

	//edit용 (문제게시물 수정)
	public PboardDTO(int scate_id, Timestamp editdate, String status) {
		this.scate_id = scate_id;
		this.editdate = editdate;
		this.status = status;
	}

}
