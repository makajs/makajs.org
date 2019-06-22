echo stop $(date)
cd scripts
call stop.bat
cd ..

echo build $(date)
cd ..\..\src\service\java 
call mvn clean
call mvn clean package install -Dmaven.test.skip=true  
 
  
echo copy  $(date)
cd ..\..\..\server\local

del /Q  dubbo\*.jar
del /Q  dubbo\logs\*.log
del /Q  dubbo\lib\*
del /Q  dubbo\js\*

copy ..\..\src\service\java\erp-service\target\*.jar dubbo\ 
copy ..\..\src\service\java\erp-service\target\lib\*.* dubbo\lib\ 
xcopy /e /Y ..\..\src\service\js\* dubbo\js\ 


 del /Q  nodejs\html\*  
 copy ..\..\src\web\build\pkg\* nodejs\html\ 


echo run  $(date)
cd scripts
call run.bat
cd ..