$(function(){
	/*************************可直接调用的校验方法***************************/
	//不为空函数
	notNull = function(id, msg){
		$('#'+id).validatebox({
			required: true,
			missingMessage: msg
		});
	}
	//重复函数
	reapet = function(id, re_id, msg){
		id = '#'+id;
		$('#'+re_id).validatebox({
			validType: "reapet['"+id+"','"+msg+"']"
		});
	};
	//数字
	number = function(id, msg){
		$('#'+id).validatebox({
			validType: 'number["'+msg+'"]'
		});
	};
	//手机号码
	cellPhone = function(id, msg){
		$('#'+id).validatebox({
			validType: 'cellPhone["'+msg+'"]'
		});
	};
	//电话号码
	phone = function(id, msg){
		$('#'+id).validatebox({
			validType: 'phone["'+msg+'"]'
		});
	};
	//邮箱
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
	 * 提交后台进行唯一性校验
	 * @param id:校验元素的id,url: 提交的地址,paramName: 传入值的参数名称
	 */
	unique = function(id, url, paramName){
        $('#'+id).validatebox({
            validType: 'unique["'+url+'","'+id+'","'+paramName+'"]'
        });
	};
	//提交，数据无效时阻止提交
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
	/*************************不为空校验 required="true"********************************/
	//在HMTL标签中加入required="true"可进行不能为空校验
	$("*").each(function(){
		if($(this).attr('required')){
			$(this).validatebox({
				required: true,
				missingMessage: '不能为空'
			});
		}
	});
	//当使用struts标签时，加入属性required="true"能过下面代码实现不能为空校验
	//注意:struts标签需用label 
	$('span').each(function(){
		//遍历所有span标签，检验是否设有class="required"
		if($(this).attr('class')=='required'){
			$("#"+$(this).parent().attr('for')).validatebox({
				required: true,
				missingMessage: '不能为空'
			});
		}
	});
	
});