
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
								<input type="button"  value="ѡ��" onfocus="this.blur();" title="�ƶ��ڵ� ��->��"
									onclick="moveTreeL2R();" />
                                <br/><br/><br/>
								<input type="button" value="ɾ��" onfocus="this.blur();" title="�ƶ��ڵ� ��->��"
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
								<jtag:jbutton id="save" value="�� ��" editCondition="*" />
								<jtag:jbutton id="back" value="�� ��" editCondition="*" />
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
		isSimpleData : true, //�����Ƿ���ü� Array ��ʽ��Ĭ��false  
		treeNodeKey : "id", //��isSimpleData��ʽ�£���ǰ�ڵ�id����  
		treeNodeParentKey : "pId", //��isSimpleData��ʽ�£���ǰ�ڵ�ĸ��ڵ�id����  
		showLine : true, //�Ƿ���ʾ�ڵ�������  
		checkable : true,
        checkType : { "Y": "s", "N": "s" },
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
			 	lockBox();
				for ( var i = 0; i < selectPeopleNode.length; i++) {
					delete selectPeopleNode[i].nodes;
				}
				var b = JSON.stringify(selectPeopleNode);
				
				$.ajax( {
					type : 'POST',
					data :  {"selUserData":b+""},
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
			url : "common/DeptSelect_detailsLoad_treegrid.action?deptSelRa="+$("#deptSelRa").val(),//�����action·��  
			success : function(data) { //����ɹ��������� 
				allPeopleNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
				},
			error : ajaxError
		});
		if (isSubmit != "") {
			$.ajax( {
				async : false,
				cache : false,
				type : 'POST',
				dataType : "json",
				url : $("#selDeptAction").val(),//�����action·��  
				success : function(data) { //����ɹ��������� 
					selectPeopleNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
				},
				error : ajaxError
			});
		} else {
			selectPeopleNode = [];
		}

		allPeopleTree = $("#allPeopleTree").zTree(setting, allPeopleNode);
		//չ�����нڵ�
		allPeopleTree.expandAll(true);

		selectPeopleTree = $("#selectPeopleTree").zTree(setting,
				selectPeopleNode);
		//չ�����нڵ�
		selectPeopleTree.expandAll(true);

	});

	//ѡ��ť
	function moveTreeL2R() {
		var selectedNode = allPeopleTree.getCheckedNodes();
		if (selectedNode.length<=0) {
            alert("����ѡ����Ҫ�ƶ��Ľڵ㣡");
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
	
	//ѡ��ڵ����ұ�
	function moveRight() {
		var srcNode = allPeopleTree.getSelectedNode();
		if (!srcNode) {
			alert("����ѡ����Ҫ�ƶ��Ľڵ㣡");
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
	//���нڵ����ұ�
	function addRightTree(srcNode) {

		var isHas = false;
		for ( var i = 0; i < selectPeopleNode.length; i++) {
			var object = selectPeopleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//δ���
			var addObject = getObject(srcNode);
			addObject.fla = srcNode.fla;//fla����ztreeĬ�����ԣ�Ҫ�ֹ����
			addObject.icon = srcNode.icon;
			selectPeopleNode.push(addObject);
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
		for ( var i = 0; i < selectPeopleNode.length; i++) {
			var object = selectPeopleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//δ���
			var addObject = getObject(srcNode);
			addObject.fla = srcNode.fla;//fla����ztreeĬ�����ԣ�Ҫ�ֹ����
			addObject.icon = srcNode.icon;
			selectPeopleNode.push(addObject);
		}
		if (srcNode.parentNode) {//��Ӹ��ڵ�
			addParentNode(srcNode.parentNode);
		}
	}
	//����ӽڵ�
	function addChildrenNode(srcNode) {
		var isHas = false;
		for ( var i = 0; i < selectPeopleNode.length; i++) {
			var object = selectPeopleNode[i];
			if (object.id == srcNode.id) {
				isHas = true;
				break;
			}
		}
		if (!isHas) {//δ���
			var addObject = getObject(srcNode);
			addObject.fla = srcNode.fla;//fla����ztreeĬ�����ԣ�Ҫ�ֹ����
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

    //ɾ����ť
	function moveTreeR2L() {
		var selectedNode = selectPeopleTree.getCheckedNodes();
        if (selectedNode.length<=0) {
            alert("����ѡ����Ҫɾ���Ľڵ㣡");
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
	//ɾ��ѡ��ڵ�
	function moveLeft() {
		var srcNode = selectPeopleTree.getSelectedNode();
		if (!srcNode) {
			alert("����ѡ����Ҫɾ���Ľڵ㣡");
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

	//ɾ���ӽڵ�
	function deleteChildrenNode(srcNode) {
		if (srcNode.nodes) {//ɾ����Ԫ��
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
	
	//ɾ�����ӽڵ�ĸ����
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

	//���ڵ㵥���¼�
	function zTreeOnClick(event, treeId, treeNode) {
		selectedNode = treeNode;
	}
	//���ڵ�˫���¼�
	function zTreeOnDblClick(event, treeId, treeNode) {
		moveRight();
	}
</SCRIPT>
</html>


