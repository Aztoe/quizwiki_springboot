<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/common.css" />
<link rel="stylesheet" type="text/css" href="/css/mypage/mycontentroom.css" />

</head>
<body>
	
		<div id="myPage_contents">
			<div class="inner_cont">
				<div class="myPage_title flex_wrap">
					<h6 style="font-size: 35px">포인트내역</h6>
					<p>회원님의 포인트 사용내역을 확인할 수 있습니다.</p>
				</div>

				<div class="inner_section">
					<div class="section_title flex_wrap">
						<p class="title">
							<span class="bl02">이하나님의 현재 포인트</span>
						</p>
						<p>
							<strong><em>2,000</em> 포인트</strong>
						</p>
					</div>

					<div class="search_bar flex_wrap">
						<ul class="multi_line">
							<li><input type="radio" name="day" id="day1" value="1"
								onclick="dateInput('2023-05-24', 'startDate', 'endDate')">
								<label for="day1">1일</label></li>
							<li><input type="radio" name="day" id="day3"
								onclick="dateInput('2023-05-22', 'startDate', 'endDate')">
								<label for="day3">3일</label></li>
							<li><input type="radio" name="day" id="day7"
								onclick="dateInput('2023-05-18', 'startDate', 'endDate')">
								<label for="day7">7일</label></li>
						</ul>

						<div class="calendar_box flex_wrap">
							<div class="dateBox">
								<input type="text" name="stime" id="startDate" class="calendar"
									value=""> <img class="ui-datepicker-trigger"
									src="../images/calendar.png" alt="Select date"
									title="Select date">
							</div>
							<div class="dateBox">─</div>
							<div class="dateBox">
								<input type="text" name="etime" id="endDate" class="calendar"
									value=""> <img class="ui-datepicker-trigger"
									src="../images/calendar.png" alt="Select date"
									title="Select date">
							</div>
							<button class="search">조회</button>
						</div>
						</form>
					</div>
				</div>
				<!-- // 캐시내역 검색 -->

				<div class="inner_section">


					<table class="basic_board">
						<caption>마일리지 사용내역을 확인 할 수 있습니다.</caption>

						<colgroup>
							<col width="5%">
							<col width="65%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
						</colgroup>

						<thead>
							<tr>
								<th>번호</th>
								<th>내용</th>
								<th>포인트</th>
								<th>적립/차감일자</th>
								<th>만료일자</th>
							</tr>
						</thead>

						<tbody>
							<tr>
								<td>1</td>
								<td>회원가입 축하</td>
								<td>+2,000</td>
								<td>2023-05-23</td>
								<td>2023-05-29</td>
							</tr>

						</tbody>
					</table>

					<div class="bbs_pagination">
						<div class="page_num flex_wrap"></div>
					</div>
				</div>
				<!-- // 캐시내역 -->

			</div>
		</div>
	
</body>
</html>