package com.multi.quizwiki;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.quizwiki.qboard.dto.QboardDTO;
import com.multi.quizwiki.qboard.service.QboardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@RequestMapping("quizwiki")
@SpringBootTest
@RequiredArgsConstructor
@Slf4j
public class QboardControllerTest {
	@Autowired
	QboardService qboardservice;
	@Autowired
	QboardDTO  dto;
	@Test
	public void test() {
		log.info("hu");
	}
	
	
	
	void testdb() {
		
	}
}
