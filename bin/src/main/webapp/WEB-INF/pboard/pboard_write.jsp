<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz Wiki</title>
	<!-- cdn -->
    <script src="https://kit.fontawesome.com/e92cf22849.js" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	
	
    <!-- CSS -->
    <link rel="stylesheet" type="text/css" href="/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="/css/pboard/pboard_write.css"/>
    <link rel="stylesheet" type="text/css" href="/css/pboard/pboard_add_popup.css"/>
    <!-- js -->
    <script src="/libs/se2/js/service/HuskyEZCreator.js"></script>
	
</head>
<body>
	<!-- pboard_write -->
<div id="pboard-write">
	<div class="pboard-write-outer">
		<div id="pboard-title">
			<span class="title-desc">문제게시판 글쓰기 <span class="title-subject">국어 (쓰기)</span></span>
			
		</div>
		
		<form id="editor-form" name="editor-form" action="POST">
			<div>
				<input id="pboard-title-input" placeholder="글 제목을 입력해주세요." name="title" type="text" />
			</div>
				<textarea name="se2" id="se2" rows="10" cols="100"></textarea>
				
			<div class="hr-shifter"></div>
			
			<div id="pmaker-area">
				<div class="pmaker-desc-container">
					<h1>문제만들기</h1>
					<h6>객관식(2개~5개선택지),주관식(정답 30자제한) 게시물당 최대 40개의 문항을 만들 수 있습니다.</h6>
					
					<div id="plist-add-btn" class="ui-btn" >문제 추가</div>
				</div>
				
				<table class="plist-item-table">
					<thead>
						<tr draggable="false">
							<th class="plist-item-no plist-right-border">번호</th>
							<th class="plist-item-no plist-right-border">종류</th>
							<th class="plist-item-content plist-right-border">내용</th>
							<th class="plist-item-no"></th>
						</tr>
					</thead>
					
					<tbody id="plist-body">
						<tr class="putable" draggable="true">
							<td class="plist-item-no plist-right-border">
								1
							</td>
							<td class="plist-item-no plist-right-border">
								객관식
							</td>
							<td class="plist-item-content plist-right-border">
								다음중 옳바른 것을 고르시오.
							</td>
							<td class="plist-item-no">
								<i class="fa-solid fa-pen-to-square"></i>
								<i class="fa-sharp fa-solid fa-trash"></i>
							</td>
						</tr>
						
						<tr class="putable" draggable="true">
							<td class="plist-item-no plist-right-border">
								2
							</td>
							<td class="plist-item-no plist-right-border">
								주관식
							</td>
							<td class="plist-item-content plist-right-border">
								다음에 해당하는 것을 적으시오.
							</td>
							<td class="plist-item-no">
								<i class="fa-solid fa-pen-to-square"></i>
								<i class="fa-sharp fa-solid fa-trash"></i>
							</td>
						</tr>
						
						<tr class="putable" draggable="true">
							<td class="plist-item-no plist-right-border">
								3
							</td>
							<td class="plist-item-no plist-right-border">
								주관식
							</td>
							<td class="plist-item-content plist-right-border">
								다음에 해당하는 것을 적으시오.
							</td>
							<td class="plist-item-no">
								<i class="fa-solid fa-pen-to-square"></i>
								<i class="fa-sharp fa-solid fa-trash"></i>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			
			<div class="hr-shifter"></div>
			
			<div class="btn-list">
				<div id="write-btn" class="ui-btn" >게시하기</div>
			</div>
		</form>
	</div>
	
</div>

<div id="add_popup">
    <div id="add_popup_bg"></div>
    <form id="add_popup_form">
        <div class="add_popup_title">
            <h1><i class="fa-solid fa-pen-to-square"></i>문제만들기</h1>
            <div class="add_popup_cbox">
                <fieldset>
                    <legend>문제 유형</legend>
                    <div style="align-self: center;">
    <input id="stype-ratio" type="radio" name="type" value="s"/>
    <label for="stype-ratio">
        <span class="round">라디오버튼</span>
        <i class="far fa-comment-dots"></i>
        주관식
    </label>
</div>

<div style="align-self: center;" class="cbox-shifter"></div>

<div style="align-self: center;">
                <input id="mtype-ratio" type="radio" name="type" value="m" checked/>
                <label for="mtype-ratio">
                    <span class="round">라디오버튼</span>
                    <i class="fa-solid fa-list"></i>
                    객관식
                </label>
            </div>
        </fieldset>
    </div>
</div>

<div class="hr-shifter"></div>

<div style="min-height:500px;" class="add_popup_content">


<div style="display: none;" class="add_popup_maker">
    <div class="pmaker_item">
        <h4>문제 내용:</h4>
        <input class="custom-input" type="text"/>
    </div>

    <div class="pmaker_item">
        <h4>지문:</h4>
        <textarea rows="3" class="custom-input"></textarea>
    </div>

    <div class="pmaker_item">
        <h4>지문 첨부파일:</h4>
        <input class="custom-input" type="file"/>
    </div>

    <div class="pmaker_item">
        <h4>정답:</h4>
        <input class="custom-input" type="text"/>
    </div>

    <div class="pmaker_item">
        <h4>해설:</h4>
        <textarea rows="3" class="custom-input"></textarea>
    </div>
    
</div>

<div style="display: none;" class="add_popup_preview">
                    <h2><i class="fa-solid fa-magnifying-glass"></i>미리보기</h2>
                    <div class="problem_preview">
                        <p class="problem_content">
                            1. 다음 글의 상황에 나타난 분위기로 가장 적절한 것은?
                        </p>
                        <div class="problem_print">
                            <pre>
At dinner I sat between my grandmother and Aunt Gloria. My grandmother, 
a thin, nervous woman who seldom spoke when my grandfather was present,
concentrated during the meal on cutting her ham into small perfect triangles
before she ate them. Whenever she passed a dish to me, she asked quietly,
“Do you like this, David?” and her questions seemed so eager and pathetic 
that I said yes to everything. As a result, my plate was 
piled high with sweet potatoes and cooked carrots and sliced tomatoes
and cottage cheese and kidney beans and corn bread and ham.
And I had no appetite.
*pathetic 애처로운
                            </pre>
                        </div>
                    </div>
                </div>

                <div class="add_popup_maker">
                    <div class="pmaker_item">
                        <h4>문제 내용:</h4>
                        <input class="custom-input" type="text"/>
                    </div>

                    <div class="pmaker_item">
                        <h4>지문:</h4>
                        <textarea rows="3" class="custom-input"></textarea>
                    </div>

                    <div class="pmaker_item">
                        <h4>지문 첨부파일:</h4>
                        <input class="custom-input" type="file"/>
                    </div>

                    <div class="pmaker_item">
                        <h4>선택지:</h4>
                        <ul id="pmaker_answer_list">
                            <li>
                                <input class="custom-input" type="text"/>
                            </li>
                            <li>
                                <input class="custom-input" type="text"/>
                            </li>
                        </ul>
                    </div>

                    <div class="pmaker_item">
                        <h4>정답:</h4>
                        <div class="pmaker_answer_cbox">
                            <fieldset>
                                <legend>정답</legend>
                                <div style="align-self: center;">
     <input id="answer-ratio" type="radio" name="answer" value="1" checked/>
     <label for="answer-ratio">
         <span class="round">라디오버튼</span>
         1
     </label>
 </div>

 <div style="align-self: center;" class="cbox-shifter"></div>

 <div style="align-self: center;">
                                    <input id="answer-ratio2" type="radio" name="answer" value="2"/>
                                    <label for="answer-ratio2">
                                        <span class="round">라디오버튼</span>
                                        2
                                    </label>
                                </div>
                            </fieldset>
                        </div>
                    </div>

                    <div class="pmaker_item">
                        <h4>해설:</h4>
                        <textarea rows="3" class="custom-input"></textarea>
                    </div>
                    
                </div>

                <div class="add_popup_preview">
                    <h2><i class="fa-solid fa-magnifying-glass"></i>미리보기</h2>
                    <div class="problem_preview">

                        <p class="problem_content">
                            1. 다음 글의 상황에 나타난 분위기로 가장 적절한 것은?
                        </p>

                        <div class="problem_print">
                            <pre>
At dinner I sat between my grandmother and Aunt Gloria. My grandmother, 
a thin, nervous woman who seldom spoke when my grandfather was present,
concentrated during the meal on cutting her ham into small perfect triangles
before she ate them. Whenever she passed a dish to me, she asked quietly,
“Do you like this, David?” and her questions seemed so eager and pathetic 
that I said yes to everything. As a result, my plate was 
piled high with sweet potatoes and cooked carrots and sliced tomatoes
and cottage cheese and kidney beans and corn bread and ham.
And I had no appetite.
*pathetic 애처로운
                            </pre>
                        </div>

                        <ul class="problem_answer_list">
                            <li>
                                happy and lively
                            </li>
                            <li>
                                busy and urgent
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            
            <div class="add_popup_btnlist">
                <div class="add-popup-btn blue-btn">등록</div>
                <div id="add-popup-close" class="add-popup-btn red-btn">닫기</div>
            </div>
            
        </form>
    </div>
	<!-- pboard_write end -->
	
	
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
	
	<script type="text/javascript">
	
	/* plist Drag And Drop */
		let plist = document.querySelector("#plist-body");
		
		let picked = null;
		let pickedIndex = null;
		
		plist.addEventListener("dragstart",(e)=>{
			let obj = e.target;
			
			picked = e.target;
			pickedIndex = [...obj.parentNode.children].indexOf(obj);
			picked.classList.add("picked-item");
		});
		
		plist.addEventListener("dragover",(e)=>{
			e.preventDefault();
		});
		
		plist.addEventListener("drop",(e)=>{
			picked.classList.remove("picked-item");
			if(picked.getAttribute("draggable") != "true") return;
			
			let el = e.target.parentNode;
			if(el.tagName != "TR" || !el.classList.contains("putable")) return;
			
			let index = [...(el.parentNode.children)].indexOf(el);
			
			(index > pickedIndex) ? el.after(picked) : el.before(picked)
		});
		
	/* plist Drag And Drop end. */
	
	/* plist-add-btn */
	let plistAddBtn = document.getElementById("plist-add-btn");
	let plistAddPopup = document.getElementById("add_popup");
	plistAddBtn.addEventListener("click", ()=>{
		document.body.style.overflow = "hidden";
		plistAddPopup.style.display = "block";
	});
	/* plist-add-btn end. */
	
	/* add-popup-close */
	let addPopupCloseBtn = document.getElementById("add-popup-close");
	addPopupCloseBtn.addEventListener("click", ()=>{
		document.body.style.overflow = "auto";
		plistAddPopup.style.display = "none";
	});
	/* add-popup-close end. */
	</script>
</body>
</html>