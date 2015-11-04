
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
		<table width="400px" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module14060100"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="publicinformationajax/MeetingEquipments_detailsUpdate.action" method="POST"
						class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
					    <s:hidden id="uuid" name="b_T_Ufp_Meeting_Equipments.uuid"></s:hidden>
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
									设备名称：
								</td>
								<td width="85%">
									<jtag:jtl id="equipmentName" name="b_T_Ufp_Meeting_Equipments.equipmentName"
										editCondition="%{allPermission}" maxlength="100" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td width="15%" class="ziduan">
									排&nbsp;序&nbsp;号：
								</td>
								<td width="85%">
									<jtag:jtl id="sort" name="b_T_Ufp_Meeting_Equipments.sort"
										editCondition="%{allPermission}" maxlength="50" cssStyle="width:98%" />
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
				jQuery.ajax( {
					url : "publicinformation/MeetingEquipments_detailsUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback
				});
			}
		});
		function callback(data) {
			ajaxMessage(data, 1);
		}
		$("#back").click(function(e) {
			closeBox();
		});
		$('#sort').numberbox({min:0,required:true});
		$('#equipmentName').validatebox({required:true});
	});
</SCRIPT>
</html>
