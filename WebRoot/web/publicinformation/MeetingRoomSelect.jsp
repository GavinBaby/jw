
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
		<title>会议室选择</title>
		<jtag:jhead />
	</head>
	<body>
		<s:hidden id="pUserId" name="parUId"></s:hidden>
	    <s:hidden id="pUserName" name="parUName"></s:hidden>
	   <table width="450px" height="100%" border="0" cellpadding="0"
            cellspacing="0" bgcolor="#FFFFFF">
            <tr>
                <td align="center" valign="top">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0"
                        class="biaodan">
                        <tr>
                            <td width="40%" valign="top">
                                <div style="height:350px;overflow:auto;width:98%">
                                    <jtag:jsl id="List_B_T_Ufp_Meeting_Roominfo" name=""
                                        list="List_B_T_Ufp_Meeting_Roominfo" listKey="uuid" listValue="meetingroomName" 
                                        editCondition="*" multiple="true" cssStyle="width: 98%; height: 340px; border: #ccc 1px solid;" ></jtag:jsl>     
                                </div>
                            </td>
                            <td width="20%" class="ziduan" style="text-align:center">
                                <input type="button"  id="moveRight" value="选择" onfocus="this.blur();" title="移动节点 右->左"/>
                                <br/><br/><br/>
                                <input type="button"  id="moveLeft" value="删除" onfocus="this.blur();" title="移动节点 左->右"/>
                            </td>
                            <td width="40%" valign="top">
                                <div style="height:350px;overflow:auto;width:98%">
                                    <jtag:jsl id="listMeetingRoomSelect" name=""
                                       list="#{'':''}" 
                                        editCondition="*" multiple="true" cssStyle="width: 98%; height: 340px; border: #ccc 1px solid;" ></jtag:jsl>   
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
	$(function() {
        $('#listMeetingRoomSelect').children().remove();//清除
		$("#moveRight").click(function(){
	        var listUserSelect=document.getElementById("listMeetingRoomSelect").options;
	        var listUserAll=document.getElementById("List_B_T_Ufp_Meeting_Roominfo").options;
	        if(listUserAll.length==0) return;
	        for(var i=0;i<listUserAll.length;i++){
	            for(var j=0;j<listUserSelect.length;j++){
	                if(listUserAll[i].selected==false) continue;
	                if(listUserSelect[j].value==listUserAll[i].value){
	                    listUserAll[i].selected=false; break;
	                }
	            }
	        }
	         $("#List_B_T_Ufp_Meeting_Roominfo option:selected").each(function(){  
	            $("#listMeetingRoomSelect").append("<option value='"+jQuery(this).val()+"'>"+jQuery(this).text()+"</option>");  
	       });  
	     }); 
	
	    $("#moveLeft").click(function(){
	        $("#listMeetingRoomSelect option:selected").each(function(){  
	           $(this).remove();  
	        });  
	    });
       
	});
    function getUsers(){
        var ObjList = document.getElementById("listMeetingRoomSelect");
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