setlocal 

set name="yj-service"
set port=8984
set jarfile=yj-service.jar


rem PubReference
set group1=%COMPUTERNAME% 
IF type_%1==type_PubReference ( 
	set group2=
) ELSE (
	set group2=%COMPUTERNAME% 
)

start %name% /MIN java -Ddubbo.service.group=%group1% -Ddubbo.reference.group=%group2% -Dzkserver="zookeeper.mk.com:2181"  -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=%port% -jar "%cd%\..\%jarfile%"

endlocal









