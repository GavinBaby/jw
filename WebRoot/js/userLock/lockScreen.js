
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
		art.dialog.open("resetlogin.jsp?usr="+sessionInfo,{title: '锁屏',lock:true,drag: false,focus: pwdString,show:true}, false);
		//lockScreen();
		//document.getElementById(usernameString).value = sessionInfo;
		//document.getElementById(usernameString).readOnly = true;
		//document.getElementById(usernameString).style.backgroundColor = "#E6E6E6";
		//document.getElementById(pwdString).value = "";
		//document.getElementById(pwdString).focus();
		$('body').stopTime('A'); //锁屏时，停止计时器名字为A的计时器
	}
}

//锁屏(未用),已用art.dialog.open代替
function lockScreen() {
	//页面初始化  
	goCenter();

	//滚动条滚动  
	$(window).scroll(function() {
		goCenter();
	});

	//拖动浏览器窗口  
	$(window).resize(function() {
		goCenter();
	});

	//锁屏  
	$("#popupDiv").show();
	$("#alertDiv").show();

}

//解屏
function displayScreen(data) {
	var successFlag = data.jsonResult;
	if (successFlag == "success") {
		//$("#popupDiv").hide();
		//$("#alertDiv").hide();
		var api = art.dialog.open.api;		
		api && api.close();	
		startTime(userenm);//解屏时，再次调用计时器A监测
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