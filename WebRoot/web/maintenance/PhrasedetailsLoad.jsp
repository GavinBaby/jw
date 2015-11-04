
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
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="maintenanceajax/Phrase_detailsUpdate.action" method="POST"
						class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_Phrase.uuid"></s:hidden>
						<s:hidden id="selectModuleJson" name="selectModuleJson"></s:hidden>
						<s:hidden id="isPersonalPhrase" name="isPersonalPhrase"></s:hidden>
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
								<td width="40%" class="ziduan">
									模块名称：
								</td>
								<td width="60%">
									<jtag:jtl id="pModuleName" name="c_T_Sys_Phrase.moduleId"
										editCondition="*" maxlength="50" cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Sys_Phrase.sort"
										editCondition="*" maxlength="5" cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									常用短语：
								</td>
								<td>
									<jtag:jtal id="phraseBody" name="c_T_Sys_Phrase.phraseBody"
										editCondition="*" cssStyle="width:190px;height:160" cols="100" />
								</td>
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
			console.log(params);
			if (returnIsValid) {
				var params = $("#update").serialize();
				console.log(params);
				$.ajax( {
					url : "maintenance/Phrase_detailsUpdate_ajax.action",
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

		var treeStr = eval($('#selectModuleJson').val());
		$('#pModuleName').combotree();
		$('#pModuleName').combotree('loadData', treeStr);

		$('#phraseBody').textareaCount( {
			'maxCharacterSize' : 2000
		});

		$("#phraseBody").validatebox( {
			required : true
		});
		
		$('#sort').numberbox({
			min:0,
			required : true
		});  
	});
</SCRIPT>
</html>


