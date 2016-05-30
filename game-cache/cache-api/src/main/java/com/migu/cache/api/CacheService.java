package com.migu.cache.api;

/**
 * 文 件 名:  CacheTemplate.java
 * 版    权:  Copyright 2015 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <对外接口，提供缓存能力>
 * 版    本： <1.0.0>
 * 创 建 人:  牟鹏飞
 * 创建时间:  2016/2/3
 */
public interface CacheService {
    /**
     *把指定键值对存入缓存中,如果缓存中已存在该键，则更新时间已经过期时间
     * @param key 存储键
     * @param value 存储值
     * @param expire 过期时间
     */
    public void set(String key,String value,Long expire);

    /**
     *获取
     * @param key
     * @return
     */
    public String get(String key);


    public void remove(String key);
}
