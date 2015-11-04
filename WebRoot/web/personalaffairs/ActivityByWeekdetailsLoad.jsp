<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
		<jtag:jhead />
		<link rel="stylesheet" href="../../css/fullcalendar/theme.css" type="text/css"></link>
		<link rel='stylesheet' type='text/css' href='../../css/fullcalendar/fullcalendar.css' />
		<script type='text/javascript' src='../../js/fullcalendar/jquery-1.4.1.min.js' charset="utf-8"></script>
		<script type='text/javascript' src='../../js/fullcalendar/jquery-ui-1.8.23.custom.min.js' charset="utf-8"></script>
		<script type='text/javascript' src='../../js/fullcalendar/fullcalendar.js' charset="utf-8"></script>
		<script type='text/javascript' src='../../js/fullcalendar/nongli.js' charset="utf-8"></script>
		<script type='text/javascript' src='../../js/json2.js' charset="utf-8"></script>
		<style type='text/css'>
body {
	margin-top: 40px;
	text-align: center;
	font-size: 14px;
	font-family: "Lucida Grande", Helvetica, Arial, Verdana, sans-serif;
}

#calendar {
	width: 900px;
	margin: 0 auto;
}
</style>

   <s:hidden id="totaltitle" name="totaltitle"></s:hidden>

	</head>

	<body>
	    �쵼��<jtag:jsl listKey="roleUserId" listValue="roleUserName" cssStyle="width:15%" editCondition="*" id="leadname" name="leadname" list="list_B_V_Ufp_LeadWorkManage" />
		<div id='calendar'></div>
	</body>
	<script type='text/javascript'>
	$(document)
			.ready(
					function() {

						var date = new Date();
						var d = date.getDate();
						var m = date.getMonth();
						var y = date.getFullYear();
						var hour=date.getHours();     
						var minute=date.getMinutes();     
						var second=date.getSeconds();
						var calendar = $('#calendar')
								.fullCalendar(
										{
											buttonText : {//���Ļ�
												prev : '��ǰ',
												next : '���',
												prevYear : 'ȥ��',
												nextYear : '����',
												today : '����',
												month : '��',
												week : '��',
												day : '��'
											},


											
											aspectRatio: 2.35,
											
											allDayText : 'ȫ��',
											header : {//ͷ����ʾ��ť
												left : 'prev,next today',
												center : 'title',
												right : 'month,agendaWeek,agendaDay'
											},
											titleFormat : {//title����ʾ��ʽ
												month : 'yyyy��MM��',
												agendaWeek : 'yyyy��MM��dd����',
												agendaDay : 'yyyy��MM��dd�� nl'
											},
											columnFormat : {//��ʾ��������ʾ��ʽ
												month : 'dddd',
												agendaWeek : 'yyyy��MM��dd��dddd',
												agendaDay : 'dddd'
											},
											
											eventClick : function(event,
													jsEvent, view) {
												 var title=event.title;
												 var plannig=event.plannig; 
												 var strs= new Array();
												 strs[0] =title;
												 strs[1] =plannig;
											     title= window.showModalDialog("ActivityByDaydetailsLoad.jsp",strs,"dialogHeight:380px;dialogWidth:400px;");
												  																																					
					    					   if (title) {
													event.title = title[0];
													event.plannig = title[1];
												} else {
													if (confirm("��Ҫɾ������ճ���")) {
														calendar.fullCalendar(
																'removeEvents',
																event._id);
														
													$.post("personalaffairs/ActivityByWeek_detailsDelete_ajax.action",{id : event.id},function() {});

													}       
												}
												if (title) {
													calendar.fullCalendar('updateEvent',event);
													$.post("personalaffairs/ActivityByWeek_detailsUpdate_ajax.action?actiontype=edit&leadname="+document.getElementById("leadname").value, {
														title :event.title,
														plannig :event.plannig,
														id : event.id
													}, function() {
													});
												}
											},
											eventDrop : function(calEvent,dayDelta,minuteDelta,allDay) {
												//�϶��󴥷�
												var start = calEvent.start;
												var Monthlength=start.getMonth()+1;
												if(Monthlength>9){
													var month=(start.getMonth()+1);
												}else{
													var month=("0"+(start.getMonth()+1));
												}
												 var Datelength=start.getDate();
												if(Datelength>9){
													var Date=start.getDate();
												}else{
													var Date="0"+start.getDate()
												}
												
												start = start.getFullYear()
														+ "-"
														+ month
														+ "-" + Date+" "+start.getHours()+":"+start.getMinutes();
												var end = calEvent.end;
												if (end != null) {
													var endmonthlength=end.getMonth()+1;
													if(endmonthlength>9){
														var endmonth=(end.getMonth()+1);
													}else{
														var endmonth=("0"+(end.getMonth()+1));
													}
													var endDatelength=end.getDate();
													if(endDatelength>9){
														var endDate=end.getDate();
													}else{
														var endDate="0"+end.getDate()
													}
													end = end.getFullYear()
															+ "-"
															+ endmonth
															+ "-"
															+ endDate+" "+end.getHours()+":"+end.getMinutes();
												}

												$.post("personalaffairs/ActivityByWeek_detailsUpdate_ajax.action?actiontype=edit&leadname="+document.getElementById("leadname").value, {
													start : start,
													end : end,
													id : calEvent.id
												}, function() {
												});
											},
											eventResize : function(calEvent) {
												//��С�仯�󴥷�
												var start = calEvent.start;
												var Monthlength=start.getMonth()+1;
												if(Monthlength>9){
													var month=(start.getMonth()+1);
												}else{
													var month=("0"+(start.getMonth()+1));
												}
												 var Datelength=start.getDate();
												if(Datelength>9){
													var Date=start.getDate();
												}else{
													var Date="0"+start.getDate()
												}
												
												start = start.getFullYear()
														+ "-"
														+ month
														+ "-" + Date+" "+start.getHours()+":"+start.getMinutes();
												var end = calEvent.end;
												if (end != null) {
													var endmonthlength=end.getMonth()+1;
													if(endmonthlength>9){
														var endmonth=(end.getMonth()+1);
													}else{
														var endmonth=("0"+(end.getMonth()+1));
													}
													var endDatelength=end.getDate();
													if(endDatelength>9){
														var endDate=end.getDate();
													}else{
														var endDate="0"+end.getDate()
													}
													end = end.getFullYear()
															+ "-"
															+ endmonth
															+ "-"
															+ endDate+" "+end.getHours()+":"+end.getMinutes();
												}
												$.post("personalaffairs/ActivityByWeek_detailsUpdate_ajax.action?actiontype=edit&leadname="+document.getElementById("leadname").value, {
													start : start,
													end : end,
													id : calEvent.id
												}, function() {
												});
											},
											axisFormat : "h tt",//��ʾ���Сʱ�е���ʾ��ʽ
											dayNames : [ "������", "����һ", "���ڶ�","������", "������", "������", "������" ],//��ʾʹ��dddd�ĵط���ʾ�ܼ��ķ�ʽ
											firstDay : 1,//ÿ�ܵĵ�һ��������һ
											selectable : true,
											selectHelper : false,
											select : function(start, end,allDay) {
												var title= window.showModalDialog("ActivityByDaydetailsLoad.jsp","","dialogHeight:380px;dialogWidth:400px;");
												if (title) {	
												var prameter = {		
													title :title[0],
													plannig: title[1],
													start : start,
													end : end,
													allDay : allDay
												};
												}
												if (title) {
													calendar.fullCalendar('renderEvent',prameter, true // make the event"stick"
															);
													
													var monthlength=start.getMonth()+1;
													if(monthlength>9){
														var month=(start.getMonth()+1);
													}else{
														var month=("0"+(start.getMonth()+1));
													}
													
													var Datelength=start.getDate();
													if(Datelength>9){
														var Date=start.getDate();
													}else{
														var Date="0"+start.getDate()
													}
													start = start.getFullYear()
															+ "-"
															+ month
															+ "-" + Date+" "+start.getHours()+":"+start.getMinutes();	
													
													if (end != null) {
														var endmonthlength=end.getMonth()+1
														if(endmonthlength>9){
															var endmonth=(end.getMonth()+1);
														}else{
															var endmonth=("0"+(end.getMonth()+1));
														}
														var endDatelength=end.getDate();
														if(endDatelength>9){
															var endDate=end.getDate();
														}else{
															var endDate="0"+end.getDate()
														}
														end = end.getFullYear()
																+ "-"
																+ endmonth
																+ "-"
																+ endDate+" "+end.getHours()+":"+end.getMinutes();
													}
													$.post("personalaffairs/ActivityByWeek_detailsUpdate_ajax.action?actiontype=save&leadname="+document.getElementById("leadname").value, {
														title : title[0],
														plannig: title[1],
														start : start,
														end : end,
														allDay : allDay
													}, function() {
													});
												}
												calendar
														.fullCalendar('unselect');

											},
											editable : true,
											events : function(start, end,
													callback) {
												var id = Math.ceil(Math.random()*35);
												$.ajax( {
														url : 'personalaffairs/ActivityByWeek_detailsLoadjax_ajax.action?id='+id,
														data : {		
													    start : Math.round(start.getTime() / 1000),
														end : Math.round(end.getTime() / 1000)
															},
														success : function(doc) {
												         // var detailsString=[{id: 9999,title: 'Repeating Eventme',start: '2013/1/3 16:0',end: '2013/1/3 19:0',allDay: false}];
														        var detailsString=doc.detailsString;
																detailsString = detailsString.replace(/^\s*/,'');													
																var eventJson = eval(detailsString);
																callback(eventJson);
															},
															error : function(
																	doc) {alert('����');
															}
														});
											}

										});
										

					});
</script>
</html>
