<#if parameters.editCondition??>
<#if parameters.editCondition="*">
<#include "/${parameters.templateDir}/simple/text.ftl" />
<#elseif parameters.editCondition?index_of(parameters.id) = -1>

<@s.property value=parameters.name />&nbsp;

<#else>
<#include "/${parameters.templateDir}/simple/text.ftl" />
</#if>
</#if>