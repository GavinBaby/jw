
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
		<script type="text/javascript"
			src="../../js/ztree/jquery.ztree-2.6.min.js"></script>
		<script type="text/javascript" src="../../js/json2.js"></script>
		<script src="../../js/artDialog/artDialog.source.js?skin=blue"></script>
		<script src="../../js/artDialog/iframeTools.source.js"></script>
		<script src="../../js/JwCommon.js"></script>
		<link rel="stylesheet" type="text/css" href="../../css/easyui/default/easyui.css">
	 	<script type="text/javascript" src="../../js/easyui/jquery.easyui.min.js"></script>
	 	<link rel="stylesheet" type="text/css" href="../../css/easyui/icon.css">
	 	<link href="../../css/zTree/zTreeStyle.css" rel="stylesheet"
			type="text/css" />
	</head>
	<body>
		<div>
			<s:hidden id="submitAction" name="submitAction"></s:hidden>
			<s:hidden id="selModuleAction" name="selModuleAction"></s:hidden>
			<s:hidden id="pModuleId" name="parMId"></s:hidden>
			<s:hidden id="pModuleName" name="parMName"></s:hidden>
			<s:hidden id="moduleSelRa" name="moduleSelRa"></s:hidden>

			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				class="biaodan">
				<tr>
					<td width="40%">
						<div  style="height: 350px; width: 220; overflow: auto">
							<ul id="allModuleTree" class="tree"></ul>
						</div>
					</td>
					<td width="20%" class="ziduan" style="text-align: center">
						<input type="button" value="选择" onfocus="this.blur();"
							title="移动节点 右->左" onclick="moveRight();" />
						<br />
						<br />
						<br />
						<input type="button" value="删除" onfocus="this.blur();"
							title="移动节点 左->右" onclick="moveLeft();" />
					</td>
					<td width="40%">
							<div  style="height: 350px; width: 220; overflow: auto">
							<ul id="selectModuleTree" class="tree"></ul>
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
		</div>
	</body>
	<SCRIPT type="text/javascript">
	var allModuleTree, selectModuleTree;
	var allModuleNode, selectModuleNode;
	var setting;
	var setting = {
		isSimpleData : true, //数据是否采用简单 Array 格式，默认false  
		treeNodeKey : "id", //在isSimpleData格式下，当前节点id属性  
		treeNodeParentKey : "pId", //在isSimpleData格式下，当前节点的父节点id属性  
		showLine : true, //是否显示节点间的连线  
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
				for ( var i = 0; i < selectModuleNode.length; i++) {
					delete selectModuleNode[i].nodes;
				}
				var b = JSON.stringify(selectModuleNode);
				lockBox();
				$.ajax( {
					type : 'POST',
					data :  {"selModuleData":b+""},
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
					if(selectPeopleNode[i].level==2){
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
		
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "common/ModuleSelect_detailsLoad_treegrid.action?moduleSelRa="+$("#moduleSelRa").val(),//请求的action路径  
			success : function(data) { //请求成功后处理函数。 
				allModuleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
			},
			error : ajaxError
		});
		if (isSubmit != "") {
			$.ajax( {
				async : false,
				cache : false,
				type : 'POST',
				dataType : "json",
				url : $("#selModuleAction").val(),//请求的action路径  
				success : function(data) { //请求成功后处理函数。 
					selectModuleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
				},
				error : ajaxError
			});
		} else {
			selectModuleNode = [];
		}

		allModuleTree = $("#allModuleTree").zTree(setting, allModuleNode);
		//展开所有节点
		allModuleTree.expandAll(true);

		selectModuleTree = $("#selectModuleTree").zTree(setting,
				selectModuleNode);
		//展开所有节点
		selectModuleTree.expandAll(true);

	});

	//选择节点至右边
	function moveRight() {
		var srcNode = allModuleTree.getSelectedNode();
		if (!srcNode) {
			alert("请先选择需要移动的节点！");
			return;
		}

		addRightTree(srcNode);

		for ( var i = 0; i < selectModuleNode.length; i++) {
			selectModuleNode[i].nodes = [];
		}
		selectModuleTree = $("#selectModuleTree").zTree(setting,
				selectModuleNode);
		selectModuleTree.expandAll(true);
	}
	//所有节点至右边
	function addRightTree(srcNode) {

		var isHas = false;
		for ( var i = 0; i < selectModuleNode.length; i++) {
			var object = selectModuleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			selectModuleNode.push(addObject);
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
		for ( var i = 0; i < selectModuleNode.length; i++) {
			var object = selectModuleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			selectModuleNode.push(addObject);
		}
		if (srcNode.parentNode) {//添加父节点
			addParentNode(srcNode.parentNode);
		}
	}
	//添加子节点
	function addChildrenNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < selectModuleNode.length; i++) {
			var object = selectModuleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//未添加
			var addObject = getObject(srcNode);
			selectModuleNode.push(addObject);
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
		return addObject;
	}
	//删除选择节点
	function moveLeft() {
		var srcNode = selectModuleTree.getSelectedNode();
		if (!srcNode) {
			alert("请先选择需要移动的节点！");
			return;
		}
		deleteChildrenNode(srcNode);
		
		deleteParentNode(srcNode);

		for ( var i = 0; i < selectModuleNode.length; i++) {
			selectModuleNode[i].nodes = [];
		}
		selectModuleTree = $("#selectModuleTree").zTree(setting,
				selectModuleNode);
	}

	//删除子节点
	function deleteChildrenNode(srcNode) {
		if (srcNode.nodes) {//删除子元素
			for ( var i = 0; i < srcNode.nodes.length; i++) {
				deleteChildrenNode(srcNode.nodes[i]);
			}
		}

		for ( var i = 0; i < selectModuleNode.length; i++) {
			var object = selectModuleNode[i];
			if (object.id == srcNode.id) {
				selectModuleNode.splice(i, 1);
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
            if (pNode.nodes.length==0)
            {   
				for ( var i = 0; i < selectModuleNode.length; i++) {
					var object = selectModuleNode[i];
				    if (object.id == pNode.id) {
				    	selectModuleNode.splice(i, 1);
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
	
	function callback(data) {
		unlockBox();
		ajaxMessage(data, 1);
	}
	
	function ajaxError() {
		art.dialog.alert("系统报错,请联系管理员!");
	}
</SCRIPT>
</html>
