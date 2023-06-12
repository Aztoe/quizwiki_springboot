package com.multi.quizwiki.entity.pboard;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "pboard")
public class PboardEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String memberId;
	int pboardCate;
	String title;
	String content;
	@CreationTimestamp
	Timestamp regDate;
	@UpdateTimestamp 
	Timestamp editDate;
	int showCount;
	int likeCount;
	String status;
	

	public PboardEntity(String memberId, int pboardCate, String title, String content) {
		this.memberId = memberId;
		this.pboardCate = pboardCate;
		this.title = title;
		this.content = content;
	}
	
	
}
