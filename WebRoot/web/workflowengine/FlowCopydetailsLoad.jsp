
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
						method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="flowId" name="flowId"></s:hidden>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="确  定" editCondition="*" />

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
								<TD width="40%" align="center" class="ziduan">
									复制对象：
								</TD>
								<TD width="60%" align="left" class="Tdcellright">
									<jtag:jsl id="copyFlowId" list="listC_T_Flow_Infor"
										name="copyFlowId" listKey="flowId" listValue="flowName"
										editCondition="*" cssStyle="width:220px" />
								</TD>

							</TR>
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
		
			//如果判断选择的复制流程为当前流程
			if($("#flowId").val() == $("#copyFlowId").val())
			{
				art.dialog.alert("不能选择当前流程！");
				return fales();
			}
		
			var params = $("#update").serialize();
			lockBox();
			$.ajax( {
				url : "FlowCopy_detailsUpdate_ajax.action",
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

	});
	function callback(data) {
		ajaxMessage(data, 1);
	}
</SCRIPT>
</html>


