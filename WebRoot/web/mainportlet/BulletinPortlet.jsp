
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
	<s:if test="listB_V_Ufp_Bulletin.size<=0">
		 <div id="div1">
		 <font color="gray">目前没有已发布的公告</font>
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
				<td width="30%" align="right">
					&nbsp;
				</td>
			</tr>
				<s:iterator value="listB_V_Ufp_Bulletin" status="list" begin="0" end="%{listB_V_Ufp_Bulletin.size<=8?listB_V_Ufp_Bulletin.size-1:8}">
					<tr>
						<td width="3%" align="center">
							·
						</td>
						<td align="left">
							<a href="javascript:window.parent.openNew('publicinformation/Bulletin_detailsLoad.action?mainDocId=<s:property value="uuid" />','通知公告',720,'auto');">
							<s:property value="title" />
							</a>
						</td>
						<td  align="right">
							[
							<s:property value="publishdate" />
							]
						</td>
					</tr>
				</s:iterator>
		</table>
		</s:else>
	</body>

</html>


