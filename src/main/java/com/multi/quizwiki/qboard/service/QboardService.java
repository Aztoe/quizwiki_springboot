package com.multi.quizwiki.qboard.service;

import java.util.List;

import com.multi.quizwiki.qboard.dto.QboardDTO;
import com.multi.quizwiki.qboard.dto.SearchDto;
import com.multi.quizwiki.qboard.entity.QboardReplyEntity;
import com.multi.quizwiki.qboard.paging.PagingResponse;
public interface QboardService {
	public int insert(QboardDTO qboard);


	public PagingResponse<QboardDTO> getBoardList(SearchDto params);	
	
	 public QboardDTO getQboardDetail(Long qboard_id);
	 		
	 public void reply_insert(QboardReplyEntity qboardReply);
	 
	 public int update(QboardDTO qboard);
	 
	 public int deleteQboard(Long qboard_id);

	  int count(SearchDto params);
} 