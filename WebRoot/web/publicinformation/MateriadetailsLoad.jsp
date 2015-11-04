
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
							<jtag:jlevel moduleId="module11020000"></jtag:jlevel>
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
						action="publicinformationajax/Materia_detailsUpdate.action"
						method="POST" class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="b_T_Ufp_MateriaWithBLOBs.uuid"></s:hidden>
                        <s:hidden id="newFileIds" name="newFileIds"></s:hidden>
                        <s:hidden id="updateTime" name="updateTime"></s:hidden>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="保 存" editCondition="%{allPermission}" />
									<jtag:jbutton id="upsave" value="上 传" editCondition="%{allPermission}" />									
									<jtag:jbutton id="cancel" value="撤 消" editCondition="%{allPermission}" />
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
								<td width="18%" class="ziduan">
									上&nbsp;传&nbsp;人：
								</td>
								<td width="32%">
								    <s:hidden name="b_T_Ufp_MateriaWithBLOBs.materiaAuthor" />
									<jtag:jtl id="materiaAuthor"
										name="b_T_Ufp_MateriaWithBLOBs.materiaAuthor"
										editCondition="#" maxlength="50"
										cssStyle="width:98%" />
								</td>
								<td width="15%" class="ziduan">
									上传时间：
								</td>
								<td width="35%">
								    <s:hidden name="b_T_Ufp_MateriaWithBLOBs.materiaTime" />
									<jtag:jtl id="materiaTime" name="b_T_Ufp_MateriaWithBLOBs.materiaTime"
										editCondition="#" maxlength="50"
										cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									资料标题：
								</td>
								<td colspan="3">
									<jtag:jtl id="materiaTitle" name="b_T_Ufp_MateriaWithBLOBs.materiaTitle"
										editCondition="%{allPermission}" maxlength="250"
										cssStyle="width:98%;" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									资料放置位置：
								</td>
								<td colspan="3">
									<jtag:jtl id="materiaPlace" name="b_T_Ufp_MateriaWithBLOBs.materiaPlace"
										editCondition="%{allPermission}" maxlength="250"
										cssStyle="width:98%;" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									资料正文：
								</td>
								<td colspan="3">
									<jtag:jtal id="materiaDetails"
										name="b_T_Ufp_MateriaWithBLOBs.materiaDetails"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:60" cols="100" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									下载权限：
								</td>
								<td colspan="3">
									<s:hidden id="materiaDownuser"
										name="b_T_Ufp_MateriaWithBLOBs.materiaDownuser"></s:hidden>
									<jtag:jtal id="materiaDownname"
										name="b_T_Ufp_MateriaWithBLOBs.materiaDownname"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:60" cols="100" readonly="true" />
									<jtag:jbutton id="selUploadUser" value="选择" editCondition="%{allPermission}" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									所属分类：
								</td>
								<td colspan="3">
									<jtag:jsl id="materiaClass" listKey="uuid" listValue="classname"
										name="b_T_Ufp_MateriaWithBLOBs.materiaClass" list="list_B_T_Ufp_Materia_Class"
										editCondition="%{allPermission}" headerKey="0" headerValue="--请选择--"
										cssStyle="width:98%;"/>
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									附&nbsp;&nbsp;&nbsp;&nbsp;件：
								</td>
								<td colspan="3">
									<jtag:jupload id="upload1" moduleId="module11020000"
                                        mainId="b_T_Ufp_MateriaWithBLOBs.uuid" editCondition="%{allPermission}" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									备&nbsp;&nbsp;&nbsp;&nbsp;注：
								</td>
								<td colspan="3">
									<jtag:jtal id="materiaRemark"
										name="b_T_Ufp_MateriaWithBLOBs.materiaRemark"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:60" cols="100" />
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
		$('#upload1').uploadify(new uploadObject("upload1",true,5,"",""));    
		$("#save").click(function(e) {
			update("0");			
		});
		$("#upsave").click(function(e) {
            update("1");            
        });
		$("#cancel").click(function(e) {
            update("0");            
        });
		function update(type){
			var returnIsValid = $('#update').form('validate');
            if (returnIsValid) {
                var params = $("#update").serialize();
                jQuery
                        .ajax( {
                            url : "publicinformation/Materia_detailsUpdate_ajax.action?type="+type,
                            type : "POST",
                            data : params,
                            dataType : "json",
                            success : callback
                        });
            }			
		}
		function callback(data) {
			ajaxMessage(data, 1);
		}
		$("#back").click(function(e) {
			closeBox();
		});
		$("#selUploadUser")
				.click(
						function(e) {
							openNew(
									"common/UserSelect_listLoad.action?parUId=materiaDownuser&parUName=materiaDownname&isSglSel=1&uSelRa=1",
									"人员选择");
						});
		$('#materiaTitle').validatebox( {
			required : true
		});
		$('#materiaClass').combobox({   
			width : 540,
            required : true,
            panelHeight : 100
        }); 
	});
</SCRIPT>
</html>
