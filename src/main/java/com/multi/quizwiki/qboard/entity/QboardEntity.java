package com.multi.quizwiki.qboard.entity;

import java.sql.Timestamp;
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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name ="qboard")

public class QboardEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long qboardId;
	private String memberId;
	private String title;
	private String content;
	@CreationTimestamp
	private Timestamp regDate;
	@UpdateTimestamp
	private Timestamp editDate;
	private int comment_Count;
	private int like_Count;
	private int view_Count;
	private char deleteYn; //삭제여부
	
	
	@Builder
	public QboardEntity(Long qboardId, String memberId, String title, String content) {
		
		this.qboardId = qboardId;
		this.memberId = memberId;
		this.title = title;
		this.content = content;
		
		
	}
	//게시글 수정
	public void update(String memberId, String title, String content, Timestamp editDate) {
		
		this.memberId = memberId;
		this.title = title;
		this.content = content;
		this.editDate = editDate;
	}
	//게시글 삭제
	public void delete() {
		this.deleteYn ='Y';
		
	}
	
	public  void increaseView_Count() {
		this.view_Count++; 
	}
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "qboardId")
	private List<QboardReplyEntity> qboardReplyList = new ArrayList<>();
}
