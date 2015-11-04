// 处理键盘事件 禁止后退键（Backspace）密码或单行、多行文本框除外
function forbidBackSpace(e) {
	var ev = e || window.event; // 获取event对象
	var obj = ev.target || ev.srcElement; // 获取事件源
	var t = obj.type || obj.getAttribute('type');
	// 获取事件源类型
	// 获取作为判断条件的事件类型
	var vReadOnly = obj.readOnly;
	var vDisabled = obj.disabled;
	// 处理undefined值情况
	vReadOnly = (vReadOnly == undefined) ? false : vReadOnly;
	vDisabled = (vDisabled == undefined) ? true : vDisabled;
	// 当敲Backspace键时，事件源类型为密码或单行、多行文本的，
	// 并且readOnly属性为true或disabled属性为true的，则退格键失效
	var flag1 = ev.keyCode == 8
			&& (t == "password" || t == "text" || t == "textarea" || selectObj.length > 0)
			&& (vReadOnly == true || vDisabled == true);
	// 当敲Backspace键时，事件源类型非密码或单行、多行文本的，则退格键失效
	var flag2 = ev.keyCode == 8 && t != "password" && t != "text"
			&& t != "textarea";
	// 判断
	if (flag2 || flag1)
		return false;
}
// 禁止后退键 作用于IE、Chrome
document.onkeydown = forbidBackSpace;

function getClientHeight() {
	var clientHeight = document.body.clientHeight;
	if (navigator.userAgent.indexOf("MSIE 6.0") != -1) {
		clientHeight = document.body.clientHeight;
	} else if (navigator.userAgent.indexOf("MSIE") != -1) {
		clientHeight = document.documentElement.offsetHeight
	}

	if (navigator.userAgent.indexOf("Chrome") != -1) {
		clientHeight = document.body.scrollHeight;
	}

	if (navigator.userAgent.indexOf("Firefox") != -1) {
		clientHeight = document.documentElement.scrollHeight;
	}
	return clientHeight;
}

// 打开新的链接（自定义头,宽,高）
function openNew(url, tit, width, height, id) {
	var api;
	if (arguments.length < 3) {
		if (tit == undefined) {
			tit = '编辑';
		}
		api = art.dialog.open(url, {
					title : tit,
					lock : true,
					drag : true,
					resize : false,
					show : true
				}, false);
		art.dialog.data('api', api);
	} else {
		if (tit == undefined) {
			tit = '编辑';
		}
		if (width == undefined) {
			width = 500;
		}
		var CurScreenH = getClientHeight() + 10;
		if (height == undefined) {
			height = CurScreenH;
		} else {

			if (CurScreenH <= height)
				height = CurScreenH;
		}
		if (id != undefined) {
			api = art.dialog.open(url, {
						title : tit,
						lock : true,
						height : height,
						width : width,
						drag : true,
						resize : false,
						id : id,
						show : true
					}, false);
		} else {
			api = art.dialog.open(url, {
						title : tit,
						lock : true,
						height : height,
						width : width,
						drag : true,
						resize : false,
						show : true
					}, false);
		}
		art.dialog.data('api', api);
	}

}

function openNewNoLock(url, tit, width, height, id) {
	var api;
	if (arguments.length < 3) {
		if (tit == undefined) {
			tit = '编辑';
		}
		api = art.dialog.open(url, {
					title : tit,
					lock : false,
					drag : true,
					resize : false,
					show : true
				}, false);
		art.dialog.data('api', api);
	} else {
		if (tit == undefined) {
			tit = '编辑';
		}
		if (width == undefined) {
			width = 500;
		}
		var CurScreenH = getClientHeight() + 10;
		if (height == undefined) {
			height = CurScreenH;
		} else {

			if (CurScreenH <= height)
				height = CurScreenH;
		}
		if (id != undefined) {
			api = art.dialog.open(url, {
						title : tit,
						lock : false,
						height : height,
						width : width,
						drag : true,
						resize : false,
						id : id,
						show : true
					}, false);
		} else {
			api = art.dialog.open(url, {
						title : tit,
						lock : false,
						height : height,
						width : width,
						drag : true,
						resize : false,
						show : true
					}, false);
		}
		art.dialog.data('api', api);
	}

}

// 锁住层
function lockBox() {
	lockBox(msg);
}

// 锁住层（自定义消息）
function lockBox(msg) {
	if (msg == undefined) {
		msg = '保存中...';
	}
	$.messager.progress({
				text : msg
			});
}
// 关闭锁层（自定义消息）
function unlockBox() {
	if ($.messager) {
		$.messager.progress('close');
	}
}
// 关闭层
function closeBox() {
	var api = art.dialog.open.api;
	api && api.close();
	art.dialog.removeData("api");
}
/**
 * Ajax 后台提示消息 isSuccessClose,1:关闭窗口并刷新父列表； 2：只关闭窗口 3:只刷新当前页列表；
 * 4关闭并刷新父（treegrid）列表；5:只刷新当前页（treegrid）列表；其他：不关闭
 * 
 * @param {Object}
 *            data
 * @param {Object}
 *            isSuccessClose
 */
function ajaxMessage(data, isSuccessClose) {
	var opener = art.dialog.opener;
	var errMsg = data.errMsg;
	var errCode = data.errCode;
	if ($.messager) {
		$.messager.progress('close');
	}
	if (errCode < 0) {// 有错误提示
		art.dialog.alert(errMsg);
	} else {// 成功
		if (isSuccessClose == 1) {
			gridReload();
			closeBox();
		}
		if (isSuccessClose == 2) {
			closeBox();
		}
		if (isSuccessClose == 3) {
			$('#list').datagrid("reload");
		}
		if (isSuccessClose == 4) {
			var opt = opener.$('#list').treegrid('options');
			opener.$.post(opt.url, getParQueryParams("searchData", opener),
					function(data) {
						var d = data;
						opener.$('#list').treegrid('loadData', d);
						closeBox();
					}, 'json');
		}
		if (isSuccessClose == 5) {
			var opt = $('#list').treegrid('options');
			$.post(opt.url, getQueryParams("searchData"), function(data) {
						var d = data;
						$('#list').treegrid('loadData', d);
					}, 'json');
		}
		opener.art.dialog.alert(errMsg).unlock();
	}
}
function ajaxError() {
	art.dialog.alert("系统报错,请联系管理员!");
}
/**
 * 刷新Grid
 */
function gridReload() {
	var opener = art.dialog.opener;
	if (opener.$('#list'))
		opener.$('#list').datagrid("reload");
}

// 更新操作
function updateDataAjax(url) {
	var params = jQuery("#update").serialize();
	jQuery.ajax({
				url : url,
				type : "POST",
				data : params,
				dataType : "json"
			});
}
/**
 * 删除单条数据
 * 
 * @param {Object}
 *            url
 * @return {TypeName}
 */
function deleteDateSingle(url, checkedIds) {
	art.dialog.confirm('你确认删除操作？', function() {
				var params = {
					checkedIds : checkedIds
				};

				jQuery.ajax({
							url : url,
							type : "POST",
							data : params,
							dataType : "json",
							success : function(data) {
								if (data.errMsg != '') {
									art.dialog.alert(data.errMsg);
								} else {
									art.dialog.tips("删除成功！", 2).lock();
								}
								if ($.fn.treegrid) {
									var opt = $('#list').treegrid('options');
									$.post(opt.url,
											getQueryParams("searchData"),
											function(data) {
												var d = data;
												$('#list').treegrid('loadData',
														d);
											}, 'json');
								} else {
									$('#list').datagrid("reload");
								}
							}
						});
			}, function() {
				art.dialog.tips("已取消！", 1);
			});
}

/**
 * 删除数据
 * 
 * @param {Object}
 *            url
 * @return {TypeName}
 */
function deleteDateAjax(url, pkid) {
	if (pkid == undefined) {
		pkid = 'uuid';
	}
	var checkedIds = getDeleteData("list", pkid);
	if (checkedIds == '') {
		art.dialog.alert("请先选中记录！");
		return;
	}
	art.dialog.confirm('你确认删除操作？', function() {
				var params = {
					checkedIds : checkedIds
				};

				jQuery.ajax({
							url : url,
							type : "POST",
							data : params,
							dataType : "json",
							success : function(data) {
								if (data.errMsg != '') {
									art.dialog.alert(data.errMsg);
								} else {
									art.dialog.tips("删除成功！", 2).lock();
								}
								$('#list').datagrid("reload");
							}
						});
			}, function() {
				art.dialog.tips("已取消！", 1);
			});
}

// 取得datagrid选择的记录
function getDeleteData(id, pkid) {
	if (pkid == undefined) {
		pkid = 'uuid'
	}
	var temp = '';
	var rows = $('#' + id).datagrid('getChecked');
	var val
	for (var i = 0; i < rows.length; i++) {
		val = '';
		val = eval("rows[" + i + "]." + pkid);
		if (temp != "") {
			temp = temp + "," + val;
		} else {
			temp = val;
		}
	}
	return temp;
}

// 取得treegrid选择的记录
function getTreeGridDeleteData(id, pkid) {
	if (pkid == undefined) {
		pkid = 'uuid'
	}
	var temp = '';

	var dc = $.data($("#" + id)[0], "datagrid").dc;

	dc.view.find("div.datagrid-cell-check input:checked").each(function() {
		if (temp != "") {
			temp = temp + ","
					+ $(this).parents("tr.datagrid-row:first").attr("node-id");
		} else {
			temp = $(this).parents("tr.datagrid-row:first").attr("node-id");
		}
	});

	return temp;
}

// 列表列宽设置
function fixWidthTable(percent) {
	return (getWidth(1)) * percent;
}
// 列表宽度设置
function getWidth(percent) {
	return $(window).width() * percent;
}

// 树绑定
function treeBind(treeName, url) {
	$('#' + treeName).tree({
				url : url,
				loadFilter : function(rows) {
					return treeConvert(rows);
				}
			});
}

// 树层次解析
function treeConvert(rows) {
	function exists(rows, pId) {
		for (var i = 0; i < rows.length; i++) {
			if (rows[i].id == pId)
				return true;
		}
		return false;
	}

	var nodes = [];
	// 得到顶层节点
	for (var i = 0; i < rows.length; i++) {
		var row = rows[i];
		if (!exists(rows, row.pId)) {
			nodes.push({
						id : row.id,
						text : row.name
					});
		}
	}

	var toDo = [];
	for (var i = 0; i < nodes.length; i++) {
		toDo.push(nodes[i]);
	}
	while (toDo.length) {
		var node = toDo.shift(); // 父节点
		// 得到子节点
		for (var i = 0; i < rows.length; i++) {
			var row = rows[i];
			if (row.pId == node.id) {
				var child = {
					id : row.id,
					text : row.name
				};
				if (node.children) {
					node.children.push(child);
				} else {
					node.children = [child];
				}
				toDo.push(child);
			}
		}
	}
	return nodes;
}
/**
 * 
 * @param {Object}
 *            id 标签id
 * @param {Object}
 *            multi 是否允许多文件上传
 * @param {Object}
 *            queueSizeLimit 队列大小设置
 * @param {Object}
 *            fileSizeLimit 文件大小限制
 * @param {Object}
 *            fileTypeExts 文件类型限制 "*.doc;*.jpg;*.xsl"
 * @memberOf {TypeName}
 * @return {TypeName}
 */
function imageObject(id, multi, queueSizeLimit, fileSizeLimit, fileTypeExts) {
	if (fileSizeLimit == '') {
		fileSizeLimit = '15MB'
	}
	var moduleId = jQuery("#" + id + "moduleId").val();
	var mainId = jQuery("#" + id + "mainId").val();
	var imageW = jQuery("#" + id + "imageW").val();
	var imageH = jQuery("#" + id + "imageH").val();
	var uploadObject = {
		'uploader' : '../../uploadImage.action',
		'swf' : '../../js/upload/swfupload.swf',
		'fileObjName' : 'fileName',
		'wmode' : 'transparent',
		'buttonText' : '浏览',// 按钮上的文字
		'auto' : true,// 选定文件后是否自动上传，默认false
		'height' : imageH,
		'width' : imageW,
		'multi' : multi,
		'queueID' : true,
		'queueSizeLimit' : queueSizeLimit,
		'fileSizeLimit' : fileSizeLimit,
		'onUploadComplete' : function(fileObj) {
		},
		'onUploadSuccess' : function(file, data, response) {
			var path = data.toString();
			path = path.replace(/"/g, "");
			$("#image" + id).attr("src", "../../uploadFile/" + path);
			var fileuuid = ((path.split("\\/"))[path.split("\\/").length - 1]
					.split("."))[0];
			var newFileIds = jQuery("#newFileIds").val();
			if (newFileIds == '')
				jQuery("#newFileIds").attr("value", fileuuid);
			else
				jQuery("#newFileIds").attr("value",
						jQuery("#newFileIds").val() + "?" + fileuuid);
			art.dialog.alert("上传成功").unlock();
		},
		'onSWFReady' : function() {
			$('#' + id + "-button").hide();
		},
		// 在浏览窗口底部的文件类型下拉菜单中显示的文本
		'fileTypeDesc' : '支持的格式：',
		// 允许上传的文件后缀
		'fileTypeExts' : fileTypeExts,
		'onSelect' : function(file) {
		},
		'onUploadStart' : function(file) {
			this.addPostParam("file_name", file.name);// 改变文件名的编码
			this.addPostParam("moduleId", moduleId);
			this.addPostParam("flgId", id);
			this.addPostParam("mainId", mainId);
		}
	};

	return uploadObject;
}

/**
 * 
 * @param {Object}
 *            id 标签id
 * @param {Object}
 *            fileSizeLimit 文件大小限制
 * @param {Object}
 *            fileTypeExts 文件类型限制 "*.doc;*.jpg;*.xsl"
 * @memberOf {TypeName}
 * @return {TypeName}
 */
function importObject(id, valueid, fileSizeLimit, fileTypeExts) {
	if (fileSizeLimit == '') {
		fileSizeLimit = '15MB'
	}
	var uploadObject = {
		'uploader' : '../../swfupload.action',
		'swf' : '../../js/upload/uploadify.swf',
		'fileObjName' : 'fileName',
		'wmode' : 'transparent',
		'buttonText' : '浏览',// 按钮上的文字
		'auto' : true,// 选定文件后是否自动上传，默认false
		'height' : 20,
		'width' : 60,
		'multi' : 1,
		'queueSizeLimit' : 1,
		'fileSizeLimit' : fileSizeLimit,
		'onUploadComplete' : function(fileObj) {
		},
		'onUploadSuccess' : function(file, data, response) {
			var path = data.toString();
			path = path.replace(/"/g, "");
			var fileuuid = path.split(".")[0];
			jQuery("#text" + id).attr("value", decodeURI(file.name));
			jQuery("#" + valueid).attr("value", path);
			art.dialog.alert("上传成功！");
		},
		// 在浏览窗口底部的文件类型下拉菜单中显示的文本
		'fileTypeDesc' : '支持的格式：',
		// 允许上传的文件后缀
		'fileTypeExts' : fileTypeExts,
		'onSelect' : function(file) {
		},
		'onUploadStart' : function(file) {
			this.addPostParam("file_name", file.name);// 改变文件名的编码
			this.addPostParam("flgId", id);
		}
	};

	return uploadObject;
}

/**
 * 
 * @param {Object}
 *            id 标签id
 * @param {Object}
 *            multi 是否允许多文件上传
 * @param {Object}
 *            queueSizeLimit 队列大小设置
 * @param {Object}
 *            fileSizeLimit 文件大小限制
 * @param {Object}
 *            fileTypeExts 文件类型限制 "*.doc;*.jpg;*.xsl"
 * @memberOf {TypeName}
 * @return {TypeName}
 */
function uploadObject(id, multi, queueSizeLimit, fileSizeLimit, fileTypeExts) {
	if (fileSizeLimit == '') {
		fileSizeLimit = '15MB'
	}
	var moduleId = jQuery("#" + id + "moduleId").val();
	var mainId = jQuery("#" + id + "mainId").val();
	var uploadObject = {
		'uploader' : '../../uploadFile.action',
		'swf' : '../../js/upload/swfupload.swf',
		'fileObjName' : 'fileName',
		'wmode' : 'transparent',
		'buttonText' : '浏览',// 按钮上的文字
		'auto' : true,// 选定文件后是否自动上传，默认false
		'height' : 20,
		'width' : 60,
		'multi' : multi,
		'queueSizeLimit' : queueSizeLimit,
		'fileSizeLimit' : fileSizeLimit,
		'onUploadComplete' : function(fileObj) {
		},
		'onUploadSuccess' : function(file, data, response) {
			var path = data.toString();
			path = path.replace(/"/g, "");
			var aa = "'" + id + "','" + path + "','" + moduleId + "','"
					+ mainId + "',this";
			jQuery("#" + id + "show")
					.append("<div><a href='../../downloadFile.action?fileName="
							+ decodeURI(file.name)
							+ "&file="
							+ path
							+ "' target='_blank'>"
							+ decodeURI(file.name)
							+ "</a>&nbsp;&nbsp;&nbsp;&nbsp;<img src='../../images/upload/delete.gif' width='20px' height='20px' class='deleteImg' onclick=\"deleteUpload("
							+ aa + ");\" alt='删除'/></div>");
			jQuery("#" + id + "show").find("input").attr("value", "");
			var fileuuid = path.split(".")[0];
			var newFileIds = jQuery("#newFileIds").val();
			if (newFileIds == '')
				jQuery("#newFileIds").attr("value", fileuuid);
			else
				jQuery("#newFileIds").attr("value",
						jQuery("#newFileIds").val() + "?" + fileuuid);
		},
		// 在浏览窗口底部的文件类型下拉菜单中显示的文本
		'fileTypeDesc' : '支持的格式：',
		// 允许上传的文件后缀
		'fileTypeExts' : fileTypeExts,
		'onSelect' : function(file) {
		},
		'onUploadStart' : function(file) {
			this.addPostParam("file_name", file.name);// 改变文件名的编码
			this.addPostParam("moduleId", moduleId);
			this.addPostParam("flgId", id);
			this.addPostParam("mainId", mainId);
		}
	};

	return uploadObject;
}
function deleteUpload(id, saveName, moduleId, mainId, it) {
	var thisObj = jQuery(it);
	thisObj.click(function() {
				var params = {
					id : id,
					url : saveName,
					moduleId : moduleId,
					mainId : mainId
				};
				art.dialog.confirm('确定删除？', function() {
							jQuery.ajax({
										url : '../../deleteUploadFile.action',
										type : "POST",
										data : params,
										dataType : "json",
										success : function(data) {
											thisObj.parent().remove();
											art.dialog.alert("删除成功！");
										}
									});
						}, function() {
							art.dialog.tips("已取消！", 1);
						});
			});
}
/**
 * 将指定form参数转换为json对象,用于treegrid查询
 */
function getQueryParams(conditionFormId) {
	var searchCondition = $("#" + conditionFormId).serialize();
	// jquery serialize后的空格为“+” 把所有“+”替换成“ ”
	searchCondition = searchCondition.replace(/\+/g, " ");
	searchCondition = decodeURIComponent(decodeURIComponent(searchCondition,
					true), true);
	var obj = {};
	var pairs = searchCondition.split('&');
	var name, value;

	$.each(pairs, function(i, pair) {
				pair = pair.split('=');
				name = decodeURIComponent(pair[0]);
				value = decodeURIComponent($.trim(pair[1]));

				obj[name] = !obj[name] ? value : [].concat(obj[name])
						.concat(value); // 若有多个同名称的参数，则拼接
			});
	return obj;
}
/**
 * 将指定获取父窗口form参数转换为json对象,用于treegrid查询
 */
function getParQueryParams(conditionFormId, opener) {
	var searchCondition = opener.$("#" + conditionFormId).serialize();
	// jquery serialize后的空格为“+” 把所有“+”替换成“ ”
	searchCondition = searchCondition.replace(/\+/g, " ");
	searchCondition = decodeURIComponent(decodeURIComponent(searchCondition,
					true), true);
	var obj = {};
	var pairs = searchCondition.split('&');
	var name, value;

	$.each(pairs, function(i, pair) {
				pair = pair.split('=');
				name = decodeURIComponent(pair[0]);
				value = decodeURIComponent($.trim(pair[1]));

				obj[name] = !obj[name] ? value : [].concat(obj[name])
						.concat(value); // 若有多个同名称的参数，则拼接
			});
	return obj;
}

/**
 * 打开签批意见画面
 * 
 * @param phraseTxtId
 * @return
 */
function selectPhrase(phraseTxtId) {
	openNew("common/PhraseSelect_listLoad.action?phraseTxtId=" + phraseTxtId,
			"签批意见", 500, 380);

}

/**
 * 流程相关按钮初始化
 * 
 * @param moduleId
 * @param mainDocId
 * @param validForm
 * @return
 */
function flowButInit(moduleId, mainDocId, validForm) {
	if (validForm == undefined) {
		validForm = "update";
	}
	$("#next").click(function(e) {
		var returnIsValid = $('#' + validForm).form('validate');
		if (returnIsValid == false) {
			return false;
		}
		openNew("workflowengine/NextLoad.action?moduleId=" + moduleId
						+ "&mainDocId=" + mainDocId, "流程选项", 650, 320);
	});

	$("#withdramal").click(function(e) {
		openNew("workflowengine/WithdramalLoad.action?moduleId=" + moduleId
						+ "&mainDocId=" + mainDocId, "退回选项");
	});

	$("#drawback").click(function(e) {
				openNew("workflowengine/Drawback.jsp", "收回确认");
			});

	$("#urge").click(function(e) {
		openNew("workflowengine/Urge_detailsLoad.action?moduleId=" + moduleId
						+ "&mainDocId=" + mainDocId, "催办选项", 350, 300);
	});

	$("#showflow").click(function(e) {
		openNew("workflowengine/FlowTacheShow.action?moduleId=" + moduleId
						+ "&mainDocId=" + mainDocId, "流程信息显示");
	});
}

// formatter: function() {
// return '<button onclick="move(event,this,true)">上</button><button
// onclick="move(event,this,false)">下</button>';
// }
function dataGridMove(e, target, isUp) {
	var $view = $(target).closest('div.datagrid-view');
	var index = $(target).closest('tr.datagrid-row').attr('datagrid-row-index');
	var $row = $view.find('tr[datagrid-row-index=' + index + ']');

	if (isUp) {
		$row.each(function() {
					$(this).prev().before($(this));
				});
	} else {
		$row.each(function() {
					$(this).before($(this).next());
				});
	}
	$row.removeClass('datagrid-row-over');
	// e.stopPropagation();
}

// 树状列表上下移动
function treeGridMove(e, target, isUp) {
	var $view = $(target).closest('div.datagrid-view');
	var index = $(target).closest('tr.datagrid-row').attr('node-id');
	var $row = $view.find('tr[node-id=' + index + ']');
	if (isUp) {
		$row.each(function() {
					$(this).prev().before($(this));
				});
	} else {
		$row.each(function() {
					$(this).before($(this).next());
				});
	}
	$row.removeClass('datagrid-row-over');
	// e.stopPropagation();
}
