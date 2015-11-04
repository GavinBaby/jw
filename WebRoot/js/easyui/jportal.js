/*
 * ��ָ��portal�л�ȡpanel
 * id��Ҫ��ȡpanel��id
 * mypanels��ָ��portal��������panel[������]
 */
function getPanelById(id,mypanels){
	for ( var i = 0; i < mypanels.length; i++) {
		if (mypanels[i].id == id) {
			return mypanels[i];
		}
	}
	return undefined;
}
		
/*
 * ����ָ��portal
 * panelids��ָ��portal��������panel��id[panel�ö��ŷָ�������ð�ŷָ�]
 * mypanels��ָ��portal��������panel[������]
 * portal��ָ��portal
 */
function renderPanel(panelids,mypanels,portal){
	var cols=panelids.split(":");
	for(var i=0;i<cols.length;i++){
		var rows=cols[i].split(",");
		for(var j=0;j<rows.length;j++){
			var op=getPanelById(rows[j],mypanels);
			if(op==undefined){//modified by pandb ���IE �� opΪundefined�����
				continue;
			}
			op.width = 100;
			var p = $('<div/>').attr('id', op.id).appendTo('body');
			p.panel(op);
			portal.portal('add', {
				panel : p,
				columnIndex : i
			});
		}
	}
}

/*
 * ��ȡָ��portal��������panel��id[panel�ö��ŷָ�������ð�ŷָ�]
 * id��portal��id
 * colnum��portal���������Ϊ3
 */
function getPortalState(id,colnum) {
	var aa=[];
	for(var columnIndex=0;columnIndex<colnum;columnIndex++) {
		var cc=[];
		var panels=$('#'+id).portal('getPanels',columnIndex);
		for(var i=0;i<panels.length;i++) {
			cc.push(panels[i].attr('id'));
		}
		aa.push(cc.join(','));
	}
	return aa.join(':');
}


/*
 * ����ָ��portal��������panel��id[panel�ö��ŷָ�������ð�ŷָ�]
 * id��portal��id
 * panelid�����رյ�panel��id
 * colnum��portal���������Ϊ3
 */
function setPortalState(id,panelid,colnum) {
	var aa=[];
	for(var columnIndex=0;columnIndex<colnum;columnIndex++) {
		var cc=[];
		var panels=$('#'+id).portal('getPanels',columnIndex);
		for(var i=0;i<panels.length;i++) {
			if (panels[i].attr('id')!=panelid)
			cc.push(panels[i].attr('id'));
		}
		aa.push(cc.join(','));
	}
	return aa.join(':');
}




//��ȡָ�����Ƶ�cookie��ֵ
function getCookie(objName){  
	var arrStr = document.cookie.split("; ");  
	for(var i = 0;i < arrStr.length;i ++){  	  
		var temp = arrStr[i].split("=");  	    
		if(temp[0] == objName) return unescape(temp[1]);  	   
	}   	   
}

function clrcookie()
{
	var exp = new Date();
	exp.setTime (exp.getTime() - 1);
	var cval = getCookie ("portal-state-left");
	document.cookie = "portal-state-left=" + cval + "; expires="+ exp.toGMTString();
	
	var cval2 = getCookie ("portal-state-right");
	document.cookie = "portal-state-right=" + cval2 + "; expires="+ exp.toGMTString();
}