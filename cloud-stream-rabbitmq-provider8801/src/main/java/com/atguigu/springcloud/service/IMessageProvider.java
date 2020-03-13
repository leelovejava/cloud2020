package com.atguigu.springcloud.service;

/**
 *
 * 消息生产者
 * @author zzyy
 * @version 1.0
 * @create 2020/03/06
 */
public interface IMessageProvider {
    /**
     * 消息发送
     * @return
     */
    String send();
}
