
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
			style="height: 80px; overflow: hidden;" align="center">

			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
				    <s:if test="flag == 'sw'">
					   <jtag:jlevel moduleId="module03040100"></jtag:jlevel>
					</s:if>
					<s:else>
					   <jtag:jlevel moduleId="module03040200"></jtag:jlevel>
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
				style="border: #ccc 1px solid;">
				<tr>
					<td>
						<s:form id="searchData" name="searchData" theme="simple"
							cssClass="jNice">
							<s:hidden id="flag" name="flag"></s:hidden>
							<table width="100%" border="0" cellpadding="0" cellspacing="0"
								class="content">
								<tr>
									<td width="8%" align="right">
										���⣺
									</td>
									<td width="10%" align="left">
										<s:textfield id="title" name="title"
											theme="simple" maxlength="500" />
									</td>
									<td width="1%" align="right">
										&nbsp;
									</td>
									<td align="left">
									   <input id="serach" type="button" value="�� ѯ" />
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
		</div>
		<div data-options="region:'center',border:false">		
			<table id="list"></table>			
		</div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		var flag = $("#flag").val();  
		$("#serach").click(function(e) {
			$('#list').datagrid('load', getQueryParams("searchData"));
		});
		$('#list').datagrid( {
			url : 'FileBase_gridLoad_grid.action',
			queryParams : getQueryParams("searchData"),
			frozenColumns: null,
			columns:[[  
				{field:'documentbaseFiledate',
					 title:'��������',
					 width:20,
					 align:'center',
					 formatter:function(value,data){  
						 return data.documentbaseFiledate.substring(0,10); 
					 	}
				},
				{field:'documentbaseTitle',
					 title:'����',
					 align:'center',
					 width:50,
					 formatter:function(value,data){   
						return '<span style="color:red"><a href="javascript:showFilebase(\''+data.documentbaseFilepath+'\',\''+data.documentbaseId+'\');" title="'+value+'">'+data.documentbaseTitle+'</a></span>'; 
					 }
				},
				{field:'documentbaseSwwh',
					 title:'���ı��',
					 align:'center',
					 width:10
				},
				{field:'documentbaseLwwh',
					 title:'�����ĺ�',
					 align:'center',
					 width:10
				},
				{field:'documentbaseFwwh',
					 title:'�����ĺ�',
					 align:'center',
					 width:10
				},
				{field:'view',
					 title:'�ļ��鿴',
					 align:'center',
					 width:10,
					 formatter:function(value,data){  
						 return '<span style="color:red"><a href="javascript:openNew(\'documentmanagement/FileBase_fileView.action?mainDocId='+data.documentbaseId+'\',\'�ļ��鿴\')">'+'�鿴'+'</a></span>'; 
				  }
				}
		   	]],
		   	onLoadSuccess:function(data){
			headAlign(this);
			if(flag=='sw'){			
				$('#list').datagrid('hideColumn',"documentbaseFwwh");//��������ɹ�ʱ���������ض�Ӧ��
			}
			if(flag=='fw'){			
				$('#list').datagrid('hideColumn',"documentbaseSwwh");//��������ɹ�ʱ���������ض�Ӧ��
				$('#list').datagrid('hideColumn',"documentbaseLwwh");//��������ɹ�ʱ���������ض�Ӧ��
			}
		}
		});
	});
		//�鿴����
	function showFilebase(url,mainDocId){
		if(url.toLocaleLowerCase().indexOf(".tif")>-1||url.toLocaleLowerCase().indexOf(".tiff")>-1){
			openNew("documentmanagement/FileBase_filebaseShowTif.action?mainDocId="+mainDocId, "���Ĳ鿴",955,555);
		}else if(url.toLocaleLowerCase().indexOf(".doc")>-1){
			openNew("documentmanagement/FileBase_filebaseShowDoc.action?mainDocId="+mainDocId,  "���Ĳ鿴",900,515);
		}else{
			window.open("<%=basePath%>uploadFile/"+url);
		}
	}
</SCRIPT>
</html>


