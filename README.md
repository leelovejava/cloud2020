# 尚硅谷2020最新版SpringCloud(H版&alibaba)框架开发教程全套完整版从入门到精通(大牛讲授spring cloud)

## 0. 视频地址

[视频教程](https://www.bilibili.com/video/av93813318)

## 1. 笔记
1) doc目录

2) 工具

下载[MindManager 2020](http://dwnld.mindjet.com/stubs/Builds/MindManager2020/20_0_334/64Bit/MindManager%202020.msi)

激活码
```text
2019: MP19-777-APE8-1162-BD8E

2020: MP20-345-DP56-7778-919A
```

3) github下载失败

[gitee导入github仓库](https://gitee.com/projects/import/github/status)

## 2. 启动前准备
### 2.1 数据库
* 执行sql脚本 doc/db2019.sql
* 修改数据库的配置

```text
cloud-provider-payment8001\src\main\resources\application.yml中
mysql的用户名和密码
```

### 2.2 修改hosts
找到C:\Windows\System32\drivers\etc路径下的hosts文件,添加

```text
127.0.0.1 eureka7001.com
127.0.0.1 eureka7002.com
```
### 2.3 修改zookeeper的地址

cloud-provider-payment8004\src\main\resources\application.yml

spring.cloud.zookeeper.connect-string=localhost:2181

## 3 软件
* Zookeeper
* consul
* JMeter
* RabbitMq
* [Seata-server](https://github.com/seata/seata/releases/download/v0.9.0/seata-server-0.9.0.zip)
* zipkin-server
