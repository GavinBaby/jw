
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
	<s:if test="listB_V_Ufp_Mail.size<=0">
		 <div id="div1">
		 <font color="gray">目前没有新邮件</font>
		 </div>  
		</s:if>
		<s:else>
		<table width="98%" border="0" cellspacing="0" cellpadding="0"
			align="center" class="black_12_24">
			<tr>
				<td width="5%" align="center">
					&nbsp;
				</td>
				<td align="left">
					&nbsp;
				</td>
				<td width="5%" align="center">
					&nbsp;
				</td>
			</tr>
				<s:iterator value="listB_V_Ufp_Mail" status="list" begin="0" end="%{listB_V_Ufp_Mail.size<=4?listB_V_Ufp_Mail.size-1:4}">
					<tr>
						<td width="5%" align="center">
							·
						</td>
						<td align="left">
							<a href="javascript:onGoto('<s:property value="uuid" />','<s:property value="mailType" />');">
							
							<s:property value="title" />
							</a>
						</td>
						<td width="5%" align="center">

						</td>
					</tr>
				</s:iterator>
		</table>
		</s:else>
	</body>

<SCRIPT type="text/javascript">
	function onGoto(uuid,mailType){
		if(mailType==2){
			window.parent.openNewNoLock("publicinformation/Mail_sendlistLoad.action?mainDocId="+uuid+"&mailType="+mailType,"最新邮件",880,600);
		}else{
			window.parent.openNewNoLock("publicinformation/Mail_detailsLoad.action?mainDocId="+uuid+"&mailType="+mailType,"最新邮件",880,600);
		}
	}
	</SCRIPT>
</html>


