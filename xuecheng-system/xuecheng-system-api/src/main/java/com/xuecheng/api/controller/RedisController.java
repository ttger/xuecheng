package com.xuecheng.api.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
@Slf4j
public class RedisController {
    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Autowired
    RedissonClient redissonClient;

    @ApiOperation(value = "设置redis key")
    @GetMapping("/set")
    public String setKV(String key, String value){
        log.info("开始写入");
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set(key, value);
        return "写入成功";
    }

    @ApiOperation(value = "设置redis key")
    @GetMapping("/get")
    public String getKV(String key){
        log.info("开始读取");
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        String s = ops.get(key);
        return "获取成功:"+key+"="+s;
    }

    @ApiOperation(value = "设置redisson lock")
    @GetMapping("/addGoods")
    public String addGoods(String goodsId){
        log.info("开始加商品");
        //获取锁
        RLock redissonLock = redissonClient.getLock(goodsId);
        //枷锁
        redissonLock.lock();
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        return "ok";
    }

}
