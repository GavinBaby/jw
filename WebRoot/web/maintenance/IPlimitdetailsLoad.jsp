
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
		<jtag:jhead />
		<script type="text/javascript" src="../../js/ztree/selectMenu.js"></script>
	</head>
	<body>

		<table width="900px" height="100%" border="0" cellpadding="0"
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
								��ǰλ�ã�IP����
							</td>
						</tr>
					</table>
					<form class="jNice">
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="�� ��" editCondition="*" />
									<jtag:jbutton id="back" value="�� ��" editCondition="*" />
								</td>
								<td>

								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0"
							class="biaodan">
							<tr>
								<td width="20%" class="ziduan">
									ģ�����ƣ�
								</td>
								<td width="30%">
									<jtag:jtl id="moduleName" name="c_T_Sys_Module.moduleId"
										editCondition="*" maxlength="50" />
								</td>
								<td width="20%" class="ziduan">
									�Ƿ����ã�
								</td>
								<td width="30%">
									<jtag:jtl id="moduleName" name="c_T_Sys_Module.moduleName"
										editCondition="*" maxlength="50" />
								</td>
								
							</tr>
							<tr>
								<td class="ziduan">
									���ö��
								</td>
								<td>
									<jtag:jtal id="moduleDescription"
                                        name="c_T_Sys_Module.moduleDescription" editCondition="*"
                                        cssStyle="width:98%;height:60" cols="100" />
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="17">
							<tr>
								<td></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>

	</body>
	<SCRIPT type="text/javascript">


	$(document).ready(function() {
		$("#back").bind("click", back);
		$("#save").bind("click", save);
		$("#selectModlue").bind("click", showMenu);
	});

	function back() {
		parent.$("#wBox").close();
	}

	function save() {

	}
</SCRIPT>
</html>


