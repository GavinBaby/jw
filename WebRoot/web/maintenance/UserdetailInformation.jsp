
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
	</head>
	<body>

		<table width="900px" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module01010300"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="maintenanceajax/User_detailsUpdate.action" method="POST"
						class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_User.uuid"></s:hidden>
						<s:hidden id="userType" name="userType"></s:hidden>
						<s:hidden id="selectUnitJson" name="selectUnitJson"></s:hidden>
						<s:hidden id="selectDeptJson" name="selectDeptJson"></s:hidden>
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
								<td width="16%" class="ziduan">
									ϵ&nbsp;ͳ&nbsp;����
								</td>
								<td width="22%">
									<jtag:jtl id="userSysName" name="c_T_Sys_User.userSysName"
										editCondition="#" maxlength="50" cssStyle="width:98%" />
								</td>
								<td width="16%" class="ziduan">
									��&nbsp;��&nbsp;����
								</td>
								<td width="22%">
									<jtag:jtl id="userName" name="c_T_Sys_User.userName"
										editCondition="#" maxlength="50" cssStyle="width:98%" />
								</td>
								<td width="5%" class="ziduan" rowspan='5' align='center'>
									��&nbsp;<br></br>Ƭ&nbsp;
								</td>
								<td width="19%" rowspan='5' align='center'>
									<jtag:jimage id="upload1" moduleId="module01010300" imageH="170" imageW="150"
                                        mainId="c_T_Sys_User.uuid" editCondition="*" />	
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									������λ��
								</td>
								<td>
									<jtag:jtl id="unitName" name="unitName"
										editCondition="#" maxlength="100" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									�������ţ�
								</td>
								<td>
									<jtag:jtl id="deptId" name="deptId"
										editCondition="#" maxlength="100" cssStyle="width:98%" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									ְ&nbsp;&nbsp;&nbsp;&nbsp;��
								</td>
								<td>
									<jtag:jtl id="positionName" name="c_T_Sys_User.positionName"
										editCondition="#" maxlength="50" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									�������£�
								</td>
								<td>
									<jtag:jtl id="birthdate" name="c_T_Sys_User.birthdate" cssClass="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})"
										editCondition="*" maxlength="50" cssStyle="width:98%" />

								</td>
								
							</tr>
							<tr>
								<td class="ziduan">
									��ͥ�绰��
								</td>
								<td>
									<jtag:jtl id="homephone" name="c_T_Sys_User.homephone"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									�칫�绰��
								</td>
								<td>
									<jtag:jtl id="officephone" name="c_T_Sys_User.officephone"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									�ֻ����룺
								</td>
								<td>
									<jtag:jtl id="mobilephone" name="c_T_Sys_User.mobilephone"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									��&nbsp;&nbsp;&nbsp;&nbsp;�ţ�
								</td>
								<td>
									<jtag:jtl id="virtualphone" name="c_T_Sys_User.virtualphone"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									�����ʼ���
								</td>
								<td colspan="5">
									<jtag:jtl id="email" name="c_T_Sys_User.email" 
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									��ͥ��ַ��
								</td>
								<td colspan="5">
									<jtag:jtal id="homeAddess" name="c_T_Sys_User.homeAddess"
										editCondition="*"  cssStyle="width:98%;height:60" cols="100" />
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
	$(function() {
		$('#upload1').uploadify(new imageObject("upload1",false,"1","30MB","*.jpg;*.gif;")); 
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid) {
				var params = $("#update").serialize();
				$.ajax( {
					url : "maintenance/User_detailsUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback
				});
			}
		});
		function callback(data) {
			ajaxMessage(data,2);
		}
		$("#back").click(function(e) {
			closeBox();
		});
	});
</SCRIPT>
</html>


