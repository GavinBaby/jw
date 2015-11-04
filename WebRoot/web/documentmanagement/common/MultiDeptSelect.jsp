
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
		<script src="../../js/artDialog/artDialog.source.js?skin=default"></script>
		<script src="../../js/artDialog/iframeTools.source.js"></script>
		<script src="../../js/JwCommon.js"></script>
		<link rel="stylesheet" type="text/css" href="../../css/easyui/default/easyui.css">
	 	<script type="text/javascript" src="../../js/easyui/jquery.easyui.min.js"></script>
	 	<link rel="stylesheet" type="text/css" href="../../css/easyui/icon.css">
	</head>
	<body>
		<s:hidden id="submitAction" name="submitAction"></s:hidden>
		<s:hidden id="selDeptAction" name="selDeptAction"></s:hidden>
		<s:hidden id="pUserId" name="parUId"></s:hidden>
		<s:hidden id="pUserName" name="parUName"></s:hidden>
		<s:hidden id="deptSelRa" name="deptSelRa"></s:hidden>
		<table width="450px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<s:form id="update" name="update">

					</s:form>
					
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						class="biaodan">
						<tr>
							<td width="40%" valign="top">
								<div class="l_tree2 auto_tree">
									<ul id="allPeopleTree" class="bumen"></ul>
								</div>
							</td>
							<td width="20%" class="ziduan" style="text-align:center">
								<input type="button"  value="选择" onfocus="this.blur();" title="移动节点 左->右"
									onclick="moveTreeL2R();" />
                                <br/><br/><br/>
								<input type="button" value="删除" onfocus="this.blur();" title="移动节点 右->左"
									onclick="moveTreeR2L();" />
							</td>
							<td width="40%" valign="top">
								<div class="l_tree2 auto_tree">
									<ul id="selectPeopleTree" class="bumen"></ul>
								</div>
							</td>
						</tr>
					</table>
					
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="17">
						<tr>
							<td></td>
						</tr>
					</table>
					<table width="98%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td align="center">
								<jtag:jbutton id="save" value="保 存" editCondition="*" />
								<jtag:jbutton id="back" value="返 回" editCondition="*" />
							</td>
							<td>

							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
	<SCRIPT type="text/javascript">
	var allPeopleTree, selectPeopleTree;
	var allPeopleNode, selectPeopleNode;
	var setting;
	var setting = {
		isSimpleData : true, //数据是否采用简单 Array 格式，默认false  
		treeNodeKey : "id", //在isSimpleData格式下，当前节点id属性  
		treeNodeParentKey : "pId", //在isSimpleData格式下，当前节点的父节点id属性  
		showLine : true, //是否显示节点间的连线  
		checkable : true,
        checkType : { "Y": "s", "N": "s" },
		callback : {
			click : zTreeOnClick,
			dblclick : zTreeOnDblClick
		}
	//每个节点上是否显示 CheckBox  
	};

	var isSubmit = $("#submitAction").val();

	$(function() {
		$("#back").click(function(e) {
			closeBox();
		});

		$("#save").click(function(e) {
			if (isSubmit != "") {
			 	lockBox();
				for ( var i = 0; i < selectPeopleNode.length; i++) {
					delete selectPeopleNode[i].nodes;
				}
				var b = JSON.stringify(selectPeopleNode);
				
				$.ajax( {
					type : 'POST',
					data :  {"selUserData":b+""},
					dataType : "json",
					url : $("#submitAction").val(),//请求的action路径  
					success : callback,
					error : ajaxError
				});
			} else {
				//给父窗体赋值
				var userId="";
				var userName="";
				for ( var i = 0; i < selectPeopleNode.length; i++) {
					if(selectPeopleNode[i].fla=='2' && selectPeopleNode[i].isParent==false){
						if(userId=='')
							userId = selectPeopleNode[i].id;
						else
							userId += ","+selectPeopleNode[i].id;
						if(userName=='')
							userName = selectPeopleNode[i].name;
						else
							userName += ","+selectPeopleNode[i].name;
						
					}
				}
				art.dialog.opener.$("#" + $("#pUserId").val()).val(
						userId);
				art.dialog.opener.$("#" + $("#pUserName").val()).val(
						userName);
				closeBox();
			}
		});
		function callback(data) {
			unlockBox();
			ajaxMessage(data, 1);
		}
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "common/DeptSelect_detailsLoad_treegrid.action?deptSelRa="+$("#deptSelRa").val(),//请求的action路径  
			success : function(data) { //请求成功后处理函数。 
				allPeopleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
				},
			error : ajaxError
		});
		if (isSubmit != "") {
			$.ajax( {
				async : false,
				cache : false,
				type : 'POST',
				dataType : "json",
				url : $("#selDeptAction").val(),//请求的action路径  
				success : function(data) { //请求成功后处理函数。 
					selectPeopleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
				},
				error : ajaxError
			});
		} else {
			selectPeopleNode = [];
		}

		allPeopleTree = $("#allPeopleTree").zTree(setting, allPeopleNode);
		//展开所有节点
		allPeopleTree.expandAll(true);

		selectPeopleTree = $("#selectPeopleTree").zTree(setting,
				selectPeopleNode);
		//展开所有节点
		selectPeopleTree.expandAll(true);

	});

	//选择按钮
	function moveTreeL2R() {
		var selectedNode = allPeopleTree.getCheckedNodes();
		if (selectedNode.length<=0) {
            alert("请先选择需要移动的节点！");
            return;
        }
		for(var j = 0; j < selectedNode.length; j++){
			  addRightTree(selectedNode[j]);
		}

        for ( var i = 0; i < selectPeopleNode.length; i++) {
        	selectPeopleNode[i].nodes = [];
        }
        selectPeopleTree = $("#selectPeopleTree").zTree(setting,
        		selectPeopleNode);
        selectPeopleTree.expandAll(true);
	}
	
	//选择节点至右边
	function moveRight() {
		var srcNode = allPeopleTree.getSelectedNode();
		if (!srcNode) {
			alert("请先选择需要移动的节点！");
			return;
		}
		addRightTree(srcNode);

		for ( var i = 0; i < selectPeopleNode.length; i++) {
			selectPeopleNode[i].nodes = [];
		}
		selectPeopleTree = $("#selectPeopleTree").zTree(setting,
				selectPeopleNode);
		selectPeopleTree.expandAll(true);
	}
	//所有节点至右边
	function addRightTree(srcNode) {

		var isHas = false;
		for ( var i = 0; i < selectPeopleNode.length; i++) {
			var object = selectPeopleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			addObject.fla = srcNode.fla;//fla不是ztree默认属性，要手工添加
			addObject.icon = srcNode.icon;
			selectPeopleNode.push(addObject);
		}
		if (srcNode.parentNode) {//添加父节点
			addParentNode(srcNode.parentNode);
		}
		if (srcNode.nodes) {
			for ( var i = 0; i < srcNode.nodes.length; i++) {
				addChildrenNode(srcNode.nodes[i]);
			}
		}
	}
	//添加父节点
	function addParentNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < selectPeopleNode.length; i++) {
			var object = selectPeopleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			addObject.fla = srcNode.fla;//fla不是ztree默认属性，要手工添加
			addObject.icon = srcNode.icon;
			selectPeopleNode.push(addObject);
		}
		if (srcNode.parentNode) {//添加父节点
			addParentNode(srcNode.parentNode);
		}
	}
	//添加子节点
	function addChildrenNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < selectPeopleNode.length; i++) {
			var object = selectPeopleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			addObject.fla = srcNode.fla;//fla不是ztree默认属性，要手工添加
			addObject.icon = srcNode.icon;
			selectPeopleNode.push(addObject);
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
		addObject.ename = node.ename;
		addObject.icon = node.icon;
		return addObject;
	}

    //删除按钮
	function moveTreeR2L() {
		var selectedNode = selectPeopleTree.getCheckedNodes();
        if (selectedNode.length<=0) {
            alert("请先选择需要删除的节点！");
            return;
        }

        for(var j = 0; j < selectedNode.length; j++){
        	deleteChildrenNode(selectedNode[j]);
        	if(j==(selectedNode.length-1)){
        		deleteParentNode(selectedNode[j]); 
        	}
        }
        
        
        for ( var i = 0; i < selectPeopleNode.length; i++) {
            selectPeopleNode[i].nodes = [];
        }
        selectPeopleTree = $("#selectPeopleTree").zTree(setting,
        		selectPeopleNode);
    }
	//删除选择节点
	function moveLeft() {
		var srcNode = selectPeopleTree.getSelectedNode();
		if (!srcNode) {
			alert("请先选择需要删除的节点！");
			return;
		}
		
		deleteChildrenNode(srcNode);
		deleteParentNode(srcNode);
		for ( var i = 0; i < selectPeopleNode.length; i++) {
			selectPeopleNode[i].nodes = [];
		}
		selectPeopleTree = $("#selectPeopleTree").zTree(setting,
				selectPeopleNode);
	}

	//删除子节点
	function deleteChildrenNode(srcNode) {
		if (srcNode.nodes) {//删除子元素
			for ( var i = 0; i < srcNode.nodes.length; i++) {
				deleteChildrenNode(srcNode.nodes[i]);
			}
		}

		for ( var i = 0; i < selectPeopleNode.length; i++) {
			var object = selectPeopleNode[i];
			if (object.id == srcNode.id) {
				selectPeopleNode.splice(i, 1);
				break;
			}
		}
	}
	
	//删除无子节点的父结点
	function deleteParentNode(srcNode) {
		if (srcNode.parentNode) {
			var pNode = srcNode.parentNode;	
			for(var i=0;i<pNode.nodes.length;i++){
				if(pNode.nodes[i]==srcNode){
					pNode.nodes.splice(i, 1);
				}
			}
			if (pNode.nodes.length==0||selectPeopleNode.length==1)
			{	
					for ( var i = 0; i < selectPeopleNode.length; i++) {
					var object = selectPeopleNode[i];
						if (object.id == pNode.id) {
							selectPeopleNode.splice(i, 1);
							deleteParentNode(object);
							break;
						}
					}
				
			}
		}
	}

	//树节点单击事件
	function zTreeOnClick(event, treeId, treeNode) {
		selectedNode = treeNode;
	}
	//树节点双击事件
	function zTreeOnDblClick(event, treeId, treeNode) {
		moveRight();
	}
</SCRIPT>
</html>


