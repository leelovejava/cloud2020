package com.atguigu.springcloud.alibaba.service;
import com.atguigu.springcloud.alibaba.domain.*;

/**
 * @author zzyy
 * @date 2020/3/8 13:55
 **/
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
