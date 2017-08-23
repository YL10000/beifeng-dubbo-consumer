# beifeng-dubbo-consumer
dubbo框架consumer端，可以直接调用provider端暴露的接口，就像调用本地代码一样

该项目依赖于beifeng-dubbo-api项目，所以要先下载beifeng-dubbo-api项目安装到本地仓库，在进行beifeng-dubbo-consumer项目的安装和启动

在启动该项目前必须保证zookeeper和provider处于正常启动状态
http://localhost:8081/consumer/dubbo   查看控制台是否调用provider端的数据
