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
										部门：
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
                                <input id="sel" type="button"  value="选择" onfocus="this.blur();" title="移动节点 右->左" />
                                <br/><br/><br/>
                                <input id="del" type="button" value="删除" onfocus="this.blur();" title="移动节点 左->右" />
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
								<jtag:jbutton id="save" value="保存" editCondition="%{allPermission}" />
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

	$(function() {
		$("#sel").click(function(e) {moveRight(); });
		$("#del").click(function(e) {moveLeft(); });
		$("#save").click(function(e) {updateData(); });
		$.ajax( {
            async : false,
            cache : false,
            type : 'POST',
            dataType : "json",
            url : "../common/UserSelect_detailsLoad_treegrid.action",//请求的action路径  
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

        changdept();

	});

    function changdept(){
    	var deptid = $("#deptName").val();
        $.ajax( {
            async : false,
            cache : false,
            type : 'POST',
            dataType : "json",
            url : "../personalaffairs/DeptWorkManege_deptworkmanagetree_treegrid.action",//请求的action路径  
            data :  {"deptid":deptid},
            error : function() {//请求失败处理函数  
                alert('请求失败');
            },
            success : function(data) { //请求成功后处理函数。 
                selectPeopleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
            }
        });
        selectPeopleTree = $("#selectPeopleTree").zTree(setting,
                selectPeopleNode);
        //展开所有节点
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
            error : function() {//请求失败处理函数  
                art.dialog.alert('请求失败');
            },
            success : function(data){
            art.dialog.alert('保存成功！').lock();
            changdept();
            }
        });
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
	
	//删除选择节点
    function moveLeft() {
        var srcNode = selectPeopleTree.getSelectedNode();
        if (!srcNode) {
            alert("请先选择需要移动的节点！");
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