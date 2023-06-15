package com.multi.quizwiki.qboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.quizwiki.qboard.dao.QboardDAO;
import com.multi.quizwiki.qboard.dto.QboardDTO;
import com.multi.quizwiki.qboard.entity.QboardEntity;
import com.multi.quizwiki.qboard.repository.QboardRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
@RequiredArgsConstructor
public class QboardServiceImpl implements QboardService {
	@Autowired
	QboardDAO qboarddao;
	

	@Autowired
	public QboardServiceImpl(QboardDAO qboarddao) {
		super();
		this.qboarddao = qboarddao;
	}

	@Override
	public int insert(QboardDTO qboard) {
		log.info("insert service 실행" +qboard.getQboard_id());
		return qboarddao.insert(qboard);

	}

	@Override
	public List<QboardDTO> getBoardList() {
		log.info("list.do 서비스 실행 ");
		return qboarddao.getBoardList();
	}

	@Override
	public QboardDTO getQboardDetail(Long qboard_id) {
		return qboarddao.getQboardDetail(qboard_id);

	}
	
	/*
	 * public void save (QboardDTO qboard) { QboardEntity qboardEntitiy =
	 * QboardEntity.toSaveEntity(qboard); qboardRepo.save(qboardEntitiy); }
	 */
}
