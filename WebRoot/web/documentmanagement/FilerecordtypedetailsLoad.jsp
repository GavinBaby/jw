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
		<table width="400px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module03010501"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<s:form id="update" name="update"
						action="documentmanagementajax/Filerecordtype_detailsUpdate_ajax.action"
						method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId" ></s:hidden>
						<s:hidden id="uuid" name="b_T_Ufp_FileRecordType.uuid" ></s:hidden>
						<s:hidden id="modules" name="modules" ></s:hidden>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="�� ��" editCondition="*" />
									<input type="button" id="back" value="�� ��" />
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
								<td width="30%" class="ziduan">
									�������
								</td>
								<td width="70%">
									<jtag:jtl id="recordtypeName" name="b_T_Ufp_FileRecordType.recordtypeName"
										editCondition="*" maxlength="50" cssStyle="width:90%"/>
								</td>
							</tr>
							<tr>
								<td width="30%" class="ziduan">
									��&nbsp;��&nbsp;�ţ�
								</td>
								<td width="70%">
									<jtag:jtl id="sort" name="b_T_Ufp_FileRecordType.sort"
										editCondition="*" maxlength="50" cssStyle="width:90%"/>
								</td>
							</tr>
						</table>
					</s:form>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="17">
						<tr>
							<td></td>
						</tr>
					</table>
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
			jQuery.ajax( {
				url : "documentmanagementajax/Filerecordtype_detailsUpdate_ajax.action",
				type : "POST",
				data : params,
				dataType : "json",
				success : callback
			});
		});
		function callback(data) {
			ajaxMessage(data, 1);
		}
		$("#back").click(function(e) {
			closeBox();
		});
		
		$("#recordtypeName").validatebox( {
			required : true
		});
		$('#sort').numberbox({min:0,required:true});
	});
</SCRIPT>
</html>


