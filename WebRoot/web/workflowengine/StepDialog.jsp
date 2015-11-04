<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>

<HTML>
	<HEAD>
		<title>环节设置画面</title>
		<base target="_self">
		<META NAME="Author" CONTENT="JinWang">
		<META NAME="Keywords" CONTENT="JMOWebFlowBuilder">
		<meta http-equiv="X-UA-Compatible" content="IE=5" />
		<jtag:jhead />
		<link href="../../css/css.css" rel="stylesheet" type="text/css" />
		<link href="../../css/zTree/zTreeStyle.css" rel="stylesheet"
			type="text/css" />
		<script type="text/javascript"
			src="../../js/ztree/jquery.ztree-2.6.min.js"></script>
		<script type="text/javascript" src="../../js/json2.js"></script>
		<link rel="stylesheet" type="text/css" href="../../css/flow/style.css">
		<link rel="stylesheet" type="text/css"
			href="../../js/flow/webTab/webtab.css">
		<script language=jscript src="../../js/flow/function.js"></script>
		<script language=jscript src="../../js/flow/webTab/webTab.js"></script>
		<style>
body {
	background-color: buttonface;
	scroll: no;
	margin: 7px, 0px, 0px, 7px;
	border: none;
	overflow: hidden;
}
</style>
	</HEAD>
	<BODY>
		<s:form id="update" name="update"
			action="TacheInfor_detailsUpdate_ajax.action">
			<s:textfield id="flowId" name="flowId" cssStyle="display:none"></s:textfield>
			<s:textfield id="tacheId" name="tacheId" cssStyle="display:none"></s:textfield>
			<s:textfield id="tacheName" name="tacheName" cssStyle="display:none"></s:textfield>
			
			<s:textfield id="tacheSort" name="tacheSort" cssStyle="display:none"></s:textfield>
			<s:hidden id="xmlValue" name="xmlValue"></s:hidden>
			<s:hidden id="uuid" name="c_T_Flow_Tache_Infor.uuid"></s:hidden>

			<table border="0" cellpadding="0" cellspacing="0" height=385px>
				<thead>
					<tr id="WebTab">
						<td class="selectedtab" id="tab1" onmouseover="hoverTab('tab1')"
							onclick="switchTab('tab1','contents1');">
							<span id=tabpage1>基本属性</span>
						</td>
						<td class="tab" id="tab3" onmouseover="hoverTab('tab3')"
							onclick="switchTab('tab3','contents3');">
							<span id=tabpage3>环节属性</span>
						</td>
						<td class="tab" id="tab4" onmouseover="hoverTab('tab4')"
							onclick="switchTab('tab4','contents4');">
							<span id=tabpage3>环节人员</span>
						</td>
						<td class="tab" id="tab5" onmouseover="hoverTab('tab5')"
							onclick="switchTab('tab5','contents5');">
							<span id=tabpage3>环节修改域</span>
						</td>
						<td class="tabspacer" width=120>
							&nbsp;
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td id="contentscell" colspan="5">
							<!-- Tab Page 1 Content Begin -->
							<div class="selectedcontents" id="contents1">
								<TABLE border=0 width="100%" height="100%">
									<TR valign=top>
										<TD></TD>
										<TD width="100%" valign=top>
											<Fieldset style="border: 1px solid #C0C0C0;">
												<LEGEND align=left style="font-size: 9pt;">
													&nbsp;
													<span id=tabpage1_1>基本属性</span>&nbsp;
												</LEGEND>
												<TABLE border=0 width="100%" height="100%"
													style="font-size: 9pt;">
													<TR valign=top>
														<TD width=5></TD>
														<TD>
															<span id=tabpage1_2>环 节 ID</span>&nbsp;&nbsp;
															<INPUT TYPE="text" NAME="StepId" value="tache"
																class=txtput>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=top>
														<TD></TD>
														<TD>
															<span id=tabpage1_3>环节名称</span>&nbsp;&nbsp;
															<INPUT TYPE="text" NAME="StepText" value="" class=txtput>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=top>
														<TD></TD>
														<TD>
															<span id=tabpage1_4>排 序 号</span>&nbsp;&nbsp;
															<INPUT TYPE="text" NAME="StepSortNo" value=""
																class=txtput>
														</TD>
														<TD></TD>
													</TR>
													<TR height="3">
														<TD></TD>
														<TD>
															<INPUT TYPE="hidden" name=fdTacheUserIDList>
															<INPUT TYPE="hidden" name=fdTacheUserChList>
														</TD>
														<TD></TD>
													</TR>
												</TABLE>
											</Fieldset>
										</TD>
										<TD>
											&nbsp;
										</TD>
									</TR>

									<TR height="100%">
										<TD></TD>
										<TD></TD>
										<TD></TD>
									</TR>
								</TABLE>
							</div>
							<!-- Tab Page 1 Content End -->
							<!-- Tab Page 2 Content Begin -->
							<div class="contents" id="contents2">
								<TABLE border=0 width="100%" height="100%">
									<TR valign=top>
										<TD></TD>
										<TD width="100%" valign=top>
											<Fieldset style="border: 1px solid #C0C0C0;">
												<LEGEND align=left style="font-size: 9pt;">
													&nbsp;
													<span id=tabpage2_1>坐标与大小</span>&nbsp;
												</LEGEND>
												<TABLE border=0 width="100%" height="100%"
													style="font-size: 9pt;">
													<TR valign=top>
														<TD width=5></TD>
														<TD>
															<span id=tabpage2_2>图形宽度</span>&nbsp;&nbsp;
															<INPUT TYPE="text" NAME="Width" value="200" class=txtput>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=top>
														<TD></TD>
														<TD>
															<span id=tabpage2_3>图形高度</span>&nbsp;&nbsp;
															<INPUT TYPE="text" NAME="Height" value="200" class=txtput>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=top>
														<TD></TD>
														<TD>
															<span id=tabpage2_4>图形X坐标</span>&nbsp;&nbsp;
															<INPUT TYPE="text" NAME="X" value="1800" class=txtput>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=top>
														<TD></TD>
														<TD>
															<span id=tabpage2_5>图形Y坐标</span>&nbsp;&nbsp;
															<INPUT TYPE="text" NAME="Y" value="150" class=txtput>
														</TD>
														<TD></TD>
													</TR>
													<TR height="3">
														<TD></TD>
														<TD></TD>
														<TD></TD>
													</TR>
												</TABLE>
											</Fieldset>
										</TD>
										<TD>
											&nbsp;
										</TD>
									</TR>

									<TR valign=top>
										<TD></TD>
										<TD width="100%" valign=top>
											<Fieldset style="border: 1px solid #C0C0C0;">
												<LEGEND align=left style="font-size: 9pt;">
													&nbsp;
													<span id=tabpage2_6>步骤样式</span>&nbsp;
												</LEGEND>
												<TABLE border=0 width="100%" height="100%"
													style="font-size: 9pt;">
													<TR valign=top>
														<TD width=5></TD>
														<TD>
															<span id=tabpage2_7>文本大小</span>&nbsp;&nbsp;
															<INPUT TYPE="text" NAME="TextWeight" value=""
																class=txtput>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=top>
														<TD></TD>
														<TD>
															<span id=tabpage2_8>边框粗细</span>&nbsp;&nbsp;
															<INPUT TYPE="text" NAME="StrokeWeight" value=""
																class=txtput>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=top>
														<TD></TD>
														<TD>
															<span id=tabpage2_9>步骤类型</span>&nbsp;&nbsp;
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><INPUT
																	TYPE="radio" NAME="StepType" value="BeginStep" disabled><span
																id=tabpage2_10>开始步骤</span>&nbsp;<INPUT TYPE="radio"
																	NAME="StepType" value="EndStep" disabled><span
																id=tabpage2_11>结束步骤</span>&nbsp;<INPUT TYPE="radio"
																	NAME="StepType" value="NormalStep" checked disabled><span
																id=tabpage2_12>中间步骤</span>&nbsp;</FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR height="3">
														<TD></TD>
														<TD></TD>
														<TD></TD>
													</TR>
												</TABLE>
											</Fieldset>
										</TD>
										<TD>
											&nbsp;
										</TD>
									</TR>

									<TR height="100%">
										<TD></TD>
										<TD></TD>
										<TD></TD>
									</TR>
								</TABLE>
							</div>
							<!-- Tab Page 2 Content End -->
							<!-- Tab Page 3 Content Begin -->
							<div class="contents" id="contents3">
								<TABLE width="100%" height="100%" style="font-size: 10pt;">
									<TR valign=top>
										<TD></TD>
										<TD width="100%" valign=top>
											<Fieldset style="border: 1px solid #C0C0C0;">
												<LEGEND align=left style="font-size: 9pt;">
													&nbsp;
													<span id=tabpage3_1>环节信息</span>&nbsp;
												</LEGEND>
												<TABLE border=0 width="100%" height="100%"
													style="font-size: 9pt;">
													<TR valign=middle>
														<TD width=150>
															<span id=tabpage3_2>是否允许传阅</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"> <s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheIsPermitpass"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_5>提交时是否询问</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheIsConfirmsubmit"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_8>是否有收回</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheIsDrawback"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_11>是否有退回</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheIsWithdramal"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_14>是否有手工催办</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheIsHandurge"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_17>是否有自动催办</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheIsAutourge"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_20>是否只显示当前用户本部门人员</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheShowMydepPerson"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_23>是否使用手写签名??</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheIsPermitpass11"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_26>缺省是否发送短消息（处理人）</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheDoIsSentSms"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_29>缺省是否发送即时消息（处理人）</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheDoIsSentMsg"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_32>缺省是否发送短消息（传阅人）</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tachePassIsSentsms"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_35>缺省是否发送即时消息（传阅人）</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tachePassIsSentMsg"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR valign=middle>
														<TD>
															<span id=tabpage3_38>处理人是否是所有人（第一环节时起作用）</span>
														</TD>
														<TD>
															<FONT style="font-size: 10pt;" COLOR="#919CD0"><s:radio
																	list="#{'1':'是','0':'否'}"
																	name="c_T_Flow_Tache_Infor.tacheShowAllPerson"
																	theme="simple" /> </FONT>
														</TD>
														<TD></TD>
													</TR>
													<TR height="3">
														<TD></TD>
														<TD></TD>
														<TD></TD>
													</TR>
												</TABLE>
											</Fieldset>
										</TD>
										<TD>
											&nbsp;
										</TD>
									</TR>
								</TABLE>
							</div>
							<!-- Tab Page 3 Content End -->

							<!-- Tab Page 4 Content Begin -->
							<div class="contents" id="contents4">
								<table width="100%" border="0" cellspacing="0"
									cellpadding="0" class="biaodan" >
									<tr>
										<td width="40%" valign="top">
											<div class="l_tree2 auto_tree" style="overflow: auto">
												<ul id="allPeopleTree" class="tree"></ul>
											</div>
										</td>
										<td width="20%" class="ziduan">
											<input type=button onfocus="this.blur();"
												onclick="moveRight();" value="选 择"></input>

											<input type=button onfocus="this.blur();"
												onclick="moveLeft();" value="删 除"></input>
										</td>
										<td width="40%" valign="top">
											<div class="l_tree2 auto_tree" style="overflow: auto">
												<ul id="selectPeopleTree" class="tree"></ul>
											</div>
										</td>
									</tr>
								</table>
							</div>
							<!-- Tab Page 4 Content End -->

							<!-- Tab Page 5 Content Begin -->
							<div class="contents" id="contents5">
								<TABLE width="100%" height="100%" style="font-size: 10pt;">
									<TR valign=top>

										<TD></TD>

										<TD width="100%" valign=top>
											<Fieldset style="border: 1px solid #C0C0C0;">
												<LEGEND align=left style="font-size: 9pt;">
													&nbsp;
													<span id=tabpage3_1>环节对应的可修改域</span>&nbsp;
												</LEGEND>
												<TABLE border=0 width="100%" height="100%"
													style="font-size: 9pt;">
													<TR valign=middle>
														<TD></TD>
														<TD>
															<s:textfield id="userSysIdStrS" name="userSysIdStrS"
																cssStyle="display:none"></s:textfield>
															<s:textfield id="userSysNameStrS" name="userSysNameStrS"
																cssStyle="display:none"></s:textfield>
															<s:checkboxlist name="arrC_T_Flow_Tache_Field"
																list="listC_T_Flow_Field" listKey="fieldId"
																listValue="fieldName"></s:checkboxlist>

														</TD>
														<TD></TD>
													</TR>

												</TABLE>
											</Fieldset>
										</TD>

										<TD>
											&nbsp;
										</TD>

									</TR>
								</TABLE>
							</div>
							<!-- Tab Page 5 Content End -->

						</td>
					</tr>
				</tbody>
			</table>
			<table cellspacing="0" cellpadding="0" border="0" height="18">
				<tr>
					<td></td>
				</tr>
			</table>
			<table cellspacing="1" cellpadding="0" border="0" width="96%">
				<tr>
					<td width="100%"></td>
					<td>
						<input type=button id="btnOk" class=btn value="确 定"
							onclick="jscript: okOnClick();">
						&nbsp;&nbsp;&nbsp;
					</td>
					<td>
						<input type=button id="btnCancel" class=btn value="取 消"
							onclick="jscript: cancelOnClick();">
						&nbsp;&nbsp;&nbsp;
					</td>
				</tr>
			</table>
		</s:form>
		<SCRIPT LANGUAGE="JavaScript">

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
	var opener = window.dialogArguments;	

	var FlowXML = opener.document.all.FlowXML;	 
	
	if($("#tacheId").val() != '')
	{
		atEditStep(FlowXML,$("#tacheId").val());
	}
	$(function() {
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "../common/UserSelect_detailsLoad_treegrid.action?userSelRa=1",
			error : ajaxError,
			success : function(data) { //请求成功后处理函数。 
				allPeopleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
		}
		});
		
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "../workflowengine/TacheInfor_selTacheUserList_treegrid.action?flowId=" + $("#flowId").val() +"&tacheId=" +$("#tacheId").val(),
			error : ajaxError,
			success : function(data) { //请求成功后处理函数。 
				selectPeopleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
		}
		});

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
	function okOnClick(){
		var opener = window.dialogArguments;
		var stepId = document.all.tacheId.value;

		for ( var i = 0; i < selectPeopleNode.length; i++) {
			delete selectPeopleNode[i].nodes;
		}
		var b = JSON.stringify(selectPeopleNode);
			var FlowXML = opener.document.all.FlowXML;
			xml = getStepXML(FlowXML,stepId);
			
			if(xml!='') {
				FlowXML.value = xml;
		   		document.all.userSysIdStrS.value=b;
		     	document.all.tacheId.value = document.all.StepId.value;
	  		 	document.all.tacheName.value = document.all.StepText.value;
	  		 	document.all.tacheSort.value = document.all.StepSortNo.value;
	  		 	document.all.xmlValue.value = xml;
		      	update.submit();
		   		window.close();
		 	}	  
	}

function cancelOnClick(){
   window.close();
}

function atEditStep(FlowXML,stepId){
  var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
  xmlDoc.async = false;
  xmlDoc.loadXML(FlowXML.value);
  var xmlRoot = xmlDoc.documentElement;
  var Steps = xmlRoot.getElementsByTagName("Steps").item(0);

  for ( var i = 0;i < Steps.childNodes.length;i++ ) {
    Step = Steps.childNodes.item(i);
	  nId = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
	  if(nId==stepId){
	    document.all.StepId.value = stepId;document.all.StepId.disabled=true;
      document.all.StepText.value = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("text");
      document.all.StepSortNo.value = Step.getElementsByTagName("FlowProperties").item(0).getAttribute("SortNo");
      setRadioGroupValue(document.all.StepType,Step.getElementsByTagName("BaseProperties").item(0).getAttribute("stepType"));
  
      document.all.Width.value = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("width");
      document.all.Height.value = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("height");
      document.all.X.value = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("x");
      document.all.Y.value = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("y");
      document.all.TextWeight.value = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("textWeight");
      document.all.StrokeWeight.value = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("strokeWeight");

	  break;
	}
  } 

}

function getStepXML(FlowXML,stepId){
  id = document.all.StepId.value;
  text = document.all.StepText.value;
  stepType = getRadioGroupValue(document.all.StepType);
  if(id=='') {alert('请先填写环节ID！');return '';}
  if(text=='') {alert('请先填写环节名称！');return '';}
  
  width = document.all.Width.value;
  height = document.all.Height.value;
  x = document.all.X.value;
  y = document.all.Y.value;
  textWeight = document.all.TextWeight.value;
  strokeWeight = document.all.StrokeWeight.value;
  ls_SortNo = document.all.StepSortNo.value;
  
  ls_TacheUserSysList = "";
  ls_TacheUserChList = "";
  ls_TacheFieldIDList = "";
  ls_TacheFieldChList = "";

  var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
  xmlDoc.async = false;
  xmlDoc.loadXML(FlowXML.value);
  var xmlRoot = xmlDoc.documentElement;
  var Steps = xmlRoot.getElementsByTagName("Steps").item(0);

  //添加：查找编号冲突的Id
  //修改：查找原来的Id
  for ( var i = 0;i < Steps.childNodes.length;i++ ) {
      Step = Steps.childNodes.item(i);
	  nId = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
	  
	  if(nId==id && stepId=='') {
	    alert('新环节ID已存在！请重新输入！');return '';
	  }
	  if(nId==stepId && stepId!='') {
	    Steps.removeChild(Step);break;
	  }
  }
  
  var xml = ""; 
  //生成步骤xml
  xml+= '<Step><BaseProperties id="'+id+'" text="'+text+'" stepType="'+stepType+'" />';
  xml+= '<VMLProperties width="'+width+'" height="'+height+'" x="'+x+'" y="'+y+'" textWeight="'+textWeight+'" strokeWeight="'+strokeWeight+'" zIndex="" />';
  
  xml+= '<FlowProperties SortNo="'+ls_SortNo+'"/>';
  xml+= '</Step>';
  
  
  var xmlDoc2 = new ActiveXObject('MSXML2.DOMDocument');
  xmlDoc2.async = false;
  xmlDoc2.loadXML(xml);
  Steps.appendChild(xmlDoc2.documentElement); 
  return xmlRoot.xml;
}





</SCRIPT>
	</BODY>
</HTML>
