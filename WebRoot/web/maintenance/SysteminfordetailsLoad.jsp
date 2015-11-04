
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
		<link rel="stylesheet" href="../../css/validationEngine.jquery.css"
			type="text/css" media="screen" title="no title" charset="utf-8" />
		<script type="text/javascript" src="../../js/ztree/selectMenu.js">
</script>
		<script src="../../js/jquery.validationEngine-cn.js"
			type="text/javascript">
</script>
		<script src="../../js/jquery.validationEngine.js"
			type="text/javascript">
</script>
	</head>
	<body>

		<table width="100%" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module01030100"></jtag:jlevel>
						</tr>
					</table>
					<form id="update" name="update" method="POST" class="jNice">
						<s:hidden id="uuid" name="c_T_Sys_System_Infor.uuid"></s:hidden>
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
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
									系统名称：
								</td>
								<td colspan="3">
									<jtag:jtl id="systemName"
										name="c_T_Sys_System_Infor.systemName" editCondition="*"
										maxlength="100" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan" width="20%">
									版本号：
								</td>
								<td width="30%">
									<jtag:jtl id="systemVersion"
										name="c_T_Sys_System_Infor.systemVersion" editCondition="*"
										cssStyle="width:98%"
										maxlength="100" />
								</td>
								<td class="ziduan" width="20%">
									版本信息：
								</td>
								<td width="30%">
									<jtag:jtl id="systemCopyright"
										name="c_T_Sys_System_Infor.systemCopyright" editCondition="*"
										cssStyle="width:98%"
										maxlength="100" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									数据库版本：
								</td>
								<td>
									<jtag:jsl id="datebaseVersion" list="#{0:'Oracle',1:'sqlServer'}"
										name="c_T_Sys_System_Infor.datebaseVersion" listKey="key"
										listValue="value" editCondition="*"cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									中间件版本：
								</td>
								<td>
									<jtag:jsl id="releaseVersion" list="#{0:'Tomcat',1:'Weblogic'}"
										name="c_T_Sys_System_Infor.releaseVersion" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									操作系统版本：
								</td>
								<td>
									<jtag:jsl id="osVersion" list="#{0:'Windows',1:'Linux'}"
										name="c_T_Sys_System_Infor.osVersion" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									是否启用锁屏功能：
								</td>
								<td>
									<jtag:jsl id="canLockScreen" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_System_Infor.canLockScreen" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									是否单用户登入：
								</td>
								<td>
									<jtag:jsl id="canSingleUser" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_System_Infor.canSingleUser" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									是否启用密码取回：
								</td>
								<td>
									<jtag:jsl id="canRetrievePwd" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_System_Infor.canRetrievePwd" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									是否启用用户锁定：
								</td>
								<td>
									<jtag:jsl id="canLockUser" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_System_Infor.canLockUser" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									是否启用用户IP绑定：
								</td>
								<td>
									<jtag:jsl id="canIpLimit" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_System_Infor.canIpLimit" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									是否启用CA认证：
								</td>
								<td>
									<jtag:jsl id="canCa" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_System_Infor.canCa" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:98%" />
								</td>
								<td class="ziduan">
									是否使用验证码：
								</td>
								<td>
									<jtag:jsl id="canVerificationCode" list="#{0:'禁用',1:'启用'}"
										name="c_T_Sys_System_Infor.canVerificationCode" listKey="key"
										listValue="value" editCondition="*" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									网页失效时间设置：
								</td>
								<td>
									<jtag:jtl id="sessionExpirationTime"
										name="c_T_Sys_System_Infor.sessionExpirationTime"
										editCondition="*" maxlength="10" cssStyle="width:85%" />
									分钟
								</td>
								<td class="ziduan">
									&nbsp;
								</td>
								<td>
									&nbsp;
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
					url : "maintenance/Systeminfor_detailsUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback,
					error : ajaxError
				});
			}
		});

		$('#systemName,#systemVersion,#systemCopyright').validatebox({  
		    required:true  
		}); 

		$('#sessionExpirationTime').numberbox({  
    		min:0, 
    		precision:0  
		});  
	});	
	
	function callback(data) {
		ajaxMessage(data,1);
	}
		
</SCRIPT>
</html>


