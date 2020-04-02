# 全部通知
curl +X POST "http://config-3344.com:3344/actuator/bus-refresh"

# 公式 http://配置中心ip:配置中心端口/actuator/bus-refresh/{destination}
# destination = 微服务名称：端口号
# 定点通知
curl +X POST "http://config-3344.com:3344/actuator/bus-refresh/config-client:3355"