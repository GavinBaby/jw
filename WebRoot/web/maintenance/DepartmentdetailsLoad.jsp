
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
							<jtag:jlevel moduleId="module01010200"></jtag:jlevel>
						</tr>
					</table>
					<form id="update" name="update"
						action="maintenanceajax/Department_detailsUpdate.action"
						method="POST" class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="userType" name="userType"></s:hidden>
						<s:hidden id="uuid"
							name="c_T_Sys_Department.uuid"></s:hidden>
						<s:hidden id="selectUnitJson" name="selectUnitJson"></s:hidden>
						<s:hidden id="selectDeptJson" name="selectDeptJson"></s:hidden>
						<s:hidden id="updateTime" name="updateTime"></s:hidden>
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
									部门ID：
								</td>
								<td width="30%">
									<jtag:jtl id="deptId" name="c_T_Sys_Department.deptId"
										editCondition="*" maxlength="50" cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td width="20%" class="ziduan">
									部门名称：
								</td>
								<td width="30%">
									<jtag:jtl id="deptName" name="c_T_Sys_Department.deptName"
										editCondition="*" maxlength="100" cssStyle="width:190px" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_Department.sort"
										editCondition="*" maxlength="5" cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									上级部门：
								</td>
								<td>
									<jtag:jtl id="parenDeptid"
										name="c_T_Sys_Department.parenDeptid" editCondition="*"
										cssStyle="width:190px" />
								</td>
							</tr>

							<tr>
								<td class="ziduan">
									所属单位：
								</td>
								<td>
									<s:if test="userType==2">
										<jtag:jtl id="pUnitName" name="c_T_Sys_Department.unitId"
											editCondition="*" cssStyle="width:190px" />
									</s:if>
									<s:else>
										&nbsp;<s:property value="unitName" />
									</s:else>
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
				lockBox();
				var params = $("#update").serialize();
				$.ajax( {
					url : "maintenance/Department_detailsUpdate_ajax.action",
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
		
		if ($('#userType').val() == 2) {
			//所属单位下拉树
			var treeStr_unit = eval($('#selectUnitJson').val());
			
			var treeStr_dept;
			$('#pUnitName').combotree({
				onSelect : function(node) {
					
					$.ajax( {
						url : "maintenance/User_getDeptInforWithUnit_ajax.action?unitId=" + node.id + "&deptId=" + $('#deptId').val(),
						type : "POST",
						dataType : "json",
						success : function(data) {
							treeStr_dept = eval(data.selectDeptJson);
							$('#parenDeptid').combotree(
								'loadData',
								treeStr_dept);
							$('#parenDeptid').combotree('clear');
							$('#parenDeptid').combotree().tree('check',$('pUnitName').val());
							},
						error : ajaxError
						});
					},
					required : true
				});
			$('#pUnitName').combotree('loadData', treeStr_unit);

			$('#parenDeptid').combotree( {
				panelHeight : 150
			});
		} else {
			$('#parenDeptid').combotree( {
				panelHeight : 150
			});
			$('#parenDeptid').combotree('loadData',eval($('#selectDeptJson').val()));
		}
		$("#deptId,#deptName").validatebox( {
			required : true
		});
		
		$('#sort').numberbox({
			min:0,
			required : true
		});  
		
	});
	function callback(data) {
		unlockBox();
		ajaxMessage(data, 4);
	}
</SCRIPT>
</html>


