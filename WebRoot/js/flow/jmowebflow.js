//**************************************************************************************
//**************************************************************************************

function newFlow(){
	if(document.all.FlowXML.value!='') {
	   if(!confirm('����������̣�������������')) return;
	}
	workFlowDialog(null,null,'Flow');	
}
function newStep(){
	if(document.all.FlowXML.value=='') {
	   alert('���ȴ��������̣�');
	   return;
	}
	
	var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
    xmlDoc.async = false;
    xmlDoc.loadXML(document.all.FlowXML.value);
    var xmlRoot = xmlDoc.documentElement;
    var Flow = xmlRoot.getElementsByTagName("FlowConfig").item(0);
	
	workFlowDialog(Flow.getElementsByTagName("BaseProperties").item(0).getAttribute("flowId"),null,'NormalStep');
}
function newAction(){
	if(document.all.FlowXML.value=='') {
	   alert('���ȴ��������̣�');
	   return;
	}
	
	workFlowDialog(null,null,'Action');
}
function editFlow(){
	if(document.all.FlowXML.value=='') {
	   alert('���ȴ��������̣�');
	   return;
	}
	var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
    xmlDoc.async = false;
    xmlDoc.loadXML(document.all.FlowXML.value);
    var xmlRoot = xmlDoc.documentElement;
    var Flow = xmlRoot.getElementsByTagName("FlowConfig").item(0);

	workFlowDialog(Flow.getElementsByTagName("BaseProperties").item(0).getAttribute("flowId"),null,'Flow');
}
function editStep(stepId,stepType){
	var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
    xmlDoc.async = false;
    xmlDoc.loadXML(document.all.FlowXML.value);
    var xmlRoot = xmlDoc.documentElement;
    var Flow = xmlRoot.getElementsByTagName("FlowConfig").item(0);
	workFlowDialog(Flow.getElementsByTagName("BaseProperties").item(0).getAttribute("flowId"),stepId,stepType);
}
function editAction(actionId){
	var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
    xmlDoc.async = false;
    xmlDoc.loadXML(document.all.FlowXML.value);
    var xmlRoot = xmlDoc.documentElement;
    var Flow = xmlRoot.getElementsByTagName("FlowConfig").item(0);
	workFlowDialog(Flow.getElementsByTagName("BaseProperties").item(0).getAttribute("flowId"),actionId,'Action');
}
function delFlow(){
	clearVML();
	clearXML();
}
function delStep(stepId){
	removeXMLNode(stepId);

	FOCUSEDOBJID = '';
	FOCUSEDOBJTYPE = '';
}
function delAction(actionId){
    removeXMLNode(actionId);

	FOCUSEDOBJID = '';
	FOCUSEDOBJTYPE = '';
}

var CONST_LAY_LOWEST = '0';
var CONST_LAY_LOWER = '10';
var CONST_LAY_MIDDLE = '20';
var CONST_LAY_TOPPER = '30';
var CONST_LAY_TOPPEST = '40';

var AUTODRAW = true;
var FOCUSEDOBJID = '';
var FOCUSEDOBJTYPE = '';

function setFocusedObjLay(xmlRoot,oldObjId,newObjId,objType,newLay){
   var Steps = xmlRoot.getElementsByTagName("Steps").item(0);
   var Actions = xmlRoot.getElementsByTagName("Actions").item(0);
	     
   if(objType=='Action'){
	   for ( var i = 0;i < Actions.childNodes.length;i++ ) {
		   Action = Actions.childNodes.item(i);
		   aId = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("id"); 
		   if(aId == newObjId){			  
			  document.getElementById(newObjId).style.zIndex = newLay;
			  Action.getElementsByTagName("VMLProperties").item(0).setAttribute("zIndex",newLay);
		   }
	   }   	
       
   }else{
	   if(oldObjId!='' && newObjId!='' && newObjId!=oldObjId){
		   var fromStep = document.getElementById(oldObjId);
		   var toStep = document.getElementById(newObjId);

		   var fromStepWidth = parseInt(fromStep.style.width);
		   var fromStepHeight = parseInt(fromStep.style.height);
		   var fromStepX = parseInt(fromStep.style.left);
		   var fromStepY = parseInt(fromStep.style.top);

		   var toStepWidth = parseInt(toStep.style.width);
		   var toStepHeight = parseInt(toStep.style.height);	   
		   var toStepX = parseInt(toStep.style.left);
		   var toStepY = parseInt(toStep.style.top);

		   var flag = ifRepeatStep(fromStepX,fromStepY,fromStepWidth,fromStepHeight,toStepX,toStepY,toStepWidth,toStepHeight);
	   }else{
		   var flag = false;
	   }

	   for ( var i = 0;i < Steps.childNodes.length;i++ ) {
		   Step = Steps.childNodes.item(i);
		   sId = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
		   if(newObjId == sId){
			  document.getElementById(sId).style.zIndex = newLay;
			  Step.getElementsByTagName("VMLProperties").item(0).setAttribute("zIndex",newLay);			  
		   }

		   if(oldObjId == sId && flag){ //�����ԭ���Ľ��㲽�������ԭ���Ĳ����������
			  document.getElementById(oldObjId).style.zIndex = parseInt(newLay)-10;
			  Step.getElementsByTagName("VMLProperties").item(0).setAttribute("zIndex",parseInt(newLay)-1);	   
		   }
	   }
	   
	   for ( var i = 0;i < Actions.childNodes.length;i++ ) {
		   Action = Actions.childNodes.item(i);
		   aId = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("id"); 
		   fromStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("from");
		   toStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("to");
		   if(fromStep == newObjId || toStep == newObjId){			  
			  document.getElementById(aId).style.zIndex = newLay;
			  Action.getElementsByTagName("VMLProperties").item(0).setAttribute("zIndex",newLay);
		   }else{
			  document.getElementById(aId).style.zIndex = CONST_LAY_MIDDLE;
			  Action.getElementsByTagName("VMLProperties").item(0).setAttribute("zIndex",parseInt(newLay)-1);
		   }	
	   }   		   
   } 

   return xmlRoot;
}
function objFocusedOn(objId,type){
   var FlowXML = document.all.FlowXML;
   if(FlowXML.value!=''){
	   var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
       xmlDoc.async = false;
       xmlDoc.loadXML(FlowXML.value);
   
       var xmlRoot = xmlDoc.documentElement;
	   var Flow = xmlRoot.getElementsByTagName("FlowConfig").item(0);
	   
	   if(type=='Action'){
		   focusedOnColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("actionFocusedStrokeColor");		   
	   }else{
		   focusedOnColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("stepFocusedStrokeColor");			   
	   }  
	   xmlRoot = setFocusedObjLay(xmlRoot,FOCUSEDOBJID,objId,type,CONST_LAY_TOPPEST);AUTODRAW = false;FlowXML.value = xmlRoot.xml;AUTODRAW = true;
	   document.getElementById(objId).style.zIndex = CONST_LAY_TOPPEST;
	   document.getElementById(objId).StrokeColor = focusedOnColor;

	   if(FOCUSEDOBJID == objId && MOVEFLAG) return;
	   objFocusedOff();
	   FOCUSEDOBJID = objId;
	   FOCUSEDOBJTYPE = type;
   }
}
function objFocusedOff(){   

   if(FOCUSEDOBJID=='') return; 

   var FlowXML = document.all.FlowXML;
   if(FlowXML.value!=''){
	   var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
       xmlDoc.async = false;
       xmlDoc.loadXML(FlowXML.value);
   
       var xmlRoot = xmlDoc.documentElement;
	   var Flow = xmlRoot.getElementsByTagName("FlowConfig").item(0);	  
	   
	   if(FOCUSEDOBJTYPE == 'Action'){
		   focusedOffColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("actionStrokeColor");
	   }else{
		   if(FOCUSEDOBJTYPE == 'BeginStep' || FOCUSEDOBJTYPE == 'EndStep'){
			   focusedOffColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("sStepStrokeColor");
		   }else{
			   focusedOffColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("stepStrokeColor");
		   }
	   }
	    
	   eval('document.all.'+FOCUSEDOBJID+'.StrokeColor="'+focusedOffColor+'"'); 
	   FOCUSEDOBJID = '';
	   FOCUSEDOBJTYPE = '';
   }
}

function moveStep(moveId){	
	dragIt(moveId,"FlowVML");
}

function redrawVML(){
   var FlowXML = document.all.FlowXML;
   var FlowVML = document.all.FlowVML;
   if(FlowXML.value!=''){
	   var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
     xmlDoc.async = false;
     xmlDoc.loadXML(FlowXML.value);
   
     var xmlRoot = xmlDoc.documentElement;
	   var Flow = xmlRoot.getElementsByTagName("FlowConfig").item(0);       
	   var Steps = xmlRoot.getElementsByTagName("Steps").item(0);
     var Actions = xmlRoot.getElementsByTagName("Actions").item(0);

	   var StepColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("stepStrokeColor");
	   var StepTextColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("stepTextColor");
	   var ActionColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("actionStrokeColor");
	   var sStepColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("sStepStrokeColor");
	   var sStepTextColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("sStepTextColor");	
	   var StepShadowColor = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("stepShadowColor");
	   var IsStepShadow = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("isStepShadow");
	   var StepColor1 = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("stepColor1");
	   var StepColor2 = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("stepColor2");
	   var IsStep3D = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("isStep3D");
	   var Step3DDepth = Flow.getElementsByTagName("VMLProperties").item(0).getAttribute("step3DDepth");
     
     var vmlHTML = '';
	   //draw steps
	   var nIndex,nId,nText,nType,nIsFocused,nTextColor,nStrokeColor,nShadowColor,nIsShadow,nWidth,nHeight,nX,nY,nStrokeWeight,nTextWeight,nColor1,nColor2,nIs3D,n3DDepth;
	   for ( var i = 0;i < Steps.childNodes.length;i++ )
	   {
		   Step = Steps.childNodes.item(i);
		   nId = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
		   nText = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("text");
		   nType = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("stepType");
		   nIndex = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("zIndex");if(nIndex=='') nIndex = CONST_LAY_LOWEST;
		   if(nType=='BeginStep' || nType=='EndStep'){
		   	 //��ʼ����������
			   nTextColor = sStepTextColor;
		     nStrokeColor = sStepColor;	
		   }else{
			   nTextColor = StepTextColor;
			   nStrokeColor = StepColor;
		   }
		   nShadowColor = StepShadowColor;
		   nIsShadow = IsStepShadow;
		   nWidth = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("width");
		   nHeight = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("height");
		   nX = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("x");
		   nY = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("y");
		   nStrokeWeight = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("strokeWeight");
		   nTextWeight = Step.getElementsByTagName("VMLProperties").item(0).getAttribute("textWeight");
		   nColor1 = StepColor1;
		   nColor2 = StepColor2;
		   nIs3D = IsStep3D;
		   n3DDepth = Step3DDepth;

		   vmlHTML+= getStepHTML(nType,nIndex,nId,nText,nTextColor,nStrokeColor,nShadowColor,nIsShadow,nWidth,nHeight,nX,nY,nStrokeWeight,nTextWeight,nColor1,nColor2,nIs3D,n3DDepth);
	   } 
	   clearVML();
	   drawObject(vmlHTML);
	   vmlHTML = '';
	   
	   //draw actions
	   var removeFlag = false;
	   var lIndex,lId,lText,lType,lIsFocused,lFromStep,lToStep,lStrokeColor,lStrokeWeight,lStartArrow,lEndArrow;
	   for ( var i = 0;i < Actions.childNodes.length;i++ )
	   {
		   Action = Actions.childNodes.item(i);
		   lId = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
		   lText = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("text");
		   lType = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("actionType");
		   lIndex = Action.getElementsByTagName("VMLProperties").item(0).getAttribute("zIndex");if(lIndex=='') lIndex = CONST_LAY_LOWER;
		   lFromStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("from");
		   lToStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("to");	
		   lStartArrow = Action.getElementsByTagName("VMLProperties").item(0).getAttribute("startArrow");
		   lEndArrow = Action.getElementsByTagName("VMLProperties").item(0).getAttribute("endArrow");	
		   lStrokeWeight = Action.getElementsByTagName("VMLProperties").item(0).getAttribute("strokeWeight");
		   lStrokeColor = ActionColor;
		   
		   result = getActionHTML(lType,lIndex,lId,lText,document.getElementById(lFromStep),document.getElementById(lToStep),lStrokeColor,lStrokeWeight,lStartArrow,lEndArrow)
		   
		   if(result!='') {
			   vmlHTML+= result;
		   }else{
			   Actions.removeChild(Action);
			   removeFlag = true;
		   }
	   } 

       drawObject(vmlHTML);
	   if(removeFlag) FlowXML.value = xmlRoot.xml;
   }
}
function clearXML(){
   var FlowXML = document.all.FlowXML;
   AUTODRAW = false;
   FlowXML.value = '';
}
function clearVML(){
   var FlowVML = document.all.FlowVML;
   FlowVML.innerHTML = '';
   
   FOCUSEDOBJID = '';
   FOCUSEDOBJTYPE = '';
}
function drawObject(ObjHTML){
   var FlowVML = document.all.FlowVML;
   FlowVML.innerHTML+= ObjHTML;
}
function removeXMLNode(objId){
   var FlowXML = document.all.FlowXML;
   if(FlowXML.value!=''){
	   xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
     xmlDoc.async = false;
     xmlDoc.loadXML(FlowXML.value);
   
     var xmlRoot = xmlDoc.documentElement;
	   var Steps = xmlRoot.getElementsByTagName("Steps").item(0);
     var Actions = xmlRoot.getElementsByTagName("Actions").item(0);
	   
	   var findFlag = false;
	   for ( var i = 0;i < Steps.childNodes.length;i++ )
	   {
		   Step = Steps.childNodes.item(i);
		   id = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
		   if(id==objId) {
		   	 //ɾ������
			   Steps.removeChild(Step);
			   //ͬʱҪɾ���û�����ص�����·��
			   for (var j = Actions.childNodes.length-1;j>=0 ;j--)
			   {
			   	 Action = Actions.childNodes.item(j);
			   	 lid = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
			   	 lFromStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("from");
		 			 lToStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("to");
		 			 if ((lFromStep==objId)||(lToStep==objId))
		 			 {
		 			 	 //��ص�·�ɣ���ɾ����·��
		 			 	 Actions.removeChild(Action);
		 			 }
			   	 
			   }
			   
			   findFlag = true;break;
		   }
	   }
	   if (!findFlag) {
	     for ( var i = 0;i < Actions.childNodes.length;i++ ){
		   Action = Actions.childNodes.item(i);
		   id = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
		   if(id==objId) {
			   Actions.removeChild(Action);
			   findFlag = true;break;
		   }
	     }
	   }

	   if (findFlag) {AUTODRAW = true;FlowXML.value = xmlRoot.xml;}
   }
}
function getStepHTML(stepType,z_index,id,text,textColor,strokeColor,shadowColor,isShadow,width,height,X,Y,strokeWeight,textWeight,color1,color2,is3D,step3DDepth){
   var stepHTML = '';
   var styleHTML = 'id='+id+' title="'+id+'" style="z-index:'+z_index+';position:absolute;width:'+width+';height:'+height+';left:'+X+';top:'+Y+';" strokecolor="'+strokeColor+'" strokeweight="'+strokeWeight+'" onmouseover=\'this.style.cursor="hand";\' onmousedown=\'cleancontextMenu();objFocusedOn(this.id,"'+stepType+'");moveStep(this);\' oncontextmenu=\'objFocusedOn(this.id,"'+stepType+'");stepContextMenu("'+id+'","'+stepType+'");return false;\' ondblclick=\'if ((id=="begin")||(id=="end")){return false;} objFocusedOn(this.id,"'+stepType+'");editStep("'+id+'","'+stepType+'");return false;\'';
   var textStyleHTML = 'style="text-align:center; color:'+textColor+'; font-size:'+textWeight+';"';
   var shadowHTML = '<v:shadow on="'+isShadow+'" type="single" color="'+shadowColor+'" offset="5px,5px"/>';
   var gradientHTML = '<v:fill type="gradient" color="'+color1+'" color2="'+color2+'" />';
   var step3DHTML = '<v:extrusion on="'+is3D+'" backdepth="'+step3DDepth+'" />';

   if(stepType=='BeginStep' || stepType=='EndStep'){
	   stepHTML = '<v:Oval '+styleHTML+'>'+shadowHTML+step3DHTML+gradientHTML+'<v:TextBox inset="6pt,10pt,6pt,10pt" '+textStyleHTML+'>'+text+'</v:TextBox></v:Oval>';
   }else{
	   stepHTML = '<v:RoundRect '+styleHTML+'>'+shadowHTML+step3DHTML+gradientHTML+'<v:TextBox inset="2pt,5pt,2pt,5pt" '+textStyleHTML+'>'+text+'</v:TextBox></v:RoundRect>';
   }

   return stepHTML;
}
function getActionHTML(actionType,z_index,id,actionText,fromStep,toStep,strokeColor,strokeWeight,startArrow,endArrow){
   var actionHTML = '';

   if(actionType == 'Line'){
      actionHTML = '<v:line id='+id+' title="'+id+'" style="z-index:'+z_index+';position:absolute;" '+getActionPoints(actionType,fromStep,toStep)+' strokecolor="'+strokeColor+'" strokeweight="'+strokeWeight+'" onmousedown=\'cleancontextMenu();objFocusedOn(this.id,"Action");\' oncontextmenu=\'objFocusedOn(this.id,"Action");actionContextMenu("'+id+'");return false;\'><v:stroke StartArrow="'+startArrow+'" EndArrow="'+endArrow+'"/></v:line>';
   }else{
      actionHTML = '<v:PolyLine id='+id+' title="'+id+'" filled="false" Points="'+getActionPoints(actionType,fromStep,toStep)+'" style="z-index:'+z_index+';position:absolute;" strokecolor="'+strokeColor+'" strokeweight="'+strokeWeight+'" onmousedown=\'cleancontextMenu();objFocusedOn(this.id,"Action");\' oncontextmenu=\'objFocusedOn(this.id,"Action");actionContextMenu("'+id+'");return false;\'><v:stroke StartArrow="'+startArrow+'" EndArrow="'+endArrow+'"/></v:PolyLine>';
   }

   return actionHTML;
}
function ifRepeatStep(fromStepX,fromStepY,fromStepWidth,fromStepHeight,toStepX,toStepY,toStepWidth,toStepHeight){
  return (fromStepX + fromStepWidth >= toStepX) && (fromStepY + fromStepHeight >= toStepY) && (toStepX + toStepWidth >= fromStepX) && (toStepY + toStepHeight >= fromStepY);
}
function getActionPoints(actionType,fromStep,toStep){
   if (fromStep==null || toStep==null) return '';

   var pointsHTML = '';

   var fromStepWidth = parseInt(fromStep.style.width);
   var fromStepHeight = parseInt(fromStep.style.height);
   var toStepWidth = parseInt(toStep.style.width);
   var toStepHeight = parseInt(toStep.style.height);
   var fromStepX = parseInt(fromStep.style.left);
   var fromStepY = parseInt(fromStep.style.top);
   var toStepX = parseInt(toStep.style.left);
   var toStepY = parseInt(toStep.style.top);

   //FromStep Center X,Y
   fromCenterX = fromStepX + parseInt(fromStepWidth/2);
   fromCenterY = fromStepY + parseInt(fromStepHeight/2);
   //ToStep Center X,Y
   toCenterX = toStepX + parseInt(toStepWidth/2);
   toCenterY = toStepY + parseInt(toStepHeight/2);
   
   if(actionType=='Line' && fromStep!=toStep){//������Line�Ļ����㷨
     //ToStep�����϶���
     toStepX1 = toStepX;
     toStepY1 = toStepY;
     //ToStep�����϶���
     toStepX2 = toStepX + toStepWidth;
     toStepY2 = toStepY;
     //ToStep�����¶���
     toStepX3 = toStepX;
     toStepY3 = toStepY + toStepHeight;
     //ToStep�����¶���
     toStepX4 = toStepX + toStepWidth;
     toStepY4 = toStepY + toStepHeight;
   
     //���ToStep��FromStep�����·�����ȡToStep�����϶���
     if (toStepX>fromStepX && toStepY>fromStepY) {toX = toStepX1;toY = toStepY1;}
     //���ToStep��FromStep�����·�����ȡToStep�����϶���
     if (toStepX<fromStepX && toStepY>fromStepY) {toX = toStepX2;toY = toStepY2;}
     //���ToStep��FromStep�����Ϸ�����ȡToStep�����¶���
     if (toStepX>fromStepX && toStepY<fromStepY) {toX = toStepX3;toY = toStepY3;}
     //���ToStep��FromStep�����Ϸ�����ȡToStep�����¶���
     if (toStepX<fromStepX && toStepY<fromStepY) {toX = toStepX4;toY = toStepY4;}

     //pointsHTML = 'from="'+fromX+','+fromY+'" to="'+toX+','+toY+'"';
     
     point2X = fromCenterX;
	   point2Y = toCenterY;
	   
	   if (toCenterX > fromCenterX) {		  
		   absY = toCenterY>=fromCenterY?toCenterY-fromCenterY:fromCenterY-toCenterY;
		   if (parseInt(fromStepHeight/2)>=absY) {
			   point1X = fromStepX + fromStepWidth;
			   point1Y = toCenterY;
			   point2X = point1X;
			   point2Y = point1Y;
		   }else{
			   point1X = fromCenterX;
			   point1Y = fromCenterY<toCenterY?fromStepY+fromStepHeight:fromStepY;
		   }
		   absX = toCenterX-fromCenterX;
		   if (parseInt(fromStepWidth/2)>=absX) {
			   point3X = fromCenterX;
			   point3Y = fromCenterY<toCenterY?toStepY:toStepY+toStepHeight;
			   point2X = point3X;
			   point2Y = point3Y;
		   }else{
			   point3X = toStepX;
			   point3Y = toCenterY;
		   }		   
	   }
	   if (toCenterX < fromCenterX) {
		   absY = toCenterY>=fromCenterY?toCenterY-fromCenterY:fromCenterY-toCenterY;
		   if (parseInt(fromStepHeight/2)>=absY) {
			   point1X = fromStepX;
			   point1Y = toCenterY;
			   point2X = point1X;
			   point2Y = point1Y;
		   }else{
			   point1X = fromCenterX;
			   point1Y = fromCenterY<toCenterY?fromStepY+fromStepHeight:fromStepY;
		   }
		   absX = fromCenterX-toCenterX;
		   if (parseInt(fromStepWidth/2)>=absX) {
			   point3X = fromCenterX;
			   point3Y = fromCenterY<toCenterY?toStepY:toStepY+toStepHeight;
			   point2X = point3X;
			   point2Y = point3Y;
		   }else{
			   point3X = toStepX + toStepWidth;
			   point3Y = toCenterY;
		   }		   
	   }
	   if (toCenterX == fromCenterX) {
		   point1X = fromCenterX;
		   point1Y = fromCenterY>toCenterY?fromStepY:fromStepY+fromStepHeight;
		   point3X = fromCenterX;
		   point3Y = fromCenterY>toCenterY?toStepY+toStepHeight:toStepY;
		   point2X = point3X;point2Y = point3Y;
	   }
	   if (toCenterY == fromCenterY) {
		   point1X = fromCenterX>toCenterX?fromStepX:fromStepX+fromStepWidth;
		   point1Y = fromCenterY;
		   point3Y = fromCenterY;
		   point3X = fromCenterX>toCenterX?toStepX+toStepWidth:toStepX;
		   point2X = point3X;point2Y = point3Y;
	   }	   

	   //pointsHTML = point1X+','+point1Y+' '+point2X+','+point2Y+' '+point3X+','+point3Y;
	   pointsHTML = 'from="'+point1X+','+point1Y+'" to="'+point3X+','+point3Y+'"';
     
     
   }else{//������PolyLine�Ļ����㷨

     if(fromStep!=toStep){
	   //�����Ƿ����: ���ǾͲ�������
	   if (ifRepeatStep(fromStepX,fromStepY,fromStepWidth,fromStepHeight,toStepX,toStepY,toStepWidth,toStepHeight)) {
			return "";
	   } 

	   point2X = fromCenterX;
	   point2Y = toCenterY;
	   
	   if (toCenterX > fromCenterX) {		  
		   absY = toCenterY>=fromCenterY?toCenterY-fromCenterY:fromCenterY-toCenterY;
		   if (parseInt(fromStepHeight/2)>=absY) {
			   point1X = fromStepX + fromStepWidth;
			   point1Y = toCenterY;
			   point2X = point1X;
			   point2Y = point1Y;
		   }else{
			   point1X = fromCenterX;
			   point1Y = fromCenterY<toCenterY?fromStepY+fromStepHeight:fromStepY;
		   }
		   absX = toCenterX-fromCenterX;
		   if (parseInt(fromStepWidth/2)>=absX) {
			   point3X = fromCenterX;
			   point3Y = fromCenterY<toCenterY?toStepY:toStepY+toStepHeight;
			   point2X = point3X;
			   point2Y = point3Y;
		   }else{
			   point3X = toStepX;
			   point3Y = toCenterY;
		   }		   
	   }
	   if (toCenterX < fromCenterX) {
		   absY = toCenterY>=fromCenterY?toCenterY-fromCenterY:fromCenterY-toCenterY;
		   if (parseInt(fromStepHeight/2)>=absY) {
			   point1X = fromStepX;
			   point1Y = toCenterY;
			   point2X = point1X;
			   point2Y = point1Y;
		   }else{
			   point1X = fromCenterX;
			   point1Y = fromCenterY<toCenterY?fromStepY+fromStepHeight:fromStepY;
		   }
		   absX = fromCenterX-toCenterX;
		   if (parseInt(fromStepWidth/2)>=absX) {
			   point3X = fromCenterX;
			   point3Y = fromCenterY<toCenterY?toStepY:toStepY+toStepHeight;
			   point2X = point3X;
			   point2Y = point3Y;
		   }else{
			   point3X = toStepX + toStepWidth;
			   point3Y = toCenterY;
		   }		   
	   }
	   if (toCenterX == fromCenterX) {
		   point1X = fromCenterX;
		   point1Y = fromCenterY>toCenterY?fromStepY:fromStepY+fromStepHeight;
		   point3X = fromCenterX;
		   point3Y = fromCenterY>toCenterY?toStepY+toStepHeight:toStepY;
		   point2X = point3X;point2Y = point3Y;
	   }
	   if (toCenterY == fromCenterY) {
		   point1X = fromCenterX>toCenterX?fromStepX:fromStepX+fromStepWidth;
		   point1Y = fromCenterY;
		   point3Y = fromCenterY;
		   point3X = fromCenterX>toCenterX?toStepX+toStepWidth:toStepX;
		   point2X = point3X;point2Y = point3Y;
	   }	   

	   pointsHTML = point1X+','+point1Y+' '+point2X+','+point2Y+' '+point3X+','+point3Y;
	   
	 }else{
	   var constLength = 30;
	   point0X = fromStepX+fromStepWidth-constLength;
	   point0Y = fromStepY+fromStepHeight;
	   point1X = point0X;
	   point1Y = point0Y+constLength;
	   point2X = fromStepX+fromStepWidth+constLength;
	   point2Y = point1Y;
	   point3X = point2X;
	   point3Y = point0Y-constLength;
	   point4X = fromStepX+fromStepWidth;
	   point4Y = point3Y;

	   pointsHTML = point0X+','+point0Y+' '+point1X+','+point1Y+' '+point2X+','+point2Y+' '+point3X+','+point3Y+' '+point4X+','+point4Y;
	 }

   }
   return pointsHTML;
}

function flowContextMenu(){
  //�˵�Դ�ı�
  var menuSrc = '<menu><entity id="c0"><description>�½�����</description><image>../../js/flow/contextMenu/images/add_step.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();newStep("NormalStep");</onClick><contents></contents></entity>';
  menuSrc+= '<entity id="c1"><description>�½�·��</description><image>../../js/flow/contextMenu/images/add_action.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();newAction();</onClick><contents></contents></entity>';
  menuSrc+= '<entity id="c2"><description>ˢ��</description><image>../../js/flow/contextMenu/images/refresh_vml.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();redrawVML();</onClick><contents></contents></entity></menu>';
  showContextMenu(menuSrc);
}

function stepContextMenu(stepId,stepType){
  //�˵�Դ�ı�
  var menuSrc = '<menu>';
  
  if(stepType!='BeginStep' && stepType!='EndStep')
  {
  	menuSrc += '<entity id="c0"><description>�޸Ļ���['+stepId+']</description><image>../../js/flow/contextMenu/images/edit_obj.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();editStep("'+stepId+'","'+stepType+'");</onClick><contents></contents></entity>';
  	menuSrc+= '<entity id="c1"><description>ɾ������['+stepId+']</description><image>../../js/flow/contextMenu/images/del_obj.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();delStep("'+stepId+'");</onClick><contents></contents></entity>';
  }
  menuSrc+= '<entity id="c2"><description>ˢ��</description><image>../../js/flow/contextMenu/images/refresh_vml.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();redrawVML();</onClick><contents></contents></entity></menu>';
  showContextMenu(menuSrc);
}

function actionContextMenu(actionId){
  //�˵�Դ�ı�
  var menuSrc = '<menu><entity id="c0"><description>�޸�·��['+actionId+']</description><image>../../js/flow/contextMenu/images/edit_obj.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();editAction("'+actionId+'");</onClick><contents></contents></entity>';
  menuSrc+= '<entity id="c1"><description>ɾ��·��['+actionId+']</description><image>../../js/flow/contextMenu/images/del_obj.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();delAction("'+actionId+'");</onClick><contents></contents></entity>';
  menuSrc+= '<entity id="c2"><description>ˢ��</description><image>../../js/flow/contextMenu/images/refresh_vml.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();redrawVML();</onClick><contents></contents></entity></menu>';
  showContextMenu(menuSrc);
}

function showContextMenu(menuSrc){
  //�����Ҽ��˵�
  xmlMenu = new ActiveXObject('MSXML2.DOMDocument')
  xmlMenu.async = false
  xmlMenu.loadXML(menuSrc)
  var root = xmlMenu.documentElement 
  
  var menuText=''+root.xml+''
  loadContextMenu(menuText,'../../js/flow/contextMenu/contextmenu.xsl')
}

var dialogURL = "";
function workFlowDialog(filowId,id,type){
	switch (type){
        case 'NormalStep': dialogURL = id==null?'GetStepDialogInfo.action?flowId='+filowId + "&rem=" + Math.random()*100:'GetStepDialogInfo.action?flowId='+filowId+ "&rem=" + Math.random()*100+'&tacheId='+id;break;
	    case 'BeginStep': dialogURL = id==null?'GetStepDialogInfo.action?flowId='+filowId+ "&rem=" + Math.random()*100:'GetStepDialogInfo.action?flowId='+filowId+ "&rem=" + Math.random()*100+'&tacheId='+id;break;
	    case 'EndStep': dialogURL = id==null?'GetStepDialogInfo.action?flowId='+filowId+ "&rem=" + Math.random()*100:'GetStepDialogInfo.action?flowId='+filowId+ "&rem=" + Math.random()*100+'&tacheId='+id;break;
	    case 'Action': dialogURL = id==null?'ActionDialog.jsp':'ActionDialog.jsp?actionid='+id;break;
		case 'Flow': dialogURL = id==null?'FlowDialog.jsp?flowId='+filowId:'FlowDialog.jsp?flowId='+filowId;break;		
	} 

	var dialog = window.showModalDialog(dialogURL, window, "dialogWidth:373px; dialogHeight:460px; center:yes; help:no; resizable:no; status:no") ;
}

function JudgeFlowIsValidity(){
	//�ж����̵Ķ����Ƿ���Ч���������Ƿ�Ϸ�
	//Return��1---��Ч��0---��Ч
	var FlowXML = document.all.FlowXML;
	
	if(FlowXML.value!=''){
		//��ֵ
		var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
    xmlDoc.async = false;
    xmlDoc.loadXML(FlowXML.value);
   
    var xmlRoot = xmlDoc.documentElement;
    var Flow = xmlRoot.getElementsByTagName("FlowConfig").item(0);
	  var Steps = xmlRoot.getElementsByTagName("Steps").item(0);
    var Actions = xmlRoot.getElementsByTagName("Actions").item(0);
    
    var ls_AllTacheID = "";
    var ls_AllTacheCh = "";
    
    //�õ����л��ڵ�ID
    for ( var i = 0;i < Steps.childNodes.length;i++ )
	  {
	  	Step = Steps.childNodes.item(i);
		  nId = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
		  nText = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("text");
		  nType = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("stepType");
		  if(nType!='BeginStep' && nType!='EndStep')
		  {
		  	//ȥ����ʼ���ڡ���������
		  	if (ls_AllTacheID=="")
		  	{
		  		ls_AllTacheID = nId;
		  		ls_AllTacheCh = nText;
		  	}
		  	else
		  	{
		  		ls_AllTacheID += "," + nId;
		  		ls_AllTacheCh += "," + nText;
		  	}
			}
	  	
	  }
	  
	  if (ls_AllTacheID=="")
	  {
	  	//����û��
	  	alert("�붨�廷�ڣ�");
	  	return 0;
	  }
	  
	  var ls_AllTacheIDFrom = "";
	  var ls_AllTacheIDTo = "";
	  
	  //�õ�·�ɵĿ�ʼ�������Ļ���ID
	  for ( var i = 0;i < Actions.childNodes.length;i++ )
	  {
	  	Action = Actions.childNodes.item(i);
	  	lFromStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("from");
		  lToStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("to");
		  if(lFromStep!=lToStep)
		  {
		  	//ȥ���Լ����Լ���·��
	  		if (ls_AllTacheIDFrom=="")
		  	{
		  		ls_AllTacheIDFrom = lFromStep;
		  		ls_AllTacheIDTo = lToStep;
		  	}
		  	else
		  	{
		  		ls_AllTacheIDFrom += "," + lFromStep;
		  		ls_AllTacheIDTo += "," + lToStep;
		  	}
			}
		}
			
			//alert(ls_AllTacheIDFrom+'\n'+ls_AllTacheIDTo);
			if (ls_AllTacheIDFrom!="")
			{
				ls_AllTacheIDFrom = ","+ls_AllTacheIDFrom+",";
				ls_AllTacheIDTo = ","+ls_AllTacheIDTo+",";
			}
			else
			{
				alert('û��·�ɣ�');
				return 0;
			}
			
	  	
	  	//�ж�ÿ�������Ƿ���from��to�ж��У���ÿ�����ڶ��н��г���
	  	var ls_ValidityResult = "";
	  	var lv_AllTacheID = ls_AllTacheID.split(",");
	  	var lv_AllTacheCh = ls_AllTacheCh.split(",");

			//�жϿ�ʼ����
	  	if (ls_AllTacheIDFrom.indexOf(',begin,')<0)
	  	{
	  		//�������·����û�п�ʼ����
	  		ls_ValidityResult += '\n[��ʼ] - �����������·��';
	  	}
	  	
	  	var lv_temp = ls_AllTacheIDFrom.split('begin,');
	  	if (lv_temp.length>2)
	  	{
	  		//�ж����ʼ����
	  		ls_ValidityResult += '\n[��ʼ] - ֻ����һ�������·��';
	  	}
	  	
	  	//�жϽ�������
	  	if (ls_AllTacheIDTo.indexOf(',end,')<0)
	  	{
	  		//�������·����û�н�������
	  		ls_ValidityResult += '\n[����] - �����������·��';
	  	}
	  	
	  	//�ж��м价��
	  	for ( var i = 0;i < lv_AllTacheID.length;i++ )
	  	{
	  		//�ж�ÿ�������Ƿ��������·�ɺ������·��
	  		
	  		if (ls_AllTacheIDTo.indexOf(','+lv_AllTacheID[i]+',')<0)
	  		{
	  			//�������·����û�иû���
	  			ls_ValidityResult += '\n['+lv_AllTacheCh[i]+'] - �����������·��';
	  		}
	  		
	  		if (ls_AllTacheIDFrom.indexOf(','+lv_AllTacheID[i]+',')<0)
	  		{
	  			//�������·����û�иû���
	  			ls_ValidityResult += '\n['+lv_AllTacheCh[i]+'] - �����������·��';
	  		}
	  		
	  	}
	  	
	  	if (ls_ValidityResult!="")
	  	{
	  		alert(ls_ValidityResult);
	  		return 0;
	  	}
	  	else
	  	{
	  		//������Ч
	  		return 1;
	  	}
  
	  
	}
	else
	{
		alert('�붨��������Ϣ��');
		return 0;
	}
	
	
	
}


