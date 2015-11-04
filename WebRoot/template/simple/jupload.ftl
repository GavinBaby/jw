<#if parameters.editCondition??>


<#if parameters.editCondition="*" || parameters.editCondition?index_of(parameters.id) != -1>
   <style type="text/css">
        .deleteImg {cursor: pointer;}
        #uploaddiv img {margin-left: 20px;}
   </style>
   			<input type="text" id = "${parameters.id}moduleId" value="${parameters.moduleId}" style="display:none;"/>
    		<input type="text" id = "${parameters.id}mainId" value="${parameters.mainId}" style="display:none;"/>
    <div id="${parameters.id}show">
    	<div>
    		<input style="width:80%" class="textname" type="text" style="float:left; display:inline"/>
    		<button  class="uploadAndNext${parameters.id}" id="${parameters.id}">‰Ø¿¿</button>
    		<img src="" width="20px" height="20px" class="uploadAndOkImg" style="display: none"/>
    		<img src="" width="20px" height="20px" class="deleteImg" style="display:none;" alt="…æ≥˝"/></div>
	   </#if>
	    <#if parameters.uploadId!="">
	      <#list parameters.uploadId?split('?') as x>
	             <#assign fileurl = x?substring(0,x?index_of('*')) />  
	             <#assign filename = x?substring(x?index_of('*')+1,x?length) />
	             <#assign aaa = parameters.editCondition?index_of(parameters.id) />    
	           <div>
	           <#if parameters.editCondition="*" || parameters.editCondition?index_of(parameters.id) != -1>
	           		<div><a href="../../downloadFile.action?fileName=${filename}&file=${fileurl}" target='_blank'>${filename}</a>&nbsp;&nbsp;&nbsp;&nbsp;<img src='../../images/upload/delete.gif' width='20px' height='20px' class='deleteImg' onclick="deleteUpload('${parameters.id}','${fileurl}','${parameters.moduleId}','${parameters.mainId}',this);" alt='…æ≥˝'/></div>
	           <#elseif parameters.editCondition="#" || parameters.editCondition?index_of(parameters.id) = -1>
	          		<div> <a href="../../downloadFile.action?fileName=${filename}&file=${fileurl}" target='_blank'>${filename}</a>&nbsp;&nbsp;&nbsp;&nbsp;</div>
	           </#if>
	      </#list>
	      </#if>
	      &nbsp;
	  </div>
	   </#if>

