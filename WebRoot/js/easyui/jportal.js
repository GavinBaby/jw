/*
 * 在指定portal中获取panel
 * id：要获取panel的id
 * mypanels：指定portal所包含的panel[含属性]
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
 * 加载指定portal
 * panelids：指定portal所包含的panel的id[panel用逗号分隔，列用冒号分隔]
 * mypanels：指定portal所包含的panel[含属性]
 * portal：指定portal
 */
function renderPanel(panelids,mypanels,portal){
	var cols=panelids.split(":");
	for(var i=0;i<cols.length;i++){
		var rows=cols[i].split(",");
		for(var j=0;j<rows.length;j++){
			var op=getPanelById(rows[j],mypanels);
			if(op==undefined){//modified by pandb 解决IE 下 op为undefined的情况
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
 * 获取指定portal所包含的panel的id[panel用逗号分隔，列用冒号分隔]
 * id：portal的id
 * colnum：portal列数，最大为3
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
 * 设置指定portal所包含的panel的id[panel用逗号分隔，列用冒号分隔]
 * id：portal的id
 * panelid：被关闭的panel的id
 * colnum：portal列数，最大为3
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




//获取指定名称的cookie的值
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