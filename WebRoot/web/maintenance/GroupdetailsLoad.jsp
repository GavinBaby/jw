
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
							<jtag:jlevel moduleId="module01010400"></jtag:jlevel>
						</tr>
					</table>
					<s:form id="update" name="update"
						action="maintenanceajax/Group_detailsUpdate.action" method="POST"
						cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_Group.uuid"></s:hidden>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<input type="button" id="save" value="保 存" />
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
							<TR>
								<TD width="20%" align="center" class="biaodan_ziduan">
									<div align="center">
										群组编号：
									</div>
								</TD>
								<TD width="70%" align="left" class="Tdcellright">
									<jtag:jtl id="groupId" name="c_T_Sys_Group.groupId"
										editCondition="*" maxlength="50" cssStyle="width:220px"></jtag:jtl>
								</TD>

							</TR>
							<tr>
								<TD width="30%" align="center" class="biaodan_ziduan">
									<div align="center">
										群组名称：
									</div>
								</TD>
								<TD width="70%" align="left" class="Tdcellright">
									<jtag:jtl id="groupName" name="c_T_Sys_Group.groupName"
										editCondition="*" maxlength="50" cssStyle="width:220px"></jtag:jtl>
								</TD>

							</tr>
							<tr>
								<TD width="30%" align="center" class="biaodan_ziduan_center">
									<div align="center">
										群组类别：
									</div>
								</TD>

								<TD width="70%" align="left" class="Tdcellright">
									<jtag:jsl id="groupType" list="#{1:'用于导航权限控制',2:'用于按钮权限控制'}"
										name="c_T_Sys_Group.groupType" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:220px" />
								</TD>
							</tr>
							<tr>
								<TD width="30%" align="center" class="biaodan_ziduan_center">
									<div align="center">
										排序号：
									</div>
								</TD>

								<TD width="70%" align="left" class="Tdcellright">
									<jtag:jtl id="sort" name="c_T_Sys_Group.sort" editCondition="*"
										maxlength="5" cssStyle="width:220px"></jtag:jtl>
								</TD>
							</tr>
							<tr>
								<TD width="12%" align="center" class="biaodan_ziduan_center">
									<div align="center">
										群组说明：
									</div>
								</TD>

								<TD width="12%" colspan="5" align="left" class="Tdcellright">
									<jtag:jtal id="remark" name="c_T_Sys_Group.remark"
										editCondition="*" cssStyle="width:220px;height:50px" rows="15"
										cols="80"></jtag:jtal>
								</TD>
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
			if (returnIsValid == false) {
				return false;
			}
			var params = $("#update").serialize();
			lockBox();
			$.ajax( {
				url : "maintenance/Group_detailsUpdate_ajax.action",
				type : "POST",
				data : params,
				dataType : "json",
				success : callback,
				error : ajaxError
			});
		});
		$("#back").click(function(e) {
			closeBox();
		});

		$("#groupId,#groupName").validatebox( {
			required : true
		});

		$('#sort').numberbox({
			min:0,
			required : true
		});  
		
		$('#groupType').combobox( {
			panelHeight : 42
		});

		$('#remark').textareaCount( {
			'maxCharacterSize' : 2000
		});
		
	});
	function callback(data) {
		unlockBox();
		ajaxMessage(data, 1);
	}
</SCRIPT>
</html>


