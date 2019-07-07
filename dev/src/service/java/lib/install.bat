call mvn install:install-file -Dfile=./dubbo-2.8.4a.jar -DgroupId=com.alibaba -DartifactId=dubbo -Dversion=2.8.4a -Dpackaging=jar

call mvn install:install-file -Dfile=./eap-base-interface-0.0.1.jar -DgroupId=com.mk.eap -DartifactId=eap-base-interface -Dversion=0.0.1 -Dpackaging=jar 
call mvn install:install-file -Dfile=./eap-base-service-0.0.1.jar -DgroupId=com.mk.eap -DartifactId=eap-base-service -Dversion=0.0.1 -Dpackaging=jar 
call mvn install:install-file -Dfile=./eap-common-0.0.1.jar -DgroupId=com.mk.eap -DartifactId=eap-common -Dversion=0.0.1 -Dpackaging=jar 
call mvn install:install-file -Dfile=./eap-component-interface-0.0.1.jar -DgroupId=com.mk.eap -DartifactId=eap-component-interface -Dversion=0.0.1 -Dpackaging=jar 
call mvn install:install-file -Dfile=./eap-component-service-0.0.1.jar -DgroupId=com.mk.eap -DartifactId=eap-component-service -Dversion=0.0.1 -Dpackaging=jar 