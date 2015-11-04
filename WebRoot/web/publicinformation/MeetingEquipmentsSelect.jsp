
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
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
		<s:form id="update" name="update" method="POST" theme="simple" cssClass="jNice">
		    <table width="98%" border="0" cellspacing="0" cellpadding="0">
		     <tr>
		         <td align="left">
			<jtag:jbutton id="back" value="关 闭" editCondition="*"	/>
			<jtag:jbutton id="save" value="确 定" editCondition="*" />
			     </td>
			</tr>
			</table>
			<TABLE width="100%" border=0 cellPadding=2 cellSpacing=0 >
				<TBODY>

					<tr>
						<TD width="80%"  align="left"  valign="top">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" id="table11" class="biaodan">
								<tr align="center" height="35px">
									<td width="20%"><p align="center">选择</p></td>
									<td width="50%"><p align="center">设备名</p></td>
									<td width="20%"><p align="center">需求数量</p></td>
								</tr>
								<s:iterator value="list_B_V_Ufp_Meeting_Equipuse" id="list_B_V_Ufp_Meeting_Equipuse" status="index">
								<tr>
								    <td align="center" >
										<p align="center"><input type="checkbox" name="checkbox"  value='<s:property value="%{list_B_V_Ufp_Meeting_Equipuse[#index.index].equipmentId}"/>' checked/></p>
									</td>
									<td align="center" >
									 <p align="center"><s:property value="%{list_B_V_Ufp_Meeting_Equipuse[#index.index].equipmentName}"/>&nbsp;
									 <input type="hidden" 
									  id='id<s:property value="%{list_B_V_Ufp_Meeting_Equipuse[#index.index].equipmentId}"/>' />
									 <input type="hidden" value='<s:property value="%{list_B_V_Ufp_Meeting_Equipuse[#index.index].equipmentName}"/>'
									   id='name<s:property value="%{list_B_V_Ufp_Meeting_Equipuse[#index.index].equipmentId}"/>'/></p>
									</td>
									<td align="center" >
									<input type="text" size="8"  onkeyup="egetamount('<s:property value="%{list_B_V_Ufp_Meeting_Equipuse[#index.index].equipmentId}"/>')" class="num" 
										id='eNum<s:property value="%{list_B_V_Ufp_Meeting_Equipuse[#index.index].equipmentId}"/>' 
										value='<s:property value="%{list_B_V_Ufp_Meeting_Equipuse[#index.index].equipmentNum}"/>' />
									</td>
								</tr>
								</s:iterator>
								<s:iterator value="list_B_T_Ufp_Meeting_Equipments" id="list_B_T_Ufp_Meeting_Equipments" status="index1">
								<tr>
									<td align="center" >
										<p align="center"><input type="checkbox" name="checkbox"  value='<s:property value="%{list_B_T_Ufp_Meeting_Equipments[#index1.index].uuid}"/>'/></p>
									</td>
									<td align="center" >
									 <p align="center"><s:property value="%{list_B_T_Ufp_Meeting_Equipments[#index1.index].equipmentName}"/>&nbsp;
									 <input type="hidden" value='<s:property value="%{list_B_T_Ufp_Meeting_Equipments[#index1.index].equipmentName}"/>'
									  id='name<s:property value="%{list_B_T_Ufp_Meeting_Equipments[#index1.index].uuid}"/>' /></p>
									</td>
									<td align="center" >
									<input size="8" type="text" maxlength="5" onkeyup="egetamount('<s:property value="%{list_B_T_Ufp_Meeting_Equipments[#index1.index].uuid}"/>')" class="num" 
										id='eNum<s:property value="%{list_B_T_Ufp_Meeting_Equipments[#index1.index].uuid}"/>' value="1"/>
									</td>
								</tr>
								</s:iterator>
							</table>
						</TD>
					</tr>
				</TBODY>
			</TABLE>
	 </s:form>
	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		$("#back").click(function(e) {
	        closeBox();
	    });
		$("#save").click(function(e) {
			getSelect();
        });
		$('.num').numberbox({min:0,required:true});
	})
	function egetamount(id){
		var nums=jQuery("#eNum"+id).attr("value");
	}
	function IsNullToInt(obj) {
		var re = 0;
		if (obj == null || obj == "" || isNaN(obj))
			return false;
		else {
			re = parseInt(obj);
		}
		return re;
	}
	// 制保留2位小数，如：2，会在2后面补上00.即2.00
	function toDecimal2(x) {
		var f = parseFloat(x);
		if (isNaN(f)) {
			return '';
		}
		var f = Math.round(x * 100) / 100;
		var s = f.toString();
		var rs = s.indexOf('.');
		if (rs < 0) {
			rs = s.length;
			s += '.';
		}
		while (s.length <= rs + 2) {
			s += '0';
		}
		return s;
	}
	function getSelect(){
		var deleteFlags="checkbox";
		var name="name";
		var num="eNum";
	    var checkBoxList = document.getElementsByName(deleteFlags); 
	    var temp="";  
	    for (var i=0;i<checkBoxList.length;i++){
		    var id=checkBoxList[i].value;
		    var names=jQuery("#name"+id).attr("value");
		    var nums=jQuery("#eNum"+id).attr("value");
	        if (checkBoxList[i].checked){
	            if(i==0)
	            {
	                temp = checkBoxList[i].value+","+names+","+nums;
	            }
	            else
	            {
	                temp = temp + "@" + checkBoxList[i].value+","+names+","+nums;
	            }
	        }
	    }
	    var ParentForm = art.dialog.opener.document.getElementById("SelectEqips");
	    ParentForm.value=temp;
	    art.dialog.opener.tableRowsAdd("table11");
	    closeBox();
	}
   </SCRIPT>
</html>