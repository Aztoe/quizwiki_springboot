<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- css -->
<link rel="stylesheet" type="text/css" href="/css/common.css" />
<link rel="stylesheet" type="text/css" href="/css/mypage/mycontentroom.css" />

</head>
<body>
	

		<div id="myPage_contents">
			<div class="inner_cont">
				<div class="myPage_title flex_wrap">
					<h6 style="font-size: 35px">마이콘텐츠룸</h6>
					<p style="font-size: 15px">나만의 내신도서관</p>
				</div>

				<div class="inner_section">
					<div class="section_title flex_wrap">
						<p class="title">
							<span class="bl01">이용중인 이용권</span>
						</p>
						<p>
							<strong>이용중인 이용권이 없습니다.</strong>
						</p>
					</div>

					<div class="search_bar flex_wrap">
						<div class="search_condition">
							<select name="ca_id" id="ca_id" class="custom"
								onchange="location.href='?ca_id='+this.value">
								<option selected="selected">과목선택</option>
								<option value="10">국어</option>
								<option value="20">영어</option>
								<option value="30">수학</option>
								<option value="40">사회</option>
								<option value="50">과학</option>
								<option value="60">기타</option>
							</select>
						</div>

						<ul class="multi_line">
							<li><input type="radio" name="day" id="day1" value="1"
								onclick="dateInput('2023-05-24', 'startDate', 'endDate')"><label
								for="day1">1일</label></li>
							<li><input type="radio" name="day" id="day3"
								onclick="dateInput('2023-05-22', 'startDate', 'endDate')"><label
								for="day3">3일</label></li>
							<li><input type="radio" name="day" id="day7"
								onclick="dateInput('2023-05-18', 'startDate', 'endDate')"><label
								for="day7">7일</label></li>
						</ul>
						<form name="search_frm" method="get">
							<input type="hidden" name="ca_id" value="">
							<div class="calendar_box flex_wrap">
								<div class="dateBox">
									<input type="text" name="stime" id="startDate" class="calendar"
										value=""><img class="ui-datepicker-trigger "
										src="/images/calendar.png" alt="Select date"
										title="Select date">
								</div>
								<div class="dateBox">─</div>
								<div class="dateBox">
									<input type="text" name="etime" id="endDate" class="calendar"
										value=""><img class="ui-datepicker-trigger"
										src="/images/calendar.png" alt="Select date"
										title="Select date">
								</div>
								<button class="search">조회</button>
							</div>
						</form>
					</div>
				</div>
				<!-- // 이용중인 이용권 -->

				<div class="inner_section">
					<div class="section_title flex_wrap">
						<p class="title">
							<span class="bl01">추천콘텐츠</span>
						</p>
					</div>

					<div class="recommend_contents flex_wrap">
						<p>
							<span>BEST</span>[3일의기적] 고1영어 천재김 1학기 중간고사 03 (1~2단원 30문제)
						</p>

						<div class="flex_wrap">
							<button class="comm_btnStyle view study_dwn mr5 preview_btn"
								data="13109">
								<span>미리보기</span>
							</button>

							<button class="comm_btnStyle download study_dwn mr5"
								onclick="download_file('coach', '13109', '3')">
								<span>PDF 받기</span>
							</button>

							<button class="comm_btnStyle download hanguel"
								onclick="download_file('coach', '13109', '2')">
								<span>hwp 받기</span>
							</button>

						</div>
					</div>
				</div>
				<!-- // 추천콘텐츠 -->


				<div class="inner_section">
					<div class="section_title flex_wrap">
						<p class="title">
							<span class="bl01">마이콘텐츠</span>
						</p>
					</div>

					<table class="basic_board">
						<caption>자료를 다운받을 수 있습니다.</caption>

						<colgroup>
							<col width="10%">
							<col width="55%">
							<col width="10%">
							<col width="17%">
							<col width="8%">
						</colgroup>

						<thead>
							<tr>
								<th>번호</th>
								<th>제목</th>
								<th>자료유형</th>
								<th>만료일</th>
								<th>다운 수</th>
							</tr>
						</thead>

						<tbody>
							<tr>
								<td colspan="5" class="empty_li">다운로드 내역이 없습니다.</td>
							</tr>

						</tbody>
					</table>
					<div class="bbs_pagination">
						<div class="page_num flex_wrap"></div>
					</div>
				</div>
				<!-- // 추천콘텐츠 -->

			</div>
		</div>
	
</body>
</html>