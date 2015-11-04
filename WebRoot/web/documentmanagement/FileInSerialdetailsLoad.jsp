
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
							<jtag:jlevel moduleId="module03020502"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<s:form id="update" name="update"
						action="documentmanagementajax/FileInSerial_detailsUpdate_ajax.action"
						method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId" ></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_Maintain.uuid" ></s:hidden>
						<s:hidden id="moduleIdS" name="moduleIdS" ></s:hidden>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="保 存" editCondition="*" />
									<input type="button" id="back" value="返 回" />
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
									收文类别：
								</td>
								<td width="70%">
									<jtag:jsl id="fileinTypeid" list="list_c_T_Sys_Maintain"
											name="b_T_Ufp_Filein_Serial.fileinTypeid" listKey="maintainId" listValue="maintainName"
											editCondition="*" headerKey=""
											headerValue="--请选择--" cssStyle="width:98%;">
										</jtag:jsl>
								</td>
							</tr>
							<tr>
								<td width="30%" class="ziduan">
									年&nbsp;&nbsp;&nbsp;&nbsp;份：
								</td>
								<td width="70%">
									<jtag:jtl id="fileinYear" cssClass="Wdate"
										name="b_T_Ufp_Filein_Serial.fileinYear"
										onclick="WdatePicker({readOnly:true,dateFmt:'yyyy'})"
										editCondition="*" maxlength="50"
										cssStyle="width:98%">
									</jtag:jtl>
								</td>
							</tr>
							<tr>
								<td width="30%" class="ziduan">
									流&nbsp;水&nbsp;号：
								</td>
								<td width="70%">
									<jtag:jtl id="fileinSerial" name="b_T_Ufp_Filein_Serial.fileinSerial"
										editCondition="*" maxlength="50" cssStyle="width:98%"/>
								</td>
							</tr>
							<tr>
								<td width="30%" class="ziduan">
									排&nbsp;序&nbsp;号：
								</td>
								<td width="70%">
									<jtag:jtl id="sort" name="b_T_Ufp_Filein_Serial.sort"
										editCondition="*" maxlength="50" cssStyle="width:98%"/>
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
				url : "maintenance/FileInSerial_detailsUpdate_ajax.action",
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
		
		$("#fileinTypeid,#fileinYear").validatebox( {
			required : true
		});
		
		$('#sort,#fileinSerial').numberbox({min:0,required:true});
	});
</SCRIPT>
</html>


