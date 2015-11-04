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
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>			
		<jtag:jhead/>
	</head>
	<body>
		<table width="678px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
							<jtag:jlevel moduleId="module05010000"></jtag:jlevel>
						</tr>
					</table>
					<s:form id="update" name="update"
						action="publicinformation/Bulletin_detailsUpdate_ajax.action"
						method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="uuid" name="b_T_Ufp_Bulletin.uuid"></s:hidden>
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="canceldate" name="b_T_Ufp_Bulletin.canceldate"></s:hidden>
						<s:hidden id="state" name="b_T_Ufp_Bulletin.state"></s:hidden>
						<s:hidden id="noteFieldId" name="noteFieldId"></s:hidden>
						<s:hidden id="note" name="note"></s:hidden>
						<s:hidden id="newFileIds" name="newFileIds"></s:hidden>
						<s:hidden id="updateTime" name="updateTime"></s:hidden>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="保 存"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="publish" value="发 布"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="cancel" value="撤 销"
										editCondition="%{allPermission}" />
									<jtag:jbutton id="show" value="阅读情况"
										editCondition="%{allPermission}" />
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
								<td width="14%" class="ziduan">
									登&nbsp;记&nbsp;人：
								</td>
								<td width="25%">
									<jtag:jtl id="userName" name="b_T_Ufp_Bulletin.userName"
										editCondition="#" maxlength="50" cssStyle="width:98%" />
								</td>
								<td width="14%" class="ziduan">
									登记日期：
								</td>
								<TD width="25%" align="left">
									<jtag:jtl id="regdate" name="b_T_Ufp_Bulletin.regdate"
										editCondition="#" maxlength="19" cssStyle="width:90%"></jtag:jtl>
								</TD>
							</tr>
							<tr>
								<td width="14%" class="ziduan">
									过期日期：
								</td>
								<td width="25%">
									<jtag:jtl id="endshowdate" name="b_T_Ufp_Bulletin.endshowdate"
										editCondition="%{allPermission}" maxlength="50"
										cssStyle="width:98%" cssClass="wdate"
										onclick="WdatePicker({minDate:'%y-%M-{%d+1}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
								</td>
								<td width="14%" class="ziduan">
									发布日期：
								</td>
								<td width="25%">
									<jtag:jtl id="publishdate" name="b_T_Ufp_Bulletin.publishdate"
										editCondition="#" maxlength="50" cssStyle="width:99%" />
								</td>
							</tr>
							<tr>
								<td width="14%" class="ziduan">
									标&nbsp;&nbsp;&nbsp;&nbsp;题：
								</td>
								<TD width="85%" colspan="4" align="left">
									<jtag:jtl id="title" name="b_T_Ufp_Bulletin.title"
										editCondition="%{allPermission}" maxlength="200"
										cssStyle="width:99%"></jtag:jtl>
							</tr>
							<tr>
								<TD width="14%" align="center" class="ziduan">
									<b>文件上传：</b>
								</TD>
								<TD width="85%" colspan="4" align="left">
									<jtag:jupload id="upload1" moduleId="module05010000"
										mainId="b_T_Ufp_Bulletin.uuid"
										editCondition="%{allPermission}" />
								</TD>
							</tr>
							<tr>
								<td width="14%" class="ziduan">
									正&nbsp;&nbsp;&nbsp;&nbsp;文：
								</td>
								<td width="85%" colspan="4" align="left">
								<s:if test="b_T_Ufp_Bulletin.state==2">
									${b_T_Ufp_Bulletin.body}&nbsp;
								</s:if>
								<s:else>
									<iframe id="eWebEditor1"
										src="<%=basePath%>js/ewebeditor/ewebeditor.htm?id=body&style=standard600&skin=office2003"
										frameborder="0" scrolling="no" width="98%" height="200"></iframe>
									<jtag:jtal id="body" name="b_T_Ufp_Bulletin.body" editCondition="*"
										cols="90" rows="12" cssStyle="width:1;height:1"></jtag:jtal>
								</s:else>
								</td>
							</tr>
						</table>
					</s:form>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="17">
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
		$('#upload1').uploadify(new uploadObject("upload1", true, 5, "", ""));

		var state = $("#state").val();
		$("#save").click(function(e) {
			if(state==""){
			    update("1");
			}else{
				update(state);
			}
		});
		$("#publish").click(function(e) {
			update("2");
		});
		$("#cancel").click(function(e) {
			update("3");
		});
		$("#show").click(
				function(e) {
					var mainDocId = $("#mainDocId").val();
					openNew(
							"publicinformation/Bulletin_readedlistLoad.action?mainDocId="
									+ mainDocId, "阅读情况", 600, 400);
				});
		function update(type) {
			if(document.getElementById("eWebEditor1")!=null){
				var o_Editor = document.getElementById("eWebEditor1").contentWindow; 
	       		$("#body").attr("value", o_Editor.getHTML());
			}
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid == false) {
				return false;
			}
			var params = $("#update").serialize();
			lockBox();
			jQuery
					.ajax( {
						url : "publicinformation/Bulletin_detailsUpdate_ajax.action"
								 ,
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
		$('#title').validatebox( {
			required : true
		});
	});
</SCRIPT>
</html>