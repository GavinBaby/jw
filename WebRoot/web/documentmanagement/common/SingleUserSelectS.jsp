
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
	</head>
	<body>
	<s:hidden id="pUserId" name="parUId"></s:hidden>
	<s:hidden id="pUserName" name="parUName"></s:hidden>

	<table width="650px" height="500px" border="0" cellpadding="0"
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
						<td width="30%" class="ziduan" align="left" >
							<div class="zTreeDemoBackground" style="height:500px;overflow:auto;">
								<ul id="allPeopleTree" class="tree"></ul>
							</div>
						</td>
						<td width="30%" align="left" >
						     <div style="overflow:auto;width:98%">
                                   <jtag:jsl id="listUserAll" name=""
                                       list="#{'':''}" 
                                       editCondition="*" multiple="true" cssStyle="width: 175px; height: 500px; border: #ccc 1px solid;" ></jtag:jsl>    
                               </div>
                           </td>
                           <td width="10%" class="ziduan" style="text-align:center">
                               <input type="button"  id="moveRight" value="选择" onfocus="this.blur();" title="移动节点 右->左"/>
                               <br/><br/><br/>
                               <input type="button"  id="moveLeft" value="删除" onfocus="this.blur();" title="移动节点 左->右"/>
                           </td>
                           <td width="30%" align="left" >
                               <div style="overflow:auto;width:98%">
                                   <jtag:jsl id="listUserSelect" name=""
                                       list="#{'':''}" 
                                       editCondition="*" multiple="true" cssStyle="width: 175px; height: 500px; border: #ccc 1px solid;" ></jtag:jsl>    
                               </div>
                           </td>
					</tr>

				</table>
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="5">
					<tr>
						<td align="center">
						<input type="button"  value="确  定" onfocus="this.blur();" onclick="selectUser();"/>
						<form id="update" name="update">
                        <s:textfield id="UserSysIdStrS" name="UserSysIdStrS"
                            cssStyle="display:none"></s:textfield>
                        <s:textfield id="UserSysNameStrS" name="UserSysNameStrS"
                            cssStyle="display:none"></s:textfield>
                        </form>
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
            click: zTreeOnClick
        }
	};

	$(function() {
		$.ajax( {
			async : false,
			cache : false,
			type : 'POST',
			dataType : "json",
			url : "common/UserSelectS_detailsLoad_treegrid.action",//请求的action路径  
			success : function(data) { //请求成功后处理函数。 
				allPeopleNode = data; //把后台封装好的简单Json格式赋给treeNodes  
			},
			error : ajaxError
		});

		allPeopleTree = $("#allPeopleTree").zTree(setting, allPeopleNode);
		//展开所有节点
		allPeopleTree.expandAll(true);
		$('#listUserAll').children().remove();//清除
		$('#listUserSelect').children().remove();//清除
	});

	function zTreeOnClick(event, treeId, treeNode) {
		selectedNode = treeNode;
		var params = {
                dtId:selectedNode.id
                }   
		if(selectedNode.fla==2){
			$.ajax( {
				async : false,
	            cache : false,
	            type : "POST",
                data : params,
                dataType : "json",
	            url : 'common/UserSelectS_deptuser_listdata.action',
	            success : callback
	        });	
		}
	}

	function callback(data){
        $('#listUserAll').children().remove();//清除
        if(data.length!=0){
            for(var j in data){
                if(j>-1){
                     $('#listUserAll').append("<option value="+data[j]['id']+">"+data[j]['name']+"</option)");
                }
            }
        }
    }

	$("#moveRight").click(function(){
        var listUserSelect=document.getElementById("listUserSelect").options;
        var listUserAll=document.getElementById("listUserAll").options;
        if(listUserAll.length==0) return;
        for(var i=0;i<listUserAll.length;i++){
            for(var j=0;j<listUserSelect.length;j++){
                if(listUserAll[i].selected==false) continue;
                if(listUserSelect[j].value==listUserAll[i].value){
                    listUserAll[i].selected=false; break;
                }
            }
        }
         $("#listUserAll option:selected").each(function(){  
            $("#listUserSelect").append("<option value='"+jQuery(this).val()+"'>"+jQuery(this).text()+"</option>");  
       });  
     }); 

	
	$("#moveLeft").click(function(){
        $("#listUserSelect option:selected").each(function(){  
           $(this).remove();  
        });  
    });
       

	function getUsers(){
        var ObjList = document.getElementById("listUserSelect");
        
        for(var i= 0;i<ObjList.options.length; i++)
        {
           if(i ==0 )
           {            
              update.UserSysIdStrS.value =  ObjList.options[i].value ;
              update.UserSysNameStrS.value =  ObjList.options[i].text ; 
           }
           else
           {              
              update.UserSysIdStrS.value = update.UserSysIdStrS.value + "," + ObjList.options[i].value;
              update.UserSysNameStrS.value = update.UserSysNameStrS.value + "," + ObjList.options[i].text;  
           }                    
         }
    }
	
	function selectUser() {
		//给父窗体赋值
		getUsers();	
		art.dialog.opener.$("#"+ $("#pUserId").val()).val(update.UserSysIdStrS.value);
		art.dialog.opener.$("#"+ $("#pUserName").val()).val(update.UserSysNameStrS.value);
		closeBox();
		
	}
</SCRIPT>
</html>


