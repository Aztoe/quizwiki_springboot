package com.multi.quizwiki.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.quizwiki.dto.InquryDTO;
import com.multi.quizwiki.dto.InquryReplyDTO;
import com.multi.quizwiki.dto.NoteDTO;
import com.multi.quizwiki.dto.PboardDTO;
import com.multi.quizwiki.dto.PointDTO;
import com.multi.quizwiki.qboard.dto.QboardDTO;

@Repository
public class MypageDAOImpl implements MypageDAO{

	SqlSession sqlSessionTemplate;
	
	public MypageDAOImpl() {
		
	}
	@Autowired
	public MypageDAOImpl(SqlSession sqlSessionTemplate) {
		super();
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	// 내포인트 내역 
	@Override
	public List<PointDTO> pointread(String member_id) {
		return sqlSessionTemplate.selectList("com.multi.quizwiki.mypage.pointread",member_id);
	}
	//내포인트 토탈 
	@Override
	public String pointtotal(String member_id) {
		
		return sqlSessionTemplate.selectOne("com.multi.quizwiki.mypage.pointtotal",member_id);
	}
	@Override//문의사항 리스트
	public List<InquryDTO> inquryread(String member_id, String inqury_category) {
		 Map<String, Object> params = new HashMap<>();
		    params.put("member_id", member_id);
		    params.put("inqury_category", inqury_category);
		    System.out.println(params);
		return sqlSessionTemplate.selectList("com.multi.quizwiki.mypage.inqury",params);
	}
	@Override//문의사항 자세히보기
	public InquryDTO inqurydetail(String inqury_id) {
		
		return sqlSessionTemplate.selectOne("com.multi.quizwiki.mypage.inqurydetail",inqury_id);
	}
	@Override//문의사항 답변
	public InquryReplyDTO inquryreply(String inqury_id) {
		return sqlSessionTemplate.selectOne("com.multi.quizwiki.mypage.inquryreply",inqury_id);
	}
	@Override//내문제리스트
	public List<PboardDTO> pboardread(String member_id) {
		return sqlSessionTemplate.selectList("com.multi.quizwiki.mypage.pboardread",member_id);
	}
	@Override//내문제 갯수
	public String pboardcount(String member_id) {
		return sqlSessionTemplate.selectOne("com.multi.quizwiki.mypage.pboardcount",member_id);
	}
	@Override//내질문 리스트 
	public List<QboardDTO> qboardread(String member_id) {
		return sqlSessionTemplate.selectList("com.multi.quizwiki.mypage.qboardread", member_id);
	}
	@Override//오답노트리스트
	public List<NoteDTO> noteread(String member_id) {
		return sqlSessionTemplate.selectList("com.multi.quizwiki.mypage.noteread", member_id);
	}
	@Override//오답노트 갯수 
	public String notecount(String member_id) {
		return sqlSessionTemplate.selectOne("com.multi.quizwiki.mypage.notecount", member_id);
	}
	
	

}
