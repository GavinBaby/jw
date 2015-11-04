<@s.property value="parameters.noteall.replaceAll(' ','&nbsp;').replaceAll('\r\n','<br>').replaceAll('\n','<br>').replaceAll('\r','<br>')" escapeHtml=false/>

<#if parameters.editCondition??>
<#if parameters.editCondition="*">
<br>
<#include "/${parameters.templateDir}/simple/notetextarea.ftl" />
<#elseif parameters.editCondition?index_of(parameters.id) = -1>


<#else>
<br>
<#include "/${parameters.templateDir}/simple/notetextarea.ftl" />
</#if>
</#if>