
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
		<script type="text/javascript" src="../../js/json2.js"></script>
		<script src="../../js/artDialog/artDialog.source.js?skin=blue"></script>
		<script src="../../js/artDialog/iframeTools.source.js"></script>
		<script src="../../js/JwCommon.js"></script>
		<link rel="stylesheet" type="text/css" href="../../css/easyui/default/easyui.css">
	 	<script type="text/javascript" src="../../js/easyui/jquery.easyui.min.js"></script>
	 	<link rel="stylesheet" type="text/css" href="../../css/easyui/icon.css">
	</head>
	<body>
		<s:hidden id="submitAction" name="submitAction"></s:hidden>
		<s:hidden id="selRoleAction" name="selRoleAction"></s:hidden>
		<s:hidden id="pRoleId" name="pRoleId"></s:hidden>
		<s:hidden id="pRoleName" name="pRoleName"></s:hidden>
		<s:hidden id="roleSelRa" name="roleSelRa"></s:hidden>
		<s:hidden id="groupId" name="groupId"></s:hidden>
		<table width="450px" height="100%" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<s:form id="update" name="update">
					</s:form>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						class="biaodan">
						<tr>
							<td width="40%" valign="top">
								<div style="height:350px;overflow:auto;width:98%">
									<jtag:jsl id="listRoleAll" name=""
										list="listRoleAll" listKey="uuid" listValue="roleName" 
										editCondition="*" multiple="true" cssStyle="width: 98%; height: 340px; border: #ccc 1px solid;" ></jtag:jsl>	 
								</div>
							</td>
							<td width="20%" class="ziduan" style="text-align:center">
								<input type="button"  id="moveRight" value="选择" onfocus="this.blur();" title="移动节点 右->左"/>
                                <br/><br/><br/>
								<input type="button"  id="moveLeft" value="删除" onfocus="this.blur();" title="移动节点 左->右"/>
							</td>
							<td width="40%" valign="top">
								<div style="height:350px;overflow:auto">
									<jtag:jsl id="listRoleSelect" name="listGroupselRoleList"
										list="listRoleSelect" listKey="roleId" listValue="roleName" 
										editCondition="*" multiple="true" cssStyle="width: 98%; height: 340px; border: #ccc 1px solid;" ></jtag:jsl>	
								</div>
							</td>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="17">
						<tr>
							<td>
							</td>
						</tr>
					</table>
					<table width="98%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td align="center">
								<jtag:jbutton id="save" value="保 存" editCondition="*" />
								<jtag:jbutton id="back" value="返 回" editCondition="*" />
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
	$(function() {
		$("#save").click(function(e) {
			lockBox();
			var len = $("#listRoleSelect option").length;
			var temp = "";
			if(len>0){
			  $("#listRoleSelect option").each(function(){
				  temp = temp + $(this).val() +",";
			  });
			}
			var groupId = $("#groupId").val();
			var selRoleData = temp;
			var params = {
					groupId:groupId,
					selRoleData:selRoleData
					}			
			$.ajax( {
				type : 'POST',
				data :  params,
				dataType : "json",
				url : "../maintenance/Group_selRoleUpdate_ajax.action",//$("#submitAction").val(),//请求的action路径  
				success : function(data){
					unlockBox();
					art.dialog.alert('保存成功！');
				},
				error : ajaxError
			});
		});
		$("#moveRight").click(function(){
				var listRoleSelect=document.getElementById("listRoleSelect").options;
				var listRoleAll=document.getElementById("listRoleAll").options;
				if(listRoleAll.length==0) return;
				for(var i=0;i<listRoleAll.length;i++){
					for(var j=0;j<listRoleSelect.length;j++){
						if(listRoleAll[i].selected==false) continue;
						if(listRoleSelect[j].value==listRoleAll[i].value){
							listRoleAll[i].selected=false; break;
						}
					}
				}
				 $("#listRoleAll option:selected").each(function(){  
                   	$("#listRoleSelect").append("<option value='"+jQuery(this).val()+"'>"+jQuery(this).text()+"</option>");  
               });  
		});	
		$("#moveLeft").click(function(){
				 $("#listRoleSelect option:selected").each(function(){  
                   	$(this).remove();  
               });  
		});
	});
</SCRIPT>
</html>


