package com.migu.cache.service.redis;

import com.alibaba.dubbo.config.annotation.Service;
import com.migu.cache.api.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * 文 件 名:  DefaultCacheTemplate.java
 * 版    权:  Copyright 2015 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <1.0.0>
 * 创 建 人:  牟鹏飞
 * 创建时间:  2016/2/3
 */
@Service
public class RedisCacheService implements CacheService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public void set(String key, String value, Long expire) {
        redisTemplate.opsForValue().set(key,value,expire, TimeUnit.SECONDS);
    }

    @Override
    public String get(String key) {
        String value= redisTemplate.opsForValue().get(key);
        return   value;
    }

    @Override
    public  void remove(String key) {
        redisTemplate.delete(key);
    }
}
