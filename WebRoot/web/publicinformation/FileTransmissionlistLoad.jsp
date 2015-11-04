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
			<div data-options="region:'north',border:false"
            style="height: 125px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
				    <jtag:jlevel moduleId="module12010000"></jtag:jlevel>
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
							action="FileTransmission_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								style="vertical-align: middle;" class="content">
								<tr>
									<td width="40px" align="right">
										标题：
									</td>
									<td width="16%" align="left">
										<s:textfield id="title" name="title" theme="simple"
											maxlength="500" cssStyle="width:98%;" />
									</td>
									<td width="80px" align="right">
										登记时间：
									</td>
									<td width="10%">
										<s:textfield id="startTime" name="startTime" theme="simple"
											maxlength="50" cssStyle="width:95%;" cssClass="wdate"
											onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'startTime\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
									</td>
									<td width="12%" align="left">
										至&nbsp;
										<s:textfield id="endTime" name="endTime" theme="simple"
											maxlength="50" cssStyle="width:82%;" cssClass="wdate"
											onclick="WdatePicker({minDate:'#F{$dp.$D(\\'startTime\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
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
			<s:if test="flagtype!=1">
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
			</s:if>
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
		$("#new").click(function(e) {
			openNew("publicinformation/FileTransmission_detailsLoad.action","文件传输");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("publicinformation/FileTransmission_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'FileTransmission_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns : [ [ 
				{
					field : 'title',
					title : '标题',
					align : 'left',
					width : 50,
					formatter:function(value,data){   
                    return '<span style="color:red"><a href="javascript:openNew(\'publicinformation/FileTransmission_detailsLoad.action?mainDocId='+data.uuid+'\',\'文件传输\')">'+data.title+'</a></span>'; 
                }
				}, {
                    field : 'receivename',
                    title : '接收人员',
                    width : 20,
                    align : 'center'
                }, {
					field : 'sendtime',
					title : '发送时间',
					width : 30,
					align : 'center'
				}
			]]
		});	
	});
</SCRIPT>
</html>
