
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link rel="stylesheet" href="../../css/cssmain.css" type="text/css"></link>
		<style style="text/css">
		#div1 {
			position: absolute;
			width: 100px;
			height: 50px;
			left: 50%;
			top: 50%;
			margin-left: -50px;
			margin-top: -25px;
			border: 0px solid #000
		}
		</style>
	</head>
	<body style="background: #ffffff">
		<s:if test="0==0">
			<div id="div1">
				<font color="gray">暂无会议日程信息</font>
			</div>
		</s:if>
		<s:else>
			<table width="98%" border="0" cellspacing="0" cellpadding="0"
				align="center" class="black_12_24">
				<tr>
					<td width="100%" align="center"></td>
				</tr>
			</table>
		</s:else>
	</body>
</html>


