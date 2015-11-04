
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
		<link rel="stylesheet" href="../../css/pwdcheck/style.css">
	<script src="../../js/pwdcheck/jquery.complexify.js"></script>
	
	<script src="../../js/pwdcheck/jquery.placeholder.min.js"></script>
	
	<script src="../../js/pwdcheck/raphael.2.1.0.min.js"></script>
	
	<script src="../../js/pwdcheck/justgage.1.0.1.min.js"></script>
		
	</head>
	<body>

		<table width="300px" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="maintenanceajax/User_detailsUpdate.action" method="POST"
						class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="c_T_Sys_User.uuid"></s:hidden>
						<s:hidden id="oldPwd" name="c_T_Sys_User.userPwd"></s:hidden>
						<s:hidden id="newPwd" name="newPwd"></s:hidden>
						
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
								<td  class="ziduan">
									现在的密码：
								</td>
								<td >
									<input type="password" id="nowpassword"  class="easyui-validatebox" data-options="required:true" style="width: 150px;"  />
								</td>
							</tr>
							<tr>
								<td  class="ziduan">
									设置新的密码：
								</td>
								<td >
									<input type="password" id="password"  class="easyui-validatebox" data-options="required:true" style="width: 150px;"  />
								</td>
							</tr>
							<tr>
								<td  class="ziduan">
									重复新的密码：
								</td>
								<td >
									<input type="password" id="confirmPassword" class="easyui-validatebox" data-options="required:true" style="width: 150px;" />
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
<div id="complexity" align="center"></div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		
		var g1 = new JustGage({
			  id: "complexity", 
			  value: 0, 
			  min: 0,
			  max: 100,
			  title: "密码强度提示",
			  titleFontColor: '#9d7540',
			  valueFontColor : '#CCCCCC',
			  label: "points",
				levelColors: [
				  "#dfa65a",
				  "#926d3b",
				  "#584224"
				]    
			});	
	
			//$('input[password]').placeholder();
			$("#password").complexify({}, function(valid, complexity){
								
				g1.refresh(Math.round(complexity));	
			});
	
	
		$('#upload1').uploadify(new imageObject("upload1",false,"1","30MB","*.jpg;*.gif;")); 
		$("#save").click(function(e) {
			
			var returnIsValid = ($('#update').form('validate'))&&(!checkNewPasswordConfirm());
			if (returnIsValid) {
				$("#newPwd").val($("#confirmPassword").val());
				var params = $("#update").serialize();
				$.ajax( {
					url : "maintenance/User_passwordUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback,
					error : ajaxError
				});
			}
		});
		function callback(data) {
			ajaxMessage(data,2);
		}
		$("#back").click(function(e) {
			closeBox();
		});
		
		//检查新密码确认
		function checkNewPasswordConfirm(){
			var hasErr = false;
			if($("#confirmPassword").val()!= $("#password").val()){
				art.dialog.opener.art.dialog.alert("您两次输入的新密码不一致，请确认！");
				hasErr  = true;
			}
			if($("#oldPwd").val()!= $("#nowpassword").val()){
				art.dialog.opener.art.dialog.alert("现在的密码输入不正确！");
				hasErr  = true;
			}
			return hasErr;
		}
	});
</SCRIPT>
</html>


