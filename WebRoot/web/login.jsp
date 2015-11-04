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
	
	//lisy ��ס�û����� start	
	String cookieUName = "";
	String cookieUPwd = "";
	String cookieMemoryPwd ="";
	String cookieLastlogin ="";
	int cookienum=0;	
	if (request.getCookies()!=null)
	{
		Cookie cookies[]=request.getCookies(); 		
		for(int i=0;i<cookies.length;i++){ 
			Cookie uCookie = cookies[i];		
			if (uCookie.getName().equals("jwMemoryPwd"))
				cookieMemoryPwd = uCookie.getValue();	
			if (uCookie.getName().equals("lastlogin"))
				cookieLastlogin = uCookie.getValue();						
		}
		for(int i=0;i<cookies.length;i++){ 
			Cookie uCookie = cookies[i];
			
			if (uCookie.getName().substring(0,3).equals("jw_"))
			{						
				cookienum++;		
				if (uCookie.getName().substring(3).equals(cookieLastlogin))
				{
					cookieUName = uCookie.getName().substring(3);
					cookieUPwd = uCookie.getValue();
				}										
			}
		}
	}
	if (cookieMemoryPwd.equals("on"))
		cookieMemoryPwd = "checked";
	//lisy ��ס�û����� end	
%>


<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>${systemName}</title>
		<script type="text/javascript" src="../js/jquery1.6.2.js"></script>
		<style type="text/css">
		<!--
		body {
			margin: 0px auto;
			background:#CCCCCC;
			font-size:12px;
		}
		.white_12_24 {
			font-size: 12px;
			line-height: 24px;
			color: #FFFFFF;
		}
		-->
		</style>
	</head>

	<body>
<div style="position:absolute; top:50%; left:50%; margin:-280px 0 0 -502px; width:1003px; height:560px;">
<table width="1003" height="560" border="0" align="center" cellpadding="0" cellspacing="0" background="../images/login_bg.jpg">
  <tr>
    <td align="center" valign="top">
      <table width="68%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td align="right" class="white_12_24">
          <span onclick="this.style.behavior='url(#default#homepage)';this.setHomePage(window.location.href);" style="cursor: hand">��Ϊ��ҳ</span>
           | <span onclick="window.external.AddFavorite(window.location.href, '${systemName}')"  style="cursor: hand">�����ղ�</span></td>
        </tr>
      </table>
      <table width="100%" height="488" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td align="center" valign="top">
            <table width="80%" height="96" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td>&nbsp;</td>
              </tr>
            </table>
            
            <s:form id="loginForm" name="login" action="login" theme="simple" method="post">
            <table width="86%" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td>&nbsp;</td>
                <td align="right">
                  <table width="305" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td><img src="../images/login1.png" width="305" height="57" /></td>
                    </tr>
                  </table>
                  <table width="305" border="0" cellpadding="8" cellspacing="0" background="../images/login2.png">
                    <tr>
                      <td align="center">
		                  <table width="228" border="0" cellspacing="0" cellpadding="0">
		                    <tr>
		                      <td width="59" align="right">�ˡ��ţ�</td>
		                      <td width="169" align="left">
		                        <input type="text" name="userenm" id="userenm" onclick="displayDiv(<%=cookienum %>,'${canMemoryPwd}','<%=cookieMemoryPwd %>')" value="<%=cookieUName %>" autocomplete="off" 
		                        style="width:162px; height:24px; border:#b0afab 1px solid; line-height:24px;"/>
		                      </td>
		                    </tr>
		                  </table>
		                  <table width="228" height="14" border="0" cellpadding="0" cellspacing="0">
		                    <tr>
		                      <td>&nbsp;</td>
		                    </tr>
		                  </table>
		                  <table width="228" border="0" cellspacing="0" cellpadding="0">
		                    <tr>
		                      <td width="59" align="right">�ܡ��룺</td>
		                      <td width="169" align="left">
		                        <input type="password" name="pwd" id="pwd" value="<%=cookieUPwd %>" 
		                        <s:if test="canVerificationCode=='none'">
		                        onkeydown="var key = window.event.keyCode;if(key==13) document.login.submit();" 
		                        </s:if>
		                        style="width:162px; height:24px; border:#b0afab 1px solid; line-height:24px;"/>
		                      </td>
		                    </tr>
		                  </table>
		                  <table width="228" height="14" border="0" cellpadding="0" cellspacing="0" style="display:${canVerificationCode}">
		                    <tr>
		                      <td>&nbsp;</td>
		                    </tr>
		                  </table>
		                  <table width="228" border="0" cellspacing="0" cellpadding="0" style="display:${canVerificationCode}">
		                    <tr>
		                      <td width="59" align="right">��֤�룺</td>
		                      <td width="65" align="left">
		                        <input type="text" name="yzm" id="yzm" value="" 
		                        onkeydown="var key = window.event.keyCode;if(key==13) document.login.submit();" 
		                        style="width:50px; height:24px; border:#b0afab 1px solid; line-height:24px;"/>
		                      </td>
		                      <td width="104" align="left"><img src="rand.action" id="rand"/>&nbsp;
								<a href="javascript:changeValidateCode(document.login.rand)">������</a></td>
		                    </tr>
		                  </table>
		                  <table width="228" height="14" border="0" cellpadding="0" cellspacing="0" style="display:${canMemoryPwd}">
		                    <tr>
		                      <td>&nbsp;</td>
		                    </tr>
		                  </table>
		                  <table width="228" border="0" cellspacing="0" cellpadding="0" style="display:${canMemoryPwd}">
		                    <tr>
		                      <td width="59" align="right">&nbsp;</td>
		                      <td width="169" align="left">
		                        <input type="checkbox" name="IsMemoryPwd" id="IsMemoryPwd" <%=cookieMemoryPwd %> style="vertical-align:middle;" />
		                        ��ס����</td>
		                    </tr>
		                  </table>
		                  <table width="228" height="40" border="0" cellpadding="0" cellspacing="0">
		                    <tr>
		                      <td>&nbsp;</td>
		                    </tr>
		                  </table>
		                  <table width="228" border="0" cellpadding="0" cellspacing="0">
		                    <tr>
		                      <td align="center"><img src="../images/dl.gif" width="81" height="28"
		                       onclick="javascript:document.login.submit();" style="cursor: hand"/></td>
		                      <td align="center"><img src="../images/cz.gif" width="82" height="28" onclick="alert(window.location.href)" /></td>
		                    </tr>
		                  </table>
						</td>
              		  </tr>
            	   </table>
            	   <table width="305" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td><img src="../images/login3.png" width="305" height="28" /></td>
                    </tr>
                  </table>
                </td>
              </tr>
            </table>
            </s:form>
            
          </td>
        </tr>
      </table>
      <table width="80%" height="44" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td align="center">����֧�� ����������Ϣ��ҵ���޹�˾</td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</div>
	
<div id="usrlist" style="BACKGROUND-COLOR:transparent;background-color:#FFFFFF;position:absolute;left:82px;top:25px;overflow-x:hidden;overflow-y:auto;height:100px;width:136px;z-index:2000;display:none">
		<table id="usrtbl">
		<%
		if (request.getCookies()!=null)
		{
			Cookie cookies[]=request.getCookies(); 		
			for(int i=0;i<cookies.length;i++){ 
				Cookie uCookie = cookies[i]; 	
				if (uCookie.getName().substring(0,3).equals("jw_"))
				{
					String listUName = uCookie.getName().substring(3);
					String listUPwd = uCookie.getValue();	
		%>
		<tr style="cursor:hand"><td onmouseenter="style.backgroundColor='#cccccc'" onmouseout="style.backgroundColor='#FFFFFF'" onclick="getValue('<%=listUName %>','<%=listUPwd %>')"><%=listUName %></td></tr>
		<% 						
				}						
			}
		}
		 %>
		</table>
</div>
		
<script type="text/javascript">
	function getValue(a,b){
		$("#userenm").val(a);
		$("#pwd").val(b);
		hiddenDiv();
	}
function hiddenDiv(){
	if ($("#usrlist").css("display")=="block")
		document.getElementById("usrlist").style.display="none";
}
function displayDiv(num,canMemoryPwd,IsMemoryPwd){
	if (num>1 && canMemoryPwd=="block" && IsMemoryPwd!=null)
	{
		y = $("#userenm").offset().top;   
	    x = $("#userenm").offset().left;   
	    h = $("#userenm").height();   
	    w = $("#userenm").width();   
	
	    $("#usrlist").css("left", x+"px");
	    $("#usrlist").css("top", (y+h+6)+"px");
	    $("#usrlist").width(w);
	                
	    $("#usrtbl").width(w);
	              
		document.getElementById("usrlist").style.display="block";
	}
}

$(document).ready(function(){
 $(document).click(function(event){   
   var id=$("*:focus").attr("id");   
   if (id!="userenm")  
   	hiddenDiv();
  });
 });
 
function changeValidateCode(obj) {
	           //��ȡ��ǰ��ʱ����Ϊ�������޾�������   
	        var timenow = new Date().getTime();   
	           //ÿ��������Ҫһ����ͬ�Ĳ�����������ܻ᷵��ͬ������֤��   
	        //���������Ļ�������й�ϵ��Ҳ���԰�ҳ������Ϊ�����棬�����Ͳ�����������ˡ�   
	        obj.src="rand.action?d="+timenow;   
	    } 
	    
var state="${state}";
if(state=="1"){
	alert("��֤�����");
	document.getElementById("yzm").focus();
}else if(state=="2"){
	document.getElementById("userenm").value="";
	document.getElementById("pwd").value="";
	alert("�û��������������");
	document.getElementById("userenm").focus();
}  
else if(state=="3"){
	document.getElementById("userenm").value="";
	document.getElementById("pwd").value="";
	alert("���û������������ص��½��ϵͳ������һ���˻�����½");
	document.getElementById("userenm").focus();
} 
else if(state=="4"){
	document.getElementById("userenm").value="";
	document.getElementById("pwd").value="";
	alert("��¼ip���������¼�б���");
	document.getElementById("userenm").focus();
} 
else if(state=="5"){
	document.getElementById("userenm").value="";
	document.getElementById("pwd").value="";
	alert("������������󣬽�ֹ��¼");
	document.getElementById("userenm").focus();
}
</script>

	</body>
</html>
