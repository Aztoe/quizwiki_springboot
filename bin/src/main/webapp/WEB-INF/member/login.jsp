<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz Wiki 로그인</title>

<link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css'
	rel='stylesheet'>
<link rel="stylesheet" type="text/css" href="./css/common.css"/>
<link rel="stylesheet" type="text/css" href="./css/member/login.css" />
</head>
<body>
	<script type="text/javascript" src="./js/member/login.js"></script>
	<div class="login">
		<div class="login__content">
			<div class="login__forms">
				<form action="" class="login__register" id="login-in">
					<h1 class="login__title">
						<a href="/main">
							<img src="/images/main_logo1.jpeg" id="login_title_img">
						</a>
					</h1>
					<div class="login__box">
						<i class='bx bx-user login__icon'></i> <input type="text"
							placeholder="아이디" class="login__input">
					</div>
					<div class="login__box">
						<i class='bx bx-lock login__icon'></i> <input type="password"
							placeholder="패스워드" class="login__input">
					</div>

					<div class="login__forgot_box">
						<a href="/findId.do" class="login__forgot">아이디 찾기</a> 
						<a href="/findPass.do"	class="login__forgot">비밀번호 찾기</a>
					</div>

					<a href="#" class="login__button">로그인</a>

					<div>
						<span class="login__account login__account--account">계정이
							없으신가요?</span> <span class="login__signin login__signin--signup"
							id="sign-up"><a href="/signup.do">회원가입</a></span>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>