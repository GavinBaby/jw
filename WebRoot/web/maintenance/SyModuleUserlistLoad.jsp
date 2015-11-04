
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
		<link href="../../css/zTree/zTreeStyle.css" rel="stylesheet"
			type="text/css" />
		<script type="text/javascript"
			src="../../js/ztree/jquery.ztree-2.6.min.js"></script>
		<script type="text/javascript" src="../../js/json2.js"></script>
		<script type="text/javascript" src="../../js/easyui/jportal.js"></script>
	<body class="easyui-layout">
		<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
		<s:hidden id="jsonResult" name="jsonResult"></s:hidden>
		<s:hidden id="unitid" name="unitid"></s:hidden>
		<div data-options="region:'north',border:false"
			style="height: 28px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01031000"></jtag:jlevel>
				</tr>
			</table>
		</div>

		<div data-options="region:'center',border:false,split:false">
			<div class="easyui-layout" data-options="fit : true,border : false">
					<div data-options="region:'west',border:true,title:'首页模块选择'"
					style="width: 250px;overflow:auto;" align="left">	
						<ul id="allModuleTree" class="tree"></ul>
					</div>
				<div data-options="region:'center',border:false,split:false">
					<div class="easyui-layout" data-options="fit : true,border : false">
						<div data-options="region:'west',border:false,split:false"
						style="width: 100px;overflow:hidden;" align="left">
							<s:form cssClass="jNice">
								<table width="92%"  border="0" cellspacing="0"
									cellpadding="5" align="center"
									style="border-style: none; padding: 0px;">
									<tr >
										<td width="80px" height="150px" >
										</td>
									</tr>
									<tr >
										<td width="100px" >
											<input type="button" id="select" value="选 择" class="btn18 pbtn1"/>
											<br />
											<br />
											<input type="button" id="del" value="移 除" class="btn2 pbtn1"/>
											<br />
											<br />
											<br />
											<br />
											<input type="button" id="clear" value="清 空" class="btn2 pbtn1"/>
											<br />
											<br />
											<input type="button" id="save" value="保 存" class="btn2 pbtn1"/>
											<br />
										</td>
									</tr>
								</table>
							</s:form>
						</div>
						<div data-options="region:'center',border:true, title:'用户首页模块',split:true">
							<ul id="userModuleTree" class="tree"></ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	var allModuleTree,userModuleTree;
	var allModuleNode,userModuleNode;
	var selectedModuleNode,selecteduserModuleNode;
	var moduleSetting,userModuleSetting;

	
	var moduleSetting = {
		isSimpleData : true,   
		treeNodeKey : "id", 
		treeNodeParentKey : "pid", 
		showLine : true,
		 callback: {
            click: moduleOnClick        
        }
	};
	
	var userModuleSetting = {
		isSimpleData : true,   
		treeNodeKey : "id", 
		treeNodeParentKey : "pid", 
		showLine : true,
		 callback: {
            click: userModuleOnClick      
        }
	};

	$(function() {
		
		//模块树加载
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "maintenance/SyModuleUser_moduleTree_treegrid.action",
			error : ajaxError,
			success : function(data) { //请求成功后处理函数。 
				allModuleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
		}
		});

		allModuleTree = $("#allModuleTree").zTree(moduleSetting, allModuleNode);
		//展开所有节点
		allModuleTree.expandAll(true);
		
		//用户模块树加载
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "maintenance/SyModuleUser_userModuleTree_treegrid.action",
			error : ajaxError,
			success : function(data) { //请求成功后处理函数。 
				userModuleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
		}
		});

		userModuleTree = $("#userModuleTree").zTree(userModuleSetting, userModuleNode);
		//展开所有节点
		userModuleTree.expandAll(true);
		
		//选择按钮
		$("#select").click(function(e) {

			var srcNode2 = allModuleTree.getSelectedNode();
			if (!srcNode2) {
				art.dialog.alert("请先选择模块！");
				return;
			}
			
			addRightTree(srcNode2);
			
			//重新展现
			for ( var i = 0; i < userModuleNode.length; i++) {
				userModuleNode[i].nodes = [];
			}
			userModuleTree = $("#userModuleTree").zTree(userModuleSetting,
					userModuleNode);
			userModuleTree.expandAll(true);
			
		});
		//移除按钮
		$("#del").click(function(e) {
			deleteChildrenNode(selecteduserModuleNode);
			/*
			art.dialog.confirm('确定要移除选择模块吗？',
				function(){				
					var unitid = $("#unitid").val();
					//流程环节树加载
					$.ajax( {
						type : 'POST',
						data :  {"unitid":unitid},
						dataType : "json",
						url : 'maintenance/SyModuleUser_detailsDelete_ajax.action',//请求的action路径  
						error : function() {//请求失败处理函数  
							art.dialog.alert('请求失败');
						},
						success : function(){
									art.dialog.alert('删除成功！',2).lock();
									userModuleNode = [];
									userTacheTree = $("#userModuleTree").zTree(userModuleSetting,
											userModuleNode);
									userModuleTree.expandAll(true);
								}
					});					
				},
				function(){
					art.dialog.tips('已取消',1).lock();
					return;
				}
			);*/
		});
		//清空按钮
		$("#clear").click(function(e) {
			art.dialog.confirm('确定要清空吗？',
				function(){
					var unitid = $("#unitid").val();
					//流程环节树加载
					$.ajax( {
						type : 'POST',
						data :  {"unitid":unitid},
						dataType : "json",
						url : 'maintenance/SyModuleUser_detailsDelete_ajax.action',
						error : ajaxError,
						success : function(){
									art.dialog.alert('清空成功！',2).lock();
									userModuleNode = [];
									userTacheTree = $("#userModuleTree").zTree(userModuleSetting,
											userModuleNode);
									userModuleTree.expandAll(true);
								}
					});
				},
				function(){
					art.dialog.tips('已取消',1).lock();
					return;
				}
			);
		});
		//保存按钮
		$("#save").click(function(e) {
			if(userModuleNode!=undefined){
				for ( var i = 0; i < userModuleNode.length; i++) {
					delete userModuleNode[i].nodes;
				}
			}
			
			var b = JSON.stringify(userModuleNode);
			
			$.ajax( {
				type : 'POST',
				data :  {"selUserModuleData":b+""},
				dataType : "json",
				url : 'maintenance/SyModuleUser_detailsUpdate_ajax.action',
				error : ajaxError,
				success : function(data){
					art.dialog.alert('保存成功！',2).lock();
					clrcookie();
				}
			});
		});

	});
	
	
		//删除子节点
	function deleteChildrenNode(srcNode) {
		if (srcNode.nodes) {//删除子元素
			for ( var i = 0; i < srcNode.nodes.length; i++) {
				deleteChildrenNode(srcNode.nodes[i]);
			}
		}
		
		for ( var i = 0; i < userModuleNode.length; i++) {
			var object = userModuleNode[i];
			if (object.id == srcNode.id) {
				userModuleNode.splice(i, 1);
				userModuleTree.removeNode(srcNode);				
				break;
			}
		}
	}
		
	//所有节点至右边	
	function addRightTree(srcNode2) {
		var isHas = false;
		
		for ( var i = 0; i < userModuleNode.length; i++) {
			var object = userModuleNode[i];
			//if (object.pId == srcNode2.id) {
			if (object.id == srcNode2.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode2);
			userModuleNode.push(addObject);
			
			if (srcNode2.parentNode) {//添加父节点
				addParentNode(srcNode2.parentNode);
			}
			if (srcNode2.nodes) {//添加子节点
				for ( var i = 0; i < srcNode2.nodes.length; i++) {
					addChildrenNode(srcNode2.nodes[i]);
				}
			}
		}
		
	}

	function moduleOnClick(event, treeId, treeNode) {
		selectedModuleNode = treeNode;	
	}
	
	function userModuleOnClick(event, treeId, treeNode) {
		selecteduserModuleNode = treeNode;	
	}
	
	//添加父节点
	function addParentNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < userModuleNode.length; i++) {
			var object = userModuleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			addObject.fla = srcNode.fla;//fla不是ztree默认属性，要手工添加
			userModuleNode.push(addObject);
		}
		if (srcNode.parentNode) {//添加父节点
			addParentNode(srcNode.parentNode);
		}
	}
	//添加子节点
	function addChildrenNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < userModuleNode.length; i++) {
			var object = userModuleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			//addObject.fla = srcNode.fla;//fla不是ztree默认属性，要手工添加
			userModuleNode.push(addObject);
		}
		if (srcNode.nodes) {
			for ( var i = 0; i < srcNode.nodes.length; i++) {
				addChildrenNode(srcNode.nodes[i]);
			}
		}
	}
	
	function getObject(node) {
		var addObject = {};
		addObject.name = node.name;
		addObject.id = node.id;
		addObject.pid = node.pid;
		addObject.ename = 'newTache';
		return addObject;
	}
</SCRIPT>
</html>


