
package com.multi.quizwiki.member.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.quizwiki.dto.MemberDTO;
import com.multi.quizwiki.member.entity.MemberEntity;
import com.multi.quizwiki.member.repository.MemberRepository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	SqlSession sqlSession;
	MemberRepository memberRepository;

	@Autowired
	public MemberDAOImpl(SqlSession sqlSession, MemberRepository memberRepository) {
		super();
		this.sqlSession = sqlSession;
		this.memberRepository = memberRepository;
	}

	public MemberDAOImpl() {

	}

	// 로그인
	@Override
	public MemberDTO login(MemberDTO loginUser) {
		MemberDTO user = sqlSession.selectOne("com.multi.quizwiki.member.login", loginUser);
		System.out.println("loginUser" + loginUser);
		System.out.println("user" + user);
		return user;
	}

	// 카카오 로그인
	@Override
	public MemberEntity loginKakao(String kakaoID) {
//		MemberEntity ent=memberRepository.findByKakaoID(kakaoID);
//		System.out.println("ent"+ent);
//		return ent;
		return memberRepository.findByKakaoID(kakaoID);
	}
	
	// 아이디 중복 체크
	@Override
	public int idCheck(MemberDTO member_id) {
		int result = sqlSession.selectOne("com.multi.quizwiki.member.idcheck", member_id);
		return result;
	}

	// 회원가입
	@Override
	public void register(MemberDTO user) throws Exception {
		sqlSession.insert("com.multi.quizwiki.member.insert", user);
	}

	// 회원 정보 조회
	@Override
	public MemberDTO read(String member_id) throws Exception{
		MemberDTO dto = sqlSession.selectOne("com.multi.quizwiki.member.read", member_id);
		return dto;
	}
	
	// 비번 변경 임시 비번
	@Override
	public int updatePw(MemberDTO dto) throws Exception {
		return sqlSession.update("com.multi.quizwiki.member.passUpdate", dto);
	}
	
	
	// 아이디 찾기
	@Override
	public MemberDTO find_id(MemberDTO dto) {
		// System.out.println(dto+"daoimpl");
		MemberDTO id = sqlSession.selectOne("com.multi.quizwiki.member.findid", dto);
		System.out.println(id);
		return id;
	}

	// 비밀번호 찾기
	@Override
	public MemberDTO find_pass(MemberDTO dto) {
		MemberDTO pass = sqlSession.selectOne("com.multi.quizwiki.member.findpass", dto);
		System.out.println(pass);
		return pass;
	}

	// 비밀번호 변경
	@Override
	public void update_pass(MemberDTO dto) throws Exception {
		sqlSession.update("com.multi.quizwiki.member.passUpdate", dto);
	}
	
	// 회원정보 수정
	@Override
	public void update_member(MemberDTO dto) throws Exception {
		sqlSession.update("com.multi.quizwiki.member.memberUpdate", dto);
	}
	
	// 회원탈퇴
	@Override
	public void delete_member(MemberDTO dto) throws Exception {
		sqlSession.delete("com.multi.quizwiki.member.delete", dto);
	}
	
	// 회원탈퇴 - 회원 특정
	@Override
	public int delete_check(MemberDTO dto) throws Exception {
		int result = sqlSession.selectOne("com.multi.quizwiki.member.deleteUser", dto);
		return result;
	}

	
	
	// 임시 비밀번호
//	@Override
//	public void updatePass(String member_id, String member_pass) {
//		Map<String, Object> map = new HashMap<>();
//		map.put("member_id", member_id);
//		map.put("member_pass", member_pass);
//		sqlSession.update("com.multi.quizwiki.member.update", map);
//	}

	
}
