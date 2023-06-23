package com.multi.quizwiki.mypage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.quizwiki.dto.InquryDTO;
import com.multi.quizwiki.dto.InquryReplyDTO;
import com.multi.quizwiki.dto.NoteDTO;
import com.multi.quizwiki.dto.PboardDTO;
import com.multi.quizwiki.dto.PointDTO;
import com.multi.quizwiki.qboard.dto.QboardDTO;

@Service
public class MypageServiceImpl implements MypageService {
	MypageDAO dao;
	
	public MypageServiceImpl() {
		
	}
	@Autowired
	public MypageServiceImpl(MypageDAO dao) {
		super();
		this.dao = dao;
	}

	@Override//내포인트 내역 
	public List<PointDTO> pointread(String member_id) {
		return dao.pointread(member_id);
	}
	@Override//내포인트 토탈 
	public String pointtotal(String member_id) {
		return dao.pointtotal(member_id);
	}
	@Override//문의사항 리스트
	public List<InquryDTO> inquryread(String member_id, String inqury_category) {
		System.out.println( "서비스"+dao.inquryread(member_id, inqury_category));
		return dao.inquryread(member_id, inqury_category);
	}
	@Override//문의사항 자세히 보기 
	public InquryDTO inqurydetail(String inqury_id) {
		return dao.inqurydetail(inqury_id);
	}
	@Override//문의사항 답변 
	public InquryReplyDTO inquryreply(String inqury_id) {
		return dao.inquryreply(inqury_id);
	}
	@Override//내문제 리스트 
	public List<PboardDTO> pboardread(String member_id) {
		System.out.println(dao.pboardread(member_id));
		return dao.pboardread(member_id);
	}
	@Override//내문제 갯수
	public String pboardcount(String member_id) {
		return dao.pboardcount(member_id);
	}
	@Override//내질문 리스트 
	public List<QboardDTO> qboardread(String member_id) {
		return dao.qboardread(member_id);
	}
	@Override//내오답노트 리스트 
	public List<NoteDTO> noteread(String member_id) {
		return dao.noteread(member_id);
	}
	@Override//내 오답노트 갯수 
	public String notecount(String member_id) {
		return dao.notecount(member_id);
	}
	

	
}
