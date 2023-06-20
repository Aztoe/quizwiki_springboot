package com.multi.quizwiki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.multi.quizwiki.qboard.dto.QboardDTO;
import com.multi.quizwiki.qboard.entity.QboardReplyEntity;
import com.multi.quizwiki.qboard.service.QboardService;
import com.multi.quizwiki.qboard.service.QboardServiceJPA;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j
@RequestMapping("quizwiki")
@RequiredArgsConstructor
public class QboardController {
	@Autowired
	QboardService qboardservice;

	@Autowired
	QboardServiceJPA qboardservicejpa;
	
	
	@RequestMapping("/qboard/list")
	public String show_qboard_list() {
		return "thymeleaf/qboard/qboard_list";
	}
	
	@GetMapping("/qboard/write")
	public String show_qboard_write() {
		return "thymeleaf/qboard/qboard_write";
	}
	@GetMapping("/freeboard/list")
	public String show_freeboard_list() {
		return "thymeleaf/qboard/freeboard_list	";
	}
	
	@GetMapping("/qboard/read")
	public String show_qboard_read() {
		return "thymeleaf/qboard/qboard_read";
	}
	
	@RequestMapping("/qboard/write.do")
	public String QboardWrite(@RequestParam(value="qboard_id", required = false) Long qboard_id, Model model,QboardDTO dto) {
	
			 if (qboard_id !=null) {
				 QboardDTO qboard = qboardservice.getQboardDetail(qboard_id);
				 model.addAttribute("qboard",qboard);
			 } else {
				
				 qboardservice.insert(dto);
			 }
			 
		return "thymeleaf/qboard/qboard_write";
	}
	
	
	  @GetMapping("/qboard/list.do") 
	  public String QboardList(Model model) {
		  log.info("list.do 실행");
		  List<QboardDTO> qboardList = qboardservice.getBoardList();
		  model.addAttribute("qboardlist",qboardList); 
	  		
	  	return "thymeleaf/qboard/qboard_list"; 
	  
	  }
	  @GetMapping("/qboard/read.do")
		 public String QboardDetail(@RequestParam(value="qboard_id",required = false) Long qboard_id, Model model ) {
				/*
				 * if (qboard_id == null) { return "redirect:/qboard/list"; }
				 */
			 QboardDTO qboard = qboardservice.getQboardDetail(qboard_id);
			 model.addAttribute("qboard", qboard);
			
			return "thymeleaf/qboard/qboard_read";
		 }
		 	
	 
		
		  @PostMapping(value="qboard/reply/write") public String
		  qboard_reply_write(QboardReplyEntity qboardReply) {
		  qboardservice.reply_insert(qboardReply);
		  
		  return "redirect:/qboard/read?no="+qboardReply.getQboardId(); 
		  }

		  
	@GetMapping("/qboard/delete")
	public String deleteBoard(@RequestParam Long qboard_id) {
		qboardservice.deleteQboard(qboard_id);
		
		return "redirect:/quizwiki/qboard/list.do";
	}
	
	@PostMapping("qboard/update.do")
	public String updateQboard(QboardDTO qboard) {
			qboardservice.update(qboard);
			return "redirect:/quizwiki/qboard/list.do";
		
	}
	
 	
}