
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ path + "/";
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
			style="height: 127px; overflow: hidden;" align="center">

			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module03020502"></jtag:jlevel>
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
						<s:form id="searchData" name="searchData" theme="simple"
							cssClass="jNice">

							<s:hidden id="flag" name="flag"></s:hidden>
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">
										收文类别：
									</td>
									<td width="15%" align="left">
										<jtag:jsl id="fileInSerialName" list="list_c_T_Sys_Maintain"
											name="fileInSerialName" listKey="maintainId" listValue="maintainName"
											editCondition="*" headerKey=""
											headerValue="--请选择--" cssStyle="width:98%;">
										</jtag:jsl>
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
			<table id="list"></table>			
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
	
		$("#new").click(function(e) {
			openNew("documentmanagement/FileInSerial_detailsLoad.action", "收文流水号");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("documentmanagement/FileInSerial_detailsDelete_ajax.action");
		});
		$('#list').datagrid( {
			url : 'FileInSerial_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns:[[  
				{field:'sort',
				 title:'排序号',
				 align:'center',
				 width:10
				},
				{field:'fileinSerialname',
				 title:'收文类别',
				 align:'center',
				 width:50,
				 formatter:function(value,data){   
					return '<span style="color:red"><a href="javascript:openNew(\'documentmanagement/FileInSerial_detailsLoad.action?mainDocId='+data.uuid+'\',\'收文流水号\')">'+data.fileinSerialname+'</a></span>'; 
					 }
				},
				{field:'fileinYear',
					 title:'年份',
					 align:'center',
					 width:20
				},
				{field:'fileinSerial',
					 title:'流水号',
					 align:'center',
					 width:20
				}
		   	]]
		});
	});
</SCRIPT>
</html>


