package com.multi.quizwiki.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.multi.quizwiki.pboard.service.PboardService;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PboardInterceptor implements HandlerInterceptor{

	@Autowired
	PboardService pboardService;

	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		req.setAttribute("pboardCateList", pboardService.pboardCate_findAll());
		return true;
	}
	
}
