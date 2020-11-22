build docker openzipkin server


link:


docker启动rabbitmq并且设置账号密码
http://144.34.158.170:1234/showdoc1234/web/#/1?page_id=198

docker mysql utf8mb4
http://144.34.158.170:1234/showdoc1234/web/#/1?page_id=214


openzipkin

http://144.34.158.170:1234/showdoc1234/web/#/1?page_id=312


example

```

 docker run -d \
--restart always \
-v /etc/localtime:/etc/localtime:ro \
-e MYSQL_USER=root \
-e MYSQL_PASS=123456 \
-e MYSQL_HOST=192.168.0.228 \
-e STORAGE_TYPE=mysql \
-e MYSQL_DB=zipkin \
-e MYSQL_TCP_PORT=3306 \
-e RABBIT_ADDRESSES=192.168.0.222:5672  \
-e RABBIT_USER=admin \
-e RABBIT_PASSWORD=admin \
-e RABBIT_QUEUE=zipkin \
-e RABBIT_VIRTUAL_HOST=/ \
--net host \
--name zipkin \
openzipkin/zipkin



```
