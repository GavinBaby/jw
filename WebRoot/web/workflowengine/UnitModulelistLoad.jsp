
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
		<link href="../../css/zTree/zTreeStyle.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="../../js/ztree/jquery.ztree-2.6.min.js"></script>
		<script type="text/javascript" src="../../js/json2.js"></script>
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
			<div data-options="region:'west',border:true,split:true,title:'��λѡ��'"
				style="width: 250px; overflow: auto;" align="left">
				<ul id="allUnitTree" class="tree"></ul>
			</div>
			<div data-options="region:'center',border:false,split:false">
				<div class="easyui-layout" data-options="fit : true,border : false">
					<div data-options="region:'west',border:true,title:'ģ��ѡ��'"
						style="width: 250px; overflow: auto;" align="center">
						<ul id="allModuleTree" class="tree"></ul>
					</div>
					<div data-options="region:'center',border:false,split:false">
						<div class="easyui-layout"
							data-options="fit : true,border : false">
							<div data-options="region:'west',border:false,split:false"
								style="width: 100px; overflow: hidden;" align="left">
								<s:form cssClass="jNice">
									<table width="92%" border="0" cellspacing="0" cellpadding="5"
										align="center" style="border-style: none; padding: 0px;">
										<tr>
											<td width="80px" height="150px">
											</td>
										</tr>
										<tr>
											<td width="100px">
												<input type="button" id="select" value="ѡ ��"
													class="btn18 pbtn1" />
												<br />
												<br />
												<input type="button" id="del" value="�� ��"
													class="btn2 pbtn1" />
												<br />
												<br />
												<br />
												<br />
												<input type="button" id="clear" value="�� ��"
													class="btn2 pbtn1" />
												<br />
												<br />
												<input type="button" id="save" value="�� ��"
													class="btn2 pbtn1" />
												<br />
											</td>
										</tr>
									</table>
								</s:form>
							</div>
							<div
								data-options="region:'center',border:true, title:'��λģ��',split:true">
								<ul id="unitModuleTree" class="tree"></ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</body>
		<SCRIPT type="text/javascript">
    var allUnitTree, allModuleTree, unitModuleTree;
    var allUnitNode, allModuleNode, unitModuleNode;
    var selectedUnitNode, selectedModuleNode, selectedunitModuleNode;
    var setting, moduleSetting, unitModuleSetting;
    var setting = {
        isSimpleData: true,
        treeNodeKey: "id",
        treeNodeParentKey: "pId",
        showLine: true,
        callback: {
            click: zTreeOnClick
        }
    };
    var moduleSetting = {
        isSimpleData: true,
        treeNodeKey: "id",
        treeNodeParentKey: "pId",
        showLine: true,
        callback: {
            click: moduleOnClick
        }
    };
    var unitModuleSetting = {
        isSimpleData: true,
        treeNodeKey: "id",
        treeNodeParentKey: "pId",
        showLine: true,
        callback: {
            click: unitModuleOnClick
        }
    };
    $(function() {
        //��λ������
        $.ajax({
            async: false,
            cache: false,
            type: 'POST',
            dataType: "json",
            url: "../common/UnitSelect_detailsLoad_treegrid.action",
            error: ajaxError,
            success: function(data) { //����ɹ��������� 
                allUnitNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
            }
        });
        allUnitTree = $("#allUnitTree").zTree(setting, allUnitNode);
        //չ�����нڵ�
        allUnitTree.expandAll(true);
        //ģ��������
        $.ajax({
            async: false,
            cache: false,
            type: 'POST',
            dataType: "json",
            url: "../workflowengine/UnitModule_moduleTree_treegrid.action",
            error: ajaxError,
            success: function(data) { //����ɹ��������� 
                allModuleNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
            }
        });
        allModuleTree = $("#allModuleTree").zTree(moduleSetting, allModuleNode);
        //չ�����нڵ�
        //allModuleTree.expandAll(true);
        //ѡ��ť
        $("#select").click(function(e) {
            var srcNode1 = allUnitTree.getSelectedNode();
            if (!srcNode1) {
                art.dialog.alert("����ѡ��λ��").unlock();
                return;
            }
            var srcNode2 = allModuleTree.getSelectedNode();
            if (!srcNode2) {
                art.dialog.alert("����ѡ��ģ�飡");
                return;
            }
            addRightTree(srcNode1, srcNode2);
            //����չ��
            for (var i = 0; i < unitModuleNode.length; i++) {
                unitModuleNode[i].nodes = [];
            }
            unitModuleTree = $("#unitModuleTree").zTree(unitModuleSetting, unitModuleNode);
            unitModuleTree.expandAll(true);
        });
        //�Ƴ���ť
        $("#del").click(function(e) {
            deleteChildrenNode(selectedunitModuleNode);
        });
        //��հ�ť
        $("#clear").click(function(e) {
            art.dialog.confirm('ȷ��Ҫ��ոõ�λ����ģ��Ȩ����', function() {
                var unitid = $("#unitid").val();
                //���̻���������
                lockBox();
                $.ajax({
                    type: 'POST',
                    data: {
                        "unitid": unitid
                    },
                    dataType: "json",
                    url: 'workflowengineajax/UnitModule_detailsDelete_ajax.action',
                    error: ajaxError,
                    success: function() {
                    	unlockBox();
                        art.dialog.alert('��ճɹ���', 2).lock();
                        unitModuleNode = [];
                        userTacheTree = $("#unitModuleTree").zTree(unitModuleSetting, unitModuleNode);
                        unitModuleTree.expandAll(true);
                    }
                });
            }, function() {
                art.dialog.tips('��ȡ��', 1).lock();
                return;
            });
        });
        //���水ť
        $("#save").click(function(e) {
            if (unitModuleNode != undefined) {
                for (var i = 0; i < unitModuleNode.length; i++) {
                    delete unitModuleNode[i].nodes;
                }
            }
            var b = JSON.stringify(unitModuleNode);
            var unitid = $("#unitid").val();
            if (unitid == '') {
                art.dialog.alert('����ѡ��λ��');
            }
            lockBox();
            $.ajax({
                type: 'POST',
                data: {
                    "selUnitModuleData": b + "",
                    "unitid": unitid
                },
                dataType: "json",
                url: 'workflowengineajax/UnitModule_detailsUpdate_ajax.action',
                error: ajaxError,
                success: function(data) {
                    unlockBox();
                    art.dialog.alert('����ɹ���', 2).lock();
                }
            });
        });
    });
    //ɾ���ӽڵ�

    function deleteChildrenNode(srcNode) {
        if (srcNode.nodes) { //ɾ����Ԫ��
            for (var i = 0; i < srcNode.nodes.length; i++) {
                deleteChildrenNode(srcNode.nodes[i]);
            }
        }
        for (var i = 0; i < unitModuleNode.length; i++) {
            var object = unitModuleNode[i];
            if (object.id == srcNode.id) {
                unitModuleNode.splice(i, 1);
                unitModuleTree.removeNode(srcNode);
                break;
            }
        }
    }
    //���нڵ����ұ�

    function addRightTree(srcNode1, srcNode2) {
        var isHas = false;
        //var tacheid ;
        for (var i = 0; i < unitModuleNode.length; i++) {
            var object = unitModuleNode[i];
            if (object.pId == srcNode2.id) {
                isHas = true;
                break;
            }
        }
        if (!isHas) { //δ���
            var addObject = getObject(srcNode2);
            unitModuleNode.push(addObject);
            if (srcNode2.parentNode) { //��Ӹ��ڵ�
                addParentNode(srcNode2.parentNode);
            }
            if (srcNode2.nodes) { //����ӽڵ�
                for (var i = 0; i < srcNode2.nodes.length; i++) {
                    addChildrenNode(srcNode2.nodes[i]);
                }
            }
        }
    }

    function zTreeOnClick(event, treeId, treeNode) {
        selectedUnitNode = treeNode;
        $("#unitid").attr("value", treeNode.id);
        //���̻�����Ա������
        if (treeNode.ename == 'new' || treeNode.ename == 'newTache') {
            return;
        }
        $.ajax({
            async: false,
            cache: false,
            type: 'POST',
            dataType: "json",
            url: "../workflowengine/UnitModule_unitModuleTree_treegrid.action?unitid=" + treeNode.id,
            error: ajaxError,
            success: function(data) { //����ɹ��������� 
                unitModuleNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
            }
        });
        unitModuleTree = $("#unitModuleTree").zTree(unitModuleSetting, unitModuleNode);
        //չ�����нڵ�
        unitModuleTree.expandAll(true);
    }

    function moduleOnClick(event, treeId, treeNode) {
        selectedModuleNode = treeNode;
    }

    function unitModuleOnClick(event, treeId, treeNode) {
        selectedunitModuleNode = treeNode;
    }
    //��Ӹ��ڵ�

    function addParentNode(srcNode) {
        var isHas = false;
        for (var i = 0; i < unitModuleNode.length; i++) {
            var object = unitModuleNode[i];
            if (object.id == srcNode.id) {
                isHas = true;
                break;
            }
        }
        if (!isHas) { //δ���
            var addObject = getObject(srcNode);
            addObject.fla = srcNode.fla; //fla����ztreeĬ�����ԣ�Ҫ�ֹ����
            unitModuleNode.push(addObject);
        }
        if (srcNode.parentNode) { //��Ӹ��ڵ�
            addParentNode(srcNode.parentNode);
        }
    }
    //����ӽڵ�

    function addChildrenNode(srcNode) {
        var isHas = false;
        for (var i = 0; i < unitModuleNode.length; i++) {
            var object = unitModuleNode[i];
            if (object.id == srcNode.id) {
                isHas = true;
                break;
            }
        }
        if (!isHas) { //δ���
            var addObject = getObject(srcNode);
            addObject.fla = srcNode.fla; //fla����ztreeĬ�����ԣ�Ҫ�ֹ����
            unitModuleNode.push(addObject);
        }
        if (srcNode.nodes) {
            for (var i = 0; i < srcNode.nodes.length; i++) {
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
        return addObject;
    }
</SCRIPT>
</html>


