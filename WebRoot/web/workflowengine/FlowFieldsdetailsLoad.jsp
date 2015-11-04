
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
							<jtag:jlevel moduleId="module01020100"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="workflowengine/FlowFields_detailsUpdate.action" method="POST"
						 class="jNice">
						<s:hidden id="uuid" name="c_T_Flow_Field.uuid"></s:hidden>
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="flowId" name="flowId"></s:hidden>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="±£ ¥Ê" editCondition="*" />
									
									<jtag:jbutton  id="back" value="∑µ ªÿ" editCondition="*" />
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
									”Ú±‡∫≈£∫
								</td>
								<td width="30%">
									<jtag:jtl id="fieldId" name="c_T_Flow_Field.fieldId"
										editCondition="*" maxlength="50" cssStyle="width:98%"/>
								</td>
							</tr>
							<tr>
								<td width="20%" class="ziduan">
									”Ú√˚≥∆£∫
								</td>
								<td width="30%">
									<jtag:jtl id="fieldName" name="c_T_Flow_Field.fieldName"
										editCondition="*" maxlength="50" cssStyle="width:98%"/>
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
				url : "workflowengine/FlowFields_detailsUpdate_ajax.action",
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
								
		$("#fieldId,#fieldName").validatebox( {
			required : true
		});
		
	});	
		
	function callback(data) {
		ajaxMessage(data,1);
	}

</SCRIPT>
</html>


