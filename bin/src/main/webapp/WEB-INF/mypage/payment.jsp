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
					<h6 style="font-size: 35px">결제내역</h6>
					<p>회원님의 결제내역을 확인할 수 있습니다.</p>
				</div>

				<table class="basic_board bor0_top">
					<caption>회원님의 결제내역을 확인할 수 있습니다.</caption>

					<colgroup>
						<col width="10%">
						<col width="40%">
						<col width="14%">
						<col width="13%">
						<col width="13%">
						<col width="10%">
					</colgroup>

					<thead>
						<tr>
							<th>번호</th>
							<th>서비스명</th>
							<th>주문일</th>
							<th>결제금액</th>
							<th>결제방법</th>
							<th>현금영수증</th>
						</tr>
					</thead>

					<tbody>

						<tr>
							<td colspan="6" class="empty_li">결제내역이 없습니다.</td>
						</tr>
					</tbody>
				</table>
				<div class="bbs_pagination">
					<div class="page_num flex_wrap"></div>
				</div>
			</div>
		</div>

</body>
</html>