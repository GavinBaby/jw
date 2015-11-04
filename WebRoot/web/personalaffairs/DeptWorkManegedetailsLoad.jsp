<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
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
        <script src="../../js/artDialog/artDialog.source.js?skin=default"></script>
        <script src="../../js/artDialog/iframeTools.source.js"></script>
		<style>
#choose_biaodan {
	border-top: #c8c9de 1px solid;
	border-left: #c8c9de 1px solid;
}

.choose_biaodan td {
	border-top: #c8c9de 1px solid;
	border-left: #c8c9de 1px solid;
	padding: 0px;
	text-align: center;
	font-size: 13px;
}
</style>
	</head>
	<body class="easyui-layout">
		<div data-options="region:'north',border:false"
			style="height: 500px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module08010302"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 1px solid;">
				<tr>
					<td>
							<s:hidden id="deptNameS" name="deptName" />
							<s:hidden id="type" name="type" />
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								style="vertical-align: middle;" class="content">
								<tr>
									<td width="40px" align="right">
										���ţ�
									</td>
									<td width="12%" align="left">
										<jtag:jsl id="deptName" list="list_C_T_Sys_Department" onchange="changdept();"
                                        name="deptName" listKey="uuid" listValue="deptName" theme="simple"
                                        editCondition="%{allPermission}" cssStyle="width:98%;" ></jtag:jsl>
									</td>
									<td align="left">
                                        &nbsp;
                                    </td>
								</tr>
							</table>
					</td>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<s:form id="update" name="update" method="post" action=""
				cssClass="jNice">
				<s:hidden id="userSelRa" name="userSelRa"></s:hidden>
				<table width="98%" border="0" cellspacing="0" cellpadding="0"
                        class="biaodan">
                        <tr>
                            <td width="40%" valign="top">
                                <div style="height:350px;overflow:auto">
                                    <ul id="allPeopleTree" class="tree"></ul>
                                </div>
                            </td>
                            <td width="20%" class="ziduan" style="text-align:center">
                                <input id="sel" type="button"  value="ѡ��" onfocus="this.blur();" title="�ƶ��ڵ� ��->��" />
                                <br/><br/><br/>
                                <input id="del" type="button" value="ɾ��" onfocus="this.blur();" title="�ƶ��ڵ� ��->��" />
                            </td>
                            <td width="40%" valign="top">
                                <div style="height:350px;overflow:auto">
                                    <ul id="selectPeopleTree" class="bumen"></ul>
                                </div>
                            </td>
                        </tr>
                 </table>
				<s:form cssClass="jNice">
					<table width="98%" height="35" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td colspan="3" align="center">
								<jtag:jbutton id="save" value="����" editCondition="%{allPermission}" />
							</td>
						</tr>
					</table>
				</s:form>
			</s:form>
		</div>
		<div data-options="region:'center',border:false"></div>
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
        callback : {
            click : zTreeOnClick,
            dblclick : zTreeOnDblClick
        }
    //ÿ���ڵ����Ƿ���ʾ CheckBox  
    };

	$(function() {
		$("#sel").click(function(e) {moveRight(); });
		$("#del").click(function(e) {moveLeft(); });
		$("#save").click(function(e) {updateData(); });
		$.ajax( {
            async : false,
            cache : false,
            type : 'POST',
            dataType : "json",
            url : "../common/UserSelect_detailsLoad_treegrid.action",//�����action·��  
            error : function() {//����ʧ�ܴ�����  
                alert('����ʧ��');
            },
            success : function(data) { //����ɹ��������� 
                allPeopleNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
        }
        });

        allPeopleTree = $("#allPeopleTree").zTree(setting, allPeopleNode);
        //չ�����нڵ�
        allPeopleTree.expandAll(true);

        changdept();

	});

    function changdept(){
    	var deptid = $("#deptName").val();
        $.ajax( {
            async : false,
            cache : false,
            type : 'POST',
            dataType : "json",
            url : "../personalaffairs/DeptWorkManege_deptworkmanagetree_treegrid.action",//�����action·��  
            data :  {"deptid":deptid},
            error : function() {//����ʧ�ܴ�����  
                alert('����ʧ��');
            },
            success : function(data) { //����ɹ��������� 
                selectPeopleNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
            }
        });
        selectPeopleTree = $("#selectPeopleTree").zTree(setting,
                selectPeopleNode);
        //չ�����нڵ�
        selectPeopleTree.expandAll(true);
    }
	
    function updateData(){
    	if(selectPeopleNode!=undefined){
            for ( var i = 0; i < selectPeopleNode.length; i++) {
                delete selectPeopleNode[i].nodes;
            }
        }
    	var b = JSON.stringify(selectPeopleNode);
    	var deptName = $("#deptName").val();
       
    	jQuery.ajax( {
            url : "DeptWorkManege_detailsUpdate_ajax.action",
            type : "POST",
            data :  {"seldeptsByUser":b+"","deptName":deptName},
            dataType : "json",
            error : function() {//����ʧ�ܴ�����  
                art.dialog.alert('����ʧ��');
            },
            success : function(data){
            art.dialog.alert('����ɹ���').lock();
            changdept();
            }
        });
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
        return addObject;
    }
	
	//ɾ��ѡ��ڵ�
    function moveLeft() {
        var srcNode = selectPeopleTree.getSelectedNode();
        if (!srcNode) {
            alert("����ѡ����Ҫ�ƶ��Ľڵ㣡");
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
            if (pNode.nodes.length==0)
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