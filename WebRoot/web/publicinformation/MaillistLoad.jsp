
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
	<body class="easyui-layout">
		<div data-options="region:'north',border:false"
			style="height: 75px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					 <s:if test="mailType==1" >
						<jtag:jlevel moduleId="module05040300"></jtag:jlevel>
					</s:if>
					 <s:elseif test="mailType==2" >
						<jtag:jlevel moduleId="module05040500"></jtag:jlevel>
					</s:elseif>
					 <s:elseif test="mailType==3" >
						<jtag:jlevel moduleId="module05040600"></jtag:jlevel>
					</s:elseif>
					 <s:else>
					 	<s:if test="isNew==0" >
							<jtag:jlevel moduleId="module05040401"></jtag:jlevel>
						</s:if>
						 <s:elseif test="isNew==1" >
						 	<jtag:jlevel moduleId="module05040402"></jtag:jlevel>
						 </s:elseif>
						  <s:else>
						 	 <jtag:jlevel moduleId="module05040200"></jtag:jlevel>
						  </s:else>
					</s:else>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
					<tr>
						<td></td>
					</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
					style="border: #ccc 0px solid;">
					<tr>
						<td>
							<s:form id="searchData" name="searchData" action="publicinformation/Mail_listLoad.action" theme="simple" method="post"
								cssClass="jNice">
								<s:hidden id="mailType" name="mailType" />
								<s:hidden id="isNew" name="isNew" />
								<s:hidden id="newFileIds" name="newFileIds"></s:hidden>
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr>			
										<td width="50%" style="valign:center">
											<jtag:jbutton id="delete" value="删 除" editCondition="*" />
											<jtag:jbutton id="tranfer" value="转移至" editCondition="*" />
											<jtag:jbutton id="copy" value="拷贝至" editCondition="*" />
											<jtag:jsl id="mailTypeS" list="#{'7':'收件箱','1':'发件箱','2':'草稿箱','3':'垃圾箱'}" 
											 name="mailTypeS" 
											 listKey="key" listValue="value" editCondition="*" 
											 headerKey="0" headerValue="---请选择---" cssStyle="width:120px"></jtag:jsl>
											
										</td>
										<td width="50%"></td>
									</tr>
								</table>
							</s:form>
						</td>
					</tr>
				</table>
		</div>
		<div data-options="region:'center',border:false">
				<table id="list"></table>
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#delete").click(function(e) {
			var mailType = $("#mailType").val();
			deleteDateAjax("publicinformation/Mail_detailsDelete_ajax.action?mailType="+mailType);
		});
		$("#tranfer").click(function(e) {
			var mailTypeS = $("#mailTypeS").combobox("getValue");
			var checkedIds = getDeleteData("list");
			
			if(mailTypeS!='0'){
				if (checkedIds == '') {
					art.dialog.alert("请先选中记录！");
					return;
				}
				art.dialog.confirm('你确定转移该信件 ?', 
					function(){
						var params = {
								checkedIds : checkedIds,
								mailTypeS : mailTypeS
						};
						
						$.ajax( {
							url : "publicinformation/Mail_detailsUpdate_ajax.action?isTranferCopy=1",
							type : "POST",
							data : params,
							dataType : "json",
							success : new function(data){
								art.dialog.tips("转移成功！",2).lock();
								$('#list').datagrid("load");
							}
						});
					}, 
					function(){
						art.dialog.tips("已取消！",1);
					}
				);
			}else{
				art.dialog.alert("请选择分类！");
			}
		});
		
		$("#copy").click(function(e) {
			var mailTypeS = $("#mailTypeS").combobox("getValue");
			var checkedIds = getDeleteData("list");
			
			if(mailTypeS!='0'){
				if (checkedIds == '') {
					art.dialog.alert("请先选中记录！");
					return;
				}
				art.dialog.confirm('你确定拷贝该信件 ?', 
					function(){
						var params = {
								checkedIds : checkedIds,
								mailTypeS : mailTypeS
						};
						
						$.ajax( {
							url : "publicinformation/Mail_detailsUpdate_ajax.action?isTranferCopy=2",
							type : "POST",
							data : params,
							dataType : "json",
							success : function(data){
								art.dialog.tips("拷贝成功！",2).lock();
							}
						});
					}, 
					function(){
						art.dialog.tips("已取消！",1);
					}
				);
			}else{
				art.dialog.alert("请选择分类！");
			}
		});

		var mailType = $("#mailType").val();
		$('#list').datagrid( {
			url : 'Mail_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			sortName: 'SEND_TIME',
			sortOrder: 'desc',
			columns:[[ {	
							field:'priorityLeve',
							 title:'优先级',
							 width: 12,
							 align:'center',
							 sortable:true,
                             formatter:function(value,data){
					                if(data.priorityLeve==1){
					                     return '<span style="color:red">高</span>';
					                }else if(data.priorityLeve==2){
                                         return '一般';
                                    }else if(data.priorityLeve==3){
					                     return '低';
					                }else{
					                    return '';
						            }
					          }
						},{   
                            field:'importantLeve',
                            title:'重要程度',
                            width: 12,
                            align:'center',
                            sortable:true,
                            formatter:function(value,data){
								 if(data.importantLeve==1){  //修正：youjh 2015-10-21
	                                 return '<span style="color:red">高</span>';
	                            }else if(data.importantLeve==2){
	                                 return '一般';
	                            }else if(data.importantLeve==3){
	                                 return '低';
	                            }else{
	                                return '';
	                            }
	                      }
                       },{  
                           field:'sendUser',
                           title:'发件人',
                           width: 25,
                           align:'center',
                           sortable:true
                      },{	
							field:'receiverUser',
							 title:'收件人',
							 width: 25,
							 align:'center',
							 sortable:true
						},{
							 field:'title',
							 title:'标题',
							 width: 45,
							 align:'left',
							 sortable:true,
							 formatter:function(value,data){    
			                    return '<span style="color:red"><a href="javascript:onGoto(\''+data.uuid+'\',\''+data.mailType+'\')">'+data.title+'</a></span>'; 
			       		     }
					    },{
							 field:'sendTime',
							 title:'发件日期',
							 width:20,
							 align:'center',
							 sortable:true
			       		},{
							 field:'receiverTime',
							 title:'收件日期',
							 width:20,
							 align:'center',
							 sortable:true
				       	},{
					       	 field:'isNew',
							 title:'是否新邮件',
							 width:10,
							 align:'center',
							 sortable:true,
							 formatter:function(value,data){
								   if(data.isNew==0){
										return '<span style="color:red">是</span>';
								   }else{
									    return '<span style="color:red">否</span>';
								   }
				       		 }
			       		}
		       		]],
		       		onLoadSuccess:function(data){
						headAlign(this);
						if(mailType=="1"){
							//发件箱
							$('#list').datagrid('hideColumn',"receiverTime");//数据载入成功时触发，隐藏对应列
							$('#list').datagrid('hideColumn',"sendUser");
							$('#list').datagrid('hideColumn',"isNew");
							$('#list').datagrid('hideColumn',"priorityLeve");
                            $('#list').datagrid('hideColumn',"importantLeve");
						}else if(mailType=="2"){
							//草稿箱
							$('#list').datagrid('hideColumn',"receiverTime");
							$('#list').datagrid('hideColumn',"sendTime");
							$('#list').datagrid('hideColumn',"sendUser");
							$('#list').datagrid('hideColumn',"priorityLeve");
                            $('#list').datagrid('hideColumn',"importantLeve");
						}else if(mailType=="3"){
							//垃圾箱
							$('#list').datagrid('hideColumn',"receiverTime");
							$('#list').datagrid('hideColumn',"receiverUser");
							$('#list').datagrid('hideColumn',"priorityLeve");
							$('#list').datagrid('hideColumn',"importantLeve");
						}else{
							//收件箱 
							$('#list').datagrid('hideColumn',"sendTime");
							$('#list').datagrid('hideColumn',"receiverUser");
						}
					}
		       		
		});

		$('#mailTypeS').combobox( {
			width: 120,
			panelHeight : 90
		});
		
	});
	
	function onGoto(uuid,mailType){
		if(mailType==2){
			window.location.href="../publicinformation/Mail_sendlistLoad.action?mainDocId="+uuid+"&mailType="+mailType;
		}else{
			window.location.href="../publicinformation/Mail_detailsLoad.action?mainDocId="+uuid+"&mailType="+mailType;
		}
	}
</SCRIPT>
</html>


