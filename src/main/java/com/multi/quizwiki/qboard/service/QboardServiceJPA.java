package com.multi.quizwiki.qboard.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.multi.quizwiki.qboard.dto.QboardRequestDTO;
import com.multi.quizwiki.qboard.dto.QboardResponseDTO;
import com.multi.quizwiki.qboard.entity.QboardEntity;
import com.multi.quizwiki.qboard.repository.QboardRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class QboardServiceJPA {
	QboardRepository qboardrepo;
	
	public Long update( Long qboard_id, QboardRequestDTO params) {
		QboardEntity entity = qboardrepo.findById(qboard_id).orElseThrow();
		entity.update(params.getMember_id(),params.getContent(),params.getTitle(),params.getEditDate());
		return qboard_id;
	}
	public Long save(final QboardRequestDTO params) {
		QboardEntity entity = qboardrepo.save(params.toEntity());
		return entity.getQboardId();
	}
	public Long delete(final Long qboard_id) {
		QboardEntity entity = qboardrepo.findById(qboard_id).orElseThrow();
		entity.delete();
		return qboard_id;
	}
	//상세정보 조회
	public QboardResponseDTO findById(Long qboard_id) {
		QboardEntity entity =  qboardrepo.findById(qboard_id).orElseThrow();
		entity.increaseView_Count();
		return new QboardResponseDTO(entity);
	}
	//게시를 리스트 조회
	public List<QboardResponseDTO> findAll() {
		Sort sort = Sort.by(Direction.DESC,"qboard_id","regDate");
		List<QboardEntity> list = qboardrepo.findAll(sort);
		return list.stream().map(QboardResponseDTO::new).collect(Collectors.toList());
	}
	
	
	
}
