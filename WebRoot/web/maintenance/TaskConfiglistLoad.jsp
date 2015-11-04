
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
			style="height: 130px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01031200"></jtag:jlevel>
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
							action="TaskConfig_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								style="vertical-align: middle;" class="content">
								<tr>
									<td width="100px" align="right">
										任务名称：
									</td>
									<td width="20%" align="left">
										<s:textfield id="taskDetails" name="taskDetails" theme="simple"
											maxlength="50" cssStyle="width:98%;" />
									</td>
									<td align="left">
										&nbsp;
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
			<s:form cssClass="jNice">
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="新 建" editCondition="*" />
							&nbsp;&nbsp;
							<jtag:jbutton id="delete" value="删 除" editCondition="*" />
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
		$("#new").click(function(e) {
			openNew("maintenance/TaskConfig_detailsLoad.action", '新建');
		});
		$("#delete").click(function(e) {
			deleteDateAjax("maintenance/TaskConfig_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'TaskConfig_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns : [ [ {
				field : 'taskName',
				title : '定时任务名称',
				width : 80,
				align : 'center',
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\'maintenance/TaskConfig_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.taskName+'</a>'; 
				}
			},{
				field : 'timerName',
				title : '定时器类型',
				width : 20,
				align : 'center'
			},
			{
				field : 'isUsed',
				title : '是否启用',
				width : 20,
				align : 'center',
				formatter : function(value, data) {
					if(data.isUsed=='1'){
						return '启用';
					}else{
						return '<font color=red>禁用</font>';
					}
				}
			}
			] ]

		});
	});
</SCRIPT>
</html>


