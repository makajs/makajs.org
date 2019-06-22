
echo build $(date)
cd ../../../src/service/java 
mvn clean
mvn clean package install -Dmaven.test.skip=true    
  
echo copy  $(date)
cd ../../../server/docker/dev

rm -rf  dubbox/*.jar
rm -rf  dubbox/lib/*
rm -rf  dubbox/js/*

cp ../../../src/service/java/erp-service/target/*.jar dubbo/ 
cp ../../../src/service/java/erp-service/target/lib/*.* dubbo/lib/ 
cp -rf ../../../src/service/js/* dubbo/js/

rm -rf  nodejs/html/*  
cp ../../../src/web/build/pkg/* nodejs/html/ 
 
