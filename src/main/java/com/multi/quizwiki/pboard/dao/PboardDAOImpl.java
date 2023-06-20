package com.multi.quizwiki.pboard.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.multi.quizwiki.pboard.entity.PboardCateEntity;
import com.multi.quizwiki.pboard.entity.PboardEntity;
import com.multi.quizwiki.pboard.entity.PboardReplyEntity;
import com.multi.quizwiki.pboard.repository.PboardCateRepository;
import com.multi.quizwiki.pboard.repository.PboardReplyRepository;
import com.multi.quizwiki.pboard.repository.PboardRepository;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Repository
public class PboardDAOImpl implements PboardDAO{
	
	PboardRepository pboardRepo;
	PboardCateRepository pboardCateRepo;
	PboardReplyRepository pboardReplyRepo;
	
	
	@Autowired
	public PboardDAOImpl(PboardRepository pboardRepo, PboardCateRepository pboardCateRepo,PboardReplyRepository pboardReplyRepo) {
		this.pboardRepo = pboardRepo;
		this.pboardCateRepo = pboardCateRepo;
		this.pboardReplyRepo = pboardReplyRepo;
	}
	
	
	

	@Override
	public void insert(PboardEntity pboard) {
		pboardRepo.save(pboard);
	}
	
	@Override
	public void pboard_edit(PboardEntity pboard) {
		PboardEntity data =  pboardRepo.findById(pboard.getPboardId()).get();
		data.setPboardContent(pboard.getPboardContent());
		data.setPboardTitle(pboard.getPboardTitle());
	}

	@Override
	public List<PboardCateEntity> pboardCate_findAll() {
		return pboardCateRepo.findAll();
	}


	@Override
	public Page<PboardEntity> pboard_findByCate(int pboardCateId, Pageable pageable) {
		return pboardRepo.findByPboardCateIdAndPboardStatusNot(pboardCateId,"d", pageable);
	}
	@Override
	public Page<PboardEntity> pboard_findByCateTitleContaining(int pboardCateId, String keyword, Pageable pageable) {
		return pboardRepo.findByPboardCateIdAndPboardStatusNotAndPboardTitleContaining(pboardCateId,"d",keyword, pageable);
	}


	@Override
	public Page<PboardEntity> pboard_findByCateMemberIdContaining(int pboardCateId, String keyword, Pageable pageable) {
		return pboardRepo.findByPboardCateIdAndPboardStatusNotAndMemberIdContaining(pboardCateId,"d",keyword, pageable);
	}




	@Override
	public PboardEntity pboard_findByPboardId(int pboardId) {
		return pboardRepo.findById(pboardId).get();
	}




	@Override
	public void reply_insert(PboardReplyEntity pboardReply) {
		pboardReplyRepo.save(pboardReply);
	}






}
