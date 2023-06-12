package com.multi.quizwiki.entity.pboard;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "pboard_like")
public class PboardLikeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pboardLikeId;
	String memberId;
	int pboardId;
	
	public PboardLikeEntity(String memberId, int pboardId) {
		super();
		this.memberId = memberId;
		this.pboardId = pboardId;
	}
	
	
}
