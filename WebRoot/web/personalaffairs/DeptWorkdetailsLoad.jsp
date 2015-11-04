<%@ page contentType="text/html;charset=GBK"%>
<%@ page import="java.util.*" language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String fileName = UUID.randomUUID().toString() + ".doc";
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<html>
	<head>
		<jtag:jhead />
	</head>
	<body>
		<table width="600px" height="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0" height="7">
						<tr>
							<td></td>
						</tr>
					</table>
					<s:form id="update" name="update" action="" method="POST" theme="simple" cssClass="jNice">
						<s:hidden id="mainDocId" name="mainDocId"></s:hidden>	
						<table width="99%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="left">
									<jtag:jbutton id="save" value="保 存" editCondition="%{allPermission}" />
									<jtag:jbutton id="back" value="返 回" editCondition="%{allPermission}" />
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0" height="7">
							<tr>
								<td></td>
							</tr>
						</table>

						<div class="biaodan2" style="overflow: hidden;">
							<s:hidden name="deptWork.uuid" />
							<input type="hidden"  name="year"  value="${year}"/>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="biaodan">
								<tr valign="top" class="right_biaodan">
									<td width="75%" align="left" valign="middle" class="Tdcell" colspan="4">
										<s:if test="xinjian2==1">
											<s:hidden id="deptid" name="deptid" />
											<s:property value="deptNameS" />
										</s:if>
										<s:if test="xinjian2==2">
											<jtag:jsl listKey="roleUserId" cssStyle="display:none" listValue="roleUserId" editCondition="*" id="deptid" name="deptid" list="list_B_V_Ufp_DeptWorkManage" />
											<jtag:jsl listKey="deptName" listValue="deptName" cssStyle="width:15%" editCondition="*" id="deptNameS" name="deptNameS" onchange="deptchange();" list="list_B_V_Ufp_DeptWorkManage" />
										</s:if>
										<font color="red">&nbsp; ${year}年 <jtag:jsl listKey="key" listValue="value" editCondition="%{allPermission}" name="month" onchange="getDeptWork()" list="#{'01':'1','02':'2','03':'3','04':'4','05':'5','06':'6','07':'7','08':'8','09':'9','10':'10','11':'11','12':'12'}" /> 月工作完成情况和${year1}年${month1}月工作安排</font>
									</td>
								</tr>
								<tr valign="top" class="right_biaodan">
									<td width="75%" align="left" valign="middle" class="Tdcell" colspan="4">
										<b>${year}年${month}月主要工作安排：</b>
									</td>
								</tr>
								<tr valign="top">
									<td colspan="4" align="left" class="Tdcell">
										<jtag:jtal name="deptWork.plan" editCondition="%{allPermission}" cssStyle="width:96%;height:90" rows="15" readonly="true" cols="80" />
									</td>
								</tr>
								<tr valign="top" class="right_biaodan">
									<td width="75%" align="left" valign="middle" class="Tdcell" colspan="4">
										<b>${year}年${month}月主要工作完成情况：</b>
									</td>
								</tr>
								<tr valign="top">
									<td colspan="4" align="left" class="Tdcell">
										<jtag:jtal name="deptWork.finishqk" editCondition="%{allPermission}" cssStyle="width:96%;height:90" rows="15" cols="80" cssClass="validate[required]" />
									</td>
								</tr>

								<tr valign="top" class="right_biaodan">
									<td width="75%" align="left" valign="middle" class="Tdcell" colspan="4">
										<b>${year1}年${month1}月主要工作安排：</b>
									</td>
								</tr>
								<tr valign="top">

									<td colspan="4" align="left" class="Tdcell">
										<jtag:jtal name="deptWork.actual" editCondition="%{allPermission}" cssStyle="width:96%;height:100" rows="15" cols="80" cssClass="validate[required]" />
									</td>
								</tr>
							</table>
						</div>

					</s:form>

					<table width="100%" border="0" cellspacing="0" cellpadding="0" height="17">
						<tr>
							<td></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		
	</body>
	<SCRIPT type="text/javascript">		
	$(function() {
		$("#save").click(function(e) {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid == false) {
				return false;
			}
			saveDoc();
		});
		
		$("#back").click(function(e) {
			closeBox();
		});	
	});
	function saveDoc() {
        var params = $("#update").serialize();
        lockBox();
        jQuery.ajax( {
            url : "personalaffairs/DeptWork_detailsUpdate_ajax.action",
            type : "POST",
            data : params,
            dataType : "json",
            success : callback
        });
    }
    
    function callback(data) {
        ajaxMessage(data, 1);
    }
    function deptchange(){
        for ( var i = 0; i < update.deptNameS.options.length; i++) {
            if (update.deptNameS.options[i].selected == true){
                var deptid=update.deptid.options[i].value
                update.deptid.options[i].selected=true              
            }   
          }
        update.action="DeptWork_detailsLoad.action";
        update.submit();
    }
    function getDeptWork(){
        update.action="DeptWork_detailsLoad.action";
        update.submit();
    }
    
</SCRIPT>
</html>
