package com.multi.quizwiki.pboard.dao;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.multi.quizwiki.common.FileUploadLogicService;
import com.multi.quizwiki.pboard.entity.PrintFileEntity;
import com.multi.quizwiki.pboard.entity.ProblemCateEntity;
import com.multi.quizwiki.pboard.entity.ProblemChoiseEntity;
import com.multi.quizwiki.pboard.entity.ProblemEntity;
import com.multi.quizwiki.pboard.entity.ProblemLikeEntity;
import com.multi.quizwiki.pboard.entity.SolvEntity;
import com.multi.quizwiki.pboard.repository.PrintFileRepository;
import com.multi.quizwiki.pboard.repository.ProblemCateRepository;
import com.multi.quizwiki.pboard.repository.ProblemChoiseRepository;
import com.multi.quizwiki.pboard.repository.ProblemLikeRepository;
import com.multi.quizwiki.pboard.repository.ProblemRepository;
import com.multi.quizwiki.pboard.repository.SolvRepository;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Repository
public class ProblemDAOImpl implements ProblemDAO {

	ProblemRepository problemRepo;
	ProblemCateRepository problemCateRepo;
	ProblemChoiseRepository problemChoiseRepo;
	PrintFileRepository printFileRepo;
	ProblemLikeRepository problemLikeRepo;
	SolvRepository solvRepo;
	FileUploadLogicService fileUpload;
	
	@Autowired
	public ProblemDAOImpl(
			ProblemRepository problemRepo, 
			ProblemChoiseRepository problemChoiseRepo, 
			ProblemCateRepository problemCateRepo,
			PrintFileRepository printFileRepo,
			FileUploadLogicService fileUpload,
			ProblemLikeRepository problemLikeRepo,
			SolvRepository solvRepo) {
		
		this.problemRepo = problemRepo;
		this.problemChoiseRepo = problemChoiseRepo;
		this.problemCateRepo = problemCateRepo;
		this.printFileRepo = printFileRepo;
		this.fileUpload = fileUpload;
		this.problemLikeRepo = problemLikeRepo;
		this.solvRepo = solvRepo;
	}
	
	@Override
	public ProblemEntity insert(ProblemEntity problem) {
		return problemRepo.save(problem);
	}

	@Override
	public List<ProblemCateEntity> problemCate_findAll() {
		return problemCateRepo.findAll();
	}

	@Override
	public void printfile_insert(MultipartFile file, int problemId) throws IllegalStateException, IOException {
		String store = fileUpload.uploadFile(file);
		PrintFileEntity pf = new PrintFileEntity(problemId, file.getOriginalFilename(), store);
		printFileRepo.save(pf);
	}

	@Override
	public ProblemChoiseEntity problemChoise_insert(ProblemChoiseEntity problemChoise) {
		return problemChoiseRepo.save(problemChoise);
	}

	@Override
	public List<ProblemEntity> probleme_findByPboardId(int pboardId) {
		return problemRepo.findAllByPboardId(pboardId);
	}

	@Override
	public PrintFileEntity printfile_findByPboardId(int problemId) {
		return printFileRepo.findByProblemId(problemId);
	}

	@Override
	public void problem_delete(int problemId) {
		printFileRepo.deleteAllByProblemId(problemId);
		problemChoiseRepo.deleteAllByProblemId(problemId);
		problemRepo.flush();
		ProblemEntity p = problemRepo.findById(problemId).get();
		problemRepo.delete(p);
	}
	
	@Override
	public void problem_editStatusByPboardId(int pboardId) {
		List<ProblemEntity> problem = problemRepo.findAllByPboardIdAndProblemStatusNot(pboardId,"p");
		problem.forEach((p)->{
			p.setProblemStatus("p");
		});
	}

	@Override
	public List<ProblemEntity> problem_findAllByPboardId(int pboardId) {
		return problemRepo.findAllByPboardId(pboardId);
	}

	@Override
	public ProblemLikeEntity problemlike_findByMemberIdAndProblemId(String memberId, int problemId) {
		return problemLikeRepo.findByMemberIdAndProblemId(memberId, problemId);
	}

	@Override
	public ProblemLikeEntity problemlike_insert(ProblemLikeEntity problemlike) {
		return problemLikeRepo.save(problemlike);
	}

	@Override
	public SolvEntity solv_insert(SolvEntity solv) {
		return solvRepo.save(solv);
	}

	@Override
	public List<SolvEntity> solv_insertAll(List<SolvEntity> solvList) {
		return solvRepo.saveAll(solvList);
	}

}
