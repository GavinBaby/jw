
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
	<body class="easyui-layout">
		<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
		<s:hidden id="jsonResult" name="jsonResult"></s:hidden>
		<s:hidden id="userid" name="userid"></s:hidden>
		<div data-options="region:'north',border:false"
			style="height: 28px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01020200"></jtag:jlevel>
				</tr>
			</table>
		</div>
		<div data-options="region:'west',border:true,split:true,title:'人员选择'"
		style="width: 250px;overflow:auto;" align="left">
				<ul id="allPeopleTree" class="tree"></ul>
		</div>
		<div data-options="region:'center',border:false,split:false">
			<div class="easyui-layout" data-options="fit : true,border : false">
					<div data-options="region:'west',border:true,title:'流程选择'"
					style="width: 250px;overflow:auto;" align="center">	
						<ul id="allTacheTree" class="tree"></ul>
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
						<div data-options="region:'center',border:true, title:'人员环节',split:true">
							<ul id="userTacheTree" class="tree"></ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	var allPeopleTree,allTacheTree,userTacheTree;
	var allPeopleNode,allTacheNode,userTacheNode;
	var selectedPeopleNode,selectedTacheNode,selectedUserTacheNode;
	var setting,tacheSetting,userTacheSetting;
	var setting = {
		isSimpleData : true,   
		treeNodeKey : "id", 
		treeNodeParentKey : "pId", 
		showLine : true,
		 callback: {
            click: zTreeOnClick
            //dblclick: zTreeOnDblClick
        }
	};
	
	var tacheSetting = {
		isSimpleData : true,   
		treeNodeKey : "id", 
		treeNodeParentKey : "pId", 
		showLine : true,
		 callback: {
            click: tacheOnClick
            //dblclick: zTreeOnDblClick
        }
	};
	
	var userTacheSetting = {
		isSimpleData : true,   
		treeNodeKey : "id", 
		treeNodeParentKey : "pId", 
		showLine : true,
		 callback: {
            click: userTacheOnClick
            //dblclick: zTreeOnDblClick
        }
	};

	$(function() {
		//人员树加载
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "../common/UserSelect_detailsLoad_treegrid.action",
			error : ajaxError,
			success : function(data) { //请求成功后处理函数。 
				allPeopleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
		}
		});

		allPeopleTree = $("#allPeopleTree").zTree(setting, allPeopleNode);
		//展开所有节点
		allPeopleTree.expandAll(true);
		
		//流程环节树加载
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "../workflowengine/UserFlow_tacheTree_treegrid.action",
			error : ajaxError,
			success : function(data) { //请求成功后处理函数。 
				allTacheNode = data; //把后台封装好的简单Json格式赋给treeNodes  
		}
		});

		allTacheTree = $("#allTacheTree").zTree(tacheSetting, allTacheNode);
		//展开所有节点
		allTacheTree.expandAll(true);
		//选择按钮
		$("#select").click(function(e) {
			var srcNode1 = allPeopleTree.getSelectedNode();
			if (!srcNode1) {
				art.dialog.alert("请先选择人员！").unlock();
				return;
			}

			var srcNode2 = allTacheTree.getSelectedNode();
			if (!srcNode2) {
				art.dialog.alert("请先选择流程环节！");
				return;
			}
			if(srcNode1.level!=2){
				art.dialog.alert("请选择人员节点！");
				return;
			}
			if(srcNode2.level!=1){
				art.dialog.alert("请选择环节节点!");
				return;
			}
			
			addRightTree(srcNode1,srcNode2);
			
			//重新展现
			for ( var i = 0; i < userTacheNode.length; i++) {
				userTacheNode[i].nodes = [];
			}
			userTacheTree = $("#userTacheTree").zTree(userTacheSetting,
					userTacheNode);
			userTacheTree.expandAll(true);
			
		});
		//移除按钮
		$("#del").click(function(e) {
			deleteChildrenNode(selectedUserTacheNode);
		});
		//清空按钮
		$("#clear").click(function(e) {
			art.dialog.confirm('确定要清空该人员所有环节权限吗？',
				function(){
					var userid = $("#userid").val();
					//流程环节树加载
					$.ajax( {
						type : 'POST',
						data :  {"userid":userid},
						dataType : "json",
						url : 'workflowengineajax/UserFlow_detailsDelete_ajax.action',
						error : ajaxError,
						success : function(){
									art.dialog.alert('清空成功！',2).lock();
									userTacheNode = [];
									userTacheTree = $("#userTacheTree").zTree(userTacheSetting,
											userTacheNode);
									userTacheTree.expandAll(true);
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
			if(userTacheNode!=undefined){
				for ( var i = 0; i < userTacheNode.length; i++) {
					delete userTacheNode[i].nodes;
				}
			}
			
			var b = JSON.stringify(userTacheNode);
			var userid = $("#userid").val();
			if(userid==''){
				art.dialog.alert('请先选择人员！');
			}
			
			$.ajax( {
				type : 'POST',
				data :  {"selUserTacheData":b+"","userid":userid},
				dataType : "json",
				url : 'workflowengineajax/UserFlow_detailsUpdate_ajax.action',
				error : ajaxError,
				success : function(data){
					art.dialog.alert('保存成功！',2).lock();
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

		for ( var i = 0; i < userTacheNode.length; i++) {
			var object = userTacheNode[i];
			if (object.id == srcNode.id) {
				userTacheNode.splice(i, 1);
				userTacheTree.removeNode(srcNode);	
				break;
			}
		}
	}
		
	//所有节点至右边
	function addRightTree(srcNode1,srcNode2) {
		var isHas = false;
		var tacheid ;
		for ( var i = 0; i < userTacheNode.length; i++) {
			var object = userTacheNode[i];
			if (object.pId == srcNode2.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode2);
			userTacheNode.push(addObject);
		
		
			var adduser = {};
			adduser.name = srcNode1.name;
			adduser.id = '<%=new com.jw.baseframe.util.GUID().toString()%>';
			adduser.pId = srcNode2.id;
			adduser.ename = 'new';
			userTacheNode.push(adduser);
			
			if (srcNode2.parentNode) {//添加父节点
				addParentNode(srcNode2.parentNode);
			}
			if (srcNode2.nodes) {
				for ( var i = 0; i < srcNode2.nodes.length; i++) {
					//addChildrenNode(srcNode2.nodes[i]);
				}
			}
		}
		
	}

	function zTreeOnClick(event, treeId, treeNode) {
		selectedPeopleNode = treeNode;	
		$("#userid").attr("value",treeNode.id);
		//流程环节人员树加载
		if(treeNode.ename == 'new' || treeNode.ename == 'newTache'){
			return;
		}
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "../workflowengine/UserFlow_userTacheTree_treegrid.action?userid="+treeNode.id,
			error : ajaxError,
			success : function(data) { //请求成功后处理函数。 
				userTacheNode = data; //把后台封装好的简单Json格式赋给treeNodes  
		}
		});

		userTacheTree = $("#userTacheTree").zTree(userTacheSetting, userTacheNode);
		//展开所有节点
		userTacheTree.expandAll(true);
	}

	function tacheOnClick(event, treeId, treeNode) {
		selectedTacheNode = treeNode;	
	}
	
	function userTacheOnClick(event, treeId, treeNode) {
		selectedUserTacheNode = treeNode;	
	}
	
	//添加父节点
	function addParentNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < userTacheNode.length; i++) {
			var object = userTacheNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			addObject.fla = srcNode.fla;//fla不是ztree默认属性，要手工添加
			addObject.icon = srcNode.icon;
			userTacheNode.push(addObject);
		}
		if (srcNode.parentNode) {//添加父节点
			addParentNode(srcNode.parentNode);
		}
	}
	//添加子节点
	function addChildrenNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < userTacheNode.length; i++) {
			var object = userTacheNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			addObject.fla = srcNode.fla;//fla不是ztree默认属性，要手工添加
			addObject.icon = srcNode.icon;
			userTacheNode.push(addObject);
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
		addObject.pId = node.pId;
		addObject.ename = 'newTache';
		addObject.icon = node.icon;
		return addObject;
	}
</SCRIPT>
</html>


