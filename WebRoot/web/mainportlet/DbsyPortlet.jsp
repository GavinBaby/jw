
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
			<style type="text/css">
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
	<s:if test="listC_V_Sys_Todomatters.size<=0">
		 <div id="div1">
		 <font color="gray">目前没有代办事宜</font>
		 </div>  
		</s:if>
		<s:else>
		<table width="98%" border="0" cellspacing="0" cellpadding="0"
			align="center" class="black_12_24">
			<tr>
				<td width="3%" align="center">
					&nbsp;
				</td>
				<td align="left">
					&nbsp;
				</td>
				<td width="30%" align="center">
					&nbsp;
				</td>
			</tr>
				<s:iterator value="listC_V_Sys_Todomatters" id="matters" status="list" begin="0" end="%{listC_V_Sys_Todomatters.size<=8?listC_V_Sys_Todomatters.size-1:8}">
					<tr>
						<td width="3%" align="center">
							·
						</td>
						<td align="left">
							<s:if test="moduleName == '发文管理'">
							<a href="javascript:window.parent.openNewNoLock('<s:property value="url" />','代办事宜',915,600);">
							</s:if>
							<s:if test="moduleName == '会议管理'">
							<a href="javascript:window.parent.openNewNoLock('<s:property value="url" />','代办事宜',830,500);">
							</s:if>
							<s:if test="moduleName == '收文管理'">
							<a href="javascript:window.parent.openNewNoLock('<s:property value="url" />','代办事宜',860,600);">
							</s:if>
							<s:if test="moduleName == '文件传输'">
							<a href="javascript:window.parent.openNewNoLock('<s:property value="url" />','代办事宜',915,500);">
							</s:if>
							<s:if test="moduleName == '发文管理'">
							<a href="javascript:window.parent.openNewNoLock('<s:property value="url" />','代办事宜',915,600);">
							</s:if>
							<s:else>
							<a href="javascript:window.parent.openNewNoLock('<s:property value="url" />','${moduleName}',915,500);">
							</s:else>
							<s:property value="title" />
							</a>
						</td>
						<td width="30%" align="right">
							<s:if test="createTime!=''">
								[
								<s:property value="userName"/>
								&nbsp;&nbsp;
								<s:property value="#matters.createTime.substring(0,10)" />
								]
							</s:if>
						</td>
					</tr>
				</s:iterator>
		</table>
		</s:else>
	</body>

</html>


