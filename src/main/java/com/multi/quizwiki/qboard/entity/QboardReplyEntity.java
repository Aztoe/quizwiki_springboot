package com.multi.quizwiki.qboard.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="qboard_reply")
public class QboardReplyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String qboardReplyId;
	String memberId;
	long qboardId;
	String qboardReplyContent;
	@UpdateTimestamp
	Timestamp qboardReplyEditDate;
	
}
