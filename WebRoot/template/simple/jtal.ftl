<#if parameters.editCondition??>
<#if parameters.editCondition="*">
<#include "/${parameters.templateDir}/simple/textarea.ftl" />
<#elseif parameters.editCondition?index_of(parameters.id) = -1>

<@s.property value="${parameters.name}.replaceAll(' ','&nbsp;').replaceAll('\r\n','<br>').replaceAll('\n','<br>').replaceAll('\r','<br>')" escapeHtml=false/>&nbsp;
<#else>
<#include "/${parameters.templateDir}/simple/textarea.ftl" />
</#if>
</#if>