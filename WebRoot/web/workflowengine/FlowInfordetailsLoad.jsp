
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
					<s:form id="update" name="update"
						action="workflowengineajax/FlowInfor_detailsUpdate.action"
						method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="selectModuleJson" name="selectModuleJson"></s:hidden>
						<s:hidden id="uuid" name="c_T_Flow_Infor.uuid"></s:hidden>
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

							<TR>
								<TD width="30%" align="center" class="ziduan">
									流程编号：
								</TD>
								<TD width="70%" align="left" class="Tdcellright">
									<jtag:jtl id="folwId" name="c_T_Flow_Infor.flowId"
										editCondition="*" maxlength="100" cssStyle="width:225px"></jtag:jtl>
								</TD>

							</TR>
							<tr>
								<TD width="30%" align="center" class="ziduan">
									流程名称：
								</TD>
								<TD width="70%" align="left" class="Tdcellright">
									<jtag:jtl id="flowName" name="c_T_Flow_Infor.flowName"
										editCondition="*" maxlength="100" cssStyle="width:225px"></jtag:jtl>
								</TD>
							</tr>
							<tr>
								<td class="ziduan">
									对应模块：
								</td>
								<td>
									<jtag:jtl id="moduleName" name="c_T_Flow_Infor.moduleId"
										editCondition="*" maxlength="100" cssStyle="width:225px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="sort" name="c_T_Flow_Infor.sort"
										editCondition="*" maxlength="100" cssStyle="width:225px" />
								</td>
							</tr>
							<tr>
								<TD width="12%" align="center" class="ziduan">
									是否启用：
								</TD>

								<TD width="12%" colspan="5" align="left" class="Tdcellright">
									<jtag:jsl id="isEnable" list="#{1:'启用',0:'禁用'}"
										name="c_T_Flow_Infor.isEnable" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:225px" />
								</TD>
							</tr>
							<tr>
								<TD width="12%" align="center" class="ziduan">
									说明：
								</TD>

								<TD width="12%" colspan="5" align="left" class="Tdcellright">
									<jtag:jtal id="remark" name="c_T_Flow_Infor.remark"
										editCondition="*" cssStyle="width:225px;height:150px"
										rows="15" cols="80"></jtag:jtal>
								</TD>
							</tr>

						</TABLE>
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
			$.ajax( {
				url : "FlowInfor_detailsUpdate_ajax.action",
				type : "POST",
				data : params,
				dataType : "json",
				success : callback,
				error : ajaxError
			});
		});
		function callback(data) {
			ajaxMessage(data, 1);
		}
		$("#back").click(function(e) {
			closeBox();
		});

		$('#isEnable').combobox( {
			panelHeight : 42
		});
		
		var treeStr = eval($('#selectModuleJson').attr("value"));
		$('#moduleName').combotree( {
			required : true
		});
		$('#moduleName').combotree('loadData', treeStr);

		$("#folwId,#flowName,#sort").validatebox( {
			required : true
		});

		$('#remark').textareaCount( {
			'maxCharacterSize' : 2000
		});
	});
</SCRIPT>
</html>


