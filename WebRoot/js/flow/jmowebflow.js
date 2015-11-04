//**************************************************************************************
//**************************************************************************************

function newFlow(){
	if(document.all.FlowXML.value!='') {
	   if(!confirm('不保存旧流程，创建新流程吗？')) return;
	}
	workFlowDialog(null,null,'Flow');	
}
function newStep(){
	if(document.all.FlowXML.value=='') {
	   alert('请先创建新流程！');
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
	   alert('请先创建新流程！');
	   return;
	}
	
	workFlowDialog(null,null,'Action');
}
function editFlow(){
	if(document.all.FlowXML.value=='') {
	   alert('请先创建新流程！');
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

		   if(oldObjId == sId && flag){ //如果与原来的焦点步骤叠盖则将原来的步骤放在下面
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
		   	 //开始、结束环节
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
		   	 //删除环节
			   Steps.removeChild(Step);
			   //同时要删除该环节相关的所有路由
			   for (var j = Actions.childNodes.length-1;j>=0 ;j--)
			   {
			   	 Action = Actions.childNodes.item(j);
			   	 lid = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
			   	 lFromStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("from");
		 			 lToStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("to");
		 			 if ((lFromStep==objId)||(lToStep==objId))
		 			 {
		 			 	 //相关的路由，则删除该路由
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
   
   if(actionType=='Line' && fromStep!=toStep){//以下是Line的画线算法
     //ToStep：左上顶点
     toStepX1 = toStepX;
     toStepY1 = toStepY;
     //ToStep：右上顶点
     toStepX2 = toStepX + toStepWidth;
     toStepY2 = toStepY;
     //ToStep：左下顶点
     toStepX3 = toStepX;
     toStepY3 = toStepY + toStepHeight;
     //ToStep：右下顶点
     toStepX4 = toStepX + toStepWidth;
     toStepY4 = toStepY + toStepHeight;
   
     //如果ToStep在FromStep的右下方，则取ToStep的左上顶点
     if (toStepX>fromStepX && toStepY>fromStepY) {toX = toStepX1;toY = toStepY1;}
     //如果ToStep在FromStep的左下方，则取ToStep的右上顶点
     if (toStepX<fromStepX && toStepY>fromStepY) {toX = toStepX2;toY = toStepY2;}
     //如果ToStep在FromStep的右上方，则取ToStep的左下顶点
     if (toStepX>fromStepX && toStepY<fromStepY) {toX = toStepX3;toY = toStepY3;}
     //如果ToStep在FromStep的左上方，则取ToStep的右下顶点
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
     
     
   }else{//以下是PolyLine的画线算法

     if(fromStep!=toStep){
	   //步骤是否叠盖: 叠盖就不画连线
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
  //菜单源文本
  var menuSrc = '<menu><entity id="c0"><description>新建环节</description><image>../../js/flow/contextMenu/images/add_step.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();newStep("NormalStep");</onClick><contents></contents></entity>';
  menuSrc+= '<entity id="c1"><description>新建路由</description><image>../../js/flow/contextMenu/images/add_action.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();newAction();</onClick><contents></contents></entity>';
  menuSrc+= '<entity id="c2"><description>刷新</description><image>../../js/flow/contextMenu/images/refresh_vml.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();redrawVML();</onClick><contents></contents></entity></menu>';
  showContextMenu(menuSrc);
}

function stepContextMenu(stepId,stepType){
  //菜单源文本
  var menuSrc = '<menu>';
  
  if(stepType!='BeginStep' && stepType!='EndStep')
  {
  	menuSrc += '<entity id="c0"><description>修改环节['+stepId+']</description><image>../../js/flow/contextMenu/images/edit_obj.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();editStep("'+stepId+'","'+stepType+'");</onClick><contents></contents></entity>';
  	menuSrc+= '<entity id="c1"><description>删除环节['+stepId+']</description><image>../../js/flow/contextMenu/images/del_obj.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();delStep("'+stepId+'");</onClick><contents></contents></entity>';
  }
  menuSrc+= '<entity id="c2"><description>刷新</description><image>../../js/flow/contextMenu/images/refresh_vml.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();redrawVML();</onClick><contents></contents></entity></menu>';
  showContextMenu(menuSrc);
}

function actionContextMenu(actionId){
  //菜单源文本
  var menuSrc = '<menu><entity id="c0"><description>修改路由['+actionId+']</description><image>../../js/flow/contextMenu/images/edit_obj.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();editAction("'+actionId+'");</onClick><contents></contents></entity>';
  menuSrc+= '<entity id="c1"><description>删除路由['+actionId+']</description><image>../../js/flow/contextMenu/images/del_obj.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();delAction("'+actionId+'");</onClick><contents></contents></entity>';
  menuSrc+= '<entity id="c2"><description>刷新</description><image>../../js/flow/contextMenu/images/refresh_vml.gif</image><fontcolor>'+MenuTextColor_enable+'</fontcolor><onClick>cleancontextMenu();redrawVML();</onClick><contents></contents></entity></menu>';
  showContextMenu(menuSrc);
}

function showContextMenu(menuSrc){
  //生成右键菜单
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
	//判断流程的定义是否有效，即流程是否合法
	//Return：1---有效；0---无效
	var FlowXML = document.all.FlowXML;
	
	if(FlowXML.value!=''){
		//有值
		var xmlDoc = new ActiveXObject('MSXML2.DOMDocument');
    xmlDoc.async = false;
    xmlDoc.loadXML(FlowXML.value);
   
    var xmlRoot = xmlDoc.documentElement;
    var Flow = xmlRoot.getElementsByTagName("FlowConfig").item(0);
	  var Steps = xmlRoot.getElementsByTagName("Steps").item(0);
    var Actions = xmlRoot.getElementsByTagName("Actions").item(0);
    
    var ls_AllTacheID = "";
    var ls_AllTacheCh = "";
    
    //得到所有环节的ID
    for ( var i = 0;i < Steps.childNodes.length;i++ )
	  {
	  	Step = Steps.childNodes.item(i);
		  nId = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("id");
		  nText = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("text");
		  nType = Step.getElementsByTagName("BaseProperties").item(0).getAttribute("stepType");
		  if(nType!='BeginStep' && nType!='EndStep')
		  {
		  	//去除开始环节、结束环节
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
	  	//环节没有
	  	alert("请定义环节！");
	  	return 0;
	  }
	  
	  var ls_AllTacheIDFrom = "";
	  var ls_AllTacheIDTo = "";
	  
	  //得到路由的开始、结束的环节ID
	  for ( var i = 0;i < Actions.childNodes.length;i++ )
	  {
	  	Action = Actions.childNodes.item(i);
	  	lFromStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("from");
		  lToStep = Action.getElementsByTagName("BaseProperties").item(0).getAttribute("to");
		  if(lFromStep!=lToStep)
		  {
		  	//去除自己到自己的路由
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
				alert('没有路由！');
				return 0;
			}
			
	  	
	  	//判断每个环节是否在from、to中都有（即每个环节都有进有出）
	  	var ls_ValidityResult = "";
	  	var lv_AllTacheID = ls_AllTacheID.split(",");
	  	var lv_AllTacheCh = ls_AllTacheCh.split(",");

			//判断开始环节
	  	if (ls_AllTacheIDFrom.indexOf(',begin,')<0)
	  	{
	  		//在输出的路由中没有开始环节
	  		ls_ValidityResult += '\n[开始] - 必须有输出的路由';
	  	}
	  	
	  	var lv_temp = ls_AllTacheIDFrom.split('begin,');
	  	if (lv_temp.length>2)
	  	{
	  		//有多个起始环节
	  		ls_ValidityResult += '\n[开始] - 只能有一个输出的路由';
	  	}
	  	
	  	//判断结束环节
	  	if (ls_AllTacheIDTo.indexOf(',end,')<0)
	  	{
	  		//在输出的路由中没有结束环节
	  		ls_ValidityResult += '\n[结束] - 必须有输入的路由';
	  	}
	  	
	  	//判断中间环节
	  	for ( var i = 0;i < lv_AllTacheID.length;i++ )
	  	{
	  		//判断每个环节是否有输出的路由和输入的路由
	  		
	  		if (ls_AllTacheIDTo.indexOf(','+lv_AllTacheID[i]+',')<0)
	  		{
	  			//在输入的路由中没有该环节
	  			ls_ValidityResult += '\n['+lv_AllTacheCh[i]+'] - 必须有输入的路由';
	  		}
	  		
	  		if (ls_AllTacheIDFrom.indexOf(','+lv_AllTacheID[i]+',')<0)
	  		{
	  			//在输出的路由中没有该环节
	  			ls_ValidityResult += '\n['+lv_AllTacheCh[i]+'] - 必须有输出的路由';
	  		}
	  		
	  	}
	  	
	  	if (ls_ValidityResult!="")
	  	{
	  		alert(ls_ValidityResult);
	  		return 0;
	  	}
	  	else
	  	{
	  		//定义有效
	  		return 1;
	  	}
  
	  
	}
	else
	{
		alert('请定义流程信息！');
		return 0;
	}
	
	
	
}


