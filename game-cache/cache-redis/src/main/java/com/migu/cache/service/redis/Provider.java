package com.migu.cache.service.redis;

import com.migu.cache.api.CacheService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 文 件 名:  Provider.java
 * 版    权:  Copyright 2015 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <1.0.0>
 * 创 建 人:  牟鹏飞
 * 创建时间:  2016/2/5
 */
public class Provider {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:/spring-config/spring-*.xml");
        while (true){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
