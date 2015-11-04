function headAlign(obj){
	var target = $(obj);  
     var opts = $.data(obj, "datagrid").options;  
     var panel = $(obj).datagrid("getPanel");  
     //获取列
     var fields=$(obj).datagrid('getColumnFields',false);
     //datagrid头部 table 的第一个tr 的td们，即columns的集合
     var headerTds =panel.find(".datagrid-view2 .datagrid-header .datagrid-header-inner table tr:first-child").children();
     //重新设置列表头的对齐方式
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
	$.fn.pagination.defaults.beforePageText = '第';
	$.fn.pagination.defaults.afterPageText = '共{pages}页';
	$.fn.pagination.defaults.displayMsg = '显示{from}到{to},共{total}记录';
}
if ($.fn.datagrid){
	$.fn.datagrid.defaults.loadMsg = '正在处理，请稍待。。。';
	/** 
	 * 扩展表格列对齐属性： 
	 *      自定义一个列字段属性： 
	 *      headalign ：原始align属性针对数据有效, headalign针对列名有效
	 *      
	 */  
	 $.extend($.fn.datagrid.defaults,{  
	     onLoadSuccess : function(data) {  
	        headAlign(this);
	         //增加tip提示功能
	        $(this).datagrid('doCellTip',{cls:{'background-color':'#FFFFFF'},delay:300});  
	     }  
	 });
}
if ($.fn.treegrid && $.fn.datagrid){
	$.fn.treegrid.defaults.loadMsg = $.fn.datagrid.defaults.loadMsg;
	/** 
	 * 扩展表格列对齐属性： 
	 *      自定义一个列字段属性： 
	 *      headalign ：原始align属性针对数据有效, headalign针对列名有效
	 *      
	 */
	 $.extend($.fn.treegrid.defaults,{  
	     onLoadSuccess : function() {  
	         headAlign(this);
	     }  
	 });
	 /**
	 * 扩展datagrid tip提示功能
	 */
	$.extend($.fn.datagrid.methods, {
		/**
		 * 开打提示功能
		 * @param {} jq
		 * @param {} params 提示消息框的样式
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
		 * 关闭消息提示功能
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
	$.messager.defaults.ok = '确定';
	$.messager.defaults.cancel = '取消';
}
if ($.fn.validatebox){
	$.fn.validatebox.defaults.missingMessage = '必输项';
	$.fn.validatebox.defaults.rules.email.message = '请输入有效的电子邮件地址';
	$.fn.validatebox.defaults.rules.url.message = '请输入有效的URL地址';
	$.fn.validatebox.defaults.rules.length.message = '输入内容长度必须介于{0}和{1}之间';
	$.fn.validatebox.defaults.rules.remote.message = '请修正该字段';
}
if ($.fn.numberbox){
	$.fn.numberbox.defaults.missingMessage = '必输项';
}
if ($.fn.combobox){
	$.fn.combobox.defaults.missingMessage = '必输项';
}
if ($.fn.combotree){
	$.fn.combotree.defaults.missingMessage = '必输项';
}
if ($.fn.combogrid){
	$.fn.combogrid.defaults.missingMessage = '必输项';
}
if ($.fn.calendar){
	$.fn.calendar.defaults.weeks = ['日','一','二','三','四','五','六'];
	$.fn.calendar.defaults.months = ['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'];
}
if ($.fn.datebox){
	$.fn.datebox.defaults.currentText = '今天';
	$.fn.datebox.defaults.closeText = '关闭';
	$.fn.datebox.defaults.okText = '确定';
	$.fn.datebox.defaults.missingMessage = '该输入项为必输项';
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
          message: '请输入数字'  
      }   
  });  
}
