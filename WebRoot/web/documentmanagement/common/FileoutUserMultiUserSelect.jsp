
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
		<script src="../../js/artDialog/artDialog.source.js?skin=blue"></script>
		<script src="../../js/artDialog/iframeTools.source.js"></script>
		<script src="../../js/JwCommon.js"></script>
		<link rel="stylesheet" type="text/css"
			href="../../css/easyui/default/easyui.css">
		<script type="text/javascript"
			src="../../js/easyui/jquery.easyui.min.js"></script>
		<link rel="stylesheet" type="text/css"
			href="../../css/easyui/icon.css">
	</head>
	<body>
		<s:hidden id="submitAction" name="submitAction"></s:hidden>
		<s:hidden id="selUserAction" name="selUserAction"></s:hidden>
		<s:hidden id="pUserId" name="parUId"></s:hidden>
		<s:hidden id="pUserName" name="parUName"></s:hidden>
		<s:hidden id="userSelRa" name="userSelRa"></s:hidden>
		<%-- ADD START SUNYX 2014/10/14 ���Ĺ���-�ļ�����ϵͳ-001,�����칫-��Ϣ�ɱ�-001 --%>
		<s:hidden id="allUserIds" name="allUserIds"></s:hidden>
		<%-- ADD END SUNYX 2014/10/14 ���Ĺ���-�ļ�����ϵͳ-001,�����칫-��Ϣ�ɱ�-001 --%>
		<s:hidden id="rangType" name="rangType"></s:hidden>
		<table width="600px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						class="biaodan">
						<tr>
							<td width="40%" valign="top">
								<div class="l_tree2 auto_tree" style="overflow: auto">
									<ul id="allPeopleTree" class="bumen"></ul>
								</div>
							</td>
							<td width="10%" class="ziduan" style="text-align: center">
								<input type="button" value="ѡ&nbsp;&nbsp;&nbsp;&nbsp;��"
									onfocus="this.blur();" title="�ƶ��ڵ� ��->��"
									onclick="moveTreeL2R();" />
								<br />
								<br />
								<br />
								<input type="button" value="ȫѡ�ҿ�" onfocus="this.blur();"
									title="�ҽڵ� ȫѡ" onclick="selectAllRight();" />
								<br />
								<br />
								<br />
								<input type="button" value="ɾ&nbsp;&nbsp;&nbsp;&nbsp;��"
									onfocus="this.blur();" title="�ƶ��ڵ� ��->��"
									onclick="moveTreeR2L();" />
							</td>
							<td width="40%" valign="top">
								<div class="l_tree2 auto_tree" style="overflow: auto"
									id="select">
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
		isSimpleData : true, 
		treeNodeKey : "id",
		treeNodeParentKey : "pId",  
		showLine : true, 
		checkable : true,
        checkType : { "Y": "s", "N": "s" },
		callback : {
			click : zTreeOnClick,
			dblclick : zTreeOnDblClick
		} 
	};
	
	
		var isSubmit = $("#submitAction").val();
		var isSelect = $("#selUserAction").val();
		$(function() {
		$("#back").click(function(e) {
			closeBox();
		});
	
		$("#save").click(function(e) {
				//�������帳ֵ
				var userId="";
				var userName="";
				var printNum="";
				var msg=""
				var parentDiv= $("#select");
				var childs=parentDiv.find('div');
				for(var i=0;i<childs.length;i++){
					userName += $("#"+childs[i].id+"name").text()+",";
					userId += $("#"+childs[i].id+"id").text()+",";
					printNum += $("#"+childs[i].id+"print").val()+",";
					
					if($("#"+childs[i].id+"msg").prop("checked")){
						msg += "1,";
					}else{
						msg += "0,";
				    }
					
				}
				if(childs.length>0){
					userName = userName.substring(0,userName.length-1);
					userId = userId.substring(0,userId.length-1);
					printNum = printNum.substring(0,printNum.length-1);
					msg = msg.substring(0,msg.length-1);
				}
				art.dialog.opener.$("#fileinDeptmentmainid").val(userId);
				art.dialog.opener.$("#fileinDeptmentmain").val(userName);
				art.dialog.opener.$("#sendMsg").val(msg);
				art.dialog.opener.$("#printNum").val(printNum);
				closeBox();
			
		});
		//ADD START SUNYX 2014/10/14 ���Ĺ���-�ļ�����ϵͳ-001,�����칫-��Ϣ�ɱ�-001
		var params = {
			userSelRa: $("#userSelRa").val(),
			allUserIds : $("#allUserIds").val(),
			rangType : $("#rangType").val()
		}
		//ADD END SUNYX 2014/10/14 ���Ĺ���-�ļ�����ϵͳ-001,�����칫-��Ϣ�ɱ�-001
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			//MOD START SUNYX 2014/10/14 ���Ĺ���-�ļ�����ϵͳ-001,�����칫-��Ϣ�ɱ�-001
			//url : "common/UserSelect_detailsLoad_treegrid.action?userSelRa="+$("#userSelRa").val(),
			url : "common/UserSelect_fileOutUserTreeLoad_treegrid.action",
			data : params,
			//MOD END SUNYX 2014/10/14 ���Ĺ���-�ļ�����ϵͳ-001,�����칫-��Ϣ�ɱ�-001
			success : function(data) {
				allPeopleNode = data; 
			},
			error : ajaxError
		});
		
		if (isSelect != "") {
			$.ajax( {
				async : false,
				cache : false,
				type : 'POST',
				dataType : "json",
				url : $("#selUserAction").val(),//�����action·��  
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
		allPeopleTree.expandAll(false);


	});

	function callback(data) {
		unlockBox();
		ajaxMessage(data, 1);
	}
	//���ұ���Աȫѡ
	function selectAllRight(){
		var parentDiv= $("#select");
		var childs=parentDiv.find('div');
		for(var i=0;i<childs.length;i++){
		    $("#"+childs[i].id+'c').attr("checked","checked"); 
		}
	}

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
    
	}
	//���нڵ����ұ�
	function addRightTree(srcNode) {
		var parentDiv= $("#select");
		var childs=parentDiv.find('div');
		for(var i=0;i<childs.length;i++){
			//alert(srcNode.id+srcNode.ispublic);
			if(childs[i].id==srcNode.id){
				$("#"+srcNode.id).remove();
			}
		}
		var html='';
		
			if(srcNode.fla==3){
        	   html += '<div id="'+srcNode.id+'"><input type="checkbox" id="'+srcNode.id+'c">'
        	   +'<img src="../../css/zTree/img/renyuan.gif"/><span id="'+srcNode.id+'name">'
        	   +srcNode.name+'</span><span style="display:none" id="'+srcNode.id+'id">'+srcNode.id
        	   +'</span>&nbsp;&nbsp;��ӡ����:'
        	   +'<input style="width:30px;height:15px" type="text" id="'+srcNode.id+'print" value="'
        	   +srcNode.print+'">&nbsp;&nbsp;����'
        	   if(srcNode.msg==1){
        		   html += '<input checked="checked" type="checkbox" id="'+srcNode.id+'msg"></div>'
        	   }else{
        		   html += '<input type="checkbox" id="'+srcNode.id+'msg"></div>'
        	   }
        	   
        	   $("#select").append(html);
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
        var parentDiv= $("#select");
        var childs=parentDiv.find('div');
        var count = 0;
        for(var i=0;i<childs.length;i++){
			if($("#"+childs[i].id+"c").prop("checked")){
				$("#"+childs[i].id).remove();
				count++;
			}
		}
        if(count==0){
        	alert("�빴ѡɾ���ĵ�λ");
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
	
	 window.onunload = onunload_handler;  
	 function onunload_handler(){ 
	 	art.dialog.opener.$("#pluginPdf").css('display','block');
		if(art.dialog.opener.$("#wps")){
			art.dialog.opener.$("#wps").css('display','block');
		}
	 }
</SCRIPT>
</html>


