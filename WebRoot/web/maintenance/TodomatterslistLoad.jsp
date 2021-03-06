
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
					<jtag:jlevel moduleId="module04010100"></jtag:jlevel>
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
			url : 'Todomatters_gridLoad_grid.action',
			columns : [ [
				{
				field : 'createTime',
				title : '日期',
				width : 15,
				align : 'center',
				formatter : function(value, data) {
					return data.createTime.substring(0,10);
				}
			}, {
				field : 'moduleName',
				title : '模块名称',
				width : 15,
				align : 'center'
			},{
				field : 'title',
				title : '标题',
				width : 40,
				formatter : function(value, data) {
					return '<a href="javascript:openNew(\''+data.url+'\')">'+data.title+'</a>'; 
				}
			},{
				field : 'priorities',
				title : '缓急',
				width : 15,
				align : 'center'
			},{
				field : 'userName',
				title : '发送人',
				width : 15,
				align : 'center'
			} 
			] ],
			toolbar : [
				{
				text : '删除',
				iconCls : 'icon-remove',
				handler : function() {
					deleteDateAjax("maintenanceajax/Todomatters_detailsDelete_ajax.action");
				}
			} 
				,
			'-',
			{text : '移动至已办箱',
				iconCls : 'icon-undo',
				handler : function() {
					var checkedIds = getDeleteData("list");
					if (checkedIds == '') {
						art.dialog.alert("请先选中记录！");
						return;
					}
					art.dialog.confirm('确定移动至已办箱？', 
						function(){
							var params = {
									checkedIds : checkedIds
							};
							
							$.ajax( {
								url : 'maintenanceajax/Todomatters_toMattersDone_ajax.action',
								type : "POST",
								data : params,
								dataType : "json",
								success : function(data){
									art.dialog.tips("操作成功！",2).lock();
									$('#list').datagrid("reload");	
								},
								error : ajaxError
							});
						}, 
						function(){
							art.dialog.tips("已取消！",1);
						}
					);
				}
			}]

		});
		 $('#modttree').tree({
				animate:true,
				url : 'maintenanceajax/Todomatters_getModTree_treegrid.action?flag=0',
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


