<%@ page contentType="text/html;charset=GBK"%>
<%@ page import="java.util.*" language="java" pageEncoding="GBK"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
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
				
			<s:form id="update" name="update" action="../publicinformation/Mail_sendlistLoad.action" method="POST" theme="simple" cssClass="jNice">
				<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
				<s:hidden id="mailTypeS" name="mailTypeS"></s:hidden>
				<s:hidden id="titleS" name="titleS"></s:hidden>
				<s:hidden id="isReplyTrun" name="isReplyTrun"></s:hidden>
				<s:hidden id="mailSaveSendFlag" name="mailSaveSendFlag"></s:hidden>
				<s:hidden id="isSendMsg" name="isSendMsg"></s:hidden>
				<s:hidden id="newFileIds" name="newFileIds"></s:hidden>
				<table width="98%" border="0" cellspacing="0" cellpadding="0" style="float: left;margin-left: 12px;">
					<tr>
						<td>
							<s:if test='allReplyFlag!="1"' >
								<jtag:jbutton id="backforyou" value="回 复" editCondition="*" />
								<jtag:jbutton id="tranfer" value="转 发" editCondition="*" />
								<jtag:jbutton id="delete" value="删 除" editCondition="*" />
								<jtag:jbutton id="allReply" value="全部回复" editCondition="*" />
							</s:if>
							<s:else>
								<jtag:jbutton id="back" value="返 回" editCondition="*" />
							</s:else>
						</td>
					</tr>
				</table>
				<table width="98%" border="0" cellspacing="0" cellpadding="0" height="7">
					<tr>
						<td></td>
					</tr>
				</table>
				<s:if test='allReplyFlag!="1"' >
				<table width="98%" border="0" cellpadding="0" cellspacing="0" class="biaodan" style="float: left; margin-left: 12px;">
					<tr>
						<td height="30" colspan="3" align="center" style="background: #f4f5f7; text-align: center; font-weight: bold;">
							<font color="red">阅读邮件</font>
						</td>
					</tr>
					<tr>
						<td width="10%" align="center" class="ziduan">
							发&nbsp;件&nbsp;人：
						</td>
						<td width="90%" align="center">
							<jtag:jtl id="sendUser" name="b_T_Ufp_Mail_Attribute.sendUser" editCondition="#" maxlength="50" cssStyle="width:99%" />
						</td>
					</tr>
					<tr>
						<td height="30" align="center" class="ziduan">
							发送时间：
						</td>
						<td height="30" align="center">
							<jtag:jtl name="b_T_Ufp_Mail_Attribute.sendTime" editCondition="#" maxlength="50" cssStyle="width:99%" />
							<s:hidden id="sendTime" name="b_T_Ufp_Mail_Attribute.sendTime"></s:hidden>
						</td>
					</tr>
					<tr>
						<td height="30" align="center" class="ziduan">
							收&nbsp;件&nbsp;人：
						</td>
						<td height="30" align="center">
							<jtag:jtl id="userName" name="b_T_Ufp_Mail_Relation.userName" editCondition="#" maxlength="50" cssStyle="width:99%" />
						</td>
					</tr>
					<tr>
						<td height="30" align="center" class="ziduan">
							主&nbsp;&nbsp;&nbsp;&nbsp;题：
						</td>
						<td height="30" align="center">
							<jtag:jtl name="b_T_Ufp_Mail_Attribute.title" editCondition="#" maxlength="50" cssStyle="width:99%" />
							<s:hidden id="title" name="b_T_Ufp_Mail_Attribute.title"></s:hidden>
						</td>
					</tr>
					<s:if test='b_T_Ufp_Mail_Attribute.copyUser!=null' >
						<tr id="sendtr">
							<td height="30" align="center" class="ziduan">
								抄&nbsp;送&nbsp;人：
							</td>
							<td height="30" align="center">
								<jtag:jtl id="copyUser" name="b_T_Ufp_Mail_Attribute.copyUser" editCondition="#" maxlength="50" cssStyle="width:99%" />
							</td>
						</tr>
					</s:if>
					<tr>
							<td height="30" align="center" class="ziduan">
								附&nbsp;&nbsp;&nbsp;&nbsp;件：
							</td>
							<td height="30" align="center">
								<jtag:jupload id="upload1" moduleId="module05040000" mainId="b_T_Ufp_Mail_Attribute.uuid" editCondition="#" />
							</td>
					</tr>
					<tr>
							<td height="30" align="center" class="ziduan">
								 正&nbsp;&nbsp;&nbsp;&nbsp;文：
							</td>
							<td height="30" align="center">
								${b_T_Ufp_Mail_Content.content}&nbsp;
							</td>
					</tr>
					<s:if test='b_T_Ufp_Mail_Attribute.tipDarkInfo!=null' >
						<tr id="darktr">
							<td height="30" align="center" class="ziduan">
								 提&nbsp;&nbsp;&nbsp;&nbsp;示：
							</td>
							<td height="30" align="center">
								<jtag:jtl id="tipDarkInfo" name="b_T_Ufp_Mail_Attribute.tipDarkInfo" editCondition="#" maxlength="50" cssStyle="width:99%" />
							</td>						
						</tr>
					</s:if>
				</table>
				</s:if>
			</s:form>

			<!--<s:if test='allReplyFlag=="1"' >
			<table width="98%" border="0" cellpadding="0" cellspacing="0" class="biaodan" style="float: left; margin-left: 12px;">
					<tr>
						<td height="30" colspan="3" align="center" style="background: #f4f5f7; text-align: center; font-weight: bold;">
							<font color="red">全部回复</font>
						</td>
					</tr>
			</table>
			<s:iterator value="b_V_Ufp_Mail_list" var="mailList" status="index">
			<table width="98%" border="0" cellpadding="0" cellspacing="0" class="biaodan" style="float: left; margin-left: 12px;">
					<tr>
						<td width="10%" align="center" class="ziduan">
							发&nbsp;件&nbsp;人：
						</td>
						<td width="90%" align="center">
							<jtag:jtl id="sendUser" name="#mailList.sendUser" editCondition="#" maxlength="50" cssStyle="width:99%" />
						</td>
					</tr>
					<tr>
						<td height="30" align="center" class="ziduan">
							发送时间：
						</td>
						<td height="30" align="center">
							<jtag:jtl name="#mailList.sendTime" editCondition="#" maxlength="50" cssStyle="width:99%" />
						</td>
					</tr>
					<tr>
						<td height="30" align="center" class="ziduan">
							收&nbsp;件&nbsp;人：
						</td>
						<td height="30" align="center">
							<jtag:jtl id="receiverUser" name="#mailList.receiverUser" editCondition="#" maxlength="50" cssStyle="width:99%" />
						</td>
					</tr>
					<tr>
						<td height="30" align="center" class="ziduan">
							主&nbsp;&nbsp;&nbsp;&nbsp;题：
						</td>
						<td height="30" align="center">
							<jtag:jtl name="#mailList.title" editCondition="#" maxlength="50" cssStyle="width:99%" />
						</td>
					</tr>
					<s:if test='#mailList.copyUser!=null' >
						<tr id="sendtr">
							<td height="30" align="center" class="ziduan">
								抄&nbsp;送&nbsp;人：
							</td>
							<td height="30" align="center">
								<jtag:jtl id="copyUser" name="#mailList.copyUser" editCondition="#" maxlength="50" cssStyle="width:99%" />
							</td>
						</tr>
					</s:if>
					<tr>
							<td height="30" align="center" class="ziduan">
								附&nbsp;&nbsp;&nbsp;&nbsp;件：
							</td>
							<td height="30" align="center">
								<jtag:jupload id="upload1" moduleId="module05040000" mainId="#mailList.uuid" editCondition="#" />			
							</td>
					</tr>
					<tr>
							<td height="30" align="center" class="ziduan">
								 正&nbsp;&nbsp;&nbsp;&nbsp;文：
							</td>
							<td height="30" align="center">
								<jtag:jtl id="content" name="#mailList.content" editCondition="#" maxlength="50" cssStyle="width:99%" />
							</td>
					</tr>
					<s:if test='#mailList.tipDarkInfo!=null' >
						<tr id="darktr">
							<td height="30" align="center" class="ziduan">
								 提&nbsp;&nbsp;&nbsp;&nbsp;示：
							</td>
							<td height="30" align="center">
								<jtag:jtl id="tipDarkInfo" name="#mailList.tipDarkInfo" editCondition="#" maxlength="50" cssStyle="width:99%" />
							</td>												
						</tr>
					</s:if>
				</table>
				<table width="100%" border="0" cellspacing="0" cellpadding="0" height="17">
					<tr>
						<td></td>
					</tr>
				</table>
			</s:iterator>
			</s:if>-->
		</div>
	</body>
	<SCRIPT type="text/javascript">		
	$(function() {
		$('#upload1').uploadify(new uploadObject("upload1",true,5,"",""));
		$("#backforyou").click(function(e) {
			$("#mailTypeS").attr("value","7");
			var titleS = $("#title").val();
			if(titleS.indexOf("回复:")<-1 && titleS.indexOf("转发:")<-1){
				titleS = "回复:" + titleS;
			}else{
				var temp = titleS.substring(0,3);
				if(temp == "回复:"){
					titleS = titleS;
				}else{
					titleS = "回复:" + titleS;
				}
			}			
			$("#titleS").val(titleS);
			$("#isReplyTrun").attr("value","0");
			$("#update").submit();
		});

		$("#tranfer").click(function(e) {
			$("#mailTypeS").attr("value","7");
			var titleS = $("#title").val();
			if(titleS.indexOf("回复:")<-1 && titleS.indexOf("转发:")<-1){
				titleS = "转发:" + titleS;
			}else{
				var temp = titleS.substring(0,3);
				if(temp == "转发:"){
					titleS = titleS;
				}else{
					titleS = "转发:" + titleS;
				}
			}	
			$("#titleS").val(titleS);
			$("#isReplyTrun").attr("value","1");
			$("#update").submit();
		});

		$("#delete").click(function(e) {
			var params = {
					checkedIds : $("#mainDocId").val()
			};
			
			$.ajax( {
				url : "publicinformation/Mail_detailsDelete_ajax.action",
				type : "POST",
				data : params,
				dataType : "json",
				success :function(data){
					art.dialog.tips("删除成功！",2).lock();
					window.location.href="../publicinformation/Mail_listLoad.action?mailType=4,5,6,7,99";
					$('#list').datagrid("load");
				}
			});
		});


		$("#allReply").click(function(e) {
			var mainDocId = $("#mainDocId").val();
			var sendTimeS = $("#sendTime").val();
			var title = $("#title").val();
			var lastIndex = title.lastIndexOf(":");
			var titleS;
			if(lastIndex==-1){
				titleS = encodeURI(encodeURI(title));
			}else{
				titleS = encodeURI(encodeURI(title.substring(lastIndex+1,title.length)));
			}
			window.location.href="../publicinformation/Mail_detailsLoad.action?allReplyFlag=1"+"&sendTimeS="+sendTimeS+"&titleS="+titleS+"&mainDocId="+mainDocId;
		});

		$("#back").click(function(e) {
			window.history.go(-1);
		});	

	});

</SCRIPT>
</html>
