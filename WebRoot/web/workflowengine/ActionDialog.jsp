<%@ page contentType="text/html;charset=GBK"%>
<%@ page language="java" pageEncoding="GBK"%>
<HTML xmlns:stedysoft>
	<HEAD>
		<title>�������û���</title>
		<META NAME="Author" CONTENT="JinWang">
		<META NAME="Keywords" CONTENT="JMOWebFlowBuilder">
		<link rel="stylesheet" type="text/css" href="../../css/flow/style.css">
		<link rel="stylesheet" type="text/css"
			href="../../js/flow/webTab/webtab.css">
		<script language=jscript src="../../js/flow/function.js"></script>
		<script language=jscript src="../../js/flow/webTab/webTab.js"></script>

		<style>
body {
	background-color: buttonface;
	scroll: no;
	margin: 7px, 0px, 0px, 7px;
	border: none;
	overflow: hidden;
}
</style>

		<SCRIPT LANGUAGE="JavaScript">
<!--
function iniWindow(){
   var opener = window.dialogArguments;
   var url = opener.dialogURL;
   var actionId = url.indexOf('?actionid=')<0?'':url.slice(url.indexOf('?actionid=')+10,url.length);
   
   try{
     
     var FlowXML = opener.document.all.FlowXML;		 

     if(FlowXML.value!=''){
	     iniActionDialog(FlowXML,actionId);
	 }else{
	     alert('��·�����ԶԻ���ʱ����');
		   window.close();
	 }	 
   }catch(e){
     alert('��·�����ԶԻ���ʱ����');
	   window.close();
   }   
}
function iniActionDialog(FlowXML,actionId){
   
   xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
   xmlDoc.async = false;
   xmlDoc.loadXML(FlowXML.value);
   
   var xmlRoot = xmlDoc.documentElement;
   var Actions = xmlRoot.getElementsByTagName("Actions").item(0);
   var fromStep = '',toStep = '',nexttacheStep = '',processpersonStep = '';
   for ( var i = 0;i < Actions.childNodes.length;i++ ){
      Action = Actions.childNodes.item(i);
	    id = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
	    if(id==actionId){
	      fromStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("from");
		    toStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("to");
		    
		    //�޸�·��ʱ��������
				document.all.ActionId.value = actionId;
				document.all.ActionId.disabled=true;
    		document.all.ActionText.value = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("text");
				setRadioGroupValue(document.all.ActionType,Action.getElementsByTagName("BaseProperties").item(0).getAttribute("actionType"));  
		
				document.all.StartArrow.value = Action.getElementsByTagName("VMLProperties").item(0).getAttribute("startArrow");
				document.all.EndArrow.value = Action.getElementsByTagName("VMLProperties").item(0).getAttribute("endArrow");
				document.all.StrokeWeight.value = Action.getElementsByTagName("VMLProperties").item(0).getAttribute("strokeWeight");
				document.all.txtSortNo.value = Action.getElementsByTagName("FlowProperties").item(0).getAttribute("SortNo");
				nexttacheStep = Action.getElementsByTagName("FlowProperties").item(0).getAttribute("nexttache");
                processpersonStep = Action.getElementsByTagName("FlowProperties").item(0).getAttribute("processperson");
				document.all.txtWorkCondition.value = Action.getElementsByTagName("FlowProperties").item(0).getAttribute("WorkCondition");
	  }
   }
   //����from��to steplist
   var Steps = xmlRoot.getElementsByTagName("Steps").item(0);
   var from = document.all.From;
   var to = document.all.To;
   
   addSelectOption(from,'��ѡ��...','',false);
   addSelectOption(to,'��ѡ��...','',false);

   var nexttache = document.all.NextTache;
   
   
   addSelectOption(nexttache,'��ѡ��...','',false);
   
   jsSelectItemByValue(document.getElementById("ProcessPerson"),processpersonStep);  
   
   function jsSelectItemByValue(objSelect,objItemText) {  
	   for(var i=0;i<objSelect.options.length;i++) {  
	       if(objSelect.options[i].value == objItemText) { 
	    	   
	             objSelect.options[i].selected = true;  
	                     break;  
           }  
       }  
   }  

  
   

   for ( var i = 0;i < Steps.childNodes.length;i++ ) {
      Step = Steps.childNodes.item(i);
	  id = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
	  text = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("text");

	  fromSelected = fromStep==id?true:false;
	  toSelected = toStep==id?true:false;
	  nexttacheSelected = nexttacheStep==id?true:false;
	  if(id!='end'&&id!='begin') addSelectOption(nexttache,text,id,nexttacheSelected);
	  if(id!='end') addSelectOption(from,text,id,fromSelected);
	  if(id!='begin') addSelectOption(to,text,id,toSelected);	  
   } 
}

function okOnClick(){
   var opener = window.dialogArguments;
   var url = opener.dialogURL;
   var actionId = url.indexOf('?actionid=')<0?'':url.slice(url.indexOf('?actionid=')+10,url.length);
   
   try{
     var FlowXML = opener.document.all.FlowXML;

	 xml = getActionXML(FlowXML,actionId);
	 if(xml!='') {
	   FlowXML.value = xml;
	   window.close();
	 }
   }catch(e){
     alert('�ر�·�����ԶԻ���ʱ����');
	   window.close();
   }   
}
function cancelOnClick(){
   window.close();
}
function applyOnClick(){
   var opener = window.dialogArguments;
   var url = opener.dialogURL;
   var actionId = url.indexOf('?actionid=')<0?'':url.slice(url.indexOf('?actionid=')+10,url.length);

   try{
     var FlowXML = opener.document.all.FlowXML;

	 xml = getActionXML(FlowXML,actionId);
	 if(xml!='') {
	   FlowXML.value = xml;
	   btnApply.disabled=true;
	 }
   }catch(e){
     alert('Ӧ��·������ʱ����');
	   window.close();
   }
}

function getActionXML(FlowXML,actionId){
  id = document.all.ActionId.value;
  text = document.all.ActionText.value;
  actionType = getRadioGroupValue(document.all.ActionType);  
  from = getSelectValue(document.all.From);
  to = getSelectValue(document.all.To);
  if(id=='') {alert('������д·�ɱ�ţ�');return '';}
  if(text=='') {alert('������д·�����ƣ�');return '';}
  if(from=='' || to=='') {alert('����ѡ����ʼ���ں�Ŀ�Ļ��ڣ�');return '';}

  startArrow = document.all.StartArrow.value;
  endArrow = document.all.EndArrow.value;
  strokeWeight = document.all.StrokeWeight.value;
  
  ls_SortNo = document.all.txtSortNo.value;
  nexttache = getSelectValue(document.all.NextTache);
  processperson = getSelectValue(document.all.ProcessPerson);
  ls_WorkCondition = document.all.txtWorkCondition.value;
  
  //��ʼ������Ŀ�Ļ���һ��������ѡ��ֱ��
  if ((from==to) && (actionType=='Line'))
  {
  	alert('��ʼ���ں�Ŀ�Ļ���һ��ʱ������ѡ��ֱ�ߣ�');
  	return '';
  }
  
 
  var xml = ""; 
  //���ɲ���xml
  xml+= '<Action><BaseProperties id="'+id+'" text="'+text+'" actionType="'+actionType+'" from="'+from+'" to="'+to+'" />';
  xml+= '<VMLProperties startArrow="'+startArrow+'" endArrow="'+endArrow+'" strokeWeight="'+strokeWeight+'" zIndex="" />';
  //xml+= '<FlowProperties /></Action>';
  xml+= '<FlowProperties SortNo="'+ls_SortNo+'" nexttache="'+nexttache+'" processperson="'+processperson+'" WorkCondition="'+ls_WorkCondition+'"/>';
  xml+= '</Action>';
  var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
  xmlDoc.async = false;
  xmlDoc.loadXML(FlowXML.value);
  var xmlRoot = xmlDoc.documentElement;
  var Actions = xmlRoot.getElementsByTagName("Actions").item(0);
  
  //�ж�����·��ʱ����·���Ƿ��Ѵ���
  
  
 
  	for ( var i = 0;i < Actions.childNodes.length;i++ ) {
  		Action = Actions.childNodes.item(i);
  		l_tempactionid = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
  		l_tempfromStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("from");
		  l_temptoStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("to");
		  
		  if (actionId=='')
		  {
		  	//����·��
		  	if ((from==l_tempfromStep) && (to==l_temptoStep))
		  	{
		  		alert('��������·���Ѵ��ڣ������¶��壡');
  				return '';
		  	}
			}
			else
			{
				//�޸�·��ʱ�����ܰѿ�ʼ·�ɡ�Ŀ��·�������޸�
				if (l_tempactionid!=actionId)
				{
					//����ԭ����·��
					if ((from==l_tempfromStep) && (to==l_temptoStep))
		  		{
		  			alert('��·���Ѵ��ڣ������¶��壡');
  					return '';
		  		}
				}
				
				
			}
  		
  	}
  
  

  //��ӣ����ұ�ų�ͻ��Id
  //�޸ģ�����ԭ����Id  
  for ( var i = 0;i < Actions.childNodes.length;i++ ) {
      Action = Actions.childNodes.item(i);
	  lId = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("id");

	  if(lId==id && actionId=='') {
	    alert('��·�ɱ���Ѵ��ڣ����������룡');return '';
	  }
	  if(lId==actionId && actionId!='') {
	    Actions.removeChild(Action);break;
	  }	  
  }

  var xmlDoc2 = new ActiveXObject('MSXML2.DOMDocument');
  xmlDoc2.async = false;
  xmlDoc2.loadXML(xml);     
  Actions.appendChild(xmlDoc2.documentElement); 
  
  return xmlRoot.xml;
}
//-->
</SCRIPT>

	</HEAD>

	<BODY onload='iniWindow()' onunload=''>
		<table border="0" cellpadding="0" cellspacing="0" height=385px>
			<thead>
				<tr id="WebTab">
					<td class="selectedtab" id="tab1" onmouseover="hoverTab('tab1')"
						onclick="switchTab('tab1', 'contents1');">
						<span id=tabpage1>��������</span>
					</td>
					<td class="tabspacer" width=340>
						&nbsp;
					</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td id="contentscell" colspan="5">
						<!-- Tab Page 1 Content Begin -->
						<div class="selectedcontents" id="contents1">
							<TABLE border=0 width="100%" height="100%">
								<TR valign=top>
									<TD></TD>
									<TD width="100%" valign=top>
										<Fieldset style="border: 1px solid #C0C0C0;">
											<LEGEND align=left style="font-size: 9pt;">
												&nbsp;
												<span id=tabpage1_1>��������</span>&nbsp;
											</LEGEND>
											<TABLE border=0 width="100%" height="100%"
												style="font-size: 9pt;">
												<TR valign=middle>
													<TD width=5></TD>
													<TD width=70>
														<span id=tabpage1_2>·�ɱ��</span>
													</TD>
													<TD>
														<INPUT TYPE="text" NAME="ActionId" value="newaction"
															class=txtput>
													</TD>
													<TD></TD>
												</TR>
												<TR valign=middle>
													<TD></TD>
													<TD>
														<span id=tabpage1_3>·������</span>
													</TD>
													<TD>
														<INPUT TYPE="text" NAME="ActionText" value="" class=txtput>
													</TD>
													<TD></TD>
												</TR>
												<TR valign=middle>
													<TD></TD>
													<TD>
														<span id=tabpage1_7>��ʼ����</span>
													</TD>
													<TD>
														<SELECT NAME="From" class=txtput></SELECT>
													</TD>
													<TD></TD>
												</TR>
												<TR valign=middle>
													<TD></TD>
													<TD>
														<span id=tabpage1_8>Ŀ�Ļ���</span>
													</TD>
													<TD>
														<SELECT NAME="To" class=txtput></SELECT>
													</TD>
													<TD></TD>
												</TR>
												<TR valign=middle>
													<TD></TD>
													<TD>
														<span id=tabpage1_9>�� �� ��</span>
													</TD>
													<TD>
														<INPUT TYPE="text" NAME="txtSortNo" value="" class=txtput>
													</TD>
													<TD></TD>
												</TR>
												<TR valign=middle>
                                                    <TD></TD>
                                                    <TD>
                                                        <span id=tabpage1_10>ѡ�񻷽�</span>
                                                    </TD>
                                                    <TD>
                                                        <SELECT NAME="NextTache" class=txtput></SELECT>
                                                    </TD>
                                                    <TD></TD>
                                                </TR>
                                                <TR valign=middle>
                                                    <TD></TD>
                                                    <TD>
                                                        <span id=tabpage1_11>���������</span>
                                                    </TD>
                                                    <TD>
                                                        <SELECT id="ProcessPerson" NAME="ProcessPerson" class=txtput>
	                                                        <option value="0">��ѡ��...</option>  
									                        <option value="1">�Ǽ���</option>  
									                        <option value="2">���Ҹ�����</option>  
									                        <option value="3">���ŷֹ��쵼</option> 
									                         <option value="4">ָ����Ա</option>  
                                                        </SELECT>
                                                    </TD>
                                                    <TD></TD>
                                                </TR>
												<TR valign=middle>
													<TD></TD>
													<TD>
														<span id=tabpage1_13>��ת����<br>" and "��ʾ�룬" or
															"��ʾ�򣨶���Сд�������пո�</span>
													</TD>
													<TD>
														<textarea name="txtWorkCondition" style="height: 80px"
															value="" class=txtput></textarea>
													</TD>
													<TD></TD>
												</TR>
												<TR valign=top>
													<TD></TD>
													<TD>
														<span id=tabpage2_5>�߶�����</span>
													</TD>
													<TD>
														<FONT style="font-size: 10pt;" COLOR="#919CD0"><INPUT
																TYPE="radio" NAME="ActionType" value="PolyLine" checked><span
															id=tabpage2_6>����</span>&nbsp;<INPUT TYPE="radio"
																NAME="ActionType" value="Line"><span
															id=tabpage2_7>ֱ��</span>&nbsp;</FONT>
													</TD>
													<TD></TD>
												</TR>
												<TR height="3">
													<TD></TD>
													<TD></TD>
													<TD></TD>
													<TD></TD>
												</TR>
											</TABLE>
										</Fieldset>
									</TD>
									<TD>
										&nbsp;
									</TD>
								</TR>

								<TR height="100%">
									<TD></TD>
									<TD></TD>
									<TD></TD>
								</TR>
							</TABLE>
						</div>
						<!-- Tab Page 1 Content End -->

						<!-- Tab Page 2 Content Begin -->
						<div class="contents" id="contents2">
							<TABLE border=0 width="100%" height="100%">
								<TR valign=top>
									<TD></TD>
									<TD width="100%" valign=top>
										<Fieldset style="border: 1px solid #C0C0C0;">
											<LEGEND align=left style="font-size: 9pt;">
												&nbsp;
												<span id=tabpage2_1>·����ʽ</span>&nbsp;
											</LEGEND>
											<TABLE border=0 width="100%" height="100%"
												style="font-size: 9pt;">
												<TR valign=top>
													<TD width=5></TD>
													<TD>
														<span id=tabpage2_2>��ʼ��ͷ</span>&nbsp;&nbsp;
														<INPUT TYPE="text" NAME="StartArrow" value="" class=txtput>
													</TD>
													<TD></TD>
												</TR>
												<TR valign=top>
													<TD width=5></TD>
													<TD>
														<span id=tabpage2_3>������ͷ</span>&nbsp;&nbsp;
														<INPUT TYPE="text" NAME="EndArrow" value="Classic"
															class=txtput>
													</TD>
													<TD></TD>
												</TR>
												<TR valign=top>
													<TD></TD>
													<TD>
														<span id=tabpage2_4>������ϸ</span>&nbsp;&nbsp;
														<INPUT TYPE="text" NAME="StrokeWeight" value=""
															class=txtput>
													</TD>
													<TD></TD>
												</TR>
												<TR height="3">
													<TD></TD>
													<TD></TD>
													<TD></TD>
												</TR>
											</TABLE>
										</Fieldset>
									</TD>
									<TD>
										&nbsp;
									</TD>
								</TR>

								<TR height="100%">
									<TD></TD>
									<TD></TD>
									<TD></TD>
								</TR>
							</TABLE>
						</div>
						<!-- Tab Page 2 Content End -->

						<!-- Tab Page 3 Content Begin -->
						<div class="contents" id="contents3">
							<TABLE width="100%" height="100%" style="font-size: 10pt;">
								<TR>
									<TD></TD>
								</TR>
							</TABLE>
						</div>
						<!-- Tab Page 3 Content End -->

					</td>
				</tr>
			</tbody>
		</table>

		<table cellspacing="1" cellpadding="0" border="0"
			style="position: absolute; top: 400px; left: 0px;">
			<tr>
				<td width="100%"></td>
				<td>
					<input type=button id="btnOk" class=btn value="ȷ ��"
						onclick="jscript: okOnClick();">
					&nbsp;&nbsp;&nbsp;
				</td>
				<td>
					<input type=button id="btnCancel" class=btn value="ȡ ��"
						onclick="jscript: cancelOnClick();">
					&nbsp;&nbsp;&nbsp;
				</td>
				<td>
					<input type=button id="btnApply" class=btn value="Ӧ ��"
						onclick="jscript: applyOnClick();">
					&nbsp;&nbsp;&nbsp;
				</td>
			</tr>
		</table>
	</BODY>
</HTML>
