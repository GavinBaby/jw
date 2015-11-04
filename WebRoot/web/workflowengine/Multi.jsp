
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
<jtag:jhead />
		<style type="text/css">
.content {
	font: 9pt/ 14pt "宋体"
}

.b1 {
	color: #FFFFFF;
	BACKGROUND-COLOR: #7C9CDE;
	border-color: #CCCCE6;
	BORDER-BOTTOM: 1px ridge;
	BORDER-LEFT: #ffffff 1px ridge;
	BORDER-RIGHT: 1px ridge;
	BORDER-TOP: #ffffff 1px ridge;
	FONT-SIZE: 12px;
	HEIGHT: 14pt
}

a:link {
	color: #0000CC;
	text-decoration: none
}

a:visited {
	color: #000066;
	text-decoration: none
}

a:active {
	color: #FF0000;
	text-decoration: none
}

a:hover {
	color: #FF0000;
	text-decoration: underline
}

</style>

		<title>办公自动化系统</title>
	</head>

	<Body oncontextmenu=self.event.returnValue=false>
		<br>
		<table border="0" width="100%">
			<tr>
				<td width="100%">
					<font color="#FF0000" style="FONT-SIZE: 9pt; FONT-FAMILY: 宋体;"><b>提示：</b>
					</font>
				</td>
			</tr>
			<tr>
				<td width="100%">
					<font color="#0000FF" style="FONT-SIZE: 9pt; FONT-FAMILY: 宋体;">
						这份文件还需要<font color='#FF00FF'>〖<s:property value="multiUserName" />〗</font>进行处理，请<font color='#008080'>【保存】</font>此份文件！

					</font>
				</td>
			</tr>
			<tr>
				<td width="100%">
					<p align="center">
						<table cellpadding=0 cellspacing=0 valign="middle" align="center">
							<tr>
								<td width="10" height="23" align="right" valign="middle">
								</td>
								<td width="45" height="23" align="center" valign="middle">
									<br>
									<br>
									<input id="ok" type=button class=btn3 style="cursor: hand;"
										value="保 存">
								</td>
								<td width="8" height="23" align="left" valign="middle">
								</td>
							</tr>
						</table>
				</td>
			</tr>
		</table>
	</body>
	
	<SCRIPT type="text/javascript">
	var ls_Separator3 = "#";
	$(function() {
		
		$("#ok").click(function(){
		var nextTacheInfo = "5" + ls_Separator3 +"1"+ ls_Separator3 +"1"+ ls_Separator3+"1"+ ls_Separator3+"1"+ ls_Separator3+"1"+ ls_Separator3;
		 art.dialog.opener.$("#nextTacheInfo").val(nextTacheInfo);
         
		 art.dialog.opener.$("#save").click();
		 closeBox();
		});
		setTimeout(function(){ 
			art.dialog.data('api').size(350, 130).position('50%','50%');
		}, 10);  
		
	});
	
	</SCRIPT>
</html>