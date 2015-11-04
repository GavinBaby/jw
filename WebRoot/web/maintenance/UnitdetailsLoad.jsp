
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
							<jtag:jlevel moduleId="module01010100"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="maintenanceajax/Unit_detailsUpdate.action" method="POST"
						class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_Unit.uuid"></s:hidden>
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
									单位ID：
								</td>
								<td width="30%">
									<jtag:jtl id="unitId" name="c_T_Sys_Unit.unitId"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td width="20%" class="ziduan">
									单位名称：
								</td>
								<td width="30%">
									<jtag:jtl id="unitName" name="c_T_Sys_Unit.unitName"
										editCondition="*" maxlength="50"
										cssStyle="width:190px" />
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									单位地址：
								</td>
								<td>
									<jtag:jtl id="unitAddress" name="c_T_Sys_Unit.unitAddress" editCondition="*"
										maxlength="200"
										cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									单位传真：
								</td>
								<td>
									<jtag:jtl id="faxphone" name="c_T_Sys_Unit.faxphone" editCondition="*"
										maxlength="50"
										cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									单位网址：
								</td>
								<td>
									<jtag:jtl id="website" name="c_T_Sys_Unit.website" editCondition="*"
										maxlength="50"
										cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_Unit.sort" editCondition="*"
										maxlength="5"
										cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									是否启用：
								</td>
								<td>
									<jtag:jsl id="state" list="#{1:'启用',0:'禁用'}"
										name="c_T_Sys_Unit.state" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:190px" />
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
				var params = $("#update").serialize();
				$.ajax( {
					url : "maintenance/Unit_detailsUpdate_ajax.action",
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
		
		$('#state').combobox( {
			panelHeight : 42
		});
		
		$("#unitId,#unitName").validatebox( {
			required : true
		});
		
		$('#sort').numberbox({
			min:0,
			required : true
		});  
	});
	function callback(data) {
		ajaxMessage(data, 1);
	}
</SCRIPT>
</html>


