//아이디 중복 검사
$('#btn-id').on('click', function() {
	id_check();
});

//올바른 아이디 입력 형태인지 파악하여 유효하지 않다면 중복확인 불필요
function id_check() {
	var $id = $('[name=id]');
	if($id.hasClass('chked')) return;
	console.log('go check');
	
	var data = join.tag_status($id);
	if(data.code != 'valid') {
		alert('아이디 중복 확인 불필요\n' + data.desc);
		$id.focus();
		return;
	}

	$.ajax({
		type: 'post',
		url: 'id_check',
		data: {id: $id.val()},
		success: function(data) {
			data = join.id_usable(data);
			display_status($id.siblings('div'), data);
			$id.addClass('chked');
		},
		error: function(req, text) {
			alert(text + ': ' + req.status);
		}
	});
}


//유효성 검사
$('.chk').on('keyup', function(){
	if($(this).attr('name') == 'id') {
		if(event.keyCode == 13) { id_check(); }
		else {
			$(this).removeClass('chked');
			validate( $(this) );
		}
	} else {
		validate($(this));
	}
});

function validate(t) {
	var data = join.tag_status(t);
	display_status(t.siblings('div'), data);
}

function display_status(div, data) {
	div.text(data.desc);
	div.removeClass();
	div.addClass(data.code)
}

// 만 13세 이상만 선택 가능하게 처리
var today = new Date();
var endDay = new Date( today.getFullYear()-13, today.getMonth(), today.getDate() );

$('[name=birth]').datepicker({
	dateFormat: 'yy-mm-dd',
	changeYear: true,
	changeMonth: true,	
	showMonthAfterYear: true,
	dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
	monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	maxDate: endDay
	//beforeShowDay: after	//오늘 이후로 선택 못하게 하는 함수
});

$('[name=birth]').change(function() {
	$('#delete').css('display', 'inline-block');
});

$('#delete').click(function(){
	$('[name=birth]').val('');
	$('#delete').css('display', 'none');
});

function after(date) {
	if(date > new Date()) {
		return [false];
	} else {
		return [true];
	}
}

function daum_post() {
    new daum.Postcode({
        oncomplete: function(data) {
			$('[name=post]').val( data.zonecode );	//우편번호
            //지번 주소 : J, 도로명 주소 : R
            var address = data.userSelectedType == 'J' ? data.jibunAddress : data.roadAddress;	//클릭한 지번주소나, 도로명주소가 저장됨
            if(data.buildingName != '') {
				address += ' (' + data.buildingName + ')';	//건물 명이 있으면 건물 명을 붙여줌
            }
            $('[name=addr]').eq(0).val( address );
        }
    }).open();
}

function go_join() {
	if( $('[name = name]').val() == '') {
		alert('성명을 입력하세요!');
		$('[name = name]').focus();
		return;
	}

	//필수 항목의 유효성을 판단하도록 한다.
	//중복확인 한 경우
	if($('[name=id]').hasClass('chked') ) {
		//이미 사용중인 경우는 회원가입 불가
		if($('[name = id]').siblings('div').hasClass('invalid')) {
			alert('회원가입 불가\n' + join.id.unusable.desc);
			$('[name=id]').focus();
			return;
		}
	} else {
		//중복확인 하지 않은 경우
		if( !item_check($('[name=id]')) ) return;
		else {
			alert('회원가입 불가\n' + join.id.valid.desc);
			$('[name=id]').focus();
			return;
		}
	}
	
	if(!item_check($('[name=pw]'))) return;
	if(!item_check($('[name=pw_ck]'))) return;
	if(!item_check($('[name=email]'))) return;
	
	$('form').submit();
}

function item_check(item) {
	var data = join.tag_status(item);
	if(data.code == 'invalid') {
		alert('회원가입 불가! \n' + data.desc);
		item.focus();
		return false;
	} else return true;
}