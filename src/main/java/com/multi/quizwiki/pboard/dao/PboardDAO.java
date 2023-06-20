package com.multi.quizwiki.pboard.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.multi.quizwiki.pboard.entity.PboardCateEntity;
import com.multi.quizwiki.pboard.entity.PboardEntity;
import com.multi.quizwiki.pboard.entity.PboardReplyEntity;

public interface PboardDAO {
	public void insert(PboardEntity pboard);
	public void pboard_edit(PboardEntity pboard);
	public void reply_insert(PboardReplyEntity pboardReply);
	
	public Page<PboardEntity> pboard_findByCate(int pboardCateId,Pageable pageable);
	public Page<PboardEntity> pboard_findByCateTitleContaining(int pboardCateId,String keyword,Pageable pageable);
	public Page<PboardEntity> pboard_findByCateMemberIdContaining(int pboardCateId, String keyword,Pageable pageable);
	public PboardEntity pboard_findByPboardId(int pboardId);
	
	public List<PboardCateEntity> pboardCate_findAll();
	
	
}
