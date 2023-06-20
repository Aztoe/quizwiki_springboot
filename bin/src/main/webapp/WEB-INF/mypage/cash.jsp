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
					<h6 style="font-size: 35px">캐시내역</h6>
					<p>회원님의 캐시 사용내역을 확인할 수 있습니다.</p>
				</div>

				<div class="inner_section">
					<div class="section_title flex_wrap">
						<p class="title">
							<span class="bl02">이하나님의 현재 캐시</span>
						</p>
						<p>
							<strong><em>0</em> 캐시</strong>
						</p>
					</div>

					<div class="search_bar flex_wrap">

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
						<div class="calendar_box flex_wrap">
							<div class="dateBox">
								<input type="text" name="stime" id="startDate" class="calendar"
									value=""><img class="ui-datepicker-trigger "
									src="../images/calendar.png" alt="Select date"
									title="Select date">
							</div>
							<div class="dateBox">─</div>
							<div class="dateBox">
								<input type="text" name="etime" id="endDate" class="calendar"
									value=""><img class="ui-datepicker-trigger"
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
						<caption>캐시사용내역을 확인할 수 있습니다.</caption>

						<colgroup>
							<col width="10%">
							<col width="60%">
							<col width="15%">
							<col width="15%">
						</colgroup>

						<thead>
							<tr>
								<th>번호</th>
								<th>내용</th>
								<th>캐시</th>
								<th>지급/차감일자</th>
							</tr>
						</thead>

						<tbody>
							<tr>
								<td colspan="4" class="empty_li">캐시 적립/차감 내역이 없습니다.</td>
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