package com.atguigu.springcloud.alibaba.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 库存服务
 *
 * @author zzyy
 * @date 2020/3/8 13:56
 **/
@Service
public interface AccountService {
    /**
     * 减库存
     *
     * @param userId 用户id
     * @param money  金额
     * @return
     */
    void decrease(Long userId, BigDecimal money);
}
