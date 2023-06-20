package com.multi.quizwiki.qboard.service;

import java.util.List;

import com.multi.quizwiki.qboard.dto.QboardDTO;
import com.multi.quizwiki.qboard.dto.QboardRequestDTO;
import com.multi.quizwiki.qboard.entity.QboardEntity;
import com.multi.quizwiki.qboard.entity.QboardReplyEntity;
public interface QboardService {
	public int insert(QboardDTO qboard);


	 public List<QboardDTO> getBoardList(); 
	
	
	 public QboardDTO getQboardDetail(Long qboard_id);
	 		
	 public void reply_insert(QboardReplyEntity qboardReply);
	 
	 public int update(QboardDTO qboard);
	 
	 public int deleteQboard(Long qboard_id);

} 