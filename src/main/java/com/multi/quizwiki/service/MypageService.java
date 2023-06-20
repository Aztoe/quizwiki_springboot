package com.multi.quizwiki.service;

import java.util.List;

import com.multi.quizwiki.dto.InquryDTO;
import com.multi.quizwiki.dto.InquryReplyDTO;
import com.multi.quizwiki.dto.NoteDTO;
import com.multi.quizwiki.dto.PboardDTO;
import com.multi.quizwiki.dto.PointDTO;
import com.multi.quizwiki.qboard.dto.QboardDTO;

public interface MypageService {
	//내 포인트 내역 
	List<PointDTO> pointread(String member_id);
	//내포인트 토탈
	String pointtotal(String member_id);
	
	//문의사항 내역 보기
	List<InquryDTO> inquryread(String member_id,String inqury_category);
	//문의사항 자세히보기
	InquryDTO inqurydetail(String inqury_id);
	//문의사항 답변
	InquryReplyDTO inquryreply(String inqury_id);
		
	//내문제보기
	List<PboardDTO> pboardread(String member_id);
	//내문제갯수
	String pboardcount(String member_id);
	
	//내질문 리스트
	List<QboardDTO> qboardread(String member_id);
	
	//내오답노트보기
	List<NoteDTO> noteread(String member_id);
	//내오답노트갯수
	String notecount(String member_id);
}
