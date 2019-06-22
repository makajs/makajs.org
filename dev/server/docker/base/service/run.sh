
sh zookeeper/bin/zkServer.sh start

cd dubbo/bin
sh startup.sh
cd ../../

sleep 25

cd nodejs/
sh startup.sh
