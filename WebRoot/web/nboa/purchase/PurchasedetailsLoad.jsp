
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
	</head>
	<body>

		<table width="900px" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" height="28" border="0" cellpadding="0"
						cellspacing="0" class="dqwz_bg">
						<tr>
				    <s:if test="flagtype==1">
				    <jtag:jlevel moduleId="module15000000"></jtag:jlevel>
				    </s:if>
				    <s:else>
					<jtag:jlevel moduleId="module15020000"></jtag:jlevel>
					</s:else>
				</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<s:hidden id="selectDeptJson" name="selectDeptJson"></s:hidden>
					<form id="update" name="update"
						action="publicinformationajax/Materia_detailsUpdate.action"
						method="POST" class="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
						<s:hidden id="uuid" name="P_INFO.uuid"></s:hidden>
                        <s:hidden id="newFileIds" name="newFileIds"></s:hidden>
                        <s:hidden id="updateTime" name="updateTime"></s:hidden>
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="保 存" editCondition="*" />
									<jtag:jbutton id="upsave" value="提交" editCondition="*" />
									<jtag:jbutton id="back" value="返回" editCondition="*" />
									<jtag:jbutton id="agree" value="同意" editCondition="%{allPermission}" />
									<jtag:jbutton id="disagree" value="不同意" editCondition="%{allPermission}" />		
																									 
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							height="7">
							<tr>
								<td></td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0"
							class="biaodan">
							<tr>
								<td width="1%" class="ziduan">
									申&nbsp;请&nbsp;人：
								</td>
								<td width="32%">
								    <s:hidden name="P_INFO.apply_name" />
									<jtag:jtl id="apply_name"
										name="P_INFO.apply_name"
										editCondition="#" maxlength="50"
										cssStyle="width:98%" />
								</td>
								<td width="15%" class="ziduan">
									申请时间：
								</td>
								<td width="35%">
								    <s:hidden name="P_INFO.apply_time" />
									<jtag:jtl id="apply_time" name="P_INFO.apply_time"
										editCondition="#" maxlength="50"
										cssStyle="width:98%" />
								</td>
							</tr>													
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0"
							height="17" class="biaodan">
							<tr>
							<td width="5%" class="ziduan">
							序号
							</td>
							<td width="16%" class="ziduan">
							物资名称
							</td>
							<td width="9%" class="ziduan">
							型号
							</td>
							<td width="9%" class="ziduan">
							单位
							</td>
							<td width="9%" class="ziduan">
							数量
							</td>
							<td width="16%" class="ziduan">
							用&nbsp;途
							</td>
							<td width="16%" class="ziduan">
							到货日期
							</td>
							<td width="16%" class="ziduan">
							备注
							</td>
							</tr>
							<tr width="98%">
								<td id="id1" name="P_INFO_DETAIL.id">
									1
								</td>
								<td>
									<jtag:jtl id="name1" name="P_INFO_DETAIL.name"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="type1" name="P_INFO_DETAIL.type"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="unit1" name="P_INFO_DETAIL.unit"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="num1" name="P_INFO_DETAIL.num"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="use1" name="P_INFO_DETAIL.use"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="getdate1" name="P_INFO_DETAIL.getdate"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtal id="remark1"
										name="P_INFO_DETAIL.remark"
										editCondition="*" 
										cssStyle="width:98%;" cols="3" />
								</td>
							</tr>
							<tr width="98%">
								<td id="id2" name="P_INFO_DETAIL.id">
									2
								</td>
								<td>
									<jtag:jtl id="name2" name="P_INFO_DETAIL.name"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="type2" name="P_INFO_DETAIL.type"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="unit2" name="P_INFO_DETAIL.unit"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="num2" name="P_INFO_DETAIL.num"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="use2" name="P_INFO_DETAIL.use"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtl id="getdate2" name="P_INFO_DETAIL.getdate"
										editCondition="*" maxlength="250" 
										cssStyle="width:100%;height:30"/>
								</td>
								<td>
									<jtag:jtal id="remark2"
										name="P_INFO_DETAIL.remark"
										editCondition="*" 
										cssStyle="width:98%;" cols="3" />
								</td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0"
							height="17" class="biaodan" id="addTable">
						</table>
						
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="right">
									<jtag:jbutton id="add" value="添加" editCondition="*" />																		 
								</td>
							</tr>
						</table>
						<table width="98%" border="0" cellspacing="0" cellpadding="0"
							class="biaodan">
							<tr>
								<td width="20%" class="ziduan">
									部门负责人意见：
								</td>
								<td>
									<jtag:jtal id="lead_f_view"
										name="P_INFO.lead_f_view"
										editCondition="#" 
										cssStyle="width:98%;height:60" cols="3" />
								</td>
							</tr>
							<tr>
							<td width="20%" class="ziduan">
									分管领导意见：
								</td>
								<td>
									<jtag:jtal id="lead_s_view"
										name="P_INFO.lead_s_view"
										editCondition="#"
										cssStyle="width:98%;height:60" cols="3" />
								</td>
							</tr>
																				
						</table>
					</form>
				</td>
			</tr>
		</table>
	</body>
	<SCRIPT type="text/javascript">
	
	$(function() {
	var type = <%=request.getParameter( "flagtype")%>;
	debugger;
	var number_add = 2;
		//保存
		$("#save").click(function(e) {
			update("0");			
		});
		//提交
		$("#upsave").click(function(e) {
		debugger;
            update("1");            
        });
        
        //同意
		$("#agree").click(function(e) {
            update("2");            
        });
        
        //不同意
		$("#disagree").click(function(e) {
            update("3");            
        });
        
        
        //更新操作
        function update(type){
			var returnIsValid = $('#update').form('validate');
            if (returnIsValid) {
            var params = {
            "apply_name":$("#apply_name").val(),
            "apply_time":$("#apply_time").val(),
            "state":type,
            "lead_f_view":$("#lead_f_view").val(),
            "lead_s_view":$("#lead_s_view").val(),
            "lists":[]
            }
            for(var i=0;i<number_add;i++){
                var num_add = i+1;
                if($("#name"+num_add).val()){
	                var list_add = {
		            	"name":$("#name"+num_add).val(),
		            	"type":$("#type"+num_add).val(),
			            "unit":$("#unit"+num_add).val(),
			            "num":$("#num"+num_add).val(),
			            "use":$("#use"+num_add).val(),
			            "getdate":$("#getdate"+num_add).val(),
			            "remark":$("#remark"+num_add).val(),
			            "id":$("#id"+num_add).val()
		            }
		            params.lists.push(list_add);
                }
            }
            params = JSON.stringify({data:params});           
            /*var params = $("#update").serialize();
             console.log(params);
            params = decodeURIComponent(params,true);*/
           
            console.log(params);
            jQuery.ajax( {
                        url : "purchase/Purchase_detailsUpdate_ajax.action",
                        type : "POST",
                        data : params,
                        dataType : "json",
                        success : callback
                    });
            }			
		}

		//返回
		$("#back").click(function(e) {
			closeBox();
		});
		function callback(){
			closeBox();
		}
		//动态添加物品申请栏	
		$("#add").click(function(e) {
		number_add++
			$("#addTable").append('<tr>'+
							'<td width="5%"  id="id'+number_add+'" name="P_INFO_DETAIL.id" >'+number_add+'</td>'+
							'<td width="16%" >'+
							'<jtag:jtl id="name'+number_add+'" name="P_INFO_DETAIL.name" editCondition="*" maxlength="32" cssStyle="width:100%;height:30"/>'+
							'</td>'+
							'<td width="9%">'+
							'<jtag:jtl id="type'+number_add+'" name="P_INFO_DETAIL.type" editCondition="*" maxlength="100" cssStyle="width:100%;height:30"/>'+
							'</td>'+
							'<td width="9%">'+
							'<jtag:jtl id="unit'+number_add+'" name="P_INFO_DETAIL.unit" editCondition="*" maxlength="100" cssStyle="width:100%;height:30"/>'+
							'</td>'+
							'<td width="9%">'+
							'<jtag:jtl id="num'+number_add+'" name="P_INFO_DETAIL.num" editCondition="*" maxlength="250" cssStyle="width:100%;height:30"/>'+
							'</td>'+
							'<td width="16%">'+
							'<jtag:jtl id="use'+number_add+'" name="P_INFO_DETAIL.use" editCondition="*" maxlength="250" cssStyle="width:100%;height:30"/>'+
							'</td>'+
							'<td width="16%">'+
							'<jtag:jtl id="getdate'+number_add+'" name="P_INFO_DETAIL.getdate" editCondition="*" maxlength="250" cssStyle="width:100%;height:30"/>'+
							'</td>'+
							'<td width="16%">'+
							'<jtag:jtal id="remark'+number_add+'" name="P_INFO_DETAIL.remark" editCondition="*" cssStyle="width:98%;" cols="3" />'+
							'</td>'+
							'</tr>');
		});
		
		
		 
	});
</SCRIPT>
</html>