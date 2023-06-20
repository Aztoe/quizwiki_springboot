package com.multi.quizwiki.qboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.quizwiki.qboard.dto.QboardDTO;
import com.multi.quizwiki.qboard.entity.QboardReplyEntity;
import com.multi.quizwiki.qboard.repository.QboardReplyRepository;
import com.multi.quizwiki.qboard.repository.QboardRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class QboardDAOImpl implements QboardDAO {
	@Autowired
	SqlSession template;
	@Autowired
	QboardRepository qboardrepo;
	@Autowired
	QboardReplyRepository qboardreplyrepo;
	
	@Override

	public int insert(QboardDTO qboard) {
		log.info("write.do dao 실행");
		System.out.println("dao 실행");
		return template.insert("com.multi.quizwiki.qboard.insert",qboard);
	}

	@Override
	public List<QboardDTO> getBoardList() {
		return template.selectList("com.multi.quizwiki.qboard.selectqboardlist");
	}

	@Override
	public QboardDTO getQboardDetail(Long qboard_id) {
		return template.selectOne("com.multi.quizwiki.qboard.findById", qboard_id);
	}

	@Override
	public int update(QboardDTO qboard) {
			return template.update("com.multi.quizwiki.qboard.update",qboard);
	}

	@Override
	public void reply_insert(QboardReplyEntity qboardReply) {
			qboardreplyrepo.save(qboardReply);
	}

	@Override
	public int deleteQboard(Long qboard_id) {
		log.info("dao실행");
		 return template.delete("com.multi.quizwiki.qboard.deleteById",qboard_id);
		
		
	}

	

}
