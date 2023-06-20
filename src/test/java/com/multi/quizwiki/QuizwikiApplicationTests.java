package com.multi.quizwiki;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.multi.quizwiki.qboard.dto.QboardDTO;

@SpringBootTest
class QuizwikiApplicationTests {

	@Autowired
	private ApplicationContext context;
	
	
	
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testByApplicationContext() {
		try {
			System.out.println("=========================");
			System.out.println(context.getBean("sqlSessionFactory"));
			System.out.println("=========================");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void insetBoard() {
		QboardDTO qboard = new QboardDTO();
		qboard.setContent("content");
		qboard.setTitle("title");
		System.out.println(qboard.getTitle());
		System.out.println(qboard.getContent());
	}


}
