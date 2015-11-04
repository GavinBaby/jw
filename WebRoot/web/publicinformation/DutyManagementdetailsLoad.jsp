
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
	<div data-options="region:'center',border:false">
			<table width="100%" height="28" border="0" cellpadding="0"
				cellspacing="0" class="dqwz_bg">
				<tr>
					<jtag:jlevel moduleId="module05050000"></jtag:jlevel>
				</tr>
			</table>
			<s:form id="update" name="update"
				action="publicinformation/Memos_detailsUpdate_ajax.action"
				method="POST" cssClass="jNice">
				<s:hidden id="updateTime" name="updateTime"></s:hidden>
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					height="7">
					<tr>
						<td></td>
					</tr>
				</table>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="center" width="20%">
							<jtag:jbutton id="save" value="保 存" editCondition="*" />
							&nbsp;&nbsp;
							<jtag:jbutton id="export" value="导 出"
								editCondition="%{allPermission}" />
						</td>
						<td width="20%" align="center">
							年月：
							<jtag:jtl id="years" cssClass="Wdate" name="years"
								onclick="WdatePicker({readOnly:true,dateFmt:'yyyy-MM'})"
								onchange="changeyears(this.value);" editCondition="*"
								maxlength="50" cssStyle="width:50%"></jtag:jtl>
						</td>
						<td width="60%">
							&nbsp;
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
						<td width="25%" class="ziduan" style="text-align: center;">
							值班日期
						</td>

						<td width="25%" class="ziduan" style="text-align: center;">
							星&nbsp;&nbsp;期
						</td>

						<td width="25%" class="ziduan" style="text-align: center;">
							值班人员
						</td>
						<td width="10%" class="ziduan" style="text-align: center;">
							签到
						</td>
						<td width="15%" class="ziduan" style="text-align: center;">
							签到时间
						</td>
					</tr>
					<s:iterator value="list_B_T_Ufp_DutyManagement" id="DutyManagement"
						status="st">
						<s:hidden id="uuid"
							name="%{'list_B_T_Ufp_DutyManagement['+#st.index+'].uuid'}" />
						<s:hidden id="dutyTime"
							name="%{'list_B_T_Ufp_DutyManagement['+#st.index+'].dutyTime'}" />
						<s:hidden id="weeks"
							name="%{'list_B_T_Ufp_DutyManagement['+#st.index+'].weeks'}" />
						<tr>
							<TD width="25%" style="text-align: center;" class="ziduan">
								<s:property value="dutyTime" />
							</TD>
							<TD width="25%" style="text-align: center;" class="ziduan">
								<s:property value="weeks" />
							</TD>
							<TD width="25%" style="text-align: center;" class="ziduan">
								<s:if test='ifadmin=="1"'>
									<jtag:jtl
										name="%{'list_B_T_Ufp_DutyManagement['+#st.index+'].dutyUser'}"
										theme="simple" cssStyle="width:80%" id="dutyUser%{#st.index}"
										maxlength="50" editCondition="*"></jtag:jtl>

								</s:if>
								<s:elseif test='ifadmin=="0"'>
									<jtag:jtl
										name="%{'list_B_T_Ufp_DutyManagement['+#st.index+'].dutyUser'}"
										theme="simple" cssStyle="width:80%" id="dutyUser%{#st.index}"
										maxlength="50" editCondition="#"></jtag:jtl>
								</s:elseif>
							</TD>
							<td width="10%" class="ziduan" style="text-align: center;">
								<a href="#"
									onClick="checkfun('<s:property value="%{#st.index}"/>')"><font
									color="#367096">点击签到</font>
								</a>
							</td>
							<TD width="15%" style="text-align: center;" class="ziduan">
								<s:if test='dutyTime==iftoday||ifadmin=="1"'>
									<jtag:jtl
										name="%{'list_B_T_Ufp_DutyManagement['+#st.index+'].checkTime'}"
										theme="simple" cssStyle="width:80%" id="checkTime%{#st.index}"
										maxlength="50" editCondition="*" readonly="true"></jtag:jtl>
								</s:if>
								<s:elseif test='dutyTime!=iftoday&&ifadmin==0'>
									<jtag:jtl
										name="%{'list_B_T_Ufp_DutyManagement['+#st.index+'].checkTime'}"
										theme="simple" cssStyle="width:80%" id="checkTime%{#st.index}"
										maxlength="50" editCondition="#"></jtag:jtl>
								</s:elseif>
							</TD>
						</tr>
					</s:iterator>
				</table>
			</s:form>
		</div>
                     
	</body>
	<SCRIPT type="text/javascript">
			
	$(function() {
		
		$("#save").click(
			function(e) {
			var returnIsValid = $('#update').form('validate');
			if (returnIsValid) {
			var params = $("#update").serialize();
			
			jQuery.ajax( {
					url : "publicinformationajax/DutyManagement_detailsUpdate_ajax.action",
					type : "POST",
					data : params,
					dataType : "json",
					success : callback
					});
					}
					});

		$("#export").click(function(e) {
		var years=$("#years").val();
		
			window.location = "DutyManagement_detailsLoad.action?type=1&years="+encodeURI(encodeURI(years));		
		});
		function callback(data) {
			art.dialog.alert("保存成功");
			window.location.href="../publicinformation/DutyManagement_detailsLoad.action?years="+data.years;
		}
			});
	function getTime(){
		return '<%=com.jw.baseframe.util.DateTools.getServerDateTime(9)%>'
	}
	function checkfun(id){
		$('#checkTime'+id).attr('value',getTime());
	}
	function changeyears(years) {
		window.location.href="../publicinformation/DutyManagement_detailsLoad.action?years="+years;
	}	
</SCRIPT>
</html>


