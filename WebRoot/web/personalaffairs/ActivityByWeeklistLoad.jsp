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
		<jtag:jhead />
		<style type="text/css">
<!--
body {
	font-size: 12px;
	line-height: 150%;
	color: #000000;
}

a {
	text-decoration: none
}

A:hover {
	color: #ff6600;
	text-decoration: none
}
-->
</style>
	</head>
	<body>
		<div>
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module08010101"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="10">
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
			<s:form cssClass="jNice">
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="�� ��"
								editCondition="%{allPermission}" />
						</td>
					</tr>
				</table>
			</s:form>

			<div class="biaodan_title"
				style="text-align: center; font-size: 16px; font-weight: bold;">
				�쵼һ�ܹ������Ż��ܱ�
			</div>
			<div
				style="width: 100%; overflow: auto; overflow-x: hidden; margin: 0 auto">
				<form id="update" name="update" method="post">
					<table width="96%" border="0" cellpadding="5" cellspacing="1"
						bgcolor="#3886c6" align="center"
						style="font-size: 12px; line-height: 150%;">
						<s:if test="list_B_V_Uft_Activity.size()!=0">
							<tr valign="top">
								<td width="10%" colspan="2" align="center" valign="middle"
									bgcolor="#e5f1f4">
									&nbsp;
									<br />
								</td>
								<td width="10%" align="center" valign="middle" bgcolor="#e5f1f4">
									��һ
									<br />
									${time[0]}
								</td>
								<td width="10%" align="center" valign="middle" bgcolor="#e5f1f4">
									�ܶ�
									<br />
									${time[1]}
								</td>
								<td width="10%" align="center" valign="middle" bgcolor="#e5f1f4">
									����
									<br />
									${time[2]}
								</td>
								<td width="10%" align="center" valign="middle" bgcolor="#e5f1f4">
									����
									<br />
									${time[3]}
								</td>
								<td width="10%" align="center" valign="middle" bgcolor="#e5f1f4">
									����
									<br />
									${time[4]}
								</td>
								<td width="10%" align="center" valign="middle" bgcolor="#e5f1f4">
									����
									<br />
									${time[5]}
								</td>
								<td width="10%" align="center" valign="middle" bgcolor="#e5f1f4">
									����
									<br />
									${time[6]}
								</td>
							</tr>
						</s:if>

						<s:iterator value="list_B_V_Uft_Activity" id="activity"
							status="index">
							<tr valign="top">
								<td width="20%" colspan="2" align="center" valign="middle"
									bgcolor="#FFFFFF">
									${userName}
								</td>
								<td bgcolor="#FFFFFF">
									<s:if test="monday==null||monday==''">&nbsp;</s:if>
									<a href="javascript:void(0);" onclick="openNew('personalaffairs/ActivityByWeek_detailsLoad.action?startTime='+${time[0]}, '�쵼�������ŵǼ�', 1000, 530, id);">
									<s:property
										value="monday.replaceAll(' ', '&nbsp;').replaceAll('\r\n', '<BR/>').replaceAll('\r', '<BR/>').replaceAll('\n', '<BR/>')"
										escape="false" /></a>
								</td>
								<td bgcolor="#FFFFFF">
									<s:if test="tuesday==null||tuesday==''">&nbsp;</s:if>
									<a href="javascript:void(0);" onclick="openNew('personalaffairs/ActivityByWeek_detailsLoad.action?startTime='+${time[1]}, '�쵼�������ŵǼ�', 1000, 530, id);">
									<s:property
										value="tuesday.replaceAll(' ', '&nbsp;').replaceAll('\r\n', '<BR/>').replaceAll('\r', '<BR/>').replaceAll('\n', '<BR/>')"
										escape="false" />
									</a>
								</td>
								<td bgcolor="#FFFFFF">
									<s:if test="wednesday==null||wednesday==''">&nbsp;</s:if>
									<a href="javascript:void(0);" onclick="openNew('personalaffairs/ActivityByWeek_detailsLoad.action?startTime='+${time[2]}, '�쵼�������ŵǼ�', 1000, 530, id);">
									<s:property
										value="wednesday.replaceAll(' ', '&nbsp;').replaceAll('\r\n', '<BR/>').replaceAll('\r', '<BR/>').replaceAll('\n', '<BR/>')"
										escape="false" />
									</a>
								</td>
								<td bgcolor="#FFFFFF">
									<s:if test="thursday==null||thursday==''">&nbsp;</s:if>
									<a href="javascript:void(0);" onclick="openNew('personalaffairs/ActivityByWeek_detailsLoad.action?startTime='+${time[3]}, '�쵼�������ŵǼ�', 1000, 530, id);">
									<s:property
										value="thursday.replaceAll(' ', '&nbsp;').replaceAll('\r\n', '<BR/>').replaceAll('\r', '<BR/>').replaceAll('\n', '<BR/>')"
										escape="false" />
									</a>
								</td>
								<td bgcolor="#FFFFFF">
									<s:if test="friday==null||friday==''">&nbsp;</s:if>
									<a href="javascript:void(0);" onclick="openNew('personalaffairs/ActivityByWeek_detailsLoad.action?startTime='+${time[4]}, '�쵼�������ŵǼ�', 1000, 530, id);">
									<s:property
										value="friday.replaceAll(' ', '&nbsp;').replaceAll('\r\n', '<BR/>').replaceAll('\r', '<BR/>').replaceAll('\n', '<BR/>')"
										escape="false" />
									</a>
								</td>
								<td bgcolor="#FFFFFF">
									<s:if test="saturday==null||saturday==''">&nbsp;</s:if>
									<a href="javascript:void(0);" onclick="openNew('personalaffairs/ActivityByWeek_detailsLoad.action?startTime='+${time[5]}, '�쵼�������ŵǼ�', 1000, 530, id);">
									<s:property
										value="saturday.replaceAll(' ', '&nbsp;').replaceAll('\r\n', '<BR/>').replaceAll('\r', '<BR/>').replaceAll('\n', '<BR/>')"
										escape="false" />
									</a>
								</td>
								<td bgcolor="#FFFFFF">
									<s:if test="sunday==null||sunday==''">&nbsp;</s:if>
									<a href="javascript:void(0);" onclick="openNew('personalaffairs/ActivityByWeek_detailsLoad.action?startTime='+${time[6]}, '�쵼�������ŵǼ�', 1000, 530, id);">
									<s:property
										value="sunday.replaceAll(' ', '&nbsp;').replaceAll('\r\n', '<BR/>').replaceAll('\r', '<BR/>').replaceAll('\n', '<BR/>')"
										escape="false" />
									</a>
								</td>
							</tr>
						</s:iterator>
					</table>
					<s:if test="list_B_V_Uft_Activity.size()==0">
					    <br/>
						<h1 style="color: #FF0000; text-align: center">
							��ǰһ�ܹ�������δ������
						</h1>
					</s:if>
				</form>
			</div>
		</div>


		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			height="7">
			<tr>
				<td></td>
			</tr>
		</table>


		<div>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#new").click(
				function(e) {
					var id = Math.ceil(Math.random() * 35);
					openNew(
							"personalaffairs/ActivityByWeek_detailsLoad.action?random="
									+ id, "�쵼�������ŵǼ�", 1000, 530, id);
				});
	});
</SCRIPT>
</html>