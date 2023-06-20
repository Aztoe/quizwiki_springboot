package com.multi.quizwiki.pboard.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pboard")
public class PboardEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pboardId;
	String memberId;
	int pboardCateId;
	String pboardTitle;
	String pboardContent;
	@CreationTimestamp
	Timestamp pboardRegDate;
	@UpdateTimestamp 
	Timestamp pboardEditDate;
	int pboardShowCount;
	int pboardLikeCount;
	String pboardStatus;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "pboardId")
	@Where(clause = "problem_status = 'r'")
	private List<ProblemEntity> problemList = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "pboardId")
	private List<PboardReplyEntity> pboardReplyList = new ArrayList<>();
}
