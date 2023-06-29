package com.multi.quizwiki.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
//전체 멤버변수를 매개변수로 하는 생성자 정의
@AllArgsConstructor
@NoArgsConstructor
@Alias("member")
public class MemberDTO {
	@NonNull
	private String member_id; // 아이디
	private String member_pass; // 비번
	private String member_name; //이름
	private String member_grade; //학년
	private String member_gender; // 성별
	private String email; // 이메일
	private String member_telnum; // 연락처
	private String member_zipcode; // 우편번호
	private String member_road_addr; // 도로명 주소
	private String member_jibun_addr; // 지번주소
	private String member_detail_addr; // 상세주소
	private String member_extra_addr; // 참고항목
	private String member_mkt_opt; // 마케팅 수신 동의 여부 
	//private String member_mkt_sms; // 마케팅 sms
	//private String member_mkt_email; // 마케팅 email
	private Date member_regdate; // 가입날짜 
	private int member_point; // 포인트
	private String member_photo; // 플필 이미지
	private String member_type; // 회원타입 - 1:청소년, 2:대학생
	private String member_major; // 전공
	private String universityName; // 대학교명
	private int member_state; // 상태값 : 회원가입시 1을 주고 없는 회원에게는 0을 준다
	
	// 마케팅 수신 전체 동의, sms, email, null일떈 미동의 이렇게 한다면?
	// 배열로 넘어오니까 그거에 대한 처리가 필요하다고 한다.ㅠㅠ
	
	// 로그인 파라미터 매핑용 생성자
	public MemberDTO(@NonNull String member_id, String member_pass) {
		super();
		this.member_id = member_id;
		this.member_pass = member_pass;
	}

}
