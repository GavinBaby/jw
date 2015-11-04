
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<!--<script type="text/javascript" src="../../js/artDialog/artDialog.source.js?skin=blue"></script>
<script type="text/javascript" src="../../js/jquery1.6.2.js"></script>
<script type="text/javascript" src="../../js/nboa/common/err.js"></script>
<script type="text/javascript" src="../../js/nboa/purchase/purchase.js"></script>
 -->
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
							<jtag:jlevel moduleId="module15000001"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="" method="POST"
						class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="P_Info.uuid"></s:hidden>
						 
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
									<jtag:jtl id="applyName" name="P_Info.applyName"
										editCondition="*" maxlength="50" cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									排序号：
								</td>
								<td>
									<jtag:jtl id="leadSView" name="P_Info.leadSView"
										editCondition="*" maxlength="5" cssStyle="width:190px" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									常用短语：
								</td>
								<td>
									<jtag:jtal id="leadFVie" name="P_Info.leadFView"
										editCondition="*" cssStyle="width:190px;height:160" cols="100" />
								</td>
							</tr>
						</table>
						<s:iterator var="row" value="P_Info.lists">
						    <input  name="P_Info.lists.code" value="${row.code}" />
						    <input   name="P_Info.lists.name" value="${row.name}" />
						</iterator>
					</form>
				</td>
			</tr>
		</table>

	</body>
	<SCRIPT type="text/javascript">
	$(function() {

console.log(123);
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			console.log(params);
			if (returnIsValid) {
				var params = $("#update").serialize();
				console.log(params);
				$.ajax( {
					url : "Purchase_detailsUpdate_ajax.action",
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
	   
	});
</SCRIPT>
</html>
