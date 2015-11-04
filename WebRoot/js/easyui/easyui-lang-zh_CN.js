function headAlign(obj){
	var target = $(obj);  
     var opts = $.data(obj, "datagrid").options;  
     var panel = $(obj).datagrid("getPanel");  
     //��ȡ��
     var fields=$(obj).datagrid('getColumnFields',false);
     //datagridͷ�� table �ĵ�һ��tr ��td�ǣ���columns�ļ���
     var headerTds =panel.find(".datagrid-view2 .datagrid-header .datagrid-header-inner table tr:first-child").children();
     //���������б�ͷ�Ķ��뷽ʽ
     headerTds.each(function (i, obj) {
         var col = target.datagrid('getColumnOption',fields[i]);
         if (!col.hidden && !col.checkbox)
         {
             var headalign=col.headalign||'center';
             $("div:first-child", obj).css("text-align", headalign);
         }
     })
}
if ($.fn.pagination){
	$.fn.pagination.defaults.beforePageText = '��';
	$.fn.pagination.defaults.afterPageText = '��{pages}ҳ';
	$.fn.pagination.defaults.displayMsg = '��ʾ{from}��{to},��{total}��¼';
}
if ($.fn.datagrid){
	$.fn.datagrid.defaults.loadMsg = '���ڴ������Դ�������';
	/** 
	 * ��չ����ж������ԣ� 
	 *      �Զ���һ�����ֶ����ԣ� 
	 *      headalign ��ԭʼalign�������������Ч, headalign���������Ч
	 *      
	 */  
	 $.extend($.fn.datagrid.defaults,{  
	     onLoadSuccess : function(data) {  
	        headAlign(this);
	         //����tip��ʾ����
	        $(this).datagrid('doCellTip',{cls:{'background-color':'#FFFFFF'},delay:300});  
	     }  
	 });
}
if ($.fn.treegrid && $.fn.datagrid){
	$.fn.treegrid.defaults.loadMsg = $.fn.datagrid.defaults.loadMsg;
	/** 
	 * ��չ����ж������ԣ� 
	 *      �Զ���һ�����ֶ����ԣ� 
	 *      headalign ��ԭʼalign�������������Ч, headalign���������Ч
	 *      
	 */
	 $.extend($.fn.treegrid.defaults,{  
	     onLoadSuccess : function() {  
	         headAlign(this);
	     }  
	 });
	 /**
	 * ��չdatagrid tip��ʾ����
	 */
	$.extend($.fn.datagrid.methods, {
		/**
		 * ������ʾ����
		 * @param {} jq
		 * @param {} params ��ʾ��Ϣ�����ʽ
		 * @return {}
		 */
		doCellTip : function(jq, params) {
			function showTip(data, td, e) {
				if ($(td).text() == "")
					return;
				data.tooltip.text($(td).text()).css({
							top : (e.pageY + 10) + 'px',
							left : (e.pageX + 20) + 'px',
							'z-index' : $.fn.window.defaults.zIndex,
							display : 'block'
						});
			};
			return jq.each(function() {
				var grid = $(this);
				var options = $(this).data('datagrid');
				if (!options.tooltip) {
					var panel = grid.datagrid('getPanel').panel('panel');
					var defaultCls = {
						'border' : '1px solid #333',
						'padding' : '1px',
						'color' : '#333',
						'background' : '#f7f5d1',
						'position' : 'absolute',
						'max-width' : '200px',
						'border-radius' : '4px',
						'-moz-border-radius' : '4px',
						'-webkit-border-radius' : '4px',
						'display' : 'none'
					}
					var tooltip = $("<div id='celltip'></div>").appendTo('body');
					tooltip.css($.extend({}, defaultCls, params.cls));
					options.tooltip = tooltip;
					panel.find('.datagrid-body').each(function() {
						var delegateEle = $(this).find('> div.datagrid-body-inner').length
						? $(this).find('> div.datagrid-body-inner')[0]
						: this;
						$(delegateEle).undelegate('td', 'mouseover').undelegate(
						'td', 'mouseout').undelegate('td', 'mousemove')
						.delegate('td', {
							'mouseover' : function(e) {
								if (params.delay) {
									if (options.tipDelayTime)
										clearTimeout(options.tipDelayTime);
									var that = this;
									options.tipDelayTime = setTimeout(
											function() {
												showTip(options, that, e);
											}, params.delay);
								} else {
									showTip(options, this, e);
								}

							},
							'mouseout' : function(e) {
								if (options.tipDelayTime)
									clearTimeout(options.tipDelayTime);
								options.tooltip.css({'display' : 'none'});
							},
							'mousemove' : function(e) {
								var that = this;
								if (options.tipDelayTime) {
									clearTimeout(options.tipDelayTime);
									options.tipDelayTime = setTimeout(
											function() {
												showTip(options, that, e);
											}, params.delay);
								} else {
									showTip(options, that, e);
								}
							}
						});
					});
				}
			});
		},
		/**
		 * �ر���Ϣ��ʾ����
		 * @param {} jq
		 * @return {}
		 */
		cancelCellTip : function(jq) {
			return jq.each(function() {
						var data = $(this).data('datagrid');
						if (data.tooltip) {
							data.tooltip.remove();
							data.tooltip = null;
							var panel = $(this).datagrid('getPanel').panel('panel');
							panel.find('.datagrid-body').undelegate('td',
									'mouseover').undelegate('td', 'mouseout')
									.undelegate('td', 'mousemove')
						}
						if (data.tipDelayTime) {
							clearTimeout(data.tipDelayTime);
							data.tipDelayTime = null;
						}
					});
		}
	});
}
if ($.messager){
	$.messager.defaults.ok = 'ȷ��';
	$.messager.defaults.cancel = 'ȡ��';
}
if ($.fn.validatebox){
	$.fn.validatebox.defaults.missingMessage = '������';
	$.fn.validatebox.defaults.rules.email.message = '��������Ч�ĵ����ʼ���ַ';
	$.fn.validatebox.defaults.rules.url.message = '��������Ч��URL��ַ';
	$.fn.validatebox.defaults.rules.length.message = '�������ݳ��ȱ������{0}��{1}֮��';
	$.fn.validatebox.defaults.rules.remote.message = '���������ֶ�';
}
if ($.fn.numberbox){
	$.fn.numberbox.defaults.missingMessage = '������';
}
if ($.fn.combobox){
	$.fn.combobox.defaults.missingMessage = '������';
}
if ($.fn.combotree){
	$.fn.combotree.defaults.missingMessage = '������';
}
if ($.fn.combogrid){
	$.fn.combogrid.defaults.missingMessage = '������';
}
if ($.fn.calendar){
	$.fn.calendar.defaults.weeks = ['��','һ','��','��','��','��','��'];
	$.fn.calendar.defaults.months = ['һ��','����','����','����','����','����','����','����','����','ʮ��','ʮһ��','ʮ����'];
}
if ($.fn.datebox){
	$.fn.datebox.defaults.currentText = '����';
	$.fn.datebox.defaults.closeText = '�ر�';
	$.fn.datebox.defaults.okText = 'ȷ��';
	$.fn.datebox.defaults.missingMessage = '��������Ϊ������';
	$.fn.datebox.defaults.formatter = function(date){
		var y = date.getFullYear();
		var m = date.getMonth()+1;
		var d = date.getDate();
		return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
	};
	$.fn.datebox.defaults.parser = function(s){
		if (!s) return new Date();
		var ss = s.split('-');
		var y = parseInt(ss[0],10);
		var m = parseInt(ss[1],10);
		var d = parseInt(ss[2],10);
		if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
			return new Date(y,m-1,d);
		} else {
			return new Date();
		}
	};
}
if ($.fn.datetimebox && $.fn.datebox){
	$.extend($.fn.datetimebox.defaults,{
		currentText: $.fn.datebox.defaults.currentText,
		closeText: $.fn.datebox.defaults.closeText,
		okText: $.fn.datebox.defaults.okText,
		missingMessage: $.fn.datebox.defaults.missingMessage
	});
}
if($.fn.validatebox){
	$.extend($.fn.validatebox.defaults.rules, {   
      number: { 
          validator: function(value){  
			  var str = /^\d+$/;
              return str.test(value);
          },   
          message: '����������'  
      }   
  });  
}
