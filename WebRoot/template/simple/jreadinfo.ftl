<#if parameters.readInfo!="">
  <#list parameters.readInfo?split('?') as x>
         <#assign readinfo = x?substring(0,x?index_of('*')) />  
         <#assign unreadinfo = x?substring(x?index_of('*')+1,x?length) />  
         <#if parameters.isReaded=="1">
         	${readinfo}
         </#if>
         <#if parameters.isReaded!="1">
         	${unreadinfo}
         </#if>
  </#list>
  </#if>
&nbsp;
