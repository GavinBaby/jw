
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

		<table width="350px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module01010500"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="maintenanceajax/Pluralism_detailsUpdate.action"
						method="POST" class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_Pluralism.uuid"></s:hidden>
						<s:hidden id="userSysName" name="c_T_Sys_Pluralism.userSysName"></s:hidden>
						<s:hidden id="selectDeptJson" name="selectDeptJson"></s:hidden>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
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
								<td width="40%" class="ziduan">
									用户名：
								</td>
								<td width="60%">
									<jtag:jtl id="userName" name="c_T_Sys_Pluralism.userName"
										editCondition="*" maxlength="50" cssStyle="width:185px"
										readonly="true" />
									<jtag:jbutton id="selUser" value="选择" editCondition="*" />
								</td>

							</tr>
							<tr>
								<td width="20%" class="ziduan">
									所属部门：
								</td>
								<td width="30%">
									<jtag:jtl id="deptId" name="c_T_Sys_Pluralism.deptId"
										editCondition="*" cssStyle="width:185px" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									担任职务：
								</td>
								<td>
									<jtag:jtl id="position" name="c_T_Sys_Pluralism.position"
										editCondition="*" maxlength="50" cssStyle="width:185px" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_Pluralism.sort"
										editCondition="*" maxlength="5" cssStyle="width:185px" />
								</td>
							</tr>

							<tr>
								<td class="ziduan">
									备注：
								</td>
								<td colspan="5">
									<jtag:jtal id="remark" name="c_T_Sys_Pluralism.remark"
										editCondition="*" cssStyle="width:185px;height:100" cols="100" />
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
		var treeStr = eval($('#selectDeptJson').attr("value"));
		$('#deptId').combotree( {
			required : true
		});
		$('#deptId').combotree('loadData', treeStr);

		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid) {
				var params = $("#update").serialize();
				$.ajax( {
					url : "maintenance/Pluralism_detailsUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback,
					error : ajaxError
				});
			}
		});
		function callback(data) {
			ajaxMessage(data, 1);
		}

		$("#back").click(function(e) {
			closeBox();
		});

		$("#selUser")
				.click(
						function(e) {
							openNew(
									"common/UserSelect_listLoad.action?parUId=userSysName&parUName=userName&isSglSel=0&uSelRa=1",
									"人员选择");
						});

		$("#userName,#position").validatebox( {
			required : true
		});
		
		$('#sort').numberbox({
			min:0,
			required : true
		});  
	});
</SCRIPT>
</html>


