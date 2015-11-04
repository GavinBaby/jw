
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
		<script type="text/javascript" src="../../js/jquery1.6.2.js"></script>
		<link href="../../css/css.css" rel="stylesheet" type="text/css" />
		<link href="../../css/zTree/zTreeStyle.css" rel="stylesheet"
			type="text/css" />
		<script type="text/javascript"
			src="../../js/ztree/jquery.ztree-2.6.min.js"></script>
		<script type="text/javascript" src="../../js/json2.js"></script>
		<script src="../../js/artDialog/artDialog.source.js?skin=blue"></script>
		<script src="../../js/artDialog/iframeTools.source.js"></script>
		<script src="../../js/JwCommon.js"></script>
	</head>
	<body>
		<s:hidden id="fieldName" name="fieldName"></s:hidden>
		<s:hidden id="fieldSysName" name="fieldSysName"></s:hidden>

		<table width="400px" height="350px" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="5">
						<tr>
							<td></td>
						</tr>
					</table>
					<table width="98%" height="350px" border="0" cellspacing="0"
						cellpadding="0" class="biaodan">
						<tr>
							<td width="40%" class="ziduan">
								<div class="zTreeDemoBackground">
									<ul id="allPeopleTree" class="tree"></ul>
								</div>
							</td>
						</tr>

					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="5">
						<tr>
							<td></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
	<SCRIPT type="text/javascript">	
	var allPeopleTree;
	var allPeopleNode;
	var selectedNode;
	var setting;
	var setting = {
		isSimpleData : true,   
		treeNodeKey : "id", 
		treeNodeParentKey : "pId", 
		showLine : true,
		 callback: {
            click: zTreeOnClick,
            dblclick: zTreeOnDblClick
        }
	};

	$(function() {
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : 'publicinformationjax/Mail_unitDeptUserTree_treegrid.action',  
			error : function() {//请求失败处理函数  
				alert('请求失败');
			},
			success : function(data) { //请求成功后处理函数。 
				allPeopleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
		}
		});

		allPeopleTree = $("#allPeopleTree").zTree(setting, allPeopleNode);
		//展开所有节点
		allPeopleTree.expandAll(true);

	});

	function zTreeOnClick(event, treeId, treeNode) {
		selectedNode = treeNode;
		var existName = art.dialog.opener.$("#"+ $("#fieldName").val()).val();
		var existSysName = art.dialog.opener.$("#"+ $("#fieldSysName").val()).val();		
		var parentName;
		var parentSysName;
		if(existName!="" && existSysName!=""){
			if(existName.indexOf(selectedNode.name)>-1 && existSysName.indexOf(selectedNode.id)>-1){
				art.dialog.alert("此人员已添加!").unlock();
			}else{
				parentName = existName + "," + selectedNode.name;
				parentSysName = existSysName + "," + selectedNode.id;
				selectUser(parentName,parentSysName);
			}
		}else{
			selectUser(selectedNode.name,selectedNode.id);
		}
	}
	
	function zTreeOnDblClick(event, treeId, treeNode) {
		closeBox();
	}
	
	function selectUser(name,sysName) {
		//给父窗体赋值
		art.dialog.opener.$("#"+ $("#fieldSysName").val()).val(sysName);
		art.dialog.opener.$("#"+ $("#fieldName").val()).val(name);
	}	
</SCRIPT>
</html>


