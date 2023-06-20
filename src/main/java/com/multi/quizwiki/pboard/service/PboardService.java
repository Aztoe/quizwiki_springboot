package com.multi.quizwiki.pboard.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.multi.quizwiki.pboard.entity.PboardCateEntity;
import com.multi.quizwiki.pboard.entity.PboardEntity;
import com.multi.quizwiki.pboard.entity.PboardReplyEntity;
import com.multi.quizwiki.pboard.entity.PrintFileEntity;
import com.multi.quizwiki.pboard.entity.ProblemCateEntity;
import com.multi.quizwiki.pboard.entity.ProblemEntity;
import com.multi.quizwiki.pboard.entity.ProblemLikeEntity;
import com.multi.quizwiki.pboard.entity.SolvEntity;

public interface PboardService {
	
	public void pboard_insert(
			PboardEntity pboard,
			List<ProblemEntity> problemList,
			List<List<String>> problemChoiseList,
			List<MultipartFile> printfileList,
			List<Integer> printfileArr);
	
	public void reply_insert(PboardReplyEntity pboardReply);
	
	public void pboard_edit(
			PboardEntity pboard,
			List<ProblemEntity> problemList,
			List<List<String>> problemChoiseList,
			List<MultipartFile> printfileList,
			List<Integer> printfileArr);
	

	public Page<PboardEntity> pboard_findByCate(int pboardCateId , Pageable pageable);
	public Page<PboardEntity> pboard_findByCateTitleContaining(int pboardCateId,String keyword , Pageable pageable);
	public Page<PboardEntity> pboard_findByCateMemberIdContaining(int pboardCateId, String keyword , Pageable pageable);
	public PboardEntity pboard_findById(int pboardId);
	
	public PrintFileEntity printfile_findByProblemId(int problemId);
	
	public List<PboardCateEntity> pboardCate_findAll();
	public List<ProblemEntity> problem_findByPboardId(int pboardId);
	public List<ProblemCateEntity> problemCate_findAll();
	
	public ProblemLikeEntity problemlike_findByMemberIdAndProblemId(String memberId, int problemId);
	public ProblemLikeEntity problemlike_insert(ProblemLikeEntity problemlike);
	
	public SolvEntity solv_insert(SolvEntity solv);
	public List<SolvEntity> solv_insertAll(List<SolvEntity> solvList);
}
