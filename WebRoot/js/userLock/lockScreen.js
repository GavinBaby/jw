
var sencods;
var sessionUrl;
var usernameString;
var pwdString;
var formSerializeString;
var resetSessionUrl;
var userenm;


function onoffLockScreen(sencods,sessionUrl,usernameString,pwdString,formSerializeString,resetSessionUrl,userenm){
	$(document).ready(function() {
		startTime(userenm);
	});

	
}

function startTime(userenm) {
	$('body').everyTime(sencods, 'A', function() {
		isSession(userenm);
	}, 0, true);
}

function isSession(userenm) {
	$.ajax( {
		url : sessionUrl,
		type : "POST",
		dataType : "json",
		data : {userenm:userenm},
		success : lockFrame,
		error: function () {
		   // alert('ajax failed');
		}
	});
}

function lockFrame(data) {
	var sessionInfo = data.jsonResult;
	var userenm = data.userenm;
	if (sessionInfo != "create" && sessionInfo==userenm) {
		art.dialog.open("resetlogin.jsp?usr="+sessionInfo,{title: '����',lock:true,drag: false,focus: pwdString,show:true}, false);
		//lockScreen();
		//document.getElementById(usernameString).value = sessionInfo;
		//document.getElementById(usernameString).readOnly = true;
		//document.getElementById(usernameString).style.backgroundColor = "#E6E6E6";
		//document.getElementById(pwdString).value = "";
		//document.getElementById(pwdString).focus();
		$('body').stopTime('A'); //����ʱ��ֹͣ��ʱ������ΪA�ļ�ʱ��
	}
}

//����(δ��),����art.dialog.open����
function lockScreen() {
	//ҳ���ʼ��  
	goCenter();

	//����������  
	$(window).scroll(function() {
		goCenter();
	});

	//�϶����������  
	$(window).resize(function() {
		goCenter();
	});

	//����  
	$("#popupDiv").show();
	$("#alertDiv").show();

}

//����
function displayScreen(data) {
	var successFlag = data.jsonResult;
	if (successFlag == "success") {
		//$("#popupDiv").hide();
		//$("#alertDiv").hide();
		var api = art.dialog.open.api;		
		api && api.close();	
		startTime(userenm);//����ʱ���ٴε��ü�ʱ��A���
	}
}

function goCenter() {
	var h = $(window).height();
	var w = $(window).width();
	var st = $(window).scrollTop();
	var sl = $(window).scrollLeft();

	$("#popupDiv").css("width", w + sl);
	$("#popupDiv").css("height", h + st);
	$(".divv").css("top", ((h - 60) / 2) + st);
	$(".divv").css("left", ((w - 80) / 2) + sl);
}

function updateData() {
	var params = $(formSerializeString).serialize();
	$.ajax( {
		url : resetSessionUrl,
		type : "POST",
		dataType : "json",
		data : params,
		success : displayScreen
	});
}