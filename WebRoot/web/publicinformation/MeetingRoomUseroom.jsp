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
			style="height:100px; overflow: hidden;" align="center">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module14050100"></jtag:jlevel>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				height="10">
				<tr>
					<td></td>
				</tr>
			</table>
			<table width="98%" border="0" cellspacing="0" cellpadding="6"
                style="border: #ccc 1px solid;">
                <tr>
                    <td>
                        <s:form id="searchData" name="searchData"
                            action="MeetingRoom_Useroom.action" theme="simple" method="post"
                            cssClass="jNice">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                style="vertical-align: middle;" class="content">
                                <tr>
                                    <td width="80px" align="right">
                                                                                                                会务时间：
                                    </td>
                                    <td width="13%">
                                        <s:textfield id="starttime" name="starttime" theme="simple"
                                            maxlength="50" cssStyle="width:95%;" cssClass="wdate"
                                            onclick="WdatePicker({maxDate:'#F{$dp.$D(\\'endtime\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
                                    </td>
                                    <td width="15%" align="left">
                                                                                                                    至&nbsp;
                                        <s:textfield id="endtime" name="endtime" theme="simple"
                                            maxlength="50" cssStyle="width:82%;" cssClass="wdate"
                                            onclick="WdatePicker({minDate:'#F{$dp.$D(\\'starttime\\')}',readOnly:true,dateFmt:'yyyy-MM-dd'})" />
                                    </td>
                                    <td align="left">
                                        &nbsp;
                                        <input id="serach" type="button" value="统 计" />
                                    </td>
                                </tr>
                            </table>
                        </s:form>
                    </td>
                </tr>
            </table>
            <table width="100%" border="0" cellspacing="0" cellpadding="0"
                height="10">
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
		$('#list').datagrid( {
			url : 'MeetingRoom_Useroom_grid.action',
			queryParams : getQueryParams("searchData"),
			frozenColumns: null,
			pagination: false,
			columns : [ [ 
				{
					field : 'meetingroomName',
					title : '会议室名称',
					align : 'center',
					width : 50
				}, {
                    field : 'sumr',
                    title : '使用次数',
                    align : 'center',
                    width : 25
                },{
					field : 'sumn',
					title : '使用人数',
					width : 25,
					align : 'center'
				}
			]]
		});	
	});
</SCRIPT>
</html>
