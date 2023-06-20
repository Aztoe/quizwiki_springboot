<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Quiz Wiki 회원가입</title>

<script type="text/javascript"
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src="./js/member/zipcode.js"></script>
<script type="text/javascript" src="./js/member/signup.js"></script>
<script type="text/javascript" src="./js/member/check.js"></script>
<!-- cdn -->
<script src="https://kit.fontawesome.com/e92cf22849.js"
	crossorigin="anonymous"></script>

<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="./css/common.css" />
<link rel="stylesheet" href="./css/member/signup.css">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>

<body>
	<div class="container">
		<div class="logo_wrap">
			<a href="/main"> <img
				src="/images/QuizWiki_logo1_trans.png" id="login_title_img"
				width="100%" height="100%">
			</a>
		</div>
		<div class="input-form-backgroud row">

			<div class="input-form col-md-12 mx-auto">
				<h4 class="mb-3">회원가입</h4>
				<form class="validation-form" novalidate>
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="name">이름</label> <input type="text"
								class="form-control" id="name" placeholder="" value="" required>
							<div class="invalid-feedback">이름을 입력해주세요.</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="member_id">아이디</label> <input type="text"
								class="form-control" id="member_id" placeholder="" value=""
								required>
							<div class="invalid-feedback">아이디를 입력해주세요.</div>
						</div>
					</div>
					<!-- </div> -->
					<!-- <div class="row"> -->
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="pass">비밀번호</label> <input type="password"
								class="form-control" id="pass" placeholder="" value="" required>
							<div class="invalid-feedback">비밀번호를 입력해주세요.</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="pass_check">비밀번호 확인</label> <input type="password"
								class="form-control" id="pass_check" placeholder="" value=""
								required>
							<div class="invalid-feedback">비밀번호를 다시입력해주세요.</div>
						</div>
						<!-- <div class="col-md-1.5 mb-2 div_btn" id="div_zipcode_btn">
							<input type="button" id="zipcode_btn_pass" class="code_num_btn"
								onclick="" value="비밀번호 확인">
						</div> -->
					</div>
					<!-- </div>
					<div class="row"> -->
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="root">성별</label> <select
								class="custom-select d-block w-100" id="root" required>
								<option value=""></option>
								<option>남자</option>
								<option>여자</option>
								<option>밝히고 싶지 않음
									</opton>
							</select>
							<div class="invalid-feedback">성별을 선택해주세요.</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="email">이메일</label> <input type="email"
								class="form-control" id="email" placeholder="quizwiki@naver.com"
								required>
							<div class="invalid-feedback">이메일을 입력해주세요.</div>
						</div>
					</div>
					<!-- </div>

					<div class="row"> -->
					<div class="row">
						<div class="col-md-8 mb-2">
							<label for="sample4_postcode">연락처</label> <input type="text"
								class="form-control" id="telnum" placeholder="-제외 숫자만 입력"
								required>
							<div class="invalid-feedback">전화번호를 입력해주세요.</div>
						</div>
						<div class="col-md-1.5 mb-2 div_btn" id="div_zipcode_btn">
							<input type="button" id="zipcode_btn_num" class="code_num_btn"
								onclick="" value="인증번호 발송">
						</div>
					</div>
					<div class="row">
						<div class="col-md-8 mb-2">
							<label for="sample4_postcode">인증번호</label> <input type="text"
								class="form-control" id="telnum_check" placeholder="6자리 숫자 입력"
								required>
							<div class="invalid-feedback">인증번호를 확인해주세요.</div>
						</div>
						<div class="col-md-1.5 mb-2 div_btn" id="div_zipcode_btn">
							<input type="button" id="zipcode_btn_check" class="code_num_btn"
								onclick="" value="인증번호 확인">
						</div>
					</div>

					<!-- </div>
					
					<div class="row"> -->
					<div class="row">
						<div class="col-md-8 mb-2">
							<label for="sample4_postcode">우편번호</label> <input type="text"
								class="form-control" id="sample4_postcode" placeholder="우편번호"
								required>
							<div class="invalid-feedback">우편번호를 통해 주소를 입력해주세요.</div>
						</div>
						<div class="col-md-1.5 mb-2 div_btn" id="div_zipcode_btn">
							<input type="button" id="zipcode_btn" class="code_num_btn"
								onclick="sample4_execDaumPostcode()" value="우편번호 찾기">
						</div>
					</div>
					<!-- </div>
					
					<div class="row"> -->
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="sample4_roadAddress">도로명 주소</label> <input
								type="text" class="form-control" id="sample4_roadAddress"
								placeholder="도로명주소" required>
						</div>
					</div>
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="sample4_jibunAddress">지번주소</label> <input type="text"
								class="form-control" id="sample4_jibunAddress"
								placeholder="지번주소" required>
						</div>
					</div>
					<!-- </div>

					<div class="row"> -->
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="sample4_detailAddress">상세주소</label> <input
								type="text" class="form-control" id="sample4_detailAddress"
								placeholder="상세주소" required>
						</div>
					</div>
					<div class="row">
						<div class="col-md-11 mb-3">
							<label for="sample4_extraAddress">참고항목</label> <input type="text"
								class="form-control" id="sample4_extraAddress"
								placeholder="참고항목" required>
						</div>
					</div>
					<!-- </div> -->


					<hr class="mb-4">

					<!-- <div class="row"> -->
					<div class="col-md-6 mb-3">
						<div class="custom-control custom-checkbox">
							<input type="checkbox" class="custom-control-input"
								id="aggrement_personal" required> <label
								class="custom-control-label" for="aggrement_personal">
								개인정보 수집 및 이용에 동의</label>
							<div class="invalid-feedback">약관에 동의해주세요.</div>
						</div>
					</div>
					<div class="col-md-6 mb-3">
						<div class="custom-control custom-checkbox">
							<input type="checkbox" class="custom-control-input"
								id="selectall" onclick="selectAll(this)" name="mkt_opt"
								value="마케팅 수신 동의"> <label class="custom-control-label"
								for="selectall"> 마케팅 수신 동의 </label>
						</div>
						<div class="child-custom-control">
							<div class="custom-control custom-checkbox">
								<input type="checkbox"
									class="check_all_list custom-control-input" id="aggrement_sms"
									onclick="checkSelectAll()" name="mkt_opt_sub" value="sms">
								<label class="custom-control-label" for="aggrement_sms">SMS
									수신 동의</label>
							</div>
							<div class="custom-control custom-checkbox">
								<input type="checkbox"
									class="check_all_list custom-control-input"
									id="aggrement_email" onclick="checkSelectAll()"
									name="mkt_opt_sub" value="email"> <label
									class="custom-control-label" for="aggrement_email">이메일
									수신 동의</label>
							</div>
						</div>
					</div>
					<!-- </div> -->
					<div class="mb-4"></div>
					<button class="btn btn-primary btn-lg btn-block" type="submit">가입
						완료</button>
				</form>
			</div>
		</div>
		<footer class="my-3 text-center text-small">
			<p class="mb-1">&copy; Quiz Wiki</p>
		</footer>
	</div>

</body>

</html>