
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
									<jtag:jbutton id="save" value="保 存" editCondition="*" />
									<jtag:jbutton id="back" value="返 回" editCondition="*" />
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
									系&nbsp;统&nbsp;名：
								</td>
								<td width="22%">
									<jtag:jtl id="userSysName" name="c_T_Sys_User.userSysName"
										editCondition="#" maxlength="50" cssStyle="width:98%" />
								</td>
								<td width="16%" class="ziduan">
									中&nbsp;文&nbsp;名：
								</td>
								<td width="22%">
									<jtag:jtl id="userName" name="c_T_Sys_User.userName"
										editCondition="#" maxlength="50" cssStyle="width:98%" />
								</td>
								<td width="5%" class="ziduan" rowspan='5' align='center'>
									照&nbsp;<br></br>片&nbsp;
								</td>
								<td width="19%" rowspan='5' align='center'>
									<jtag:jimage id="upload1" moduleId="module01010300" imageH="170" imageW="150"
                                        mainId="c_T_Sys_User.uuid" editCondition="*" />	
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									所属单位：
								</td>
								<td>
									<jtag:jtl id="unitName" name="unitName"
										editCondition="#" maxlength="100" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									所属部门：
								</td>
								<td>
									<jtag:jtl id="deptId" name="deptId"
										editCondition="#" maxlength="100" cssStyle="width:98%" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									职&nbsp;&nbsp;&nbsp;&nbsp;务：
								</td>
								<td>
									<jtag:jtl id="positionName" name="c_T_Sys_User.positionName"
										editCondition="#" maxlength="50" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									出生年月：
								</td>
								<td>
									<jtag:jtl id="birthdate" name="c_T_Sys_User.birthdate" cssClass="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})"
										editCondition="*" maxlength="50" cssStyle="width:98%" />

								</td>
								
							</tr>
							<tr>
								<td class="ziduan">
									家庭电话：
								</td>
								<td>
									<jtag:jtl id="homephone" name="c_T_Sys_User.homephone"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									办公电话：
								</td>
								<td>
									<jtag:jtl id="officephone" name="c_T_Sys_User.officephone"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									手机号码：
								</td>
								<td>
									<jtag:jtl id="mobilephone" name="c_T_Sys_User.mobilephone"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									短&nbsp;&nbsp;&nbsp;&nbsp;号：
								</td>
								<td>
									<jtag:jtl id="virtualphone" name="c_T_Sys_User.virtualphone"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									电子邮件：
								</td>
								<td colspan="5">
									<jtag:jtl id="email" name="c_T_Sys_User.email" 
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									家庭地址：
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


