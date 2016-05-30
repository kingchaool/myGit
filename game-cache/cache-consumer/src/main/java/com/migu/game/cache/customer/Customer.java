package com.migu.game.cache.customer;

import com.migu.cache.api.CacheService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 文 件 名:  Customer.java
 * 版    权:  Copyright 2015 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <1.0.0>
 * 创 建 人:  牟鹏飞
 * 创建时间:  2016/2/5
 */
public class Customer {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:/spring-config/spring-*.xml");
        CacheService cacheService = (CacheService) ctx.getBean("cacheService");
        cacheService.set("test","testVelue",10000L);
        System.out.println(cacheService.get("test"));
        try {
            System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
