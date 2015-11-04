<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>

<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	response.setCharacterEncoding("GBK");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
		<title>办公自动化系统</title>
		<base target="_self">
		<jtag:jhead />
	</head>
	<body onload="" class="easyui-layout"
		style=" height: 350px; overflow: hidden;">
		<!-- 隐藏控制域 开始  -->
		<s:hidden id="phraseTxtId" name="phraseTxtId" />

		<!-- 隐藏控制域 结束 -->
		<div data-options="region:'north',border:false"
			style="overflow: hidden;" align="center">
			<table width="100%" height="40" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td align="center">
						<font style="color:#235c8d; font-weight:bold; font-size:14px;">签批意见</font>
					</td>
				</tr>
			</table>
		</div>
		<div data-options="region:'west',border:false"
			style="width: 200px;  overflow: hidden;" align="center">
			<div id="tt" class="easyui-tabs" fit="true" plain="true"
				style="width: 100%; height: 190px; algin: center;">
				<div title="常用意见" style="padding: 2px; overflow-x: hidden;border:false;"
					closable="false">
					<table width="100%" height="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td width="100%">
								<s:select cssStyle="width:195px;height:100%;algin:left; border:none;"
									id="wordlist0" name="" list="list_C_T_Sys_Phrase"
									multiple="true" listKey="uuid" listValue="phraseBody"
									ondblclick="document.getElementById('select').click();"></s:select>
							</td>
						</tr>
					</table>
				</div>
				<div title="个人意见" style="overflow: auto; padding: 2px; overflow-x: hidden; closable:false"
					closable="false">
					<table width="100%" height="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td width="100%">
								<s:select cssStyle="width:195px;height:100%;algin:left; border:none;"
									id="wordlist1" name="" list="list_C_T_Sys_MyPhrase"
									multiple="true" listKey="uuid" listValue="phraseBody"
									ondblclick="document.getElementById('select').click();"></s:select>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<div data-options="region:'center',border:false" style="overflow:hidden;">
			<s:form cssClass="jNice">
				<table width="100%" height="100%" border="0" cellspacing="0"
					cellpadding="0" align="center"
					style="border-style: none; padding: 0px;">
					<tr >
						<td width="100px" align="center">
							<input type="button" id="select" value="选 择" class="btn18 pbtn1" />
							<br /><br />
							<input type="button" id="clear" value="清 空" class="btn2 pbtn1" />
							<br />
						</td>
						<td valign="middle">
							<textarea id="mywords" name="mywords" style="width: 98%"
								rows="17"></textarea>
						</td>
					</tr>
				</table>
			</s:form>
		</div>
		<div data-options="region:'south',border:false"
			style="height: 40px; overflow-y: hidden;" align="center">
			<s:form cssClass="jNice">
				<table width="100%" height="40" border="0" cellpadding="0"
					cellspacing="0">
					<tr>
						<td align="center">
							<input type="button" id="ok" value="确 定" class="btn4 pbtn1" />
							&nbsp;&nbsp;&nbsp;
							<input name="close" id="close" type="button" value="关 闭"
								class="btn5 pbtn1" />
						</td>
					</tr>
				</table>
			</s:form>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		var id = $("#phraseTxtId").val();
		var opener = art.dialog.opener;
		var oldwords = opener.$("#"+id).val();
		var pos = oldwords.indexOf("\n");
		oldwords = oldwords.substring(0,pos);
		$("#mywords").attr("value",oldwords);
		$("#select").click(function(e) {
			var index = $('#tt').tabs('getTabIndex', $('#tt').tabs('getSelected'));
			$("#wordlist"+index).children("option:selected").each(function(){
				if($("#mywords").val()==''){
					$("#mywords").attr("value",$(this).text());
				}else{
					$("#mywords").attr("value",$("#mywords").val()+'\n'+$(this).text());
				}
			});
			
		});
		$("#clear").click(function(e) {
			$("#mywords").attr("value","");
		});
		$("#ok").click(function(e) {
			var username = "<%=com.jw.baseframe.common.session.SessionFactory.getSessionUserNm()%>";
			var curdate = "<%=com.jw.baseframe.util.DateTools.getServerDateTime(9)%>"+" "+"<%=com.jw.baseframe.util.DateTools.getServerDateTime(16)%>";
			var text = $("#mywords").val()+"\n    （"+username+"      "+curdate+")";
			opener.$("#"+id).attr("value",text);
			opener.$("#note").attr("value",text);
			opener.$("#noteFieldId").attr("value",id);
			closeBox();
		});
		$("#close").click(function(e) {
			closeBox();
		});
		
	
	});
</SCRIPT>
</html>
