
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
		<title>办公自动化系统</title>
		<base target="_self">
		<jtag:jhead />
		<link rel="stylesheet" href="../../css/zTree/zTreeStyle.css"
			type="text/css">
		<script type="text/javascript"
			src="../../js/zTree/jquery.ztree-2.6.min.js"></script>
	</head>
	<body>
		<!-- 隐藏控制域 开始  -->
		<!-- 列表中选中的数据的ID集合  -->
		<s:hidden id="checkedIds" value="checkedIds" />
		<!-- 当前用户在该页面中的所有权限  -->
		<s:hidden id="allPermission" value="allPermission" />

		<!-- 隐藏控制域 结束 -->
		<div class="btn_lm" style="width:300;TEXT-ALIGN: center;">
				人员选择
		</div>
		<div class="kb"></div>
		<div class="r_maincontent_top">
			<span><span></span> </span>
		</div>
		<div class="r_maincontent">
			<div class="kb"></div>

			<div class="l_tree2">				
				<ul id="depttree" class="tree"></ul>
			</div>
			
			<div class="l_tree" >
			<input type="button"  onfocus="this.blur();" value="   >    " onclick="moveTreeL2R();" width="10px"></input>
			<p></p>
			<input type="button" class="ico_moveNode" onfocus="this.blur();" value="   >>   " onclick="moveTreeL2RAll();" width="10px"></input>
            <p></p>
			<input type="button" class="ico_moveNodeR" onfocus="this.blur();" value="   <    " onclick="moveTreeR2L();" width="10px"></input>
			<p></p>
			<input type="button" class="ico_moveNodeR" onfocus="this.blur();" value="   <<   " onclick="moveTreeR2LAll();" width="10px"></input>
            <p></p>
			</div>
			
			<div class="r_tree">
			<table border="0"><tr><td>				
				<select id="userlist" multiple="multiple" size="30" style="width:100"></select>
			</td></tr></table>
			</div>
		</div>
		<div class="r_maincontent_bottom">
			<span><span></span> </span>
		</div>
		
	</body>
	<SCRIPT type="text/javascript">
	var zTree1, zTree2;
    var preSelectedNode1="";
	var preSelectedNode2="";
	var setting;
	
	
	//var preSelectedNodes1=new Array();
	
	
    //userlistLoad('<s:property value="FormIdS"/>','<s:property value="IdTxtIdS"/>','<s:property value="NameTxtIdS"/>');
    deptusertreeLoad();


    function deptusertreeLoad()
    {
        setting = {
            isSimpleData : true, //数据是否采用简单 Array 格式，默认false  
            treeNodeKey : "id", //在isSimpleData格式下，当前节点id属性  
            treeNodeParentKey : "pId", //在isSimpleData格式下，当前节点的父节点id属性  
            showLine : true, //是否显示节点间的连线  
            checkable : true,
            checkType : { "Y": "s", "N": "s" },
            callback: {
                change: zTreeChange,
                click: zTreeOnClick,
                nodeCreated: zTreeOnNodeCreated
                
            }
        //每个节点上是否显示 CheckBox  
        };
        //var zTree
        
        $(function() {
            $.ajax( {
                async : false,
                cache : false,
                type : 'POST',
                dataType : "json",
                url : "DeptUserTreeLoad.action",
				error : ajaxError,
                success : function(data) { //请求成功后处理函数。    
                    treeNodes = data; //把后台封装好的简单Json格式赋给treeNodes  
            }
            });

            zTree1 = jQuery("#depttree").zTree(setting, treeNodes);
            //展开所有节点
            zTree1.expandAll(false);
        });
    }
    

    function ztree2getnodes()
    {
    	update.UserSysIdStrS.value="";
    	update.UserSysNameStrS.value="";
    	var nodes = zTree1.getNodes();
    	for (var i=0;i<nodes.length;i++){    		
    		Nodegetnodes(nodes[i]);       			
    	}
    }
    function Nodegetnodes(selectedNode)
    {    	
        if(selectedNode.id!="unit0001"&&selectedNode.id.length<20)
        {
             preSelectedNode1 = selectedNode.id;
             preSelectedNode2 = selectedNode.name;
             
             
             var ObjList = document.getElementById("userlist");  
             var j=ObjList.options.length;
             var flag = true;
             for(var k=0;k<ObjList.options.length; k++)
             {                       
                 if(ObjList.options[k].value == preSelectedNode1)
                 {
                     //若选择的人员已经选择过
                     flag = false;
                     break;
                 }                   
             }
             if (flag)
             {         
                 ObjList.options[j] = new Option(preSelectedNode2);
                 ObjList.options[j].value = preSelectedNode1;                    
                 j++;
             }
        }
     
    	
    	
    	while (selectedNode.isParent)
    	{
    		var nodes = zTree1.getNodesByParam("pId",selectedNode.id);
    		
    		for (var j=0;j<nodes.length;j++){    			
    			selectedNode=nodes[j];
    			Nodegetnodes(nodes[j]); 
    		}   		
    	}    	
    }
    
	function getUsers(){
		var ObjList = document.getElementById("userlist");
		
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

	function zTreeOnClick(event, treeId, treeNode) {
		//preSelectedNode1 = treeNode.id;	
		
	}
	
	function zTreeChange(event, treeId, treeNode) {
	    //var node=zTree1.getCheckedNodes(true);
    } 
	
	function moveTreeR2L() {	
		var ObjList = document.getElementById("userlist");
			
		if (ObjList.selectedIndex != -1)
		{
			for(var i= 0;i<ObjList.options.length; i++)
			{
			   if (ObjList.options[i].selected)
				{
					ObjList.options[i] = null;
					--i;
				}
	        }
	        
	     }
	}
	
	function moveTreeR2LAll() { 
	   
        var ObjList = document.getElementById("userlist");
        //alert(ObjList.options.length);    
        ObjList.options.length = 0;       
         
    }
	
	function moveTreeL2R() {
	
	   var selectedNode = zTree1.getCheckedNodes();
	   if (selectedNode.length==0) {
            alert("请先选择人员！");
            return;
        }
       for(var i=0;i<selectedNode.length;i++)
       {
           //alert(selectedNode[i].id.length);
           if(selectedNode[i].id!="unit0001"&&selectedNode[i].id.length<20)
           {
	            preSelectedNode1 = selectedNode[i].id;
	            preSelectedNode2 = selectedNode[i].name;
	            
	            
	            var ObjList = document.getElementById("userlist");  
		        var j=ObjList.options.length;
		        var flag = true;
		        for(var k=0;k<ObjList.options.length; k++)
		        {                       
		            if(ObjList.options[k].value == preSelectedNode1)
		            {
		                //若选择的人员已经选择过
		                flag = false;
		                break;
		            }                   
		        }
		        if (flag)
		        {         
		            ObjList.options[j] = new Option(preSelectedNode2);
		            ObjList.options[j].value = preSelectedNode1;                    
		            j++;
		        }
           }
           //alert(selectedNode[i].id);
       }	
		
		//if (treeNode.isParent) {
			//alert("请选择子节点！");
			//return;
		//}		
	}
	
	var createdCount = 0;
    function zTreeOnNodeCreated(event, treeId, treeNode) {
        createdCount++;
        
    }	
	function moveTreeL2RAll() {
       
       var nodes = zTree1.getNodes();
        for (var i=0;i<nodes.length;i++){           
            Nodegetnodes(nodes[i]);                 
        }
         
    }
    
    function selectData(FormIdS,IdTxtIdS,NameTxtIdS) {        
        //ztree2getnodes();
        getUsers();
        
        var ParentForm = window.dialogArguments;
		
		eval("ParentForm."+FormIdS+"."+IdTxtIdS+".value=update.UserSysIdStrS.value;");
		eval("ParentForm."+FormIdS+"."+NameTxtIdS+".value=update.UserSysNameStrS.value;");
		
		window.returnValue=1;
		window.close();
    }

</SCRIPT>
</html>


