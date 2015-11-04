<%@ page contentType="text/html;charset=GBK"%>
<%@ page import="java.util.*" language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
		<jtag:jhead />
	</head>
	<body>
		<table width="600px" height="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0" height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<s:form id="update" name="update"  method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<table width="99%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">	
									<jtag:jbutton id="save" value="保 存" editCondition="#" />
									<jtag:jbutton id="back" value="返 回" editCondition="*" />
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0" height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="99%" height="202" border="0" cellpadding="0" cellspacing="0" class="biaodan">
							<tr>
								<td width="12%" height="10" class="ziduan" align="left">
									姓&nbsp;&nbsp;&nbsp;&nbsp;名：
								</td>
								<td width="35%" height="10" colspan="-2" align="left" >
									<jtag:jtl id="userName" name="b_V_Ufp_UnitAddress_Book.userName"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:99%" />
								</td>
								<td width="12%" height="10" colspan="-2" align="center" class="ziduan">
									排&nbsp;序&nbsp;号：
								</td>
								<td width="38%" height="10" colspan="-2" align="left">
									<jtag:jtl id="sort" name="bb_V_Ufp_UnitAddress_Book.sort"
										editCondition="%{allPermission}" maxlength="8" 
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td align="center" class="ziduan">
								单位类型：
								</td>
								<td colspan="-2" align="left">
									<jtag:jtl id="faxPhone" name="faxPhone"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:99%" />
								</td>								
								<td height="10" align="center" class="ziduan">
								单&nbsp;&nbsp;&nbsp;&nbsp;位：
								</td>
								<td height="10" colspan=3 align="left">
									<jtag:jtl id="unitName" name="b_V_Ufp_UnitAddress_Book.unitName"
										editCondition="%{allPermission}" maxlength="100" 
										cssStyle="width:100%" />
								</td>
							</tr>
							<tr>				
								<td height="10" align="center" class="ziduan">
									职&nbsp;&nbsp;&nbsp;&nbsp;务：
								</td>
								<td height="10" colspan="-2" align="left">
									<jtag:jtl id="positionName" name="b_V_Ufp_UnitAddress_Book.positionName"
										editCondition="%{allPermission}" maxlength="100" 
										cssStyle="width:99%" />
								</td>
								<td align="center" class="ziduan">
									传&nbsp;真&nbsp;号：
								</td>
								<td colspan="-2" align="left">
									<jtag:jtl id="faxPhone" name="b_V_Ufp_UnitAddress_Book.faxphone"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td height="10" align="center" class="ziduan">
									电话(办)：
								</td>
								<td height="10" colspan="-2" align="left">
									<jtag:jtl id="officePhone" name="b_V_Ufp_UnitAddress_Book.officephone"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:99%" />
								</td>
								<td height="10" colspan="-2" align="center" class="ziduan">
									电话(宅)：
								</td>
								<td height="10" colspan="-2" align="left">
									<jtag:jtl id="homePhone" name="b_V_Ufp_UnitAddress_Book.homephone"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td height="10" align="center" class="ziduan">
									手&nbsp;&nbsp;&nbsp;&nbsp;机：
								</td>
								<td height="10" colspan="-2" align="left">
									<jtag:jtl id="mobilePhone" name="b_V_Ufp_UnitAddress_Book.mobilephone"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:99%" />
								</td>
								<td height="10" colspan="-2" align="center" class="ziduan">
									虚&nbsp;拟&nbsp;号：
								</td>
								<td height="10" colspan="-2" align="left">
									<jtag:jtl id="virtualPhone" name="b_V_Ufp_UnitAddress_Book.virtualphone"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:99%" />
								</td>
							</tr>
						</table>
					</s:form>
					<table width="100%" border="0" cellspacing="0" cellpadding="0" height="17">
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
			saveDoc();
		});
		
		function saveDoc() {
			var params = $("#update").serialize();
			lockBox();
			jQuery.ajax( {
				url : "publicinformation/AddressBook_persondetailsUpdate_ajax.action",
				type : "POST",
				data : params,
				dataType : "json",
				success : callback
			});
		}
		$("#back").click(function(e) {
			closeBox();
		});		
	});
</SCRIPT>
</html>
