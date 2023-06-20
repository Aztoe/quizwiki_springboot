package com.multi.quizwiki.pboard.entity;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pboard_reply")
public class PboardReplyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pboardReplyId;
	String memberId;
	int pboardId;
	String pboardReplyContent;
	@UpdateTimestamp 
	Timestamp pboardReplyEditDate;
}
