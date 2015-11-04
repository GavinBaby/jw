(function($) {
	// your code
	$.noConflict(true); // this api called at the end of your component.
	function getDate() {
		$.ajax( {
			async : false,
			cache : false,
			type : 'GET',
			dataType : "json",
			//MOD START SUNYX 2014/10/14 公文管理-文件传输系统-001,行政办公-信息采编-001
			//url : "common/UserSelect_detailsLoad_treegrid.action?userSelRa="+$("#userSelRa").val(),
			url : "purchase/Purchase_gridLoad.action",
			//		data : params,
			//MOD END SUNYX 2014/10/14 公文管理-文件传输系统-001,行政办公-信息采编-001
			success : function(data) {
				//			allPeopleNode = data;
			console.log(data);
		},
		error : ajaxError
		});
	}

	getDate();
	var params ={apply_name:"test",list:[{name:"1",type:"类型1"},{name:"2",type:"类型2"}]}
//	var params ={data:{apply_name:"test",list:[{name:"1",type:"类型1"},{name:"2",type:"类型2"}]}}
	params = JSON.stringify(params);
	console.log('~~~~~~~~~'+params);
	function save() {
		$.ajax( {
			url : "Purchase_detailsUpdate_ajax.action",
			type : "POST",
			data : params,
			dataType : "json",
			success : callback,
			error : ajaxError
		});
	}

	function callback(data) {
		ajaxMessage(data, 1);
	}

//	save();
	
	function get_changed_url(){
		
	}
	
	
})(jQuery);



