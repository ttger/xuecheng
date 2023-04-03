package com.xuecheng.service.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.google.gson.Gson;
import com.xuecheng.base.constants.Constants;
import com.xuecheng.base.utils.CommonResult;
import com.xuecheng.base.utils.GsonUtil;
import com.xuecheng.base.utils.RedisUtil;
import com.xuecheng.service.mapper.DictionaryMapper;
import com.xuecheng.service.service.DictionaryService;
import org.redisson.api.RLock;
import org.redisson.api.RReadWriteLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.domain.DictionaryEntity;

import java.util.concurrent.TimeUnit;

/**
 * 数据字典Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-08
 */
@Service
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, DictionaryEntity> implements DictionaryService {
    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Autowired
    RedissonClient redissonClient;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    /**
     * 获取字典值
     * @param id id
     * @return CommonResult
     */
    @Override
    public CommonResult getDictionary(String id) {
        DictionaryEntity dictionary = null;
        String key = Constants.DICTIONARY_CACHE_KEY+ id;
        //1.查缓存
        dictionary = this.getDictionayFromCache(key);
        if (null != dictionary){
            return CommonResult.success(dictionary);
        }

        //针对瞬间流量到达此处，且无缓存，重建缓存，需要枷锁，（等待前部分请求构建好缓存，后面的大部分请求可直接走缓存）
        RLock rwLock = redissonClient.getLock(Constants.DICTIONARY_READ_WRITE_LOCK + id);
        try {
            //设定时间内的请求串行，时间过后则释放锁，后继请求并行（理想情况下前面的请求已经构建好缓存）
            rwLock.tryLock(3,TimeUnit.SECONDS);
            //从缓存中读取
            dictionary = this.getDictionayFromCache(id);
            if (null != dictionary){
                return CommonResult.success(dictionary);
            }
            //防止双写不一致问题，此处需要枷锁，
            RReadWriteLock readWriteLock = redissonClient.getReadWriteLock(key);
            RLock rLock = readWriteLock.writeLock();
            rLock.lock();
            //2.查数据库，更新缓存
            try {
                dictionary = dictionaryMapper.selectById(id);
                if (null != dictionary){
                    RedisUtil.set(key,GsonUtil.toJson(dictionary),Constants.CACHE_OVERTIME);
                } else {
                    //缓存穿透了,设置空值
                    RedisUtil.set(key,Constants.CACHE_BLANK,Constants.CACHE_OVERTIME);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                rLock.unlock();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            rwLock.unlock();
        }
        return CommonResult.success(dictionary);
    }

    private DictionaryEntity getDictionayFromCache(String key) {
        DictionaryEntity dictionary = null;
        //1.查缓存
        String data = RedisUtil.get(key);
        if (null != data){
            if (Constants.CACHE_BLANK.equals(data)){
                //无效数据，直接返回
                return new DictionaryEntity();
            }
            //缓存续期
            dictionary = GsonUtil.parseJson(data,DictionaryEntity.class);
            RedisUtil.expire(key,Constants.CACHE_OVERTIME);
            return dictionary;
        }
        return dictionary;
    }

    @Override
    public CommonResult createDictionary(DictionaryEntity dictionary) {
        int insert = dictionaryMapper.insert(dictionary);
        if (insert>0){
            RedisUtil.set(Constants.DICTIONARY_CACHE_KEY+dictionary.getId(),JSONUtils.toJSONString(dictionary),Constants.CACHE_OVERTIME);
            return CommonResult.success();
        }
        return CommonResult.error();
    }


    /**
     *
     * @param dictionary dictionary
     * @return CommonResult
     */
    @Override
    public CommonResult UpdateDictionary(DictionaryEntity dictionary) {
        String key = Constants.DICTIONARY_READ_WRITE_LOCK + dictionary.getId();
        //1.获取锁,读写锁-解决双写缓存不一致问题
        RReadWriteLock readWriteLock = redissonClient.getReadWriteLock(key);
        RLock rLock = readWriteLock.writeLock();
        rLock.lock(30, TimeUnit.SECONDS);
        try {
            //2.更新数据库
            dictionaryMapper.updateById(dictionary);
            //3.更新缓存
            RedisUtil.set(Constants.DICTIONARY_CACHE_KEY+dictionary.getId(),GsonUtil.toJson(dictionary),Constants.CACHE_OVERTIME);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //4.释放锁
            rLock.unlock();
        }
        return null;
    }
}
