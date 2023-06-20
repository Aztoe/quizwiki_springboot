<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz Wiki 비밀번호 찾기</title>

<link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css'
	rel='stylesheet'>
<link rel="stylesheet" type="text/css" href="./css/common.css" />
<link rel="stylesheet" type="text/css"
	href="./css/member/login_pass_forgot_find.css" />


</head>

<body>
	<script
		src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
	<div class="login">
		<div class="login__content">
			<div class="login__forms">

				<form action="" class="login__register" id="login-in">
					<h1 class="login__title">
						<a href="/main">
							<img src="/images/main_logo1.jpeg" id="login_title_img">
						</a>
					</h1>
					<div class="login__box login_id_forgot">임시 비밀번호 발급</div>
					<hr>
					<div class="login__box login_id">
						귀하의 임시 비밀번호를 휴대폰으로 발송했습니다.
					</div>
					<span class="login__box__under">비밀번호는 
					<a href="/mypage/modify">마이페이지</a>에서 변경할 수 있습니다.</span>
					<a href="/login.do" class="login__button">로그인하기</a>
				</form>

			</div>
		</div>
	</div>

</body>

</html>