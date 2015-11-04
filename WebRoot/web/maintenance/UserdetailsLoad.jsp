
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
								<td width="15%" class="ziduan">
									ϵͳ����
								</td>
								<td width="18%">
									<jtag:jtl id="userSysName" name="c_T_Sys_User.userSysName"
										editCondition="%{allPermission}" maxlength="50" cssStyle="width:142px" />
								</td>
								<td width="15%" class="ziduan">
									��������
								</td>
								<td width="19%">
									<jtag:jtl id="userName" name="c_T_Sys_User.userName"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td width="15%" class="ziduan">
									���룺
								</td>
								<td width="18%">
									<jtag:jtl id="userPwd" name="c_T_Sys_User.userPwd"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									������λ��
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
									�������ţ�
								</td>
								<td>
									<jtag:jtl id="pDeptName" name="c_T_Sys_User.deptId"
										editCondition="*" maxlength="100" cssStyle="width:145px" />
								</td>
								<td class="ziduan">
									ְ��
								</td>
								<td>
									<jtag:jtl id="positionName" name="c_T_Sys_User.positionName"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									�������£�
								</td>
								<td>
									<jtag:jtl id="birthdate" name="c_T_Sys_User.birthdate"
										editCondition="*" maxlength="50" cssStyle="width:142px" />

								</td>
								<td class="ziduan">
									�칫�ҵ绰��
								</td>
								<td>
									<jtag:jtl id="officephone" name="c_T_Sys_User.officephone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									�ֻ����룺
								</td>
								<td>
									<jtag:jtl id="mobilephone" name="c_T_Sys_User.mobilephone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									�̺ţ�
								</td>
								<td>
									<jtag:jtl id="virtualphone" name="c_T_Sys_User.virtualphone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									��ͥ�绰��
								</td>
								<td>
									<jtag:jtl id="homephone" name="c_T_Sys_User.homephone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									������룺
								</td>
								<td>
									<jtag:jtl id="faxphone" name="c_T_Sys_User.faxphone"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									�����ʼ���
								</td>
								<td>
									<jtag:jtl id="email" name="c_T_Sys_User.email"
										editCondition="*" maxlength="50" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									�Ƿ�λ�˺ţ�
								</td>
								<td>
									<jtag:jsl id="isUnit" list="#{0:'��',1:'��'}"
										name="c_T_Sys_User.isUnit" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:142px" />
								</td>
								<td class="ziduan">
									�Ƿ����ֹ�����
								</td>
								<td>
									<jtag:jsl id="isWork" list="#{0:'��',1:'��'}"
										name="c_T_Sys_User.isWork" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									������
								</td>
								<td>
									<jtag:jtl id="sendSmsCount" name="c_T_Sys_User.sendSmsCount"
										editCondition="*" maxlength="50" cssStyle="width:100px;" />
									��/��
								</td>
								<td class="ziduan">
									������
								</td>
								<td>
									<jtag:jtl id="mailQuota" name="c_T_Sys_User.mailQuota"
										editCondition="*" maxlength="50" cssStyle="width:130px;" />
									M
								</td>
								<td class="ziduan">
									����ţ�
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_User.sort" editCondition="*"
										maxlength="5" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									��ͥ��ַ��
								</td>
								<td colspan="3">
									<jtag:jtl id="homeAddess" name="c_T_Sys_User.homeAddess"
										editCondition="*" maxlength="50" cssStyle="width:430px;" />
								</td>
								<td class="ziduan">
									�˺�״̬��
								</td>
								<td>
									<jtag:jsl id="state" list="#{1:'����',0:'����'}"
										name="c_T_Sys_User.state" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:142px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									��ע��
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
		// ���û�Ϊ��������Աʱ����ȡ��λ��Ϣ�Ͷ�Ӧ�Ĳ�����Ϣ
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
		// ���û���Ϊ��������Աʱ�����ݵ�ǰ�û���λȡ�ò�����Ϣ
		
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


