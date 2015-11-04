
<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
%>
<%@ taglib prefix="jtag" uri="/tld/jtag"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String xmlstart="<graph chartTopMargin='5' chartBottomMargin='15' chartLeftMargin='0' formatNumberScale='0' formatNumber='0' baseFontSize='12' >";
	String xmlend="";
	xmlend += "></graph>";
%>
<html>
	<head>
		<jtag:jhead />
		 <script language="JavaScript" src='../../js/fusioncharts/FusionCharts.js '></script>
	</head>
	<body>

		<table width="100%" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#FFFFFF">
			<tr>
				<td align="center" valign="top">
				aa
					<div id="aaaa"
				style="width: 400px; height: 100%; margin: 0 auto;">
											</div>
				</td>
			</tr>
			
				<tr>
				<td align="center" valign="top">
			
					<input id="cc" value="01">  
				</td>
			</tr>
		</table>

	</body>
	<SCRIPT type="text/javascript">
	$(function() {
		
		$('#cc').combotree({   
		    url: 'get_data.php',   
		    required: true  
		});  
		
		
		
		var strURL = "Charts_loginLogWichDep_ajax.action?random="+Math.random();
			//var strURL = "fixedassetmanagement/FixedAssets_everyImportAmountImage2.action"
				$.ajax( {
					type : "GET",
					url : strURL,
					success : function(msg) {
						//$("#detailedChart3").show().html(msg);
						drawchart(msg.factoryDetailsBean.xml,msg.factoryDetailsBean.filename,"aaaa",msg.factoryDetailsBean.height,msg.factoryDetailsBean.width);
						
					}
				}); 
	});
	
	function drawchart(xml,charType,detailedChart,height,width)
		{
			var chart = new FusionCharts("../../FusionCharts/"+charType, "ChartId",width,height, "0", "0");		   			
			chart.setDataXML(xml);
			chart.render('aaaa');
		}
	
</SCRIPT>
</html>


