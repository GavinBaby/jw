
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
						<input type="button" value="ѡ��" onfocus="this.blur();"
							title="�ƶ��ڵ� ��->��" onclick="moveRight();" />
						<br />
						<br />
						<br />
						<input type="button" value="ɾ��" onfocus="this.blur();"
							title="�ƶ��ڵ� ��->��" onclick="moveLeft();" />
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
						<jtag:jbutton id="save" value="�� ��" editCondition="*" />
						<jtag:jbutton id="back" value="�� ��" editCondition="*" />
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
		isSimpleData : true, //�����Ƿ���ü� Array ��ʽ��Ĭ��false  
		treeNodeKey : "id", //��isSimpleData��ʽ�£���ǰ�ڵ�id����  
		treeNodeParentKey : "pId", //��isSimpleData��ʽ�£���ǰ�ڵ�ĸ��ڵ�id����  
		showLine : true, //�Ƿ���ʾ�ڵ�������  
		callback : {
			click : zTreeOnClick,
			dblclick : zTreeOnDblClick
		}
	//ÿ���ڵ����Ƿ���ʾ CheckBox  
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
					url : $("#submitAction").val(),//�����action·��  
					success : callback,
					error : ajaxError
				});
			} else {
				//�������帳ֵ
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
			url : "common/ModuleSelect_detailsLoad_treegrid.action?moduleSelRa="+$("#moduleSelRa").val(),//�����action·��  
			success : function(data) { //����ɹ��������� 
				allModuleNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
			},
			error : ajaxError
		});
		if (isSubmit != "") {
			$.ajax( {
				async : false,
				cache : false,
				type : 'POST',
				dataType : "json",
				url : $("#selModuleAction").val(),//�����action·��  
				success : function(data) { //����ɹ��������� 
					selectModuleNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
				},
				error : ajaxError
			});
		} else {
			selectModuleNode = [];
		}

		allModuleTree = $("#allModuleTree").zTree(setting, allModuleNode);
		//չ�����нڵ�
		allModuleTree.expandAll(true);

		selectModuleTree = $("#selectModuleTree").zTree(setting,
				selectModuleNode);
		//չ�����нڵ�
		selectModuleTree.expandAll(true);

	});

	//ѡ��ڵ����ұ�
	function moveRight() {
		var srcNode = allModuleTree.getSelectedNode();
		if (!srcNode) {
			alert("����ѡ����Ҫ�ƶ��Ľڵ㣡");
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
	//���нڵ����ұ�
	function addRightTree(srcNode) {

		var isHas = false;
		for ( var i = 0; i < selectModuleNode.length; i++) {
			var object = selectModuleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//δ���
			var addObject = getObject(srcNode);
			selectModuleNode.push(addObject);
		}
		if (srcNode.parentNode) {//��Ӹ��ڵ�
			addParentNode(srcNode.parentNode);
		}
		if (srcNode.nodes) {
			for ( var i = 0; i < srcNode.nodes.length; i++) {
				addChildrenNode(srcNode.nodes[i]);
			}
		}
	}
	//��Ӹ��ڵ�
	function addParentNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < selectModuleNode.length; i++) {
			var object = selectModuleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//δ���
			var addObject = getObject(srcNode);
			selectModuleNode.push(addObject);
		}
		if (srcNode.parentNode) {//��Ӹ��ڵ�
			addParentNode(srcNode.parentNode);
		}
	}
	//����ӽڵ�
	function addChildrenNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < selectModuleNode.length; i++) {
			var object = selectModuleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//δ���
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
	//ɾ��ѡ��ڵ�
	function moveLeft() {
		var srcNode = selectModuleTree.getSelectedNode();
		if (!srcNode) {
			alert("����ѡ����Ҫ�ƶ��Ľڵ㣡");
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

	//ɾ���ӽڵ�
	function deleteChildrenNode(srcNode) {
		if (srcNode.nodes) {//ɾ����Ԫ��
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
	//ɾ�����ӽڵ�ĸ����
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

	//���ڵ㵥���¼�
	function zTreeOnClick(event, treeId, treeNode) {
		selectedNode = treeNode;
	}
	//���ڵ�˫���¼�
	function zTreeOnDblClick(event, treeId, treeNode) {
		moveRight();
	}
	
	function callback(data) {
		unlockBox();
		ajaxMessage(data, 1);
	}
	
	function ajaxError() {
		art.dialog.alert("ϵͳ����,����ϵ����Ա!");
	}
</SCRIPT>
</html>
