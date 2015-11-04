
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
		<s:hidden id="jsonResult" name="jsonResult"></s:hidden>
		<div data-options="region:'north',border:false"
			style="height: 120px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01020100"></jtag:jlevel>
				</tr>
			</table>


			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 1px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData"
							action="FlowInfor_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="7%" align="right">
										流程名称：
									</td>
									<td width="20%" align="left">
										<jtag:jtl id="flowNameS" name="flowNameS" editCondition="*"
											maxlength="100" />
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
			<form class="jNice">
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="新 建" editCondition="*" />
						</td>
					</tr>
				</table>
			</form>
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
			openNew("workflowengine/FlowInfor_detailsLoad.action","新建");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid({ 
        	url: 'workflowengine/FlowInfor_gridLoad_grid.action',
        	queryParams:getQueryParams("searchData"),
        	frozenColumns: null,
			columns:[[  
				{field:'flowId',title:'流程编号',width:10,align:'center'}, 
				{field:'flowName',title:'流程名称',width:20,
					formatter:function(value,data){        
                    return '<span style="color:red"><a href="javascript:openNew(\'workflowengine/FlowInfor_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.flowName+'</a></span>'; 
       		    }},  
				{field:'isEnable',title:'是否启用',width:10,align:'center',
					formatter:function(value,data){
						return (value=='1')?'启用':'不启用';}},  
				{field:'unitName',title:'所属单位',width:10,align:'center'},  
				{field:'fileds',title:'对应域',width:10,align:'center',
							formatter:function(value,data){

							return '<span style="color:red"><a href="javascript:openNew(\'workflowengine/FlowFields_listLoad.action?flowId='+data.flowId+'\')">对应域</a></span>'; 
						}},  
				{field:'tacheInfo',title:'流程定制',width:10,align:'center',
								formatter:function(value,data){
							return '<span style="color:red"><a href="javascript:openNew(\'workflowengine/TacheInfor_detailsLoad.action?flowId='+data.flowId+'\')">流程定制</a></span>'; 
				}},  
				{field:'tacheCopy',title:'复制流程',width:10,align:'center',
								formatter:function(value,data){
							return '<span style="color:red"><a href="javascript:openNew(\'workflowengine/FlowCopy_detailsLoad.action?flowId='+data.flowId+'\')">复制流程</a></span>'; 
				}}           
       		]]
					                     
		});
	});
	
</SCRIPT>
</html>


