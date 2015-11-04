
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
	<body >
	<div style="width:420px;height:480px;">
		<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
		<s:hidden id="jsonResult" name="jsonResult"></s:hidden>
		<s:hidden id="flowId" name="flowId"></s:hidden>
		<div class="easyui-layout" data-options="fit : true,border : false">
			<div data-options="region:'north',border:false"
				style="height: 29px; overflow: hidden;" align="center">
				<table width="100%" height="28" border="0" cellpadding="0"
					cellspacing="0" class="dqwz_bg">
					<tr>
						<jtag:jlevel moduleId="module01020100"></jtag:jlevel>
					</tr>
				</table>
			</div>

			<div data-options="region:'center',border:false">
				<table id="list"></table>
			</div>
		</div>
	</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$('#list')
				.datagrid(
						{
							url : "workflowengine/FlowFields_gridLoad_grid.action?flowId="
									+ $("#flowId").attr("value"),
							fit : true,
							fitColumns : true,
							checkOnSelect : false,
							selectOnCheck : true,
							columns : [ [ {
								field : 'fieldId',
								title : '对应域ID',
								width : 40,
								align : 'center'
							}, {
								field : 'fieldName',
								title : '对应域名称',
								width :60,
								formatter : function(value, data) {
									return '<span style="color:red"><a href="javascript:openNew(\'workflowengine/FlowFields_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.fieldName+'</a></span>';
								}
							} ] ],
							toolbar : [
									{
										text : '新建',
										iconCls : 'icon-undo',
										handler : function() {
											openNew("workflowengine/FlowFields_detailsLoad.action?flowId=" + $("#flowId").attr("value"),"新建");
										}
									},
									'-',
									{
										text : '删除',
										iconCls : 'icon-remove',
										handler : function() {
											deleteDateAjax("workflowengine/FlowFields_detailsDelete_ajax.action");
										}
									} ]
						});

	});
</SCRIPT>
</html>


