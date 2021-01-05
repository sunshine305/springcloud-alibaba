# springcloud-alibaba
springcloud阿里巴巴项目实战，nacos注册中心，统一的配置管理。sentinel流量管理，削峰限流，seata实现
分布式事务管理，gateway路由管理，实现消费端负载均衡，灰度发布。
#项目运行基础环境
1、nacos
2、seata
3、sentinel
#服务器
1、所有服务器运行环境均为windows环境
2、所有项目运行相关资源均在项目根目录的resource目录下
#服务器启动
1、nacos
单机模式启动
cmd startup.cmd -m standalone
账号密码：nacos/nacos

2、sentinel
启动命令：
java -Dserver.port=8081 -Dcsp.sentinel.dashboard.server=localhost:8081 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.8.0.jar

3、seata
启动：执行seata\bin下seata-server.bat
