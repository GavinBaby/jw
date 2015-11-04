
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
		<table width="800px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module05030000"></jtag:jlevel>
						</tr>
					</table>
					<s:form id="update" name="update"
						action="publicinformation/Memos_detailsUpdate_ajax.action"
						method="POST" cssClass="jNice">
						<s:hidden id="Uuid" name="b_T_Ufp_Memos.uuid"></s:hidden>
						<s:hidden id="registeredUser" name="b_T_Ufp_Memos.registeredUser"></s:hidden>
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="checkboxflag" name="checkboxflag"></s:hidden>
						<s:hidden id="updateTime" name="updateTime"></s:hidden>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="99%" border="0" cellspacing="0" cellpadding="0">
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
									登记时间：
								</td>
								<td width="25%">
									<jtag:jtl id="registeredTime"
										name="b_T_Ufp_Memos.registeredTime" editCondition="#"
										maxlength="50" cssStyle="width:98%" />
								</td>
								<td width="20%" class="ziduan">
									安排时间：
								</td>
								<td width="20%" colspan="2">
									<jtag:jtl id="arrangeTime" cssClass="Wdate"
										name="b_T_Ufp_Memos.arrangeTime"
										onclick="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})"
										editCondition="*" maxlength="50" cssStyle="width:99%"></jtag:jtl>
								</td>
							</tr>
							<tr>
								<td width="20%" class="ziduan">
									内&nbsp;&nbsp;&nbsp;&nbsp;容：
								</td>
								<TD width="80%" colspan="4" align="left">
									<jtag:jtal id="memos" name="b_T_Ufp_Memos.memos"
										editCondition="*" cssStyle="width:99%;height:50px" rows="15"
										cols="80"></jtag:jtal>
								</TD>
							</tr>
							<tr>
								<td width="20%" class="ziduan">
									备&nbsp;&nbsp;&nbsp;&nbsp;注：
								</td>
								<TD width="80%" colspan="4" align="left">
									<jtag:jtal id="remarks" name="b_T_Ufp_Memos.remarks"
										editCondition="*" cssStyle="width:99%;height:50px" rows="15"
										cols="80"></jtag:jtal>
								</TD>
							</tr>
							<tr>
								<td width="20%" class="ziduan">
									提醒时间：
								</td>
								<td width="20%">
									<jtag:jtl id="remindTime" cssClass="Wdate"
										name="b_T_Ufp_Memos.remindTime"
										onclick="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})"
										editCondition="*" maxlength="50" cssStyle="width:99%"></jtag:jtl>
								</td>
								<td width="20%">
									<jtag:jtl id="hour" cssClass="Wdate" name="b_T_Ufp_Memos.hour"
										onclick="WdatePicker({readOnly:true,dateFmt:'HH:mm'})"
										editCondition="*" maxlength="50" cssStyle="width:99%"></jtag:jtl>
								</td>
								<td width="20%" class="ziduan">
									提醒方式：
								</td>
								<td width="25%">
									<s:if test='checkboxflag =="1"'>
										<input type="checkbox" name="checkbox" value="1"
											checked="checked">
								短消息<br>
										<input type="checkbox" name="checkbox" value="2">
								待办事宜   
							</s:if>
									<s:elseif test='checkboxflag=="2"'>
										<input type="checkbox" name="checkbox" value="1">
								短消息<br>
										<input type="checkbox" name="checkbox" value="2"
											checked="checked">
								待办事宜   
							</s:elseif>
									<s:elseif test='checkboxflag=="3"'>
										<input type="checkbox" name="checkbox" value="1"
											checked="checked">
								短消息<br>
										<input type="checkbox" name="checkbox" value="2"
											checked="checked">
								待办事宜   
							</s:elseif>
								</td>

							</tr>
						</table>
						<font color="red" size="2">备注：如果不填则根据提醒方式马上发短信或待办事宜</font>
					</s:form>
				</td>
			</tr>
		</table>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {

		$("#save")
				.click(
						function(e) {
							var returnIsValid = $('#update').form('validate');
							if (returnIsValid) {
								var params = $("#update").serialize();
								var chk_value = [];
								$('input[name="checkbox"]:checked').each(
										function() {
											chk_value.push($(this).val());
										});
								var value = chk_value.toString();
								jQuery
										.ajax( {
											url : "publicinformationajax/Memos_detailsUpdate_ajax.action?chk_value="
													+ value,
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

		$('#arrangeTime').validatebox( {
			required : true
		});

	});
</SCRIPT>
</html>


