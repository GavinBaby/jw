
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
										模块名称：
									</td>
									<td width="20%" align="left">
										<jtag:jtl id="moduleNameS" name="moduleNameS"
											editCondition="*" maxlength="100" />
									</td>
									<td width="7%" align="right">
										模块位置：
									</td>
									<td width="20%" align="left">
										<jtag:jsl id="moduleTypeS"
											list="#{'':'==请选择==','L':'左侧','C':'居中','R':'右侧'}"
											name="moduleTypeS" listKey="key" listValue="value"
											editCondition="*" cssStyle="width:90%" />
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
							<jtag:jbutton id="new" value="新 建" editCondition="*" />
							<jtag:jbutton id="delete" value="删 除" editCondition="*" />
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
			openNew("maintenance/SyModule_detailsLoad.action","新建");
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
				title : '模块编号',
				width : 20,
				align : 'center'
			}, {
				field : 'moduleTitle',
				title : '模块名称',
				width : 30,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/SyModule_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.moduleTitle+'</a>'; 
				}
			}, {
				field : 'moduleType',
				title : '模块位置',
				width : 20,
				align : 'center',
				formatter : function(value, data) {
					if (value == "L") {
						return "左侧";
					} else if (value == "C") {
						return "居中";
					} else if (value == "R") {
						return "右侧";
					}
				}
			} ] ]

 
		});
	});
</SCRIPT>
</html>


