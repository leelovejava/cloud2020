package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zzyy
 * @date 2020-02-18 17:27
 **/
@Configuration
public class ApplicationContextConfig {
    /**
     * applicationContext.xml <bean id="" class=""> </bean>
     * LoadBalanced 负载均衡
     * @return
     */
    @Bean
    /// 使用自定义负载均衡规则 @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
