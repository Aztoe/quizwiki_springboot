package com.multi.quizwiki.entity.pboard;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "pboard_reply")
public class PboardReplyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pboardReplyId;
	String memberId;
	int pboardId;
	String content;
	@UpdateTimestamp 
	Timestamp editDate;
	
	
	public PboardReplyEntity(String memberId, int pboardId, String content) {
		this.memberId = memberId;
		this.pboardId = pboardId;
		this.content = content;
	}
	
	
}
