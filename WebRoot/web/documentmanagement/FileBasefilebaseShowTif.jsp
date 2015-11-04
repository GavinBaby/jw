
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
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
	<head>
		<jtag:jhead />
	</head>
<body style="margin-top:7px;" onLoad="FunOpenDefault();">
<div style="algin:center;">
    <s:hidden id="documentbaseFilepath" name="documentbaseFilepath"></s:hidden>
		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			class="biaodan">
		<tr>
			<TD width="12%" class="ziduan">
				公文标题：
            </td>
            <td   colspan='3' width="38%" align="center">
            &nbsp;${b_T_Ufp_FilesBase.documentbaseTitle}
            </td>
		</tr>
	</table>
	<table width="100%" border="0" cellspacing="0" cellpadding="0"
		height="7">
		<tr>
			<td></td>
		</tr>
	</table>
</div>
<div>
	<object id="SiriusTifView" classid="CLSID:A3D9E8B2-C766-4B53-949C-861A64FD34A4" codebase="SiriusTifView.CAB#version=1,0,0,4" width="100%" height="88%">
		<param id="FileName" name="FileName" value="" />
	</object>
</div>
</body>
<script language="javascript">
function FunOpenDefault()
{
    var TifView = window.document.getElementById ("SiriusTifView");
    var documentbaseFilepath = $("#documentbaseFilepath").val();
    var filepath ="<%=basePath%>uploadFile/"+documentbaseFilepath;
    TifView.filename = filepath;
}

function FunOpenLocal()
{
    var TifView = window.document.getElementById ("SiriusTifView");

    TifView.FileName = fileTif.value;
}
</script>
</html>


