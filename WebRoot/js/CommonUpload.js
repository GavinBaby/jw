/**
 * 
 * @param {Object} id 
 * @param {Object} multi һ���ϴ���������
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
                 'buttonText': '���',//��ť�ϵ����� 
                 'auto': true,//ѡ���ļ����Ƿ��Զ��ϴ���Ĭ��false
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
                       	jQuery("#"+id+"show").append("<div><a href='../../downloadFile.action?fileName="+encodeURI(encodeURI(file.name))+"&file="+path+"' target='_blank'>"+file.name+"</a>&nbsp;&nbsp;&nbsp;&nbsp;<img src='../../images/upload/delete.gif' width='20px' height='20px' class='deleteImg' onclick=\"deleteUpload("+aa+");\" alt='ɾ��'/></div>");  	
                  		jQuery("#"+id+"show").find("input").attr("value", "");
                  },
                  //��������ڵײ����ļ����������˵�����ʾ���ı� 
                  'fileTypeDesc':'֧�ֵĸ�ʽ��', 
                  //�����ϴ����ļ���׺ 
                  'fileTypeExts':fileTypeExts, 
                  'onSelect' : function(file) {  
			       this.addPostParam("file_name",encodeURI(file.name));//�ı��ļ����ı���
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
		if(confirm("ȷ��ɾ��")){
			jQuery.ajax( {
			url : '../../deleteUploadFile.action',
			type : "POST",
			data : params,
			dataType : "json",
			success : new function(data){
				thisObj.parent().remove();
				alert("ɾ���ɹ���");
			}
			});
		}
			
		});	
	}
	 