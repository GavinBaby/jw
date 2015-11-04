@echo off
echo %0
for /f "tokens=1-3 delims=\" %%i in (%0) do (java -jar  F:\workspace\jgdgwoa\WebRoot\WEB-INF\lib\mybatis-generator-core-1.3.1.jar -configfile F:\workspace\jgdgwoa\src\mybatis.xml -overwrite  )
pause  