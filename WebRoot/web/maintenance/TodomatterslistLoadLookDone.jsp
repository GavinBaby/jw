
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
			style="height: 28px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module04020200"></jtag:jlevel>
				</tr>
			</table>
		</div>
		<div data-options="region:'west',split:false,title:'模块名称',border:true"
			style="width: 200px; overflow :   hidden;"
			align="left">
				<ul id="modttree" class="tree"></ul>
		</div>
		<div data-options="region:'center',border:false">
			<table id="list"></table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$('#list').datagrid( {
			url : 'Todomatters_gridLoadLookDone_grid.action',
			frozenColumns: null,
			columns : [ [
				{
				field : 'createTime',
				title : '日期',
				width : 15,
				align : 'center',
				formatter : function(value, data) {
					return data.createTime.substring(0,10);
				}
			},{
				field : 'title',
				title : '标题',
				width : 40,
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\''+data.url+'\')">'+data.title+'</a>'; 
				}
			}, {
				field : 'userName',
				title : '发送人',
				width : 20,
				align : 'center'
			}, {
				field : 'priorities',
				title : '缓急',
				width : 10,
				align : 'center'
			}, {
				field : 'moduleName',
				title : '模块名称',
				width : 30,
				align : 'center'
			}
			
			] ]

		});
		$('#modttree').tree({
			animate:true,
			url : 'maintenanceajax/Todomatters_getModTree_treegrid.action?flag=13',
			loadFilter: function(rows){
				return treeConvert(rows);  
			},
			onClick:function(node){
		 		var moduleName = node.text;
		 		
		 		moduleName = decodeURIComponent(moduleName);
		 		$query = {moduleName:moduleName};
			 	$('#list').datagrid('load', $query);
			}
		});
	});
</SCRIPT>
</html>


