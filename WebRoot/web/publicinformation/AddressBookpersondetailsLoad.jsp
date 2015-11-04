<%@ page contentType="text/html;charset=GBK"%>
<%@ page import="java.util.*" language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String fileName = UUID.randomUUID().toString() + ".doc";
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
					<s:form id="update" name="update" action="publicinformation/AddressBook_detailsUpdate_ajax.action" method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="categoryIdS" name="categoryIdS" />
						<s:hidden id="updateTime" name="updateTime"></s:hidden>
						<table width="99%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="�� ��" editCondition="*" />
									<jtag:jbutton id="back" value="�� ��" editCondition="*" />
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0" height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="99%" height="280" border="0" cellpadding="0" cellspacing="0" class="biaodan">
							<tr>
								<td width="12%" height="43" align="center" class="ziduan">
									��&nbsp;&nbsp;&nbsp;&nbsp;����
								</td>
								<td width="35%" height="43" colspan="-2" align="center">
									<jtag:jtl id="userName" name="b_T_Ufp_Address_Book.userName"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:99%" />
								</td>
								<td width="12%" height="43" colspan="-2" align="center" class="ziduan">
									��&nbsp;��&nbsp;�ţ�
								</td>
								<td width="38%" height="43" colspan="-2" align="center">
									<jtag:jtl id="sort" name="b_T_Ufp_Address_Book.sort"
										editCondition="%{allPermission}" maxlength="5" 
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td height="46" align="center" class="ziduan">
									��&nbsp;&nbsp;&nbsp;&nbsp;λ��
								</td>
								<td height="46" align="center">
									<jtag:jtl id="unitName" name="b_T_Ufp_Address_Book.unitName"
										editCondition="%{allPermission}" maxlength="100" 
										cssStyle="width:98%" />
								</td>
								<td height="46" align="center" class="ziduan">
									��&nbsp;&nbsp;&nbsp;&nbsp;��
								</td>
								<td align="center">
									  <jtag:jsl id="categoryId"
										list="listAddressBookgetPersonAddressBook"		
										name="b_T_Ufp_Address_Book.categoryId" listKey="uuid" listValue="maintainName" editCondition="%{allPermission}"
										headerKey="" headerValue="--��ѡ��--" cssStyle="width:98%" ></jtag:jsl>	
								</td>
							</tr>
							<tr>
								<td height="46" align="center" class="ziduan">
									��&nbsp;&nbsp;&nbsp;&nbsp;�ţ�
								</td>
								<td height="46" colspan="-2" align="center">
									<jtag:jtl id="deptName" name="b_T_Ufp_Address_Book.deptName"
										editCondition="%{allPermission}" maxlength="28" 
										cssStyle="width:99%" />
								</td>
								<td height="46" colspan="-2" align="center" class="ziduan">
									ְ&nbsp;&nbsp;&nbsp;&nbsp;��
								</td>
								<td height="46" colspan="-2" align="center">
									<jtag:jtl id="positionName" name="b_T_Ufp_Address_Book.positionName"
										editCondition="%{allPermission}" maxlength="100" 
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td height="46" align="center" class="ziduan">
									�绰(��)��
								</td>
								<td height="46" colspan="-2" align="center">
									<jtag:jtl id="officePhone" name="b_T_Ufp_Address_Book.officePhone"
										editCondition="%{allPermission}" maxlength="15" 
										cssStyle="width:99%" />
								</td>
								<td height="46" colspan="-2" align="center" class="ziduan">
									�绰(լ)��
								</td>
								<td height="46" colspan="-2" align="center">
									<jtag:jtl id="homePhone" name="b_T_Ufp_Address_Book.homePhone"
										editCondition="%{allPermission}" maxlength="15" 
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td align="center" class="ziduan">
									��&nbsp;&nbsp;&nbsp;&nbsp;����
								</td>
								<td colspan="-2" align="center">
									<jtag:jtl id="mobilePhone" name="b_T_Ufp_Address_Book.mobilePhone"
										editCondition="%{allPermission}" maxlength="11" 
										cssStyle="width:99%" />
								</td>
								<td colspan="-2" align="center" class="ziduan">
									��&nbsp;��&nbsp;�ţ�
								</td>
								<td colspan="-2" align="center">
									<jtag:jtl id="virtualPhone" name="b_T_Ufp_Address_Book.virtualPhone"
										editCondition="%{allPermission}" maxlength="15" 
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td align="center" class="ziduan">
									��&nbsp;��&nbsp;�ţ�
								</td>
								<td colspan="-2" align="center">
									<jtag:jtl id="faxPhone" name="b_T_Ufp_Address_Book.faxPhone"
										editCondition="%{allPermission}" maxlength="28" 
										cssStyle="width:99%" />
								</td>
								<td colspan="-2" align="center" class="ziduan">
									�����ַ��
								</td>
								<td colspan="-2" align="center">
									<jtag:jtl id="email" name="b_T_Ufp_Address_Book.email"
										editCondition="%{allPermission}" maxlength="50" 
										cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td align="center" class="ziduan">
									��&nbsp;&nbsp;&nbsp;&nbsp;ע��
								</td>
								<td colspan="3" align="center">
									<jtag:jtal id="remark" name="b_T_Ufp_Address_Book.remark"
										editCondition="%{allPermission}"
										cssStyle="width:100%;height:50px" rows="15" cols="80"></jtag:jtal>
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
		function callback(data) {
			ajaxMessage(data, 1);
		}
		$("#back").click(function(e) {
			closeBox();
		});	
		$("#userName").validatebox(	 
				{required:true}
		);
		$("#sort").validatebox({
			required:true,
			validType:"number"
		});
		$("#mobilePhone").validatebox({
			required:true,
			validType:"mobile"
		});		
		$('#categoryId').combobox( {
			width : 230,
			required : false,
			panelHeight : 100
		});
		$("#officePhone,#homePhone").validatebox({
			validType:"tel"
		});	
		$("#virtualPhone").validatebox({
			validType:"number"
		});	
		$("#email").validatebox({
			validType:"email"
		});
	});
</SCRIPT>
</html>
