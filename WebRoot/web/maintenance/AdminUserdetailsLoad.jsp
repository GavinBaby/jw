
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
		<table width="600px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
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
						<s:hidden id="isAdmin" name="c_T_Sys_User.isAdmin"></s:hidden>
						<s:hidden id="selectUnitJson" name="selectUnitJson"></s:hidden>
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
								<td width="20%" class="ziduan">
									管理员系统名：
								</td>
								<td width="30%">
									<jtag:jtl id="userSysName" name="c_T_Sys_User.userSysName"
										editCondition="%{allPermission}" maxlength="50"
										cssStyle="width:98%" />
								</td>
								<td width="20%" class="ziduan">
									管理员中文名：
								</td>
								<td width="30%">
									<jtag:jtl id="userName" name="c_T_Sys_User.userName"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									管理员密码：
								</td>
								<td>
									<jtag:jtl id="userPwd" name="c_T_Sys_User.userPwd"
										editCondition="*" maxlength="50" cssStyle="width:98%" />
								</td>

								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_User.sort" editCondition="*"
										maxlength="50" cssStyle="width:98%" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									所属单位：
								</td>
								<td>
									<jtag:jtl id="pUnitName" name="c_T_Sys_User.unitId"
										editCondition="*" maxlength="100" cssStyle="width:160px" />
								</td>
								<td class="ziduan">
									所属部门：
								</td>
								<td>
									<jtag:jtl id="pDeptName" name="c_T_Sys_User.deptId"
										editCondition="*" maxlength="100" cssStyle="width:160px" />
								</td>
							</tr>
							<tr>

								<td class="ziduan">
									账号状态：
								</td>
								<td>
									<jtag:jsl id="state" list="#{1:'启用',0:'禁用'}"
										name="c_T_Sys_User.state" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:160px" />
								</td>
								<td>
									&nbsp;
								</td>
								<td>
									&nbsp;
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									备注：
								</td>
								<td colspan="3">
									<jtag:jtal id="remark" name="c_T_Sys_User.remark"
										editCondition="*" cssStyle="width:98%;height:150" cols="100" />
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

		$("#sort").numberbox({
			min:0,
			required : true
		});
		
		$("#userName,#userSysName,#userPwd").validatebox( {
			required : true
		});
		
		$('#state').combobox( {
			panelHeight : 42
		});
		
		var treeStr_unit = eval($('#selectUnitJson').val());
		var treeStr_dept = eval($('#selectDeptJson').val());
		$('#pUnitName').combotree({
			onSelect : function(node) {  
	            
	            $.ajax( {
					url : "maintenance/User_getDeptInforWithUnit_ajax.action?unitId="+node.id,
					type : "POST",
					dataType : "json",
					success : function(data){
						treeStr_dept = eval(data.selectDeptJson);
						$('#pDeptName').combotree('clear');
						$('#pDeptName').combotree('loadData', treeStr_dept);
  						$('#pDeptName').combotree().tree('check',$('pDeptName').val());
					},
					error : ajaxError
				});
	            
	    	},
	    	required : true  
	    });
		$('#pUnitName').combotree('loadData', treeStr_unit);
		$('#pDeptName').combotree( {
			required : true
		});
	});
	
	function callback(data) {
			unlockBox();
			ajaxMessage(data, 4);
		}
</SCRIPT>
</html>


