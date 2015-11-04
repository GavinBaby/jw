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
			style="height: 80px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module14060200"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="10">
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
		$("#new").click(function(e) {
			openNew("publicinformation/MeetingRoominfo_detailsLoad.action","会务设备管理");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("publicinformation/MeetingRoominfo_detailsDelete_ajax.action");
		});
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'MeetingRoominfo_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns : [ [ 
				{
					field : 'sort',
					title : '排序号',
					align : 'center',
					width : 20
				}, {
                    field : 'meetingroomNumber',
                    title : '编号',
                    align : 'center',
                    width : 20
                },{
					field : 'meetingroomName',
					title : '会议室名称',
					width : 60,
					align : 'center',
					formatter:function(value,data){   
	                	return '<span style="color:red"><a href="javascript:openNew(\'publicinformation/MeetingRoominfo_detailsLoad.action?mainDocId='+data.uuid+'\',\'会议室管理\')">'+data.meetingroomName+'</a></span>'; 
	   		    	}
				}
			]]
		});	
	});
</SCRIPT>
</html>
