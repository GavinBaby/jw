<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<!DOCTYPE html PUBLIC "-//W3C//Dtd XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/Dtd/xhtml1-transitional.dtd">
<html>
	<head>
		<jtag:jhead />
		<link rel="stylesheet" type="text/css" href="../../css/next.css">
	</head>
	<body>
		<TABLE width="100%" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<TBODY>
				<TR>
					<td align="center" valign="middle" class="bigtitleshow" height="30">
						<b>�����̴���ѡ�</b>
						<s:hidden name="nextTacheClrDepId" id="nextTacheClrDepId"></s:hidden>
						<s:hidden name="nextTacheClrRoleId" id="nextTacheClrRoleId"></s:hidden>
						<s:hidden name="nextTacheCyrDepId" id="nextTacheCyrDepId"></s:hidden>
						<s:hidden name="nextTacheCyrRoleId" id="nextTacheCyrRoleId"></s:hidden>
						<s:hidden name="nextTacheClrDepName" id="nextTacheClrDepName"></s:hidden>
						<s:hidden name="nextTacheClrRoleName" id="nextTacheClrRoleName"></s:hidden>
						<s:hidden name="nextTacheCyrDepName" id="nextTacheCyrDepName"></s:hidden>
						<s:hidden name="nextTacheCyrRoleName" id="nextTacheCyrRoleName"></s:hidden>
						<s:hidden name="nextTacheClrIdByDep" id="nextTacheClrIdByDep"></s:hidden>
						<s:hidden name="nextTacheClrIdByRole" id="nextTacheClrIdByRole"></s:hidden>
						<s:hidden name="nextTacheClrNameByDep" id="nextTacheClrNameByDep"></s:hidden>
						<s:hidden name="nextTacheClrNameByRole"
							id="nextTacheClrNameByRole"></s:hidden>
						<s:hidden name="nextTacheCyrIdByDep" id="nextTacheCyrIdByDep"></s:hidden>
						<s:hidden name="nextTacheCyrIdByRole" id="nextTacheCyrIdByRole"></s:hidden>
						<s:hidden name="nextTacheCyrNameByDep" id="nextTacheCyrNameByDep"></s:hidden>
						<s:hidden name="nextTacheCyrNameByRole"
							id="nextTacheCyrNameByRole"></s:hidden>
						<s:hidden name="smsClr" id="smsClr"></s:hidden>
						<s:hidden name="smsCyr" id="smsCyr"></s:hidden>
						<s:hidden name="allUserName" id="allUserName"></s:hidden>
						<s:hidden name="allSysUser" id="allSysUser"></s:hidden>
						<s:hidden name="betterClr" id="betterClr"></s:hidden>
						<s:hidden name="flowId" id="flowId"></s:hidden>
						<s:hidden name="curTacheId" id="curTacheId"></s:hidden>
						<s:hidden name="jsonC_V_Flow_Route" id="jsonC_V_Flow_Route"></s:hidden>
					</td>
				</TR>
				<TR>
					<td>
						<TABLE height="100%" cellSpacing="1" cellPadding="0" width="100%"
							border="0" bgcolor="#9fcaf5">
							<TBODY>
								<TR>
									<td width="30%" height="25" align="center" vAlign="middle"
										noWrap="nowrap" class="Tdcellleft">
										���������ڡ�
									</td>
									<td width="30%" align="center" vAlign="middle" noWrap="nowrap"
										class="Tdcellright">
										<label>
											<s:select id="f_NextTacheName" name="f_NextTacheName"
												list="listC_V_Flow_Route" listKey="nextTacheId"
												listValue="tacheName" onchange="tacheChange();"
												theme="simple" cssStyle="width:120px"></s:select>
										</label>
									</td>
									<td width="13%" height="25" align="center" vAlign="middle"
										noWrap="nowrap" class="Tdcellleft">
										������֪ͨ��
									</td>
									<td vAlign="middle" noWrap="nowrap" align="center"
										class="Tdcellright">
										<input type="checkbox" id="f_isMustSend" name="f_isMustSend"
											value="1" />
										����Ϣ
									</td>
								</TR>
								<TR>

									<td vAlign="middle" nowrap="nowrap" align="center" colspan="2"
										height="25" class="Tdcellleft">
										���������ڴ����ˡ�
									</td>
									<td rowSpan=2 align="center" vAlign="middle" noWrap
										class="Tdcellleft">
										<TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%"
											border=0>
											<TBODY>
												<TR>
													<td vAlign="middle" noWrap align=center height="30">
														<input type=button id="clrselect" class=btn1_mouseout
															value="ѡ ��">
														</input>
													</td>
												</TR>
												<TR>
													<td vAlign="middle" noWrap align="center"
														class="Tdcellleft">
													</td>
												</TR>
												<TR>
													<td vAlign="middle" noWrap align="center"
														class="Tdcellleft">
													</td>
												</TR>

												<TR>
													<td vAlign="middle" noWrap align=center height="30">
														<input type=button id="clrdelete" class="btn1_mouseout"
															value="ɾ ��">
														</input>
													</td>
												</TR>
											</TBODY>
										</TABLE>
									</td>
									<td vAlign="middle" noWrap align="center" class="Tdcellleft">
										&nbsp;����ѡ���Ĵ����ˡ�
									</td>
								</TR>
								<TR>
									<td align="center" vAlign="middle" noWrap>
										<table width="100%" height="24" border="0" cellpadding="0"
											cellspacing="0" class="Tdcellright">
											<tr>
												<td width="50%" align="center"
													background="../../images/yq_xz.gif" class="TdcellHead"
													id="tm_1">
													<input name="radiobutton" type="radio" value="radiobutton"
														checked="checked" style="vertical-align: middle;"
														onClick="change_dh_sy(1)" />
													������
												</td>
												<td align="center" background="../../images/yq_wxz.gif"
													bgcolor="#F8FBFC" id="tm_2">
													<input type="radio" name="radiobutton" value="radiobutton"
														style="vertical-align: middle;" onClick="change_dh_sy(2)" />
													����ɫ
												</td>
											</tr>
										</table>
										<div id="div_1">
											<TABLE height="126" cellSpacing=0 cellPadding=0 width="100%"
												border=0>
												<TBODY>
													<TR>
														<td vAlign=top noWrap align=center class="Tdcellright">
															<select id="f_deptlist_clr" name="f_deptlist_clr"
																multiple
																style="width: 160px; height: 120px; border: #ccc 1px solid;"
																onchange="deptClrChange();" class=text1></select>
														</td>
													</TR>
												</TBODY>
											</TABLE>
										</div>
										<div id="div_2" style="display: none">
											<table height="126" cellspacing="0" cellpadding="0"
												width="100%" border="0">
												<tbody>
													<tr>
														<td valign="top" nowrap="nowrap" align="center"
															class="Tdcellright">
															<select id="f_rolelist_clr" name="f_rolelist_clr"
																multiple
																style="width: 160px; height: 120px; border: #ccc 1px solid;"
																onchange="roleClrChange();" class=text1></select>
														</td>
													</tr>
												</tbody>
											</table>
										</div>
									</td>
									<td align="center" vAlign="middle" noWrap>
										<table width="100%" height="24" border="0" cellpadding="0"
											cellspacing="0" class="Tdcellright">
											<tr>
												<td align="center">
													<input type="checkbox" name="fdSelectAll" id="fdSelectAll"
														onclick="selectAll(this,'f_hjclr');" />
													ȫ��ѡ��
												</td>
											</tr>
										</table>
										<TABLE height="126" cellSpacing=0 cellPadding=0 width="100%"
											border=0>
											<TBODY>
												<TR>
													<td vAlign=top noWrap align=center class="Tdcellright">
														<select id="f_hjclr" name="f_hjclr" multiple
															style="width: 160px; height: 120px; border: #ccc 1px solid;"
															ondblclick="document.getElementById('clrselect').click();"
															class=text1>
															<option value="@" selected>
														</select>
													</td>
												</TR>
											</TBODY>
										</TABLE>
									</td>
									<td align="center" vAlign="middle">
										<table width="100%" height="24" border="0" cellpadding="0"
											cellspacing="0" class="Tdcellright">
											<tr>
												<td align="center">
													<input type="checkbox" name="checkbox5" id="checkbox5"
														onclick="selectAll(this,'f_selectedclr');" />
													ȫ��ѡ��
												</td>
											</tr>
										</table>
										<TABLE class="Table_One" borderColor=#000000 height="126"
											cellSpacing=0 borderColorDark="#ffffff" cellPadding=0
											width="100%" borderColorLight="#000000" border=0>
											<TBODY>
												<TR>
													<td vAlign=top noWrap align=center class="Tdcellright">
														<select id="f_selectedclr" name="f_selectedclr" multiple
															style="width: 150px; height: 120px; border: #ccc 1px solid;"></select>
													</td>
												</TR>
											</TBODY>
										</TABLE>
									</td>
								</TR>
							</TBODY>
						</TABLE>

						<div id="lm1" class="cyhj" onClick="cyxsload();">
							���Ļ���
							<img id="cyxs" src="../../images/yq_jia.gif" width="12"
								height="12" style="vertical-align: middle;" />
						</div>
						<div id="er_lm1"
							style="width: 100%; height: 175px; z-index: 2; left: -40px; top: 360px; display: none;">
							<table height="100%" cellspacing="0" cellpadding="0" width="100%"
								border="0">
								<tbody>
									<tr>
										<td height="25" colspan="2" align="center" valign="middle"
											nowrap="nowrap" class="Tdcellleft cyhjbd">
											���������ڴ����ˡ�
										</td>
										<td width="13%" align="center" valign="middle" nowrap="nowrap"
											class="Tdcellleft cyhjbd">
											������֪ͨ��
										</td>
										<td align="center" valign="middle" nowrap="nowrap"
											class="Tdcellright cyhjbd">
											<input type="checkbox" id="f_isMustSend_Cy"
												name="f_isMustSend_Cy" value="1" />
											����Ϣ
										</td>
									</tr>
									<tr>
										<td width="30%" align="center" valign="middle" nowrap="nowrap"
											class="cyhjbd">
											<table width="100%" height="24" border="0" cellpadding="0"
												cellspacing="0">
												<tr>
													<td width="50%" align="center"
														background="../../images/yq_xz.gif"
														class="TdcellHead" id="tm_3">
														<input name="radiobutton2" type="radio"
															value="radiobutton" checked="checked"
															style="vertical-align: middle;" onclick="change_dh_sy(3)" />
														������
													</td>
													<td align="center" background="../../images/yq_wxz.gif"
														id="tm_4" bgcolor="#F8FBFC" >
														<input name="radiobutton2" type="radio"
															value="radiobutton" style="vertical-align: middle;"
															onclick="change_dh_sy(4)" />
														����ɫ
													</td>
												</tr>
											</table>
											<div id="div_3">
												<table  height="126" cellspacing="0"
													 cellpadding="0" width="100%"
													 border="0">
													<tbody>
														<tr>
															<td valign="middle" nowrap="nowrap" align="center">
																<select id="f_deptlist_cyr" name="f_deptlist_cyr"
																	multiple
																	style="width: 160px; height: 120px; border: #ccc 1px solid;"
																	onchange="deptCyrChange();" class="content">
																</select>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
											<div id="div_4" style="display: none">
												<table  height="126" cellspacing="0"
													 cellpadding="0" width="100%"
													 border="0">
													<tbody>
														<tr>
															<td valign="middle" nowrap="nowrap" align="center">
																<select id="f_rolelist_cyr" name="f_rolelist_cyr"
																	multiple
																	style="width: 160px; height: 120px; border: #ccc 1px solid;"
																	onchange="roleCyrChange();" class="content"></select>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</td>
										<td width="30%" align="center" valign="middle" nowrap="nowrap"
											style="border-right: #9fcaf5 1px solid; border-bottom: #9fcaf5 1px solid;">
											<table width="100%" height="24" border="0" cellpadding="0"
												cellspacing="0">
												<tr>
													<td width="30%" align="center">
														<input type="checkbox" name="checkbox7" id="checkbox7"
															onclick="selectAll(this,'f_rylist');" />
														ȫ��ѡ��
													</td>
												</tr>
											</table>
											<table bordercolor="#000000" height="126" cellspacing="0"
												bordercolordark="#ffffff" cellpadding="0" width="100%"
												bordercolorlight="#000000" border="0">
												<tbody>
													<tr>
														<td valign="middle" nowrap="nowrap" align="center">
															<select id="f_rylist" name="f_rylist" cols="22" rows="8"
																multiple
																style="width: 160px; height: 120px; border: #ccc 1px solid;"
																ondblclick="document.getElementById('cyrselect').click();"
																class="content">
															</select>
														</td>
													</tr>
												</tbody>
											</table>
										</td>
										<td width="13%" align="center" valign="middle" nowrap="nowrap"
											class="Tdcellleft cyhjbd">
											<table height="100%" cellspacing="0" cellpadding="0"
												width="100%" border="0">
												<tbody>
													<tr>
														<td valign="middle" nowrap="nowrap" align="center"
															height="30">
															<input type=button id="cyrselect" name="cyrselect"
																class="btn1_mouseout" value="ѡ ��">
															</input>
														</td>
													</tr>
													<tr>
														<td valign="middle" nowrap="nowrap" align="center">
														</td>
													</tr>
													<tr>
														<td valign="middle" nowrap="nowrap" align="center">
														</td>
													</tr>
													<tr>
														<td valign="middle" nowrap="nowrap" align="center"
															height="30">
															<input type=button id="cyrdelete" class="btn1_mouseout"
																value="ɾ ��">
															</input>
														</td>
													</tr>
												</tbody>
											</table>
										</td>
										<td align="center" valign="middle" class="cyhjbd">
											<table width="100%" height="24" border="0" cellpadding="0"
												cellspacing="0">
												<tr>
													<td align="center">
														<input type="checkbox" name="checkbox6" id="checkbox6"
															onclick="selectAll(this,'f_selectedcyr');" />
														ȫ��ѡ��
													</td>
												</tr>
											</table>
											<table bordercolor="#000000" height="126" cellspacing="0"
												bordercolordark="#ffffff" cellpadding="0" width="100%"
												bordercolorlight="#000000" border="0">
												<tbody>
													<tr>
														<td valign="middle" nowrap="nowrap" align="center">
															<select id="f_selectedcyr" name="f_selectedcyr" multiple
																style="width: 150px; height: 120px; border: #ccc 1px solid;"></select>
														</td>
													</tr>
												</tbody>
											</table>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</td>
				</TR>
				<TR>
					<td vAlign="middle" noWrap align="center">
						&nbsp;
					</td>
				</TR>
				<TR>
					<td vAlign="middle" noWrap align="center">
						<input type=button id="ok" class="btn1_mouseout" value="ȷ ��">
						</input>
						&nbsp;&nbsp;
						<input type=button id="quxiao" class="btn1_mouseout" value="ȡ ��">
						</input>
					</td>
				</TR>
			</TBODY>
		</TABLE>
	</body>
	<SCRIPT type="text/javascript">
		
	///�õ��ָ���
	var ls_Separator1 = ",";
	var ls_Separator2 = "+";
	var ls_Separator3 = "#";
	var ls_Separator4 = "*";

	var option1=$("#f_NextTacheName").get(0).options;
	var option2=$("#f_hjclr").get(0).options;

	$(function() {
		
		//���в���Id����
		var v_AllDeptId = $("#nextTacheCyrDepId").val().split(ls_Separator1);
		//���в�����������
		var v_AllDeptName = $("#nextTacheCyrDepName").val().split(ls_Separator1);
		//���н�ɫId����
		var v_AllRoleId = $("#nextTacheCyrRoleId").val().split(ls_Separator1);
		//���н�ɫ��������
		var v_AllRoleName = $("#nextTacheCyrRoleName").val().split(ls_Separator1);

		var jdata = $.parseJSON($("#jsonC_V_Flow_Route").val());
		
		for(kk=0;kk<v_AllDeptId.length-1;kk++)
		{
			$("#f_deptlist_cyr").append("<option value='" +v_AllDeptId[kk] + "'>"+v_AllDeptName[kk]+"</option>");
		}	
			
		for(j=0;j<v_AllRoleId.length-1;j++)
		{
			$("#f_rolelist_cyr").append("<option value='" +v_AllRoleId[j] + "'>"+v_AllRoleName[j]+"</option>");
		}
		
		tacheChange();

		setTimeout("selectOption()",1);
		
		$("#clrselect").click(function(){
			contrastSelect("f_hjclr","f_selectedclr");
			$("#f_hjclr option:selected").each(function(){
                   	$("#f_selectedclr").append("<option value='"+jQuery(this).val()+"'>"+jQuery(this).text()+"</option>");  
               });
		});	
		$("#cyrselect").click(function(){
				contrastSelect("f_rylist","f_selectedcyr");
				 $("#f_rylist option:selected").each(function(){  
                   	$("#f_selectedcyr").append("<option value='"+jQuery(this).val()+"'>"+jQuery(this).text()+"</option>");  
               });  
		});	
		$("#clrdelete").click(function(){
				 $("#f_selectedclr option:selected").remove();
		});	
		$("#cyrdelete").click(function(){
				 $("#f_selectedcyr option:selected").remove();
		});	
		$("#ok").click(function(){
		
			//ȡ�ú�������ID	
			var nextTacheId = jQuery("#f_NextTacheName").find("option:selected").val();
			var nextTacheInfo;
			if(nextTacheId == "end")
			{
				var yn= confirm("�Ƿ�ȷ���������ĵ����̣�")
				if(yn==false)
				{
   					return false;
				}
				nextTacheInfo = "*" + ls_Separator3 +"1"+ ls_Separator3 +"1"+ ls_Separator3+"1"+ ls_Separator3+"1"+ ls_Separator3+"1"+ ls_Separator3;
			}
			else
			{
				if($("#f_selectedclr").find("option").length==0)
				{
					alert("��ѡ��������ڵĴ�����Ա��");
	     				return false;
				}
				
				if(jdata[0].tacheIsConfirmsubmit == 1)
				{
					var yn= confirm("�Ƿ�ȷ��������")
					if(yn==false)
					{
		  					return false;
					}
				}
				
				//ȡ�ú������ڴ�����
				var nextTacheClr = "";
				$("#f_selectedclr option").each(function(){  
	                   	nextTacheClr+=jQuery(this).val() + ls_Separator2;  
	               });  
				
				//ȡ�ú������ڴ�����
				var nextTacheCyr = "";
				$("#f_selectedcyr option").each(function(){  
	                   	nextTacheCyr+=jQuery(this).val() + ls_Separator2;  
	               }); 
				
				nextTacheClr = nextTacheClr.substring(0,nextTacheClr.length-1);
				if("" != nextTacheCyr)
				{
					nextTacheCyr = nextTacheCyr.substring(0,nextTacheCyr.length-1);
				}
				
				nextTacheInfo= "1" + ls_Separator3 + nextTacheId + ls_Separator3 + nextTacheClr + ls_Separator3 +nextTacheCyr+ ls_Separator3;
			    if(document.getElementById("f_isMustSend").checked==true)
			    {
			    	nextTacheInfo = nextTacheInfo + "true"+ls_Separator3;
			    }
			    else
			    {
			    	nextTacheInfo = nextTacheInfo + "false"+ls_Separator3;
			    }
			    if(document.getElementById("f_isMustSend_Cy").checked==true)
			    {
			    	nextTacheInfo = nextTacheInfo + "true"+ls_Separator3;
			    }
			    else
			    {
			    	nextTacheInfo = nextTacheInfo + "false"+ls_Separator3;
			    }
			}

		    art.dialog.opener.$("#nextTacheInfo").val(nextTacheInfo);
            
		    art.dialog.opener.$("#save").click();
			closeBox();
		});

		$("#quxiao").click(function(){
			closeBox();
		});

		if(jdata[0].tacheOneDirectSubmit == 1)
		{
		option1=$("#f_NextTacheName").get(0).options;
	    option2=$("#f_hjclr").get(0).options;
			if($("#f_NextTacheName option").length ==1 && $("#f_hjclr option").length==1)
			{
				var nextTacheInfo;
				nextTacheInfo = "1" + ls_Separator3 + option1[0].value + ls_Separator3 + option2[0].value + ls_Separator3 +""+ ls_Separator3;
				 if(document.getElementById("f_isMustSend").checked==true)
				    {
				    	nextTacheInfo = nextTacheInfo + "true"+ls_Separator3;
				    }
				    else
				    {
				    	nextTacheInfo = nextTacheInfo + "false"+ls_Separator3;
				    }
				    if(document.getElementById("f_isMustSend_Cy").checked==true)
				    {
				    	nextTacheInfo = nextTacheInfo + "true"+ls_Separator3;
				    }
				    else
				    {
				    	nextTacheInfo = nextTacheInfo + "false"+ls_Separator3;
				    }

				
				  art.dialog.opener.$("#nextTacheInfo").val(nextTacheInfo);
		            
				  art.dialog.opener.$("#save").click();
					closeBox();
			}	
		
		}
	
	});

	 function change_dh_sy(n)
	  {
	  	switch(n)
		{

			case 1:
			document.getElementById("tm_1").style.borderBottom="#ffffff 0px solid";
			document.getElementById("tm_1").style.backgroundColor="#ffffff";
			document.getElementById("tm_1").className="TdcellHead";
			document.getElementById("tm_1").style.background="url(../../images/yq_xz.gif)";
			document.getElementById("tm_2").style.borderBottom="#9fcaf5 0px solid";
			document.getElementById("tm_2").style.backgroundColor="#F8FBFC";
			document.getElementById("tm_2").className="";
			document.getElementById("tm_2").style.background="url(../../images/yq_wxz.gif)";
			
			document.getElementById("div_1").style.display="block";
			document.getElementById("div_2").style.display="none";
				deptClrChange();
			break;
			case 2:
			document.getElementById("tm_1").style.borderBottom="#9fcaf5 0px solid";
			document.getElementById("tm_1").style.backgroundColor="#F8FBFC";
			document.getElementById("tm_1").className="";
			document.getElementById("tm_1").style.background="url(../../images/yq_wxz.gif)";
			document.getElementById("tm_2").style.borderBottom="#ffffff 0px solid";
			document.getElementById("tm_2").style.backgroundColor="#ffffff";
			document.getElementById("tm_2").className="TdcellHead";
			document.getElementById("tm_2").style.background="url(../../images/yq_xz.gif)";
			
			document.getElementById("div_1").style.display="none";
			document.getElementById("div_2").style.display="block";
				roleClrChange();
			break;
			case 3:
			document.getElementById("tm_3").style.borderBottom="#ffffff 0px solid";
			document.getElementById("tm_3").style.backgroundColor="#ffffff";
			document.getElementById("tm_3").className="TdcellHead";
			document.getElementById("tm_3").style.background="url(../../images/yq_xz.gif)";
			document.getElementById("tm_4").style.borderBottom="#9fcaf5 0px solid";
			document.getElementById("tm_4").style.backgroundColor="#F8FBFC";
			document.getElementById("tm_4").className="";
			document.getElementById("tm_4").style.background="url(../../images/yq_wxz.gif)";
			
			document.getElementById("div_3").style.display="block";
			document.getElementById("div_4").style.display="none";
			deptCyrChange();
			break;
			case 4:
			document.getElementById("tm_3").style.borderBottom="#9fcaf5 0px solid";
			document.getElementById("tm_3").style.backgroundColor="#F8FBFC";
			document.getElementById("tm_3").className="";
			document.getElementById("tm_3").style.background="url(../../images/yq_wxz.gif)";
			document.getElementById("tm_4").style.borderBottom="#ffffff 0px solid";
			document.getElementById("tm_4").style.backgroundColor="#ffffff";
			document.getElementById("tm_4").className="TdcellHead";
			document.getElementById("tm_4").style.background="url(../../images/yq_xz.gif)";
			
			document.getElementById("div_3").style.display="none";
			document.getElementById("div_4").style.display="block";
			roleCyrChange();
			break;
			
		}
	  }	 

	function contrastSelect(selectList,usedList){
		var listOption=document.getElementById(selectList).options;
		var usedOption=document.getElementById(usedList).options;
		if(usedOption.length==0) return;
		for(var i=0;i<usedOption.length;i++){
			for(var j=0;j<listOption.length;j++){
				if(listOption[j].selected==false) continue;
				if(listOption[j].value==usedOption[i].value){
					listOption[j].selected=false; break;
				}
			}
		}
	}
	
	function tacheChange()
	{
		var i_select=$("#f_NextTacheName").get(0).selectedIndex;  ///ѡ�����Ǹ�����
		
		//���в���Id����
		var v_AllDeptId = $("#nextTacheClrDepId").val().split(ls_Separator2);
		//���в�����������
		var v_AllDeptName = $("#nextTacheClrDepName").val().split(ls_Separator2);
		//���н�ɫId����
		var v_AllRoleId = $("#nextTacheClrRoleId").val().split(ls_Separator2);
		//���н�ɫ��������
		var v_AllRoleName = $("#nextTacheClrRoleName").val().split(ls_Separator2);
		var jdata = $.parseJSON($("#jsonC_V_Flow_Route").val());
		
		/////���ѡ��Ĵ������б�
		$("#f_selectedclr").empty(); 
		/////���ѡ��Ĵ������б�
		$("#f_selectedcyr").empty(); 
		/////��մ��������ڲ��ŵ��б�
		$("#f_deptlist_clr").empty();
		/////��մ��������ڽ�ɫ���б�
		$("#f_rolelist_clr").empty(); 
		////��ѡ��Ĵ�����Ա���
		$("#f_hjclr").empty(); 
		////��ѡ��Ĵ�����Ա���
		$("#f_rylist").empty(); 
	
		//������Ա������
		var vs_AllUserName = $("#allUserName").val().split(ls_Separator2);
		//������Աϵͳ��
		var vs_AllUser = $("#allSysUser").attr("value").split(ls_Separator2);
		var k = 0 ;
	    $("#f_deptlist_clr").append("<option value='all'>��ʾȫ�崦����</option>");
	
		var v_DeptName = v_AllDeptName[i_select].split(ls_Separator1);
		var v_DeptId = v_AllDeptId[i_select].split(ls_Separator1);
		var v_RoleName = v_AllRoleName[i_select].split(ls_Separator1);
		var v_RoleId = v_AllRoleId[i_select].split(ls_Separator1);
		
		for(k=0;k<v_DeptName.length-1;k++)
		{
			$("#f_deptlist_clr").append("<option value='" +v_DeptId[k] + "'>"+v_DeptName[k]+"</option>");
		}	
			
		for(j=0;j<v_RoleName.length-1;j++)
		{
			$("#f_rolelist_clr").append("<option value='" +v_RoleId[j] + "'>"+v_RoleName[j]+"</option>");
		}
				//��ʼ����Ա
		lv_sysuser = vs_AllUser[i_select].split(ls_Separator1);  //ϵͳ��
		lv_user = vs_AllUserName[i_select].split(ls_Separator1); //������
		for(i=0;i<lv_sysuser.length-1;i++)
		{
			$("#f_hjclr").append("<option value='" +lv_sysuser[i] + "'>"+lv_user[i]+"</option>");
		}

		//�Ƿ�������
		if(jdata[0].tacheIsPermitpass == 1)
		{
			document.all.lm1.style.display='';
		}
		else
		{
			document.all.lm1.style.display='none';
		}
		//ȱʡ�Ƿ��Ͷ���Ϣ�������ˣ�
		if(jdata[0].tacheDoIsSentSms == 1)
		{
			$("#f_isMustSend").attr("checked", true);
		}
		else
		{
			$("#f_isMustSend").attr("checked", false);
		}
		
		//ȱʡ�Ƿ��Ͷ���Ϣ�������ˣ�
		if(jdata[0].tachePassIsSentsms == 1)
		{
			$("#f_isMustSend_Cy").attr("checked", true);
		}
		else
		{
			$("#f_isMustSend_Cy").attr("checked", false);
		}
		//ȱʡ�Ƿ��ͼ�ʱ��Ϣ�������ˣ�
		if(jdata[0].tacheDoIsSentMsg == 1)
		{

		}
		else
		{
		}
		//ȱʡ�Ƿ��ͼ�ʱ��Ϣ�������ˣ�
		if(jdata[0].tachePassIsSentMsg == 1)
		{

		}
		else
		{
		}

	}

	function selectOption()
	{
		var option=document.getElementById("f_deptlist_clr").options;
		var selected=true;
		option[0].selected=true;
		document.getElementById("f_rolelist_clr").options;
		option[0].selected=true;
		document.getElementById("f_deptlist_cyr").options;
		option[0].selected=true;
		document.getElementById("f_rolelist_cyr").options;
		option[0].selected=true;
	}
	
	
	function deptCyrChange()
	{
		/////���ѡ��Ĵ������б�
		$("#f_rylist").empty(); 
		var d_select=$("#f_deptlist_cyr").get(0).selectedIndex;  ///ѡ�����Ǹ�����
		
		//������Ա������
		var vs_AllUserName = $("#nextTacheCyrNameByDep").val().split(ls_Separator2)[d_select].split(ls_Separator1);
		//������Աϵͳ��
		var vs_AllUser = $("#nextTacheCyrIdByDep").val().split(ls_Separator2)[d_select].split(ls_Separator1);
		
		for(i=0;i<vs_AllUser.length-1;i++)
		{
			$("#f_rylist").append("<option value='" +vs_AllUser[i] + "'>"+vs_AllUserName[i]+"</option>");
		}
	}
	
	function deptClrChange()
	{
		var i_select=$("#f_NextTacheName").get(0).selectedIndex;  ///ѡ�����Ǹ�����
		/////���ѡ��Ĵ������б�
		$("#f_hjclr").empty(); 
		var d_select=$("#f_deptlist_clr").get(0).selectedIndex;  ///ѡ�����Ǹ�����
		var vs_AllUserName;
		var vs_AllUser
		if(d_select == 0)
		{
		//������Ա������
		 vs_AllUserName = $("#allUserName").val().split(ls_Separator2)[i_select].split(ls_Separator1);
		//������Աϵͳ��
		 vs_AllUser = $("#allSysUser").val().split(ls_Separator2)[i_select].split(ls_Separator1);
		}
		else
		{
		//������Ա������
		 vs_AllUserName = $("#nextTacheClrNameByDep").val().split(ls_Separator3)[i_select].split(ls_Separator2)[d_select-1].split(ls_Separator1);
		//������Աϵͳ��
		 vs_AllUser = $("#nextTacheClrIdByDep").val().split(ls_Separator3)[i_select].split(ls_Separator2)[d_select-1].split(ls_Separator1);
		}
		for(i=0;i<vs_AllUser.length-1;i++)
		{
			$("#f_hjclr").append("<option value='" +vs_AllUser[i] + "'>"+vs_AllUserName[i]+"</option>");
		}
	}
	function roleCyrChange()
	{
		var i_select=$("#f_NextTacheName").get(0).selectedIndex;  ///ѡ�����Ǹ�����
		/////���ѡ��Ĵ������б�
		//jQuery("#f_selectedcyr").empty(); 
		$("#f_rylist").empty(); 
		document.getElementById("checkbox6").checked=false;
		document.getElementById("checkbox7").checked=false;
		var r_select=$("#f_rolelist_cyr").get(0).selectedIndex;  ///ѡ�����Ǹ���ɫ
		
		//������Ա������
		var vs_AllUserName = $("#nextTacheCyrNameByRole").val().split(ls_Separator2)[r_select].split(ls_Separator1);
		//������Աϵͳ��
		var vs_AllUser = $("#nextTacheCyrIdByRole").val().split(ls_Separator2)[r_select].split(ls_Separator1);
		for(i=0;i<vs_AllUser.length-1;i++)
		{
			$("#f_rylist").append("<option value='" +vs_AllUser[i] + "'>"+vs_AllUserName[i]+"</option>");
		}
	}
	
	function roleClrChange()
	{
		var i_select=$("#f_NextTacheName").get(0).selectedIndex;  ///ѡ�����Ǹ�����
		/////���ѡ��Ĵ������б�
		//jQuery("#f_selectedclr").empty(); 
		$("#f_hjclr").empty(); 
		document.getElementById("fdSelectAll").checked=false;
		document.getElementById("checkbox5").checked=false;
		var r_select=$("#f_rolelist_clr").get(0).selectedIndex;  ///ѡ�����Ǹ���ɫ
		
		//������Ա������
		var vs_AllUserName = $("#nextTacheClrNameByRole").val().split(ls_Separator3)[i_select].split(ls_Separator2)[r_select].split(ls_Separator1);;
		//������Աϵͳ��
		var vs_AllUser = $("#nextTacheClrIdByRole").val().split(ls_Separator3)[i_select].split(ls_Separator2)[r_select].split(ls_Separator1);;
		for(i=0;i<vs_AllUser.length-1;i++)
		{
			$("#f_hjclr").append("<option value='" +vs_AllUser[i] + "'>"+vs_AllUserName[i]+"</option>");
		}
	}	
	
	function selectAll(checkbox,strName){
		var option=document.getElementById(strName).options;
		var selected=checkbox.checked;
		for(var i=0;i<option.length;i++){
			option[i].selected=selected;
		}
	}


	function cyxsload()
	{

		document.all.er_lm1.style.display=(document.all.er_lm1.style.display =='none')?'':'none';

		if(document.all.er_lm1.style.display =='none')
		{
			document.all.cyxs.src="../../images/yq_jia.gif";
			art.dialog.data('api').size(650, 320).position('50%','50%');
		}
		else
		{
			document.all.cyxs.src="../../images/yq_jian.gif";
			art.dialog.data('api').size(650, 500).position('50%','50%');
		}
	}
</SCRIPT>
</html>