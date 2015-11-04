
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
		<table width="650px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module01031200"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="maintenanceajax/Task_detailsUpdate.action" method="POST"
						class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_TaskConfig.uuid"></s:hidden>
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
									任务名称：
								</td>
								<td width="30%">
									<jtag:jtl id="taskName" name="c_T_Sys_TaskConfig.taskName"
										editCondition="*" maxlength="50" 
										cssStyle="width:190px" />
								</td>
								<td width="20%" class="ziduan">
									是否启用：
								</td>
								<td width="30%">
									<jtag:jsl id="isUsed" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_TaskConfig.isUsed" listKey="key" listValue="value"
										editCondition="*" cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									定时器类型：
								</td>
								<td >
									<jtag:jsl id="schedulerType" list="list_c_T_Sys_TaskTimer"listKey="uuid"
										listValue="timerName"name="c_T_Sys_TaskConfig.schedulerType"headerKey=""
										headerValue="--请选择--" editCondition="*" cssStyle="width:190px" />
								</td>
								<td class="ziduan">
									方&nbsp;法&nbsp;名：
								</td>
								<td >
									<jtag:jtl id="methodName" name="c_T_Sys_TaskConfig.methodName" editCondition="*"
										maxlength="500"cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									任务描述：
								</td>
								<td  colspan="3">
									<jtag:jtal id="taskDetail" name="c_T_Sys_TaskConfig.taskDetail"
										editCondition="*"cssStyle="width:99%;height:50px" rows="15" cols="80"/>
								</td>

							</tr>
							<tr>
								<td class="ziduan">
									类&nbsp;路&nbsp;径：
								</td>
								<td colspan="3">
									<jtag:jtl id="classPath" name="c_T_Sys_TaskConfig.classPath" editCondition="*"
										maxlength="500"cssStyle="width:98%" />
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
					url : "maintenance/TaskConfig_detailsUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback,
					error : ajaxError
				});
			}
		});

		$("#delete").click(function(e) {
			deleteDateAjax("documentmanagement/TaskConfig_detailsDelete_ajax.action");
		});
				
		$("#back").click(function(e) {
			closeBox();
		});
		
		
		$("#taskName,#classPath,#isUsed,#schedulerType").validatebox( {
			required : true
		});
		function callback(data) {
			ajaxMessage(data, 1);
		}
	});
	
</SCRIPT>
</html>


