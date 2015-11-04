
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
        + request.getServerName() + ":" + request.getServerPort()
        + path + "/";
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
							<jtag:jlevel moduleId="module14060100"></jtag:jlevel>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<form id="update" name="update"
						action="publicinformationajax/MeetingRoominfo_detailsUpdate.action" method="POST"
						class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
					    <s:hidden id="uuid" name="b_T_Ufp_Meeting_Roominfo.uuid"></s:hidden>
					    <s:hidden id="newFileIds" name="newFileIds"></s:hidden>
					    <s:hidden id="updateTime" name="updateTime"></s:hidden>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="保 存1" editCondition="*" />
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
									会议室编号：
								</td>
								<td width="35%">
									<jtag:jtl id="meetingroomNumber" name="b_T_Ufp_Meeting_Roominfo.meetingroomNumber"
										editCondition="%{allPermission}" maxlength="100" cssStyle="width:98%" />
								</td>
								<td width="15%" class="ziduan">
									排&nbsp;序&nbsp;号：
								</td>
								<td width="35%">
									<jtag:jtl id="sort" name="b_T_Ufp_Meeting_Roominfo.sort"
										editCondition="%{allPermission}" maxlength="50" cssStyle="width:98%" />
								</td>
							</tr>
							<tr>
                                <td width="15%" class="ziduan">
                                                                                                会议室名称：
                                </td>
                                <td width="85%" colspan="3">
                                    <jtag:jtl id="meetingroomName" name="b_T_Ufp_Meeting_Roominfo.meetingroomName"
                                        editCondition="%{allPermission}" maxlength="100" cssStyle="width:98%" />
                                </td>
                            </tr>
                            <tr>
                                <td width="15%" class="ziduan">
                                                                                               会议室介绍：
                                </td>
                                <td width="85%" colspan="3">
                                    <iframe id="eWebEditor1"
                                        src="<%=basePath%>js/ewebeditor/ewebeditor.htm?id=introduce&style=standard600&skin=office2003"
                                        frameborder="0" scrolling="no" width="98%" height="200"></iframe>
                                    <jtag:jtal id="introduce" name="b_T_Ufp_Meeting_Roominfo.introduce" editCondition="*"
                                        cols="90" rows="12" cssStyle="width:1;height:1"></jtag:jtal>
                                </td>
                            </tr>
                            <tr>
                                <td width="15%" class="ziduan">
                                                                                               会议室图片：
                                </td>
                                <td width="85%" colspan="3">
                                   <jtag:jupload id="upload1" moduleId="module14060200"
                                        mainId="b_T_Ufp_Meeting_Roominfo.uuid"
                                        editCondition="%{allPermission}" />
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
		$('#upload1').uploadify(new uploadObject("upload1", true, 5, "", ""));
		
		$("#save").click(function(e) {
			if(document.getElementById("eWebEditor1")!=null){
                var o_Editor = document.getElementById("eWebEditor1").contentWindow; 
                $("#introduce").attr("value", o_Editor.getHTML());
            }
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid) {
				var params = $("#update").serialize();
				jQuery.ajax( {
					url : "publicinformation/MeetingRoominfo_detailsUpdate_ajax.action",
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
		$('#sort').numberbox({min:0,required:true});
		$('#meetingroomNumber,#meetingroomName').validatebox({required:true});
	});
</SCRIPT>
</html>
