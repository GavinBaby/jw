<#if parameters.editCondition??>


<#if parameters.editCondition="*" || parameters.editCondition?index_of(parameters.id) != -1>
   <style type="text/css">
        .deleteImg {cursor: pointer;}
        #uploaddiv img {margin-left: 20px;}
   </style>
   			<input type="text" id = "${parameters.id}moduleId" value="${parameters.moduleId}" style="display:none;"/>
    		<input type="text" id = "${parameters.id}mainId" value="${parameters.mainId}" style="display:none;"/>
    		<input type="text" id = "${parameters.id}imageW" value="${parameters.imageW}" style="display:none;"/>
    		<input type="text" id = "${parameters.id}imageH" value="${parameters.imageH}" style="display:none;"/>
    <div id="${parameters.id}show">
    	<div>
    		
	   </#if>
	    <#if parameters.uploadId!="">
	      <#list parameters.uploadId?split('?') as fileurl>
	             <#assign aaa = parameters.editCondition?index_of(parameters.id) />    
	           <div>
	           <#if parameters.editCondition="*" || parameters.editCondition?index_of(parameters.id) != -1>
	           		<div>
	           		<div style="height: ${parameters.imageH}px; width: ${parameters.imageW}px;">
	           		   <div style="position:absolute;">
	           		   		<img id="image${parameters.id}"src='../../uploadFile/${fileurl}' width='${parameters.imageW}px' height='${parameters.imageH}px'  alt='点击上传'/>
	           		   </div>
   						<div style="position:absolute;">
   						<button  class="uploadAndNext${parameters.id}" style="display:none;" id="${parameters.id}" ></button>
   						</div>
	           		</div>
	           		</div>
	           <#elseif parameters.editCondition="#" || parameters.editCondition?index_of(parameters.id) = -1>
	          		<div><img src='../../uploadFile/${fileurl}' width='${parameters.imageW}px' height='${parameters.imageH}px' /></div>
	           </#if>
	      </#list>
	      <#else>
	      		<div>
	           		<div style="height: ${parameters.imageH}px; width: ${parameters.imageW}px;">
	           		   <div style="position:absolute;">
	      				<img id="image${parameters.id}" src='../../images/photo_tj.gif' width='${parameters.imageW}px' height='${parameters.imageH}px'  alt='上传图片'/>
	      				 </div>
   						<div style="position:absolute;">
	      		  <button  class="uploadAndNext${parameters.id}" style="display:none;" id="${parameters.id}" ></button>
	      		  </div>
	           		</div>
	           		</div>
	      </#if>
	    
	      </div>
	  </div>
	   </#if>

