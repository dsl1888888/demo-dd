echo "开始启动java"
source /etc/profile

#!/bin/bash

nohup java -server -Xmx4g -Xms2g -Xss512k -XX:MaxMetaspaceSize=512m  -XX:+UseG1GC -XX:MaxGCPauseMillis=50 -XX:GCPauseIntervalMillis=200  -jar /data/javajar/demo-provider-service-loanmaster-0.0.1-SNAPSHOT.jar --spring.profiles.active=prodIndia   --server.port=2000 >/dev/null 2>&1 &
echo "启动demo-provider-service完毕"
