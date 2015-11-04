<#if parameters.editCondition??>
<#if parameters.editCondition="*">
<#include "/${parameters.templateDir}/simple/select.ftl" />
<#elseif parameters.editCondition?index_of(parameters.id) = -1>
<#assign flg=0>
<@s.iterator value="parameters.list">
        <#if parameters.listKey??>
            <#if stack.findValue(parameters.listKey)??>
              <#assign itemKey = stack.findValue(parameters.listKey)/>
              <#assign itemKeyStr = stack.findString(parameters.listKey)/>
            <#else>
              <#assign itemKey = ''/>
              <#assign itemKeyStr = ''/>
            </#if>
        <#else>
            <#assign itemKey = stack.findValue('top')/>
            <#assign itemKeyStr = stack.findString('top')>
        </#if>
        <#if parameters.listValue??>
            <#if stack.findString(parameters.listValue)??>
              <#assign itemValue = stack.findString(parameters.listValue)/>
            <#else>
              <#assign itemValue = ''/>
            </#if>
        <#else>
            <#assign itemValue = stack.findString('top')/>
        </#if>

        <#if tag.contains(parameters.nameValue, itemKey) == true>
        <#assign flg=1>
${itemValue?html}</#if>
</@s.iterator>
<#if flg=0>
&nbsp;
</#if>
<#else>
<#include "/${parameters.templateDir}/simple/select.ftl" />
</#if>
</#if>