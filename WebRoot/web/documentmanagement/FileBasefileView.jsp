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
		<jtag:jhead/>
	</head>
	<body >
	<div style='width:630px;height:350px;overflow:scroll'>
		<table width="100%" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<td width="40" align="center">
								<img src="../../images/dqwz_tb.gif" width="15" height="15" />
							</td>
							<td align="left" class="gray_12">
								文件查看
								<s:property value="curTacheName" />
							</td>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<table width="99%" border="0" cellspacing="0" cellpadding="0"
						class="biaodan">
						<s:if test="list_c_T_Sys_File.size>0">
						<s:iterator value="list_c_T_Sys_File"
							id="list_c_T_Sys_File" status="index">
						<TR>
							<TD width="5%" align="left" class="ziduan">
								<s:property value="%{#index.index+1}"/>&nbsp;
							</TD>
							<TD width="95%" align="left" >
								&nbsp;<a href="../../uploadFile/<s:property value='%{list_c_T_Sys_File[#index.index].fileSvaePath}' />/<s:property value='%{list_c_T_Sys_File[#index.index].fileSvaeName}' />" target=_black><s:property value='%{list_c_T_Sys_File[#index.index].fileName}' /></a>
							</TD>
						</TR>
						</s:iterator>
						</s:if>
						<s:else>
						<TR>
							<TD align="center" >
								&nbsp;&nbsp;&nbsp;&nbsp;无附件
							</TD>
						</TR>
						</s:else>
					</TABLE>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="17">
						<tr>
							<td></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		
	});
</SCRIPT>
</html>
