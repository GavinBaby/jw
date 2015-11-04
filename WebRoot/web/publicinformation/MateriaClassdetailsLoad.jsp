
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

		<table width="700px" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module11030000"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<s:hidden id="selectDeptJson" name="selectDeptJson"></s:hidden>
					<form id="update" name="update"
						action="publicinformationajax/MateriaClass_detailsUpdate.action" method="POST"
						class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
					    <s:hidden id="uuid" name="b_T_Ufp_Materia_Class.uuid"></s:hidden>
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
								<td width="15%" class="ziduan">
									分类名称：
								</td>
								<td width="35%">
									<jtag:jtl id="classname" name="b_T_Ufp_Materia_Class.classname"
										editCondition="%{allPermission}" maxlength="100" cssStyle="width:98%" />
								</td>
								<td width="15%" class="ziduan">
									排&nbsp;序&nbsp;号：
								</td>
								<td width="35%">
									<jtag:jtl id="sort" name="b_T_Ufp_Materia_Class.sort"
										editCondition="%{allPermission}" maxlength="50" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									上传权限：
								</td>
								<td colspan="3">
									<s:hidden id="uploadpermit" name="b_T_Ufp_Materia_Class.uploadpermit"></s:hidden>
									<jtag:jtal id="uploadpermitname" name="b_T_Ufp_Materia_Class.uploadpermitname"
											editCondition="%{allPermission}" cssStyle="width:98%;height:60" cols="100" readonly="true"/>
									<jtag:jbutton id="selUploadUser" value="选择" editCondition="*" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									下载权限：
								</td>
								<td colspan="3">
									<s:hidden id="downpermit" name="b_T_Ufp_Materia_Class.downpermit"></s:hidden>
									<jtag:jtal id="downpermitname" name="b_T_Ufp_Materia_Class.downpermitname"
											editCondition="%{allPermission}" cssStyle="width:98%;height:60" cols="100" readonly="true"/>
									<jtag:jbutton id="selDownloadDept" value="选择" editCondition="*" />
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
				jQuery.ajax( {
					url : "publicinformation/MateriaClass_detailsUpdate_ajax.action",
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
		$("#selUploadUser").click(function(e) {
			openNew("common/UserSelect_listLoad.action?parUId=uploadpermit&parUName=uploadpermitname&isSglSel=1&uSelRa=1","人员选择");
		});
		$('#sort').numberbox({min:0,required:true});
		$('#classname').validatebox({required:true});

		// 当用户不为超级管理员时，根据当前用户单位取得部门信息
		$("#selDownloadDept").click(function(e) {
			openNew("common/DeptSelect_listLoad.action?parUId=downpermit&parUName=downpermitname&isSglSel=1&deptSelRa=1","部门选择");
		});
	});
</SCRIPT>
</html>
