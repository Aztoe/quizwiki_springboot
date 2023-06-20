<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- cdn -->
    <script src="https://kit.fontawesome.com/e92cf22849.js" crossorigin="anonymous"></script>

<!--  css -->
<link rel="stylesheet" type="text/css" href="/css/qboard/qboard.css" />
<link rel="stylesheet" type="text/css" href="/css/qboard/style.css" />
<link rel="stylesheet" type="text/css" href="/css/qboard/bootstrap.css" />

<!-- js -->
<script type="text/javascript" src="/js/qboard/sidebar.js"></script>
<script type="text/javascript" src="/js/qboard/jquery-1.11.2.js"></script>
<script type="text/javascript" src="/js/qboard/bootstrap.js"></script>

</head>


<!-- 2. 사이드바 -->
<aside id="qboard-aside">
 			<div id="aside">

				<div id="side_title">커뮤니티</div>
				<!-- 제작 페이지의 카테고리 제목 -->

				<div id="side_menu">
					<ul>

						<!-- 
					 아래 리스트는 사이드바의 메뉴 리스트 해당 링크 걸고, 메뉴 제목고치고, 
					 필요없는 리스트는 지우면 됩니다. 
					
					 ** 현재페이지에 해당하는 <li>태그에 side_select 클래스를 적용하세요!	
				-->

						<li onclick="location.href='/exam/user/freeboardlist.action'">자유게시판</li>

						<li class="side_select"
							onclick="location.href='/exam/community/qna/list.action'">질문게시판</li>

						<li onclick="location.href='#'">문제게시판</li>
					</ul>


				</div>
			</div>
</aside>

