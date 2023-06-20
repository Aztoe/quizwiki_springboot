package com.multi.quizwiki.pboard.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.pboard.entity.PboardEntity;

public interface PboardRepository extends JpaRepository<PboardEntity, Integer>{
	public Page<PboardEntity> findByPboardCateIdAndPboardStatusNot(int pboardCateId,String pboardStatus, Pageable pageable);
	
	public Page<PboardEntity> 
	findByPboardCateIdAndPboardStatusNotAndPboardTitleContaining
	(int pboardCateId,String pboardStatus,String pboardTitle, Pageable pageable);
	
	public Page<PboardEntity> 
	findByPboardCateIdAndPboardStatusNotAndMemberIdContaining
	(int pboardCateId,String pboardStatus,String memberId, Pageable pageable);
	

}
