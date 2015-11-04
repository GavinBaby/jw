
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<!-- 框架通用js引用 -->
		<script type="text/javascript" src="../../js/JwCommon.js">
</script>
		<script type="text/javascript" src="../../js/jquery1.6.2.js">
</script>

		<!-- artDialog插件js/css引用 -->
		<script src="../../js/artDialog/artDialog.source.js?skin=blue">
</script>
		<script src="../../js/artDialog/iframeTools.source.js">
</script>

		<title>办公自动化系统</title>
	</head>

	<Body>
		<br>
		<table border="0" width="100%">
			<tr>
				<td width="100%">
					<font color="#FF0000" style="FONT-SIZE: 12pt; FONT-FAMILY: 宋体;"><b>收回确认：</b>
					</font>
				</td>
			</tr>
			<tr>
				<td width="100%">
					<font color="#0000FF" style="FONT-SIZE: 12pt; FONT-FAMILY: 宋体;">
						您确定收回此文档？ </font>
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
									<input id="ok" type=button class=btn3 style="cursor: hand;"
										value="确 定">
								</td>
								<td width="45" height="23" align="center" valign="middle">
									<input id="close" type=button class=btn3 style="cursor: hand;"
										value="关 闭">
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
	$(function() {
		$("#ok").click(function(){
		 var nextTacheInfo = "3####false#false";
		 art.dialog.opener.$("#nextTacheInfo").val(nextTacheInfo);
		 art.dialog.opener.saveDoc();
		 closeBox(); 
		});
		$("#close").click(function(){
			 closeBox();
			});
	});
	</SCRIPT>
</html>