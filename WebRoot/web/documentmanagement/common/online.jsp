
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
		<div data-options="region:'center',border:false" style="height: 320px; overflow: hidden;" align="center">
			<table id="list">
			</table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		
		$('#list').datagrid( {
			url : 'Online_gridLoad_grid.action',	
			frozenColumns: null,
			columns : [ [ {
				field : 'userSysName',
				title : '用户名',
				width : 30
			}, {
				field : 'userName',
				title : '姓名',
				width : 30,
				align : 'center'						
			}, {
				field : 'expandXml',
				title : 'Ip',
				width : 40,
				align : 'center'			
			} ] ]

		});
	});
</SCRIPT>
</html>


