<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>질문게시판</title>
<!-- cdn -->
<script src="https://kit.fontawesome.com/e92cf22849.js"
	crossorigin="anonymous"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!--  css -->
<link rel="stylesheet" type="text/css" href="/css/qboard/qboard.css" />
<link rel="stylesheet" type="text/css" href="/css/qboard/style.css" />
<link rel="stylesheet" type="text/css" href="/css/qboard/bootstrap.css" />

<!-- js -->
<script type="text/javascript" src="/js/qboard/sidebar.js"></script>
<script type="text/javascript" src="/js/qboard/jquery-1.11.2.js"></script>
<script type="text/javascript" src="/js/qboard/bootstrap.js"></script>

 <script src="/libs/se2/js/service/HuskyEZCreator.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#inSubject").focus();
	});
</script>

</head>
<body>
<div id="container">

	<!-- 1. 현재 작업 위치 -->
	<div id="locationBar">
		<div id="locationBar_child">
				
				<!-- 해당페이지 제목(서브메뉴 제목) 과 해당 링크 수정 -->
			</div>
		
		
	</div>
	<div id="mainBlock">
		
		<!-- 2. 사이드바 -->
		<div id="aside">
		
			<div id="side_title">커뮤니티</div><!-- 제작 페이지의 카테고리 제목 -->
		
			
				<div id="side_menu">
					<ul>
						<li onclick="location.href=''">자유게시판</li>

						<li class="side_select"
							onclick="location.href='/qboard/list'">질문게시판</li>

						<li onclick="location.href='/pboard/list'">나만의 문제집</li>
					</ul>

				</div>
		</div>

	<!-- 3. 본문 -->
	<div id="content">

		<div id="content_title">궁금증 해결하기</div>
		<!-- 본문 상단의 타이틀(해당페이지 제목) -->


		<div id="content_body">
			<!-- #content_body 박스 : 이하 본문 작성하시면됩니다.  -->

			<form method="POST" action="">
				<select id="inSubject" autocomplete="categoryCode"
					class="form-control" name="categoryCode"><option value=""
						class="">과목을 선택해주세요.</option>
					<option value="tech" class="">국어</option>
					<option value="career" class="">영어</option>
					<option value="qna-etc" class="">수학</option></select> <input type="text"
					id="inSubject" name="inSubject" class="form-control"
					placeholder="제목" required />
				<textarea name="se2" id="se2" rows="10" cols="100"></textarea>
				<div class="form-group">
			      <input type="file" class="form-control-file border" name="file">
			    </div>
				<textarea class="form-control" id="inContent" name="inContent"
					placeholder="질문 내용을 입력하세요." required></textarea>
				<span style='float: right;'> <input type="button"
					class="btn btn-default" value="취소" onclick="history.back();" /> <input
					type="submit" class="btn btn-success" value="질문등록" />
				</span>

			</form>

		</div>
	</div>

	</div>
	<!-- 본문블럭 끝-->
<!-- se2 -->
    <script>
    var oEditors = [];
	nhn.husky.EZCreator.createInIFrame({
		oAppRef : oEditors,
		elPlaceHolder : "se2",
		sSkinURI : "/libs/se2/SmartEditor2Skin.html",
		fCreator : "createSEditor2",
		htParams : {
			// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
			bUseToolbar : true,

			// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
			bUseVerticalResizer : false,

			// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
			bUseModeChanger : false
		}
	});
	</script>
	<!-- se2 end -->
	


</body>
</html>