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
	<body class="easyui-layout">
		<div data-options="region:'center',border:false">
			<table width="100%" height="28" border="0" cellpadding="0" cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module05040100"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0" height="7">
				<tr>
					<td></td>
				</tr>
			</table>
				
			<s:form id="update" name="update" action="publicinformation/Mail_detailsUpdate_ajax.action" method="POST" theme="simple" cssClass="jNice">
				<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
				<s:hidden id="newFileIds" name="newFileIds"></s:hidden>
				<s:hidden id="mailTypeS" name="mailTypeS"></s:hidden>
				<s:hidden id="isReplyTrun" name="isReplyTrun"></s:hidden>
				<table width="98%" border="0" cellspacing="0" cellpadding="0" style="float: left;margin-left: 12px;">
					<tr>
						<td >
							<jtag:jbutton id="send" value="发 送" editCondition="*" />
							<jtag:jbutton id="savePaper" value="存草稿" editCondition="*" />
						</td>
					</tr>
				</table>
				<table width="98%" border="0" cellspacing="0" cellpadding="0" height="7">
					<tr>
						<td></td>
					</tr>
				</table>
				<table width="98%" height="80%" border="0" cellpadding="0" cellspacing="0" class="biaodan" style="float: left; margin-left: 12px;">
					<tr>
						<td height="30" colspan="3" align="center" style="background: #f4f5f7; text-align: center; font-weight: bold;">
							<font color="red">写邮件</font>
						</td>
					</tr>
					<tr>
						<td width="10%" height="30" align="center" class="ziduan">
							发&nbsp;件&nbsp;人：
						</td>
						<td width="90%" height="30" align="center">
							<jtag:jtl id="sendUser" name="b_T_Ufp_Mail_Attribute.sendUser" editCondition="#" maxlength="50" cssStyle="width:99%" />
						</td>
						
					</tr>
					<tr>
						<td height="30" align="center" class="ziduan">
							<a href="javascript:personSJList();"><font color="#235c8d"><U>收&nbsp;件&nbsp;人</U>：</font></a>
						</td>
						<td height="30" align="center">
							<jtag:jtl id="userName" name="b_T_Ufp_Mail_Relation.userName" editCondition="%{allPermission}" maxlength="50" cssStyle="width:99%" readonly="true"/>
							<s:hidden id="userSysName" name="b_T_Ufp_Mail_Relation.userId" />
						</td>
					</tr>
					<tr>
						<td height="30" align="center" class="ziduan">
							主&nbsp;&nbsp;&nbsp;&nbsp;题：
						</td>
						<td height="30" align="center">
							<jtag:jtl id="title" name="b_T_Ufp_Mail_Attribute.title" editCondition="%{allPermission}" maxlength="500" cssStyle="width:99%" />
						</td>
						
					</tr>
					<tr id="sendtr">
						<td height="30" align="center" class="ziduan">
							<a href="javascript:personCSList();"><font color="#235c8d"><U>抄&nbsp;送&nbsp;人</U>：</font></a>
						</td>
						<td height="30" align="center">
							<jtag:jtl id="copyUser" name="b_T_Ufp_Mail_Attribute.copyUser" editCondition="%{allPermission}" maxlength="50" cssStyle="width:99%" readonly="true"/>
							<s:hidden id="copySysUser" name="b_T_Ufp_Mail_Attribute.copySysUser" />
						</td>
						
					</tr>
					<tr id="darktr">
						<td height="30" align="center" class="ziduan">
							<a href="javascript:personASList();"><font color="#235c8d"><U>暗&nbsp;送&nbsp;人</U>：</font></a>
						</td>
						<td height="30" align="center">
							<jtag:jtl id="darkUser" name="b_T_Ufp_Mail_Attribute.darkUser" editCondition="%{allPermission}" maxlength="50" cssStyle="width:99%" readonly="true"/>
							<s:hidden id="darkSysUser" name="b_T_Ufp_Mail_Attribute.darkSysUser" />
						</td>
						
					</tr>
					<tr>
						<td align="center" class="ziduan">
							附&nbsp;&nbsp;&nbsp;&nbsp;件：
						</td>
						<td height="30" align="center" colspan="2">
							<jtag:jupload id="upload1" moduleId="module05040000" mainId="b_T_Ufp_Mail_Attribute.uuid" editCondition="%{allPermission}" />
						</td>
					</tr>
					<tr>
						<td colspan="3" align="center">
							 <IFRAME ID="eWebEditor1" src="../../js/ewebeditor/ewebeditor.htm?id=content&style=magicbpm_text" frameborder="0" scrolling="no" width="100%" height="250px"></IFRAME>
							 <jtag:jtal id="content" name="b_T_Ufp_Mail_Content.content" editCondition="*" cols="80" rows="10" cssStyle="width:1;height:1"></jtag:jtal>	
						</td>
					</tr>
			
					<tr>
						<td width="98%" colspan=3 height="30" align="left" style="color: #235c8d; font-weight: bold;">
							优先级：
							<jtag:jsl id="priorityLeve" list="#{'1':'高','2':'一般','3':'低'}" name="b_T_Ufp_Mail_Attribute.priorityLeve" listKey="key" listValue="value" editCondition="%{allPermission}" cssStyle="width:6%"></jtag:jsl>

							重要程度：
							<jtag:jsl id="importantLeve" list="#{'1':'高','2':'一般','3':'低'}" name="b_T_Ufp_Mail_Attribute.importantLeve" listKey="key" listValue="value" editCondition="%{allPermission}" cssStyle="width:6%"></jtag:jsl>

							回执选项：
							<s:if test='isReceipt=="0"' >
								<s:checkbox name="isReceipt" value="0" />
							</s:if>
							<s:if test='isReceipt=="1"' >
								<s:checkbox name="isReceipt" value="true" />
							</s:if>
							保存邮件到发件箱：
							<s:if test='mailSaveSendFlag=="1"' >
								<s:checkbox name="mailType" value="true" />
							</s:if>
							<s:if test='mailSaveSendFlag=="0"'  >
								<s:checkbox name="mailType" value="0" />
							</s:if>
						</td>
					</tr>
				</table>

			</s:form>

			<table width="100%" border="0" cellspacing="0" cellpadding="0" height="17">
				<tr>
					<td></td>
				</tr>
			</table>

		</div>
	</body>
	<SCRIPT type="text/javascript">	
	function personSJList(){
		//openNew("publicinformation/Mail_unitDeptUserlistLoad.action?fieldName=userName&fieldSysName=userSysName","人员列表",350,510);
		var userIds = $("#userSysName").val();
		openNew("common/UserSelect_listLoad.action?parUId=userSysName&parUName=userName&isSglSel=1&uSelRa=0&selUserAction=../publicinformation/Mail_selUserList_treegrid.action?userIds="+userIds,"人员选择");
	}

	function personCSList(){
		//openNew("publicinformation/Mail_unitDeptUserlistLoad.action?fieldName=copyUser&fieldSysName=copySysUser","人员列表",350,510);
		var userIds = $("#copySysUser").val();
		openNew("common/UserSelect_listLoad.action?parUId=copySysUser&parUName=copyUser&isSglSel=1&uSelRa=0&selUserAction=../publicinformation/Mail_selUserList_treegrid.action?userIds="+userIds,"人员选择");
	}

	function personASList(){
		//openNew("publicinformation/Mail_unitDeptUserlistLoad.action?fieldName=darkUser&fieldSysName=darkSysUser","人员列表",350,510);
		var userIds = $("#darkSysUser").val();
		openNew("common/UserSelect_listLoad.action?parUId=darkSysUser&parUName=darkUser&isSglSel=1&uSelRa=0&selUserAction=../publicinformation/Mail_selUserList_treegrid.action?userIds="+userIds,"人员选择");
	}
	
	$(function() {
		$('#upload1').uploadify(new uploadObject("upload1",true,5,"20MB","")); 			
		
		$("#send").click(function(e) {
			var returnIsValid = $("#update").form("validate");
			if (returnIsValid == false) {
				return false;
			}
			saveDoc('');
		});

		$("#savePaper").click(function(e) {
			var isPaper = "2";
			var returnIsValid = $("#update").form("validate");
			if (returnIsValid == false) {
				return false;
			}
			saveDoc(isPaper);
		});

		function saveDoc(flag){
			var o_Editor = document.getElementById("eWebEditor1").contentWindow; 
       		$("#content").attr("value", o_Editor.getHTML());
			var params = $("#update").serialize();
			lockBox();
			jQuery.ajax( {
				url : "publicinformation/Mail_detailsUpdate_ajax.action?isPaper="+flag,
				type : "POST",
				data : params,
				dataType : "json",
				success : callback
			});
		}

		function callback(data) {
			var newFileIds = $("#newFileIds").val();
			if("2" == data.mailType){
				//转草稿箱
				window.location.href="../publicinformation/Mail_listLoad.action?mailType=2&newFileIds="+newFileIds;
			}else{
				//转发件箱
				window.location.href="../publicinformation/Mail_listLoad.action?mailType=1&newFileIds="+newFileIds;
			}	
		}			

		$("#userName,#title").validatebox({
			required:true
		});	

		$('#priorityLeve').combobox( {
			width : 50,
			required : false,
			panelHeight : 65
		});

		$('#importantLeve').combobox( {
			width : 50,
			required : false,
			panelHeight : 65
		});

	});

</SCRIPT>
</html>
