
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ path + "/";
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
		<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
		<div data-options="region:'north',border:false"
			style="height: 120px; overflow: hidden;" align="center">

			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module03030100"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="7">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
				style="border: #ccc 1px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData" theme="simple"
							cssClass="jNice">

							<s:hidden id="flag" name="flag"></s:hidden>
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="10%" align="right">
										标题：
									</td>
									<td width="10%" align="left">
										<s:textfield id="title" name="title"
											theme="simple" maxlength="500" />
									</td>
									<td width="10%" align="right">
										类别：
									</td>
									<td width="10%" align="left">
										<jtag:jsl id="favoriteFileType" list="favoritesType_list" name="favoriteFileType"
											listKey="uuid" listValue="maintainName" editCondition="*" 
											headerKey="" headerValue="--请选择--" cssStyle="width:120;"></jtag:jsl>
									</td>
									<td align="left">
										&nbsp;
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
							<jtag:jbutton id="delete" value="删 除" editCondition="*" />
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
			<table id="list"></table>			
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
	
		$("#new").click(function(e) {
			openNew("documentmanagement/FavoriteFile_detailsLoad.action", "个人收藏夹");
		});
		$("#delete").click(function(e) {
			deleteDateAjax("documentmanagement/FavoriteFile_detailsDelete_ajax.action");
		});
		$('#list').datagrid( {
			url : 'FavoriteFile_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			columns:[[  
				{field:'favoritesWenhao',
				 title:'文号',
				 align:'left',
				 width:20,
				 formatter:function(value,data){   
			       return data.favoritesWenhao+"号"; 
				 	}
				},
				
				{field:'favoritesTitle',
				 title:'标题',
				 align:'center',
				 width:50,
				 formatter:function(value,data){   
				 if(data.favoritesUrl == "FileIn_detailsLoad.action"){ //2015-10-11 修改：尤   
					 		return '<a href="javascript:openNew(\'documentmanagement/'+ data.favoritesUrl +'?mainDocId='+data.maindocId+'\',\'公文收文单\',840,550)" title="'+value+'">'+data.favoritesTitle+'</a>';
					 	}else if(data.favoritesUrl == "FileOut_detailsLoad.action"){
					 		return '<a href="javascript:openNew(\'documentmanagement/'+ data.favoritesUrl +'?mainDocId='+data.maindocId+'\',\'公文发文单\',882,2515)" title="'+value+'">'+data.favoritesTitle+'</a>';
					 	}else{
					 		return '<a href="javascript:showFavorites(\''+data.favoritesUrl+'\',\''+data.uuid+'\');" title="'+value+'">'+data.favoritesTitle+'</a>'; 
				 	}
				 }
					
				 	
				},
				{field:'favoritesTime',
					 title:'日期',
					 width:20,
					 align:'center',
					 formatter:function(value,data){  
						 return data.favoritesTime.substring(0,10); 
					 	}
					},
				{field:'favoritesTypename',
					 title:'类别',
					 align:'center',
					 width:10
				},
				{field:'favoritesType',
					 title:'重新分类',
					 align:'center',
					 width:10,
					 formatter:function(value,data){    
				 		return '<span style="color:red"><a href="javascript:saveUrl(\'documentmanagement/FavoriteFile_detailsUpdate_ajax.action?'+"mainDocId="+data.uuid+'\');" >编辑</a></span>';
   		    		}
				}
				
		   	]]
		});
	});
	//查看附件
	function showFavorites(url,mainDocId){
		if(url.toLocaleLowerCase().indexOf(".tif")>-1||url.toLocaleLowerCase().indexOf(".tiff")>-1){
			openNew("documentmanagement/FavoriteFile_favoritesShowTif.action?mainDocId="+mainDocId, "公文查看",955,555);
		}else if(url.toLocaleLowerCase().indexOf(".doc")>-1){
			openNew("documentmanagement/FavoriteFile_favoritesShowDoc.action?mainDocId="+mainDocId,  "公文查看",900,515);
		}else{
			window.open("<%=basePath%>uploadFile/"+url);
		}
	}
	//重新分类
	function saveUrl(url){
		art.dialog.open('documentmanagement/FavoriteFile_typeLoad.action', {
		    title: '收藏类别选择',
		    cancel: true,
		    lock:true,
		    height:100,
		    id:'FavoriteFileType',
		    button: 
		    [
				{
				    name: '确定',
				    callback: function () {
						var iframe = this.iframe.contentWindow;
						var type = iframe.document.getElementById('favoriteFileType').value;
						$.ajax( {
							url : url+"&favoriteFileType="+type,
							type : "POST",
							dataType : "json",
							success:function(data){
					    	    var errMsg = data.errMsg;
					    	    art.dialog.alert(errMsg).unlock();
					    	    $('#list').datagrid("reload"); 
							}
						});
						this.close();
				       	return false;
				    }
				},
	             {
	                 name: '取消',
	                 callback: function () {
	                     return false;
	                 }
	             }
	         ]
		});
	}
</SCRIPT>
</html>


