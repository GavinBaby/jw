
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
	</head>
	<body style="background:#ffffff">
	<table width="98%" border="0" cellspacing="0" cellpadding="0" align="center" class="black_12_24">
 <s:iterator value="listC_T_Sys_BasePortlet" status="list">
  <tr>
    <td width="3%" align="center">¡¤</td>
    <td align="left"><s:property value="title" /></td>
    <td width="10%" align="center"><s:property value="registerdate" /></td>
  </tr>
  </s:iterator>
</table>
	</body>
	
</html>


