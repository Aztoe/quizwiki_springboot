package com.multi.quizwiki.service;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.quizwiki.dao.MemberDAO;
import com.multi.quizwiki.dto.MemberDTO;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

@Service
public class MemberServiceImpl implements MemberService {
	
	MemberDAO dao;
	
	public MemberServiceImpl() {
		
	}
	
	@Autowired
	public MemberServiceImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	// 로그인
	@Override
	public MemberDTO login(MemberDTO loginUser) {
		//user가 db인증 후에 받은 결과
		MemberDTO user= dao.login(loginUser);
		System.out.println("서비스==>"+user);
		return user;
	}
	
	// 아이디 중복
	@Override
	public int idCheck(MemberDTO member_id) throws Exception {
		int result = dao.idCheck(member_id);
		return result;
	}

	@Override
	 public void certifiedPhoneNumber(String telnum, String numStr) {
		 
		  String api_key = "NCSHJUW5DCMXSS7Y";
          String api_secret = "UXVPXD24NSMYAELLTR5BW4RLVMSRAVVL";
          Message coolsms = new Message(api_key, api_secret);

        
          HashMap<String, String> params = new HashMap<String, String>();
          params.put("to", telnum);    
          params.put("from", "01079196032");   
          params.put("type", "SMS");
          params.put("text", "작성할내용 "+numStr);
          params.put("app_version", "test app 1.2"); // application name and version

          try {
              JSONObject obj = (JSONObject) coolsms.send(params);
              System.out.println(obj.toString());
          } catch (CoolsmsException e) {
              System.out.println(e.getMessage());
              System.out.println(e.getCode());
          }

	}

	
}
