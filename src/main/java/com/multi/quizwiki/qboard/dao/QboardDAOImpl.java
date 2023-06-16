package com.multi.quizwiki.qboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.quizwiki.qboard.dto.QboardDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class QboardDAOImpl implements QboardDAO {
	@Autowired
	SqlSession template;

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
		return template.selectOne("com.multi.quizwiki.qboard.selectBoardDetail", qboard_id);
	}

}