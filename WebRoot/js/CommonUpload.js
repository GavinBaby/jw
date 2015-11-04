/**
 * 
 * @param {Object} id 
 * @param {Object} multi 一次上传个数限制
 * @param {Object} queueSizeLimit
 * @param {Object} fileSizeLimit
 * @param {Object} fileTypeExts
 * @memberOf {TypeName} 
 * @return {TypeName} 
 */
function uploadObject(id,multi,queueSizeLimit,fileSizeLimit,fileTypeExts){
		if(fileSizeLimit==''){
			fileSizeLimit = '15MB'
		}
		 var moduleId = jQuery("#"+id+"moduleId").val();
		 var mainId = jQuery("#"+id+"mainId").val();
   		var uploadObject = {
   		'uploader'  : '../../uploadFile.action',  
                 'swf' : '../../js/upload/uploadify.swf', 
                 'fileObjName':'fileName',  
                 'wmode'          : 'transparent' ,   
                 'buttonText': '浏览',//按钮上的文字 
                 'auto': true,//选定文件后是否自动上传，默认false
                 'height'    : 20,  
                 'width'     : 60,  
                 'multi':multi,  
                 'queueSizeLimit' : queueSizeLimit,
                 'fileSizeLimit':fileSizeLimit, 
                 'onUploadComplete'  : function( fileObj) {  
                       },
                 'onUploadSuccess' : function (file, data, response){
                       	var path = data.toString();
                       	path = path.replace(/"/g,"");
                       var  aa = "'"+id+"','"+path+"','"+moduleId+"','"+mainId+"',this";
                       	jQuery("#"+id+"show").append("<div><a href='../../downloadFile.action?fileName="+encodeURI(encodeURI(file.name))+"&file="+path+"' target='_blank'>"+file.name+"</a>&nbsp;&nbsp;&nbsp;&nbsp;<img src='../../images/upload/delete.gif' width='20px' height='20px' class='deleteImg' onclick=\"deleteUpload("+aa+");\" alt='删除'/></div>");  	
                  		jQuery("#"+id+"show").find("input").attr("value", "");
                  },
                  //在浏览窗口底部的文件类型下拉菜单中显示的文本 
                  'fileTypeDesc':'支持的格式：', 
                  //允许上传的文件后缀 
                  'fileTypeExts':fileTypeExts, 
                  'onSelect' : function(file) {  
			       this.addPostParam("file_name",encodeURI(file.name));//改变文件名的编码
			       this.addPostParam("moduleId",moduleId);
				   this.addPostParam("flgId",id);
				    this.addPostParam("mainId",mainId);
				    }
                 };
   	
		return uploadObject;
	}
	 function deleteUpload(id,url,moduleId,mainId,it){
		var thisObj = jQuery(it);
		thisObj.click(function(){
			 var thisObj = jQuery(this);
					var params = {
				id : id,
				url : url,
				moduleId : moduleId,
				mainId : mainId
		};
		if(confirm("确定删除")){
			jQuery.ajax( {
			url : '../../deleteUploadFile.action',
			type : "POST",
			data : params,
			dataType : "json",
			success : new function(data){
				thisObj.parent().remove();
				alert("删除成功！");
			}
			});
		}
			
		});	
	}
	 