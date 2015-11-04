$(function(){
	/*************************��ֱ�ӵ��õ�У�鷽��***************************/
	//��Ϊ�պ���
	notNull = function(id, msg){
		$('#'+id).validatebox({
			required: true,
			missingMessage: msg
		});
	}
	//�ظ�����
	reapet = function(id, re_id, msg){
		id = '#'+id;
		$('#'+re_id).validatebox({
			validType: "reapet['"+id+"','"+msg+"']"
		});
	};
	//����
	number = function(id, msg){
		$('#'+id).validatebox({
			validType: 'number["'+msg+'"]'
		});
	};
	//�ֻ�����
	cellPhone = function(id, msg){
		$('#'+id).validatebox({
			validType: 'cellPhone["'+msg+'"]'
		});
	};
	//�绰����
	phone = function(id, msg){
		$('#'+id).validatebox({
			validType: 'phone["'+msg+'"]'
		});
	};
	//����
	email = function(id,msg){
		$('#'+id).validatebox({
			validType: 'email',
			invalidMessage: msg
		});
	};
	//url
	url = function(id, msg){
		$('#'+id).validatebox({
			validType: 'url',
			invalidMessage: msg
		});
	};
	//ip
	ip = function(id, msg){
		$('#'+id).validatebox({
			validType: 'ip["'+msg+'"]'
		});
	};
	/**
	 * �ύ��̨����Ψһ��У��
	 * @param id:У��Ԫ�ص�id,url: �ύ�ĵ�ַ,paramName: ����ֵ�Ĳ�������
	 */
	unique = function(id, url, paramName){
        $('#'+id).validatebox({
            validType: 'unique["'+url+'","'+id+'","'+paramName+'"]'
        });
	};
	//�ύ��������Чʱ��ֹ�ύ
	form = function(id, url){
		 $("#"+id).form({
			url: url,
			onSubmit: function(){
		   		return $(this).form('validate');
			},
			success: function(data){
				alert(data);
			}
	   });
	};
	/*************************��Ϊ��У�� required="true"********************************/
	//��HMTL��ǩ�м���required="true"�ɽ��в���Ϊ��У��
	$("*").each(function(){
		if($(this).attr('required')){
			$(this).validatebox({
				required: true,
				missingMessage: '����Ϊ��'
			});
		}
	});
	//��ʹ��struts��ǩʱ����������required="true"�ܹ��������ʵ�ֲ���Ϊ��У��
	//ע��:struts��ǩ����label 
	$('span').each(function(){
		//��������span��ǩ�������Ƿ�����class="required"
		if($(this).attr('class')=='required'){
			$("#"+$(this).parent().attr('for')).validatebox({
				required: true,
				missingMessage: '����Ϊ��'
			});
		}
	});
	
});