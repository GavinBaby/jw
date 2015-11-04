
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
					<s:form id="update" name="update"
						action="maintenanceajax/Role_detailsUpdate.action" method="POST"
						cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid"
                            name="c_T_Sys_Role.uuid"></s:hidden>
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
									角色编号：
								</td>
								<td width="50%">
									<jtag:jtl id="roleId" name="c_T_Sys_Role.roleId"
										editCondition="*" maxlength="50"
										cssStyle="width:175px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									角色名：
								</td>
								<td>
									<jtag:jtl id="roleName" name="c_T_Sys_Role.roleName"
										editCondition="*" maxlength="50"
										cssStyle="width:175px" />
								</td>
							</tr>
							<tr>

								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_Role.sort" editCondition="*"
										maxlength="5"
										cssStyle="width:175px" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									流程中是否显示：
								</td>
								<td>
									<jtag:jsl id="isFlowShow" list="#{0:'不显示',1:'显示'}"
										name="c_T_Sys_Role.isFlowShow" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:175px" />
								</td>

							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="17">
							<tr>
								<td></td>
							</tr>
						</table>
					</s:form>
				</td>
			</tr>
		</table>

	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid) {
				var params = $("#update").serialize();
				$.ajax( {
					url : "maintenance/Role_detailsUpdate_ajax.action",
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

		$("#roleId,#roleName").validatebox( {
			required : true
		});

		$('#sort').numberbox({
			min:0,
			required : true
		});  

		$('#isFlowShow').combobox( {
			panelHeight : 42
		});
	});
</SCRIPT>
</html>


