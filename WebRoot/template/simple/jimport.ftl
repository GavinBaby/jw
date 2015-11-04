<#if parameters.editCondition??>


<#if parameters.editCondition="*" || parameters.editCondition?index_of(parameters.id) != -1>
   <style type="text/css">
        .deleteImg {cursor: pointer;}
        #uploaddiv img {margin-left: 20px;}
   </style>
    <div id="${parameters.id}show">
    	<div>
    		<input style="width:80%"  class="textname" id="text${parameters.id}" type="text" style="float:left; display:inline;" disabled=true;/>
    		<button  class="uploadAndNext${parameters.id}" id="${parameters.id}">‰Ø¿¿</button>
	   </#if>
	    <#if parameters.uploadId!="">
	      </#if>
	      &nbsp;
	  </div>
	   </#if>

