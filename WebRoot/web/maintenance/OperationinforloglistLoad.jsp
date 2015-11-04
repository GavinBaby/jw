
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
			style="height: 92px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01030600"></jtag:jlevel>
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
							action="Operationinforlog_gridLoad_grid.action" theme="simple"
							method="post" cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">

									</td>
									<td width="20%" align="left">

									</td>
									<td width="1%"></td>
									<td align="left">
										<input id="serach" type="button" value="查 询" />
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
		</div>
		<div data-options="region:'center',border:false">
			<table id="list">
			</table>
		</div>

	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'Operationinforlog_gridLoad_grid.action',
			frozenColumns: null,
			columns : [ [ {
				field : 'moduleName',
				title : '操作模块',
				width : 15,
				align : 'center'
			}, {
				field : 'operationType',
				title : '操作类型',
				width : 10,
				formatter : function(value, data) {
				if(value = "select")
					{
					return "查询";
					}
				if(value = "update")
					{
					return "更新";
					}
				if(value = "delete")
					{
					return "删除";
					}
				if(value = "insert")
					{
					return "新建";
					}
				},
				align : 'center'
			}, {
				field : 'mainDocId',
				title : '操作文档ID',
				width : 40,
				align : 'center'
			}, {
				field : 'createUser',
				title : '操作人员',
				width : 10,
				align : 'center'
			}, {
				field : 'createTime',
				title : '操作时间',
				width : 15,
				align : 'center'
			}, {
				field : 'operationSql',
				title : '详细情况',
				width : 10,
				align : 'center'
			} ] ]

		});

	});
</SCRIPT>
</html>


