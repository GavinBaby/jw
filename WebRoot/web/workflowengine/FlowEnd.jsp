<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
<jtag:jhead />
		<link href="../../css/global.css" rel="stylesheet" type="text/css">
		<link href="../../css/layout.css" rel="stylesheet" type="text/css">
		<link href="../../css/biaodan.css" rel="stylesheet" type="text/css">
		<link href="../../css/mo4css.css" rel="stylesheet" type="text/css">
		<script src="../../js/jquery-1.4.2.js" type="text/javascript"></script>
		<title>办公自动化系统</title>
		<style type="text/css">
<!--
.STYLE1 {
	font-size: 14px;
	color: #ff7e00;
	line-height: 22px;
	font-weight: bold;
}
-->
</style>
	</head>

	<body >
		<table width="100%" height="80" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#f9fcff"
			style="border-bottom: #87a3c1 1px solid;">
			<tr>
				<td align="center">
					<span class="STYLE1">点击【保存】按钮<br /> 该文档将流转结束！</span>
				</td>
			</tr>
		</table>
		<table width="100%" height="40" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#dae6f5"
			style="border-bottom: #87a3c1 1px solid;">
			<tr>
				<td align="center">
					<button id="ok" class=btn1_mouseout onMouseOver=this.className
						= 'btn1_mouseover';
onMouseOut=this.className
						= 'btn1_mouseout';
onMouseDown=this.className
						= 'btn1_mousedown';
onMouseUp=this.className='btn1_mouseup';
>
						保 存
					</button>
					&nbsp;&nbsp;
					<button id="close"  class=btn1_mouseout onMouseOver=this.className
						= 'btn1_mouseover';
onMouseOut=this.className
						= 'btn1_mouseout';
onMouseDown=this.className
						= 'btn1_mousedown';
onMouseUp="this.className='btn1_mouseup'" >
						关 闭
					</button>
				</td>
			</tr>
		</table>
	</body>
	
		<SCRIPT type="text/javascript">

		var ls_Separator3 = "#";
		$(function() {
			$("#ok").click(function(){
			var nextTacheInfo = "*" + ls_Separator3 +"1"+ ls_Separator3 +"1"+ ls_Separator3+"1"+ ls_Separator3+"1"+ ls_Separator3+"1"+ ls_Separator3;
			 art.dialog.opener.$("#nextTacheInfo").val(nextTacheInfo);
	         
			 art.dialog.opener.$("#save").click();
			 closeBox();
			});
			$("#close").click(function(){
				
				 closeBox();
				});
			setTimeout(function(){ 
				art.dialog.data('api').size(350, 130).position('50%','50%');
			}, 10);  
		});
	
	</SCRIPT>
</html>
