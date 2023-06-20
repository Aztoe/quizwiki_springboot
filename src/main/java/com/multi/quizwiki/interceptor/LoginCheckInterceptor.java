package com.multi.quizwiki.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.multi.quizwiki.dto.MemberDTO;



public class LoginCheckInterceptor extends HandlerInterceptorAdapter{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession(false);
		if(session!=null) {
			MemberDTO user = (MemberDTO)session.getAttribute("user");
			if(user==null) {
				response.sendRedirect("/login.do");
				return false;
			}
		}
		return true;
		
	}
	

}
