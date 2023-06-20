<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz Wiki 아이디 찾기</title>

<link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css'
	rel='stylesheet'>
<link rel="stylesheet" type="text/css" href="./css/common.css" />
<link rel="stylesheet" type="text/css"
	href="./css/member/login_id_forgot_find.css" />


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
					<div class="login__box login_id_forgot">등록된 귀하의 아이디</div>
					<hr>
					<div class="login__box login_id">
						아이디
						<span>아이디는 요기에</span>
				
					</div>
					
					
					<a href="/login.do" class="login__button">로그인하기</a>
				</form>

			</div>
		</div>
	</div>

</body>

</html>