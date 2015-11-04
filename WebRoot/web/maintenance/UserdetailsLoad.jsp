
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
								<td width="15%" class="ziduan">
									系统名：
								</td>
								<td width="18%">
									<jtag:jtl id="userSysName" name="c_T_Sys_User.userSysName"
										editCondition="%{allPermission}" maxlength="50" cssStyle="width:142px" />
								</td>
								<td width="15%" class="ziduan">
									中文名：
								</td>
								<td width="19%">
									<jtag:jtl id="userName" name="c_T_Sys_User.userName"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td width="15%" class="ziduan">
									密码：
								</td>
								<td width="18%">
									<jtag:jtl id="userPwd" name="c_T_Sys_User.userPwd"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									所属单位：
								</td>
								<td>
									<s:if test="userType==2">
										<jtag:jtl id="pUnitName" name="c_T_Sys_User.unitId"
											editCondition="*" maxlength="100" cssStyle="width:142px" />
									</s:if>
									<s:else>
										<s:property value="unitName" />
									</s:else>
								</td>
								<td class="ziduan">
									所属部门：
								</td>
								<td>
									<jtag:jtl id="pDeptName" name="c_T_Sys_User.deptId"
										editCondition="*" maxlength="100" cssStyle="width:145px" />
								</td>
								<td class="ziduan">
									职务：
								</td>
								<td>
									<jtag:jtl id="positionName" name="c_T_Sys_User.positionName"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									出生年月：
								</td>
								<td>
									<jtag:jtl id="birthdate" name="c_T_Sys_User.birthdate"
										editCondition="*" maxlength="50" cssStyle="width:142px" />

								</td>
								<td class="ziduan">
									办公室电话：
								</td>
								<td>
									<jtag:jtl id="officephone" name="c_T_Sys_User.officephone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									手机号码：
								</td>
								<td>
									<jtag:jtl id="mobilephone" name="c_T_Sys_User.mobilephone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									短号：
								</td>
								<td>
									<jtag:jtl id="virtualphone" name="c_T_Sys_User.virtualphone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									家庭电话：
								</td>
								<td>
									<jtag:jtl id="homephone" name="c_T_Sys_User.homephone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									传真号码：
								</td>
								<td>
									<jtag:jtl id="faxphone" name="c_T_Sys_User.faxphone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									电子邮件：
								</td>
								<td>
									<jtag:jtl id="email" name="c_T_Sys_User.email"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									是否单位账号：
								</td>
								<td>
									<jtag:jsl id="isUnit" list="#{0:'否',1:'是'}"
										name="c_T_Sys_User.isUnit" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									是否主持工作：
								</td>
								<td>
									<jtag:jsl id="isWork" list="#{0:'否',1:'是'}"
										name="c_T_Sys_User.isWork" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									短信配额：
								</td>
								<td>
									<jtag:jtl id="sendSmsCount" name="c_T_Sys_User.sendSmsCount"
										editCondition="*" maxlength="50" cssStyle="width:100px;" />
									条/月
								</td>
								<td class="ziduan">
									邮箱配额：
								</td>
								<td>
									<jtag:jtl id="mailQuota" name="c_T_Sys_User.mailQuota"
										editCondition="*" maxlength="50" cssStyle="width:130px;" />
									M
								</td>
								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_User.sort" editCondition="*"
										maxlength="5" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									家庭地址：
								</td>
								<td colspan="3">
									<jtag:jtl id="homeAddess" name="c_T_Sys_User.homeAddess"
										editCondition="*" maxlength="50" cssStyle="width:430px;" />
								</td>
								<td class="ziduan">
									账号状态：
								</td>
								<td>
									<jtag:jsl id="state" list="#{1:'启用',0:'禁用'}"
										name="c_T_Sys_User.state" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									备注：
								</td>
								<td colspan="5">
									<jtag:jtal id="remark" name="c_T_Sys_User.remark"
										editCondition="*" cssStyle="width:730px;height:60" cols="100" />
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
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid) {
				//lockBox();
				var params = $("#update").serialize();
				$.ajax( {
					url : "maintenance/User_detailsUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback,
					error : ajaxError
				});
			}
		});
	
		$("#back").click(function(e) {
			closeBox();
		});
		var treeStr_dept;
		// 当用户为超级管理员时，读取单位信息和对应的部门信息
		if ($("#userType").val() == 2) {
			var treeStr_unit = eval($('#selectUnitJson').val());
			$('#pUnitName').combotree(
							{
								onSelect : function(node) {
									
									jQuery
											.ajax( {
												url : "maintenance/User_getDeptInforWithUnit_ajax.action?unitId="
														+ node.id,
												type : "POST",
												dataType : "json",
												success : function(data) {
													$('#pDeptName').combotree('clear');
													treeStr_dept = eval(data.selectDeptJson);
													$('#pDeptName').combotree('loadData',treeStr_dept);
													$('#pDeptName').combotree().tree('check',$('pDeptName').val());
												}
											});

								},
								required : true
							});
			$('#pUnitName').combotree('loadData', treeStr_unit);
		}
		
		$('#pDeptName').combotree( {
			required : true
		});
		// 当用户不为超级管理员时，根据当前用户单位取得部门信息
		
		if ($("#selectDeptJson").val() != '') {
			treeStr_dept = eval($('#selectDeptJson').val());
			$('#pDeptName').combotree('loadData', treeStr_dept);
		}

		$("#birthdate").datebox();

		$("#userName,#userPwd").validatebox( {
			required : true
		});

		$('#sort').numberbox({
			min:0,
			required : true
		});  
		$('#sendSmsCount,#mailQuota').numberbox({
			min:0
		});  

		$('#isUnit,#isWork,#state').combobox( {
			panelHeight : 42
		});

		$('#userSysName').validatebox( {
			required : true,
			missingMessage:"www"
		});
		
		
		$('#mobilephone').validatebox( {
			validType : "mobile"
		});
		
		
	});
	function callback(data) {
		ajaxMessage(data, 4);
	}
</SCRIPT>
</html>


