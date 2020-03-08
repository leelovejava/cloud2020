package com.atguigu.springcloud.alibaba.service;

/**
 * @author zzyy
 * @date 2020/3/8 15:43
 **/
public interface StorageService {
    /**
     * 减库存
     *
     * @param productId
     * @param count
     * @return
     */
    void decrease(Long productId, Integer count);
}
