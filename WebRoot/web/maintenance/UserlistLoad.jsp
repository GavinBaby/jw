
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
	</head>
	<body class="easyui-layout">
		<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
		
		<div data-options="region:'west',border:true,split:true,title:'单位/部门选择'"
			style="width: 250px; overflow: auto;" align="left">
			<ul id="allUnitTree" class="tree"></ul>
		</div>
		
		<div data-options="region:'north',border:false"
			style="height: 120px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module01010300"></jtag:jlevel>
				</tr>
			</table>

			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="10">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 1px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData"
							action="User_listLoad.action" theme="simple" method="post"
							cssClass="jNice">
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="80px" align="right">
										用户姓名：
									</td>
									<td width="20%" align="left">
										<s:textfield id="userNameS" name="userNameS" theme="simple"
											maxlength="50" cssStyle="width:98%;" />
									</td>
									<td align="left">
										<input id="serach" type="button" value="查 询" />
									</td>
								</tr>
							</table>
						</s:form>
					</td>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<s:form cssClass="jNice">
				<table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
							<jtag:jbutton id="new" value="新建普通用户" editCondition="*" />

							<jtag:jbutton id="newAdmin" value="新建分级管理员"
								editCondition="%{allPermission}" />
						</td>
					</tr>
				</table>
			</s:form>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
		</div>
		<div data-options="region:'center',border:false">
			<table id="list">
			</table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
            var allUnitTree;
            var allUnitNode;
            var setting = {
                isSimpleData: true,
                treeNodeKey: "id",
                treeNodeParentKey: "pId",
                showLine: true,
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
                url: "../common/DeptSelect_detailsLoad_treegrid.action",
                error: ajaxError,
                success: function(data) { //请求成功后处理函数。 
                    allUnitNode = data; //把后台封装好的简单Json格式赋给treeNodes  
                }
            });
            allUnitTree = $("#allUnitTree").zTree(setting, allUnitNode);
            //展开所有节点
            allUnitTree.expandAll(true);
  
	
	    $("#new").click(function(e) {
	        openNew("maintenance/User_detailsLoad.action?userType=0", "新建普通用户");
	    });
	    $("#newAdmin").click(function(e) {
	        openNew("maintenance/User_detailsLoad.action?userType=1", "新建分级管理员");
	    });
	    $("#delete").click(function(e) {
	        deleteDateAjax("maintenance/User_detailsDelete_ajax.action");
	    });
	    $("#serach").click(function(e) {
	        $.post('User_gridLoad_treegrid.action', getQueryParams("searchData"), function(data) {
	            var d = data;
	            $('#list').treegrid('loadData', d);
	        }, 'json');
	    });
	    $('#list').treegrid({
	        url: 'User_gridLoad_treegrid.action',
	        queryParams: getQueryParams("searchData"),
	        rownumbers: true,
	        animate: true,
	        draggable: true,
	        idField: 'uuid',
	        singleSelect: false,
	        parentField: 'pid',
	        treeField: 'userName',
	        pagination: false,
	        loadMsg: '数据加载中请稍后……',
	        frozenColumns: null,
	        columns: [
	            [{
	                field: 'userName',
	                title: '姓名',
	                width: 30,
	                align: 'left',
	                formatter: function(value, data) {
	                    if (data.usertype == 3) {
	                        return '<a href="javascript:openNew(\'maintenance/User_detailsLoad.action?mainDocId=' + data.uuid + '\')">' + data.userName + '</a>';
	                    } else {
	                        return data.userName;
	                    }
	                }
	            }, {
	                field: 'positionName',
	                title: '职务',
	                width: 10,
	                align: 'center'
	            }, {
	                field: 'officephone',
	                title: '办公室电话',
	                width: 10,
	                align: 'center'
	            }, {
	                field: 'mobilephone',
	                title: '手机',
	                width: 20,
	                align: 'center'
	            }, {
	                field: 'email',
	                title: '电子邮箱',
	                width: 20,
	                align: 'center'
	            }, {
	                field: 'usertype',
	                title: '操作',
	                width: 10,
	                align: 'center',
	                formatter: function(value, data) {
	                    if (data.usertype == 2) {
	                        return '<a href="javascript:openNew(\'maintenance/User_detailsLoad.action?userType=0&deptId=' + data.uuid + '&unitId=' + data.unitId + '\')"><img src="../../images/add.gif"/></a>';
	                    } else if (data.usertype == 3) {
	                        return '<a href="javascript:deleteDateSingle(\'maintenance/User_detailsDelete_ajax.action\',\'' + data.uuid + '\')"><img src="../../images/delete.png"/></a>';
	                    } else {
	                        return "";
	                    }
	                }
	            }
	            
	           ]
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
	    lockBox();
	    $.ajax({
	        url: "maintenance/User_sortUpdate_ajax.action",
	        type: "POST",
	        data: {
	            mainDocId: uuid,
	            isRowUp: isUp,
	            deptId: pId
	        },
	        dataType: "json",
	        success: callback,
	        error: ajaxError
	    });
	}
	
	function callback(data) {
	    unlockBox();
	}
	
	function zTreeOnClick(event, treeId, treeNode) {
		$temp=treeNode.nodes;
		if(typeof($temp)=="undefined")
		{
        $.ajax({
            url: "User_gridLoad_treegrid.action",
            type: "POST",
            data: {
                deptId: treeNode.id
            },
            dataType: "json",
            success: function(data) {
                $('#list').treegrid('loadData', data);
            },
            error: ajaxError
        });
        }
    }
	
</SCRIPT>
</html>


