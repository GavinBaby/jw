
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
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
		<script src="../../js/artDialog/artDialog.source.js?skin=blue"></script>
		<script src="../../js/artDialog/iframeTools.source.js"></script>
		<script src="../../js/JwCommon.js"></script>
	</head>
	<body>
	<s:hidden id="pUserId" name="parUId"></s:hidden>
	<s:hidden id="pUserName" name="parUName"></s:hidden>

		<table width="350px" height="500px" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="5">
						<tr>
							<td></td>
						</tr>
					</table>
					<table width="98%" height="500px" border="0" cellspacing="0"
						cellpadding="0" class="biaodan">
						<tr>
							<td width="40%" class="ziduan" >
								<div class="zTreeDemoBackground" style="height:500px;overflow:auto">
									<ul id="allPeopleTree" class="tree"></ul>
								</div>
							</td>
						</tr>

					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="5">
						<tr>
							<td align="center">
							<input type="button"  value="ȷ  ��" onfocus="this.blur();" onclick="selectUser();"/>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
	<SCRIPT type="text/javascript">
	var allPeopleTree;
	var allPeopleNode;
	var selectedNode;
	var setting;
	var setting = {
		isSimpleData : true,   
		treeNodeKey : "id", 
		treeNodeParentKey : "pId", 
		showLine : true,
		 callback: {
            click: zTreeOnClick,
            dblclick: zTreeOnDblClick
        }
	};

	$(function() {
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "common/UserSelect_detailsLoad_treegrid.action",//�����action·��  
			success : function(data) { //����ɹ��������� 
				allPeopleNode = data; //�Ѻ�̨��װ�õļ�Json��ʽ����treeNodes  
			},
			error : ajaxError
		});

		allPeopleTree = $("#allPeopleTree").zTree(setting, allPeopleNode);
		//չ�����нڵ�
		allPeopleTree.expandAll(true);

	});

	function zTreeOnClick(event, treeId, treeNode) {
		selectedNode = treeNode;	
	}

	function zTreeOnDblClick(event, treeId, treeNode) {
		//�������帳ֵ
		if(selectedNode.fla=='3'){
			art.dialog.opener.$("#"+ $("#pUserId").val()).val(treeNode.id);
			art.dialog.opener.$("#"+ $("#pUserName").val()).val(treeNode.name);
			closeBox();
		}else{
			art.dialog.alert("��ѡ����Ա��");
		}
	}
	function selectUser() {
		//�������帳ֵ
		if(selectedNode.fla=='3'){
			art.dialog.opener.$("#"+ $("#pUserId").val()).val(selectedNode.id);
			art.dialog.opener.$("#"+ $("#pUserName").val()).val(selectedNode.name);
			closeBox();
		}else{
			art.dialog.alert("��ѡ����Ա��");
		}
	}
</SCRIPT>
</html>


