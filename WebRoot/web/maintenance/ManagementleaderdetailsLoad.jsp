
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
		<table width="500px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module01010700"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="maintenanceajax/Managementleader_detailsUpdate.action"
						method="POST" class="jNice">
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="保 存" editCondition="*" />
									<jtag:jbutton id="back" value="返 回" editCondition="*" />
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
									分管领导：
								</td>
								<td width="70%">
									<jtag:jtl id="leadername"
										name="c_V_Sys_ManagementleaderGroup.userName"
										editCondition="*" readonly="true" cssStyle="width:70%"></jtag:jtl>
									<s:hidden id="leaderid"
										name="c_V_Sys_ManagementleaderGroup.systemUserId"></s:hidden>
									<jtag:jbutton id="selUser" value="选择" editCondition="*" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									对应部门：
								</td>
								<td>
									<jtag:jtal id="depnames" editCondition="*" cols="50" rows="4"
										name="c_V_Sys_ManagementleaderGroup.depnames"
										cssStyle="width:70%" readonly="true" />
									<s:hidden id="depids"
										name="c_V_Sys_ManagementleaderGroup.depids"></s:hidden>
									<jtag:jbutton id="selUploadDept" value="选择" editCondition="*" />
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
		$("#save")
				.click(
						function(e) {
							var returnIsValid = $('#update').form('validate');
							if (returnIsValid) {
								var params = $("#update").serialize();
								$
										.ajax( {
											url : "maintenance/Managementleader_detailsUpdate_ajax.action",
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

		$("#leadername,#depnames").validatebox( {
			required : true
		});
		$("#selUser")
				.click(
						function(e) {
							openNew(
									"common/UserSelect_listLoad.action?parUId=leaderid&parUName=leadername&isSglSel=0&deptSelRa=1",
									"人员选择");
						});
		$("#selUploadDept")
				.click(
						function(e) {
							openNew(
									"common/DeptSelect_listLoad.action?parUId=depids&parUName=depnames&isSglSel=1&deptSelRa=1",
									"部门选择");
						});
	});
	function callback(data) {
		ajaxMessage(data,1);
	}
</SCRIPT>
</html>


