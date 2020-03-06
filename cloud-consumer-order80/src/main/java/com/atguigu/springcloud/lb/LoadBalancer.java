package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author zzyy
 * @create 2020/3/6 16:03
 **/
public interface LoadBalancer {
    /**
     * 获取存活的服务实例列表
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
