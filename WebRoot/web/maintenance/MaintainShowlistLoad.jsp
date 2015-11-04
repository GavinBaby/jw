
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
					<jtag:jlevel moduleId="module01030800"></jtag:jlevel>
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
							action="MaintainShow_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">
										显示名称：
									</td>
									<td width="20%" align="left">
										<jtag:jtl id="showName" name="showName"
											editCondition="*" maxlength="100" />
									</td>
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
			openNew("maintenance/MaintainShow_detailsLoad.action","新建");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("maintenance/MaintainShow_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'MaintainShow_gridLoad_grid.action',
			queryParams:getQueryParams("searchData"),
			columns : [ [ {
				field : 'moduleId',
				title : '模块ID',
				width : 20,
				align : 'center'
			}, {
				field : 'showName',
				title : '显示名称',
				width : 30,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/MaintainShow_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.showName+'</a>'; 
				}
			}
			] ]
		});
	});
</SCRIPT>
</html>


