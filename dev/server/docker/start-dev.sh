docker run -d \
    --name demo-erp-dev \
    -p 8088:8086 \
    -e discservice=com.mkdemo.erp.sys.itf.ISysInterfaceService \
    -e zkserver=127.0.0.1:2181 \
    -e dbserver=140.143.248.227 \
    -e dbname=bizdata_dev \
    -e dbuser=cobweb \
    -e dbpwd=Cobweb_created \
   makajs/server-dev;

 #   -v /root/mk-demo-erp/src/web/build/pkg-dev:/usr/local/server/nodejs/html \
 #   -v /root/mk-demo-erp/src/service/js:/usr/local/server/dubbo/js \
 #   -v /root/mk-demo-erp/src/service/java/erp-service/target/lib:/usr/local/server/dubbo/lib \
 #   -v /root/mk-demo-erp/src/service/java/erp-service/target/erp-service.jar:/usr/local/server/dubbo/erp-service.jar \
 