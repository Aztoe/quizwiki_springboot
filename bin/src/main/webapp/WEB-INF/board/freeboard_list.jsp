<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>quizwiki</title>

<link rel="stylesheet" type="text/css"
	href="/css/qboard/qna.css" />
<link rel="stylesheet" type="text/css"
	href="/css/qboard/style.css" />
<link rel="stylesheet" type="text/css"
	href="/css/qboard/bootstrap.css" />

<script type="text/javascript">
	var Json = $
	{
		JsonList
	};
	var userSeq = '${userSeq}';
</script>

<script type="text/javascript" src="/js/qboard/qna.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>




	<!-- Container 시작 -->
	<div id="container">

		<!-- 1. 현재 작업 위치 -->
		<div id="locationBar">

			<div id="locationBar_child">
				<a href="">< /> 홈</a> &gt; <a href="/">커뮤니티</a> &gt;
				<!-- 상단메뉴(카테고리) 제목과 해당 링크 수정 -->

				<a href="/">질문게시판</a>
				<!-- 해당페이지 제목(서브메뉴 제목) 과 해당 링크 수정 -->
			</div>

		</div>


		<!-- 본문블럭 시작-->
		<div id="mainBlock">

			<!-- 2. 사이드바 -->
			<div id="aside">

				<div id="side_title">커뮤니티</div>
				<!-- 제작 페이지의 카테고리 제목 -->

				<div id="side_menu">
					<ul>
						<li onclick="location.href=''">자유게시판</li>

						<li class="side_select"
							onclick="location.href='/qboard/list'">질문게시판</li>

						<li onclick="location.href='/pboard/list'">나만의 문제집</li>
					</ul>

				</div>
			</div>
			<script type="text/javascript" src="/js/sidebar.js"></script>


			<!-- 3. 본문 -->
			<div id="content">

				<div id="content_title">질문게시판</div>
				<!-- 본문 상단의 타이틀(해당페이지 제목) -->
				<nav class="navbar nav">
					<div class="container-nav">
						<div class="navbar-header">
							<a class="navbar-brand" href="#"> </a>
						</div>


						<span style='float: right;'> <input type="button"
							class="btn btn-success" value="질문하기"
							onclick="location.href='/qboard/write'" />
						</span>


						<ul class="nav navbar-nav">
							<li class="active" style="font-size: 16px;"><a href="#">국어</a></li>
							<li class="active"><a href="#">수학</a></li>
							<li class="active"><a href="#">영어</a></li>
						</ul>
						<form class="navbar-form navbar-left" action="/">
							<div class="input-group">
								<input type="text" class="form-control" placeholder="검색">
								<div class="input-group-btn">
									<button class="btn btn-default" type="submit">
										<i class="glyphicon glyphicon-search"></i>
									</button>
								</div>
							</div>
						</form>
					</div>
				</nav>


				<div id="content_body">
					<!-- #content_body 박스 : 이하 본문 작성하시면됩니다.  -->


					<table id="QNA" class="table tbl2">
						<tr>
							<th>번호</th>
							<th>질문/답변</th>
							<th>작성자</th>
							<th>작성일</th>
						</tr>
					</table>





				</div>
			</div>

		</div>
		<!-- 본문블럭 끝-->

	</div>
	<!-- Container 끝 -->



</body>
</html>	