
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
					<jtag:jlevel moduleId="module01030900"></jtag:jlevel>
				</tr>
			</table>

			<table width="100%" height="10" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 1px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData"
							action="SyModule_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="7%" align="right">
										ģ�����ƣ�
									</td>
									<td width="20%" align="left">
										<jtag:jtl id="moduleNameS" name="moduleNameS"
											editCondition="*" maxlength="100" />
									</td>
									<td width="7%" align="right">
										ģ��λ�ã�
									</td>
									<td width="20%" align="left">
										<jtag:jsl id="moduleTypeS"
											list="#{'':'==��ѡ��==','L':'���','C':'����','R':'�Ҳ�'}"
											name="moduleTypeS" listKey="key" listValue="value"
											editCondition="*" cssStyle="width:90%" />
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
			<s:form cssClass="jNice">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
					<tr>
						<td></td>
					</tr>
				</table>
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="�� ��" editCondition="*" />
							<jtag:jbutton id="delete" value="ɾ ��" editCondition="*" />
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
					<tr>
						<td></td>
					</tr>
				</table>
			</s:form>
		</div>
		<div data-options="region:'center',border:false">
			<table id="list">
			</table>
		</div>

	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#new").click(function(e) {
			openNew("maintenance/SyModule_detailsLoad.action","�½�");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("maintenance/SyModule_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'SyModule_gridLoad_grid.action',
			queryParams:getQueryParams("searchData"),  
			columns : [ [ {
				field : 'moduleId',
				title : 'ģ����',
				width : 20,
				align : 'center'
			}, {
				field : 'moduleTitle',
				title : 'ģ������',
				width : 30,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/SyModule_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.moduleTitle+'</a>'; 
				}
			}, {
				field : 'moduleType',
				title : 'ģ��λ��',
				width : 20,
				align : 'center',
				formatter : function(value, data) {
					if (value == "L") {
						return "���";
					} else if (value == "C") {
						return "����";
					} else if (value == "R") {
						return "�Ҳ�";
					}
				}
			} ] ]

 
		});
	});
</SCRIPT>
</html>


