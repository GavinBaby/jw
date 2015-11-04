
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
			src="../../js/ztree/jquery.ztree-2.6.min.js">
</script>
		<script type="text/javascript" src="../../js/json2.js">
</script>
		<style type="text/css">
button.diyBtn1 {
	background: url("../../css/easyui/icons/edit_add.png") no-repeat scroll
		1px 1px transparent;
}
</style>
	</head>
	<body class="easyui-layout">
		<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
		<s:hidden id="userType" name="userType"></s:hidden>
		<s:if test="userType==2">
		<div data-options="region:'west',border:true,split:true,title:'单位选择'"
			style="width: 250px; overflow: auto;" align="left">
			<ul id="allUnitTree" class="tree"></ul>
		</div>
		</s:if>
		<div data-options="region:'north',border:false"
			style="height: 28px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01010200"></jtag:jlevel>
				</tr>
			</table>
			
		</div>
		<div data-options="region:'center',border:false">
			<table id="list"></table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
    $(function() {
        if ($("#userType").val() == '2') {
            var allUnitTree;
            var allUnitNode;
            var setting = {
                isSimpleData: true,
                treeNodeKey: "id",
                treeNodeParentKey: "pId",
                showLine: true,
                addDiyDom: addDiyDom,
                callback: {
                    click: zTreeOnClick
                }
            };
            //单位树加载
            $.ajax({
                async: false,
                cache: false,
                type: 'POST',
                dataType: "json",
                url: "../common/UnitSelect_detailsLoad_treegrid.action",
                error: ajaxError,
                success: function(data) { //请求成功后处理函数。 
                    allUnitNode = data; //把后台封装好的简单Json格式赋给treeNodes  
                }
            });
            allUnitTree = $("#allUnitTree").zTree(setting, allUnitNode);
            //展开所有节点
            allUnitTree.expandAll(true);
        }
        $("#delete").click(function(e) {
            deleteDateAjax("maintenance/Department_detailsDelete_ajax.action");
        });
        $('#list').treegrid({
            url: 'Department_gridLoad_treegrid.action',
            rownumbers: true,
            animate: true,
            draggable: true,
            idField: 'uuid',
            singleSelect: false,
            parentField: 'pid',
            treeField: 'userName',
            pagination: false,
            frozenColumns: null,
            columns: [
                [{
                    field: 'userName',
                    title: '部门名称',
                    width: 30,
                    align: 'left',
                    formatter: function(value, data) {
                        if (data.usertype == 2) {
                            return '  <a href="javascript:openNew(\'maintenance/Department_detailsLoad.action?mainDocId=' + data.uuid + '\')">' + data.userName + '</a>';
                        } else {
                            return data.userName;
                        }
                    }
                }, {
                    field: 'userSysName',
                    title: '部门编号',
                    width: 20,
                    align: 'center',
                    formatter: function(value, data) {
                        if (data.usertype == 2) {
                            return data.userSysName;
                        } else {
                            return "";
                        }
                    }
                }, {
                    field: 'usertype',
                    title: '操作',
                    width: 10,
                    align: 'center',
                    formatter: function(value, data) {
                        if (data.usertype == 2) {
                            return '<a href="javascript:openNew(\'maintenance/Department_detailsLoad.action?selectDeptJson=' + data.uuid + '&selectUnitJson=' + data.unitId + '\')"><img src="../../images/add.gif"/></a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:deleteDateSingle(\'maintenance/Department_detailsDelete_ajax.action\',\'' + data.uuid + '\')"><img src="../../images/delete.gif"/></a>';
                        } else if (data.usertype == 3) {
                            return '<a href="javascript:openNew(\'maintenance/Department_detailsLoad.action?selectUnitJson=' + data.uuid + '\')"><img src="../../images/add.gif"/></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;';
                        } else {
                            return "";
                        }
                    }
                }, {
                    field: 'usertype2',
                    title: '修改排序',
                    width: 10,
                    align: 'center',
                    formatter: function(value, data) {
                        if (data.usertype == 2) {
                            return '<button  onclick="move(this,true,\'' + data.uuid + '\',\'' + data.pid + '\')"><img src="../../images/previous.gif"/></button>&nbsp;&nbsp;<button  onclick="move(this,false,\'' + data.uuid + '\',\'' + data.pid + '\')"><img src="../../images/next.gif"/></button>';
                        } else {
                            return "";
                        }
                    }
                }]
            ],
            loadFilter: function(data) {
                var opt = $(this).data().treegrid.options;
                var idFiled, textFiled, parentField;
                if (opt.parentField) {
                    idFiled = opt.idFiled || 'uuid';
                    textFiled = opt.textField || 'text';
                    parentField = opt.parentField;
                    var i, l, treeData = [],
                        tmpMap = [];
                    for (i = 0, l = data.length; i < l; i++) {
                        tmpMap[data[i][idFiled]] = data[i];
                    }
                    for (i = 0, l = data.length; i < l; i++) {
                        if (tmpMap[data[i][parentField]] && data[i][idFiled] != data[i][parentField]) {
                            if (!tmpMap[data[i][parentField]]['children']) tmpMap[data[i][parentField]]['children'] = [];
                            data[i]['text'] = data[i][textFiled];
                            tmpMap[data[i][parentField]]['children'].push(data[i]);
                        } else {
                            data[i]['text'] = data[i][textFiled];
                            treeData.push(data[i]);
                        }
                    }
                    return treeData;
                }
                return data;
            }
        });
    });

    function move(target, isUp, uuid, pId) {
        var $view = $(target).closest('div.datagrid-view');
        var index = $(target).closest('tr.datagrid-row').attr('node-id');
        var $row = $view.find('tr[node-id=' + index + ']');
        if (isUp) {
            $row.each(function() {
                $(this).prev().before($(this));
            });
        } else {
            $row.each(function() {
                $(this).before($(this).next());
            });
        }
        this.sectionRowIndex;
        $row.removeClass('datagrid-row-over');
/*
        lockBox();
        $.ajax({
            url: "maintenance/Department_sortUpdate_ajax.action",
            type: "POST",
            data: {
                mainDocId: uuid,
                isRowUp: isUp,
                selectUnitJson: pId
            },
            dataType: "json",
            success: callback,
            error: ajaxError
        });
        */
    }

    function callback(data) {
        unlockBox();
    }

    function addDiyDom(treeId, treeNode) {
        var aObj = $("#" + treeNode.tId + "_a");
        var editStr = "&nbsp;&nbsp;&nbsp;<button type='button' class='diyBtn1' id='diyBtn_" + treeNode.id + "' title='新建部门' onfocus='this.blur();'></button>";
        aObj.append(editStr);
        var btn = $("#diyBtn_" + treeNode.id);
        if (btn) btn.bind("click", function() {
            openNew("maintenance/Department_detailsLoad.action?selectUnitJson=" + treeNode.id, "新建");
        });
    }

    function zTreeOnClick(event, treeId, treeNode) {
        $.ajax({
            url: "Department_gridLoad_treegrid.action",
            type: "POST",
            data: {
                selectUnitJson: treeNode.id
            },
            dataType: "json",
            success: function(data) {
                $('#list').treegrid('loadData', data);
            },
            error: ajaxError
        });
    }
</SCRIPT>
</html>


