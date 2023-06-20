package com.multi.quizwiki.qboard.dao;

import java.util.List;

import com.multi.quizwiki.qboard.dto.QboardDTO;
import com.multi.quizwiki.qboard.entity.QboardReplyEntity;
public interface QboardDAO {
	public int insert(QboardDTO qboard);
	
	
	 public List<QboardDTO> getBoardList();
	 
	
	 public QboardDTO getQboardDetail(Long qboard_id);
	 
	 public int update(QboardDTO qboard);
	 
	 public void reply_insert(QboardReplyEntity qboardReply);
	 
	 public int deleteQboard(Long qboard_id);
}
