package com.multi.quizwiki.pboard.dao;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.multi.quizwiki.pboard.entity.PrintFileEntity;
import com.multi.quizwiki.pboard.entity.ProblemCateEntity;
import com.multi.quizwiki.pboard.entity.ProblemChoiseEntity;
import com.multi.quizwiki.pboard.entity.ProblemEntity;
import com.multi.quizwiki.pboard.entity.ProblemLikeEntity;
import com.multi.quizwiki.pboard.entity.SolvEntity;

public interface ProblemDAO {
	public ProblemEntity insert(ProblemEntity problem);
	public ProblemChoiseEntity problemChoise_insert(ProblemChoiseEntity problemChoise);
	public void printfile_insert(MultipartFile file, int problemId) throws IllegalStateException, IOException;
	
	public PrintFileEntity printfile_findByPboardId(int problemId);
	public List<ProblemCateEntity> problemCate_findAll();
	
	public List<ProblemEntity> probleme_findByPboardId(int pboardId);
	
	public void problem_delete(int problemId);
	public void problem_editStatusByPboardId(int pboardId);
	public List<ProblemEntity> problem_findAllByPboardId(int pboardId);
	
	public ProblemLikeEntity problemlike_insert(ProblemLikeEntity problemlike);
	public ProblemLikeEntity problemlike_findByMemberIdAndProblemId(String memberId, int problemId);

	public SolvEntity solv_insert(SolvEntity solv);
	public List<SolvEntity> solv_insertAll(List<SolvEntity> solvList);
}
