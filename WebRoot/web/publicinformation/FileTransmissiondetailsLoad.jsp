
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

		<table width="750px" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
						<s:if test="type==1">
							<jtag:jlevel moduleId="module12020000"></jtag:jlevel>
						</s:if>
						<s:else>
						<jtag:jlevel moduleId="module12010000"></jtag:jlevel>
						</s:else>
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
						action="publicinformationajax/FileTransmission_detailsUpdate.action"
						method="POST" class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="b_T_Ufp_File_TransmissionWithBLOBs.uuid"></s:hidden>
                        <s:hidden id="newFileIds" name="newFileIds"></s:hidden>
                        <s:hidden id="updateTime" name="updateTime"></s:hidden>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="发 送" editCondition="%{allPermission}" />
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
									发&nbsp;送&nbsp;人：
								</td>
								<td width="32%">
								    <s:hidden name="b_T_Ufp_File_TransmissionWithBLOBs.sendperson" />
									<jtag:jtl id="sendperson"
										name="b_T_Ufp_File_TransmissionWithBLOBs.sendperson"
										editCondition="#" maxlength="50"
										cssStyle="width:98%" />
								</td>
								<td width="15%" class="ziduan">
									发送时间：
								</td>
								<td width="35%">
								    <s:hidden name="b_T_Ufp_File_TransmissionWithBLOBs.sendtime" />
									<jtag:jtl id="sendtime" name="b_T_Ufp_File_TransmissionWithBLOBs.sendtime"
										editCondition="#" maxlength="50"
										cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									标&nbsp;&nbsp;&nbsp;&nbsp;题：
								</td>
								<td colspan="3">
									<jtag:jtl id="title" name="b_T_Ufp_File_TransmissionWithBLOBs.title"
										editCondition="%{allPermission}" maxlength="500" 
										cssStyle="width:98%;" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									正&nbsp;&nbsp;&nbsp;&nbsp;文：
								</td>
								<td colspan="3">
									<jtag:jtal id="context"
										name="b_T_Ufp_File_TransmissionWithBLOBs.context"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:60" cols="100" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									接收人员：
								</td>
								<td colspan="3">
									<s:hidden id="receiveperson"
										name="b_T_Ufp_File_TransmissionWithBLOBs.receiveperson"></s:hidden>
									<jtag:jtal id="receivename"
										name="b_T_Ufp_File_TransmissionWithBLOBs.receivename"
										editCondition="%{allPermission}"
										cssStyle="width:98%;height:60" cols="100" readonly="true" />
									<jtag:jbutton id="selUploadUser" value="选择" editCondition="%{allPermission}" />
								</td>
							</tr>
							<tr>
								<td class="ziduan">
									附&nbsp;&nbsp;&nbsp;&nbsp;件：
								</td>
								<td colspan="3">
									<jtag:jupload id="upload1" moduleId="module12010000"
                                        mainId="b_T_Ufp_File_TransmissionWithBLOBs.uuid" editCondition="%{allPermission}" />
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
			update();			
		});
		function update(){
			var returnIsValid = $('#update').form('validate');
            if (returnIsValid) {
                var params = $("#update").serialize();
                jQuery
                        .ajax( {
                            url : "publicinformation/FileTransmission_detailsUpdate_ajax.action",
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
									"common/UserSelect_listLoad.action?parUId=receiveperson&parUName=receivename&isSglSel=1&uSelRa=1",
									"人员选择");
						});
		$('#title').validatebox( {
			required : true
		});
		$('#receivename').validatebox( {
            required : true
        });
	});
</SCRIPT>
</html>
