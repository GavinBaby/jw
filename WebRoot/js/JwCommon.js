// ��������¼� ��ֹ���˼���Backspace��������С������ı������
function forbidBackSpace(e) {
	var ev = e || window.event; // ��ȡevent����
	var obj = ev.target || ev.srcElement; // ��ȡ�¼�Դ
	var t = obj.type || obj.getAttribute('type');
	// ��ȡ�¼�Դ����
	// ��ȡ��Ϊ�ж��������¼�����
	var vReadOnly = obj.readOnly;
	var vDisabled = obj.disabled;
	// ����undefinedֵ���
	vReadOnly = (vReadOnly == undefined) ? false : vReadOnly;
	vDisabled = (vDisabled == undefined) ? true : vDisabled;
	// ����Backspace��ʱ���¼�Դ����Ϊ������С������ı��ģ�
	// ����readOnly����Ϊtrue��disabled����Ϊtrue�ģ����˸��ʧЧ
	var flag1 = ev.keyCode == 8
			&& (t == "password" || t == "text" || t == "textarea" || selectObj.length > 0)
			&& (vReadOnly == true || vDisabled == true);
	// ����Backspace��ʱ���¼�Դ���ͷ�������С������ı��ģ����˸��ʧЧ
	var flag2 = ev.keyCode == 8 && t != "password" && t != "text"
			&& t != "textarea";
	// �ж�
	if (flag2 || flag1)
		return false;
}
// ��ֹ���˼� ������IE��Chrome
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

// ���µ����ӣ��Զ���ͷ,��,�ߣ�
function openNew(url, tit, width, height, id) {
	var api;
	if (arguments.length < 3) {
		if (tit == undefined) {
			tit = '�༭';
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
			tit = '�༭';
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
			tit = '�༭';
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
			tit = '�༭';
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

// ��ס��
function lockBox() {
	lockBox(msg);
}

// ��ס�㣨�Զ�����Ϣ��
function lockBox(msg) {
	if (msg == undefined) {
		msg = '������...';
	}
	$.messager.progress({
				text : msg
			});
}
// �ر����㣨�Զ�����Ϣ��
function unlockBox() {
	if ($.messager) {
		$.messager.progress('close');
	}
}
// �رղ�
function closeBox() {
	var api = art.dialog.open.api;
	api && api.close();
	art.dialog.removeData("api");
}
/**
 * Ajax ��̨��ʾ��Ϣ isSuccessClose,1:�رմ��ڲ�ˢ�¸��б� 2��ֻ�رմ��� 3:ֻˢ�µ�ǰҳ�б�
 * 4�رղ�ˢ�¸���treegrid���б�5:ֻˢ�µ�ǰҳ��treegrid���б����������ر�
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
	if (errCode < 0) {// �д�����ʾ
		art.dialog.alert(errMsg);
	} else {// �ɹ�
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
	art.dialog.alert("ϵͳ����,����ϵ����Ա!");
}
/**
 * ˢ��Grid
 */
function gridReload() {
	var opener = art.dialog.opener;
	if (opener.$('#list'))
		opener.$('#list').datagrid("reload");
}

// ���²���
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
 * ɾ����������
 * 
 * @param {Object}
 *            url
 * @return {TypeName}
 */
function deleteDateSingle(url, checkedIds) {
	art.dialog.confirm('��ȷ��ɾ��������', function() {
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
									art.dialog.tips("ɾ���ɹ���", 2).lock();
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
				art.dialog.tips("��ȡ����", 1);
			});
}

/**
 * ɾ������
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
		art.dialog.alert("����ѡ�м�¼��");
		return;
	}
	art.dialog.confirm('��ȷ��ɾ��������', function() {
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
									art.dialog.tips("ɾ���ɹ���", 2).lock();
								}
								$('#list').datagrid("reload");
							}
						});
			}, function() {
				art.dialog.tips("��ȡ����", 1);
			});
}

// ȡ��datagridѡ��ļ�¼
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

// ȡ��treegridѡ��ļ�¼
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

// �б��п�����
function fixWidthTable(percent) {
	return (getWidth(1)) * percent;
}
// �б�������
function getWidth(percent) {
	return $(window).width() * percent;
}

// ����
function treeBind(treeName, url) {
	$('#' + treeName).tree({
				url : url,
				loadFilter : function(rows) {
					return treeConvert(rows);
				}
			});
}

// ����ν���
function treeConvert(rows) {
	function exists(rows, pId) {
		for (var i = 0; i < rows.length; i++) {
			if (rows[i].id == pId)
				return true;
		}
		return false;
	}

	var nodes = [];
	// �õ�����ڵ�
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
		var node = toDo.shift(); // ���ڵ�
		// �õ��ӽڵ�
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
 *            id ��ǩid
 * @param {Object}
 *            multi �Ƿ�������ļ��ϴ�
 * @param {Object}
 *            queueSizeLimit ���д�С����
 * @param {Object}
 *            fileSizeLimit �ļ���С����
 * @param {Object}
 *            fileTypeExts �ļ��������� "*.doc;*.jpg;*.xsl"
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
		'buttonText' : '���',// ��ť�ϵ�����
		'auto' : true,// ѡ���ļ����Ƿ��Զ��ϴ���Ĭ��false
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
			art.dialog.alert("�ϴ��ɹ�").unlock();
		},
		'onSWFReady' : function() {
			$('#' + id + "-button").hide();
		},
		// ��������ڵײ����ļ����������˵�����ʾ���ı�
		'fileTypeDesc' : '֧�ֵĸ�ʽ��',
		// �����ϴ����ļ���׺
		'fileTypeExts' : fileTypeExts,
		'onSelect' : function(file) {
		},
		'onUploadStart' : function(file) {
			this.addPostParam("file_name", file.name);// �ı��ļ����ı���
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
 *            id ��ǩid
 * @param {Object}
 *            fileSizeLimit �ļ���С����
 * @param {Object}
 *            fileTypeExts �ļ��������� "*.doc;*.jpg;*.xsl"
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
		'buttonText' : '���',// ��ť�ϵ�����
		'auto' : true,// ѡ���ļ����Ƿ��Զ��ϴ���Ĭ��false
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
			art.dialog.alert("�ϴ��ɹ���");
		},
		// ��������ڵײ����ļ����������˵�����ʾ���ı�
		'fileTypeDesc' : '֧�ֵĸ�ʽ��',
		// �����ϴ����ļ���׺
		'fileTypeExts' : fileTypeExts,
		'onSelect' : function(file) {
		},
		'onUploadStart' : function(file) {
			this.addPostParam("file_name", file.name);// �ı��ļ����ı���
			this.addPostParam("flgId", id);
		}
	};

	return uploadObject;
}

/**
 * 
 * @param {Object}
 *            id ��ǩid
 * @param {Object}
 *            multi �Ƿ�������ļ��ϴ�
 * @param {Object}
 *            queueSizeLimit ���д�С����
 * @param {Object}
 *            fileSizeLimit �ļ���С����
 * @param {Object}
 *            fileTypeExts �ļ��������� "*.doc;*.jpg;*.xsl"
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
		'buttonText' : '���',// ��ť�ϵ�����
		'auto' : true,// ѡ���ļ����Ƿ��Զ��ϴ���Ĭ��false
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
							+ aa + ");\" alt='ɾ��'/></div>");
			jQuery("#" + id + "show").find("input").attr("value", "");
			var fileuuid = path.split(".")[0];
			var newFileIds = jQuery("#newFileIds").val();
			if (newFileIds == '')
				jQuery("#newFileIds").attr("value", fileuuid);
			else
				jQuery("#newFileIds").attr("value",
						jQuery("#newFileIds").val() + "?" + fileuuid);
		},
		// ��������ڵײ����ļ����������˵�����ʾ���ı�
		'fileTypeDesc' : '֧�ֵĸ�ʽ��',
		// �����ϴ����ļ���׺
		'fileTypeExts' : fileTypeExts,
		'onSelect' : function(file) {
		},
		'onUploadStart' : function(file) {
			this.addPostParam("file_name", file.name);// �ı��ļ����ı���
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
				art.dialog.confirm('ȷ��ɾ����', function() {
							jQuery.ajax({
										url : '../../deleteUploadFile.action',
										type : "POST",
										data : params,
										dataType : "json",
										success : function(data) {
											thisObj.parent().remove();
											art.dialog.alert("ɾ���ɹ���");
										}
									});
						}, function() {
							art.dialog.tips("��ȡ����", 1);
						});
			});
}
/**
 * ��ָ��form����ת��Ϊjson����,����treegrid��ѯ
 */
function getQueryParams(conditionFormId) {
	var searchCondition = $("#" + conditionFormId).serialize();
	// jquery serialize��Ŀո�Ϊ��+�� �����С�+���滻�ɡ� ��
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
						.concat(value); // ���ж��ͬ���ƵĲ�������ƴ��
			});
	return obj;
}
/**
 * ��ָ����ȡ������form����ת��Ϊjson����,����treegrid��ѯ
 */
function getParQueryParams(conditionFormId, opener) {
	var searchCondition = opener.$("#" + conditionFormId).serialize();
	// jquery serialize��Ŀո�Ϊ��+�� �����С�+���滻�ɡ� ��
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
						.concat(value); // ���ж��ͬ���ƵĲ�������ƴ��
			});
	return obj;
}

/**
 * ��ǩ���������
 * 
 * @param phraseTxtId
 * @return
 */
function selectPhrase(phraseTxtId) {
	openNew("common/PhraseSelect_listLoad.action?phraseTxtId=" + phraseTxtId,
			"ǩ�����", 500, 380);

}

/**
 * ������ذ�ť��ʼ��
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
						+ "&mainDocId=" + mainDocId, "����ѡ��", 650, 320);
	});

	$("#withdramal").click(function(e) {
		openNew("workflowengine/WithdramalLoad.action?moduleId=" + moduleId
						+ "&mainDocId=" + mainDocId, "�˻�ѡ��");
	});

	$("#drawback").click(function(e) {
				openNew("workflowengine/Drawback.jsp", "�ջ�ȷ��");
			});

	$("#urge").click(function(e) {
		openNew("workflowengine/Urge_detailsLoad.action?moduleId=" + moduleId
						+ "&mainDocId=" + mainDocId, "�߰�ѡ��", 350, 300);
	});

	$("#showflow").click(function(e) {
		openNew("workflowengine/FlowTacheShow.action?moduleId=" + moduleId
						+ "&mainDocId=" + mainDocId, "������Ϣ��ʾ");
	});
}

// formatter: function() {
// return '<button onclick="move(event,this,true)">��</button><button
// onclick="move(event,this,false)">��</button>';
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

// ��״�б������ƶ�
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
