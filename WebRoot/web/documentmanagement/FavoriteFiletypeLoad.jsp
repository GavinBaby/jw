
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
		<s:hidden id="mainDocId" name="mainDocId"></s:hidden>
		<div data-options="region:'north',border:false"
			style="height: 100px; overflow: hidden;" align="center">
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
					<input type='button' id='new' value='添加类别' onclick="newType();" />
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
			<s:form id="searchData" name="searchData" theme="simple"
				cssClass="jNice">
				<s:hidden id="flag" name="flag"></s:hidden>
				<table width="98%" border="0" cellpadding="0" cellspacing="0"
					class="biaodan">
					<tr>
						<td width="8%" align="center" class="ziduan">
						收藏类别：
					</td>
					<td width="10%" align="left">
						<jtag:jsl id="favoriteFileType" list="favoritesType_list" 
							listKey="uuid" listValue="maintainName" editCondition="*" 
							headerKey="" headerValue="--请选择--" cssStyle="width:160;"></jtag:jsl>
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
        </div>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#new").click(function(e) {
			art.dialog.open('maintenance/Maintain_detailsLoad.action?moduleIdS=module03030200', {
			    title: '类别新增',
			    height:180,
			    close:function () {
					toChooseFileRecordType();
					return true;
				}
			});
	    });
	})
	function toChooseFileRecordType(){
		jQuery.ajax( {
            url : 'documentmanagementajax/FavoriteFile_typeLoad_ajax.action',
            type : "POST",
            data : {},
            dataType : "json",
            success : callbackFunForSearch
        });
	}	
	function callbackFunForSearch(data){
		jQuery('#favoriteFileType').children().remove();//清除
		jQuery('#favoriteFileType').append("<option value=''>--请选择--</option>");
		var json = eval("(" + data.jsonResult + ")");
		if(json.length!=0){
			for(var j in json){
				if(j>-1){
					 jQuery('#favoriteFileType').append("<option value="+json[j]['uuid']+">"+json[j]['maintainName']+"</option>");
				}
			}
		}
	}
</SCRIPT>
</html>