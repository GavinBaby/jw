
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
										�������ƣ�
									</td>
									<td width="20%" align="left">
										<jtag:jtl id="flowNameS" name="flowNameS" editCondition="*"
											maxlength="100" />
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
			<form class="jNice">
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="�� ��" editCondition="*" />
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
			openNew("workflowengine/FlowInfor_detailsLoad.action","�½�");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid({ 
        	url: 'workflowengine/FlowInfor_gridLoad_grid.action',
        	queryParams:getQueryParams("searchData"),
        	frozenColumns: null,
			columns:[[  
				{field:'flowId',title:'���̱��',width:10,align:'center'}, 
				{field:'flowName',title:'��������',width:20,
					formatter:function(value,data){        
                    return '<span style="color:red"><a href="javascript:openNew(\'workflowengine/FlowInfor_detailsLoad.action?mainDocId='+data.uuid+'\')">'+data.flowName+'</a></span>'; 
       		    }},  
				{field:'isEnable',title:'�Ƿ�����',width:10,align:'center',
					formatter:function(value,data){
						return (value=='1')?'����':'������';}},  
				{field:'unitName',title:'������λ',width:10,align:'center'},  
				{field:'fileds',title:'��Ӧ��',width:10,align:'center',
							formatter:function(value,data){

							return '<span style="color:red"><a href="javascript:openNew(\'workflowengine/FlowFields_listLoad.action?flowId='+data.flowId+'\')">��Ӧ��</a></span>'; 
						}},  
				{field:'tacheInfo',title:'���̶���',width:10,align:'center',
								formatter:function(value,data){
							return '<span style="color:red"><a href="javascript:openNew(\'workflowengine/TacheInfor_detailsLoad.action?flowId='+data.flowId+'\')">���̶���</a></span>'; 
				}},  
				{field:'tacheCopy',title:'��������',width:10,align:'center',
								formatter:function(value,data){
							return '<span style="color:red"><a href="javascript:openNew(\'workflowengine/FlowCopy_detailsLoad.action?flowId='+data.flowId+'\')">��������</a></span>'; 
				}}           
       		]]
					                     
		});
	});
	
</SCRIPT>
</html>


