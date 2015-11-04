
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
	<body class="easyui-layout">
		<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
		<div data-options="region:'north',border:false"
			style="height: 120px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
				<s:if test="isPersonalPhrase==1">
					<jtag:jlevel moduleId="module13010000"></jtag:jlevel>
				</s:if>
				<s:else>
					<jtag:jlevel moduleId="module01030300"></jtag:jlevel>
				</s:else> 
				</tr>
			</table>

			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="10">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 1px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData"
							action="Phrase_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<s:hidden id="isPersonalPhrase" name="isPersonalPhrase"></s:hidden>
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">
										���
									</td>
									<td width="20%" align="left">
										<s:textfield id="phraseBody" name="phraseBody" theme="simple"
											maxlength="50" />
									</td>
									<td width="1%"></td>
									<td align="left">
										<input id="serach" type="button" value="�� ѯ" />
									</td>
								</tr>
							</table>
						</s:form>
					</td>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<s:form cssClass="jNice">
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="�� ��" editCondition="*" />
							<jtag:jbutton id="delete" value="ɾ ��" editCondition="*" />
						</td>
					</tr>
				</table>
			</s:form>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
		</div>
		<div data-options="region:'center',border:false">
			<table id="list">
			</table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		var isPersonalPhrase = $("#isPersonalPhrase").val();
		$("#new").click(function(e) {
			openNew("maintenance/Phrase_detailsLoad.action?isPersonalPhrase="+isPersonalPhrase,"�½�");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("maintenance/Phrase_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'Phrase_gridLoad_grid.action',
			queryParams:getQueryParams("searchData"),
			columns : [ [ {
				field : 'sort',
				title : '�����',
				width : 10,
				align : 'center'
			}, {
				field : 'moduleName',
				title : 'ģ������',
				width : 20
				
			}, {
				field : 'phraseBody',
				title : '��������',
				width : 70,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/Phrase_detailsLoad.action?mainDocId='+data.uuid+'&isPersonalPhrase='+isPersonalPhrase+'\')">'+data.phraseBody+'</a>';
				}
			} ] ]

		});
	});
	

	
</SCRIPT>
</html>


