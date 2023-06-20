package com.multi.quizwiki.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.multi.quizwiki.qboard.dto.QboardRequestDTO;
import com.multi.quizwiki.qboard.dto.QboardResponseDTO;
import com.multi.quizwiki.qboard.service.QboardServiceJPA;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class QboardAPIController {
	private final QboardServiceJPA qboardservicejpa;
	
	@PatchMapping("/qboard/{qboard_id}")
	 public Long save(@PathVariable final Long qboard_id, @RequestBody QboardRequestDTO params ) {
		 return qboardservicejpa.update(qboard_id, params);
	 }
	 
	 @DeleteMapping("/qboard/{qboard_id}")
	 public Long delete(@PathVariable Long qboard_id) {
		 return qboardservicejpa.delete(qboard_id);
	 }
	 
	 @GetMapping("/qboard")
	 public List<QboardResponseDTO> findAll() {
		 return qboardservicejpa.findAll();
	 }
	 //게시글 조회
	@GetMapping("/qboard/{qboard_id}")
	public QboardResponseDTO findById(@PathVariable Long qboard_id) {
		return qboardservicejpa.findById(qboard_id);
	}
	
	@GetMapping("/qboard/write")
	public String openQboardWrtie(@RequestParam(required = false)Long qboard_id, Model model) {
		model.addAttribute("qboard",qboard_id);
		return "thymeleaf/qboard/qboard_write";
	}
}
