<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz Wiki</title>
<!-- cdn -->
<script src="https://kit.fontawesome.com/e92cf22849.js"
	crossorigin="anonymous"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script> 

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="/css/content.css" />
</head>
<body>
	<div id="nscoach-wrapper">
		
		<div id="nscoach-contents">
			<div id="myPage_contents" class="bg_gray cs_center_contents">
				<div class="inner_cont">
					<div class="myPage_title flex_wrap">
						<h6>고객센터</h6>
						<p>1:1 문의 전 FAQ를 확인해주세요!</p>
					</div>

					<div class="error_box__wrap">
						<div class="error_box">
							<p>
								<strong>Quiz Wiki에 대한 궁금한 점, 편리한 1:1 문의로 해결해보세요!</strong>
							</p>
							<p>전화연결보다 1:1문의가 더 신속하고 편리하게 해결됩니다.</p>
							<a href="/oto" class="comm_btnStyle"><span
								class="pl0">1:1 문의하기</span></a>
						</div>
					</div>



					<div class="inner_section">
						<div class="section_title flex_wrap">
							<p class="title">
								<span class="bl01">FAQ</span>
							</p>
						</div>

						<div class="">
							<ul class="class_tabs leng5 class2_tabs">
								<li class="active"><a href="/faqt"
									style="display: block">전체</a></li>
								<li><a href="/usecredit" style="display: block">이용권결제</a></li>
								<li><a href="/contentquestion" style="display: block">콘텐츠</a></li>
								<li><a href="/siteuse" style="display: block">사이트이용</a></li>
								<li><a href="/etc" style="display: block">기타</a></li>

							</ul>
						</div>

						<div class="class2_tabs-contents" id="faq1">
							<div class="faq_list__wrap">
								<ul id="my-accordion" class="accordionjs faq_list">
									 <li> 
                                        <div><p><span>[콘텐츠]</span>우리학교 기출문제가 없어요</p></div>
                                        <div>
                                            <div class="content"><p>Quiz Wiki는 최대한 많은 학교의 기출문제를 수집하여 회원님들께 무료로 이용하실 수 있도록 해드리고 있습니다.</p><p><br />하지만 모든 학교의 시험문제를 수집하는 것은 현실적으로 불가능하여 회원님께서 원하시는 학교의 시험문제가 없을 수도 있습니다.<br /><br /></p><p>이런 경우에는 비슷한 지역의 다른 학교나 같은 출판사의 다른학교 기출문제를 풀어보시면 되겠습니다.<br /><br /></p><p>그리고 기출문제를 완벽히 분석한 필수출제유형으로 제작된 Quiz Wiki의 정규 콘텐츠를 이용하시는 것이 내신준비에 큰 도움이 될 것입니다.</p></div>
                                        </div>
                                    </li>
                                                                         <li> 
                                        <div><p><span>[콘텐츠]</span>제가 원하는 출판사의 자료가 없어요.</p></div>
                                        <div>
                                            <div class="content"><p>Quiz Wiki는 국어, 영어 과목은 출판사별로 제공을 해드리고 있으며 나머지 과목들은 공통과정으로 콘텐츠를 제공하고 있습니다.<br />원하시는 자료가 없으신 경우 1:1 문의를 이용해주세요 <br /> </p></div>
                                        </div>
                                    </li>
                                                                         <li> 
                                        <div><p><span>[이용권결제]</span>구매한 이용권은 어디에서 확인 가능할까요?</p></div>
                                        <div>
                                            <div class="content"><p>구매하신 이용권은 우측위 로그아웃 버튼옆 마이페이지를 누르신 후 결제 내역 탭에서 확인할 수 있습니다.</p></div>
                                        </div>
                                    </li>
                                                                         <li> 
                                        <div><p><span>[기타]</span>(사업)제휴 문의</p></div>
                                        <div>
                                            <div class="content"><p>Quiz Wiki와의 사업 제휴를 원하시는 경우 아래에 메일주소로 제휴제안 메일을 보내시면 <br />검토 후 회신을 드립니다.</p><p><br /></p><p>◎ 사업 제휴 제안 메일 ◎<br />naeshin@naver.com</p></div>
                                        </div>
                                    </li>
                                                                         <li> 
                                        <div><p><span>[이용권결제]</span>현금영수증이나 세금계산서 발행을 원해요</p></div>
                                        <div>
                                            <div class="content"><p>현금영수증이나 세금계산서는 아래와 같은 방법으로 신청이 가능합니다.</p><p>1. 현금영수증<br /> 마이페이지의 결제내역에서 현금영수증 신청 버튼을 누르신 후 발행과 관련된 정보를 입력하시면 됩니다<br /></p><p>2. 세금계산서<br /></p><p> 1:1문의에서 세금계산서 발행 받을 메일주소와 사업자등록증을 첨부해 신청하시면 됩니다.<br /> (단, 현금영수증을 발행하신 경우에는 '증복신고'로 세금계산서 발행이 불가합니다.) </p></div>
                                        </div>
                                    </li>
								</ul>
							</div>
							<div class="bbs_pagination">
								<div class="page_num flex_wrap">
									<a href="/faqt" class="btn_page_num">1<span
										class="hidden">페이지</span></a> <a href="/total2"
										class="btn_page_num">2<span class="hidden">페이지</span></a> <a
										href="#none" class="btn_page_num  active">3<span
										class="hidden">페이지</span></a>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
		</div>

    <!-- FAQ -->
    <script src="/js/accordion.js" type="text/javascript"></script>
    <script src="/js/accordion.min.js" type="text/javascript"></script>
    <script>
        $(".faq_list").accordionjs({
            // Allow self close.(data-close-able)
            closeAble   : true,

            // Close other sections.(data-close-other)
            closeOther  : true,

            // Animation Speed.(data-slide-speed)
            slideSpeed  : 150,

            // The section open on first init. A number from 1 to X or false.(data-active-index)
            activeIndex : false,

            // Callback when a section is open
            openSection: function( section ){},

            // Callback before a section is open
            beforeOpenSection: function( section ){},
        });
    </script>
		
		
</body>
</html>