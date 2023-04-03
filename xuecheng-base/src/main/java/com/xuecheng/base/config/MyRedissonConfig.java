package com.xuecheng.base.config;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRedissonConfig {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private String port;

    @Value("${spring.redis.password}")
    private String password;
    /**
     * 所有对Redisson的使用都是通过RedissonClient对象
     * @return
     */
    @Bean(destroyMethod = "shutdown")
    public RedissonClient redissonClient(){
        // 创建配置 指定redis地址及节点信息
        Config config = new Config();
        String url = "redis://"+host+":"+port;
        config.useSingleServer().setAddress(url).setPassword(password);

        // 根据config创建出RedissonClient实例
        return Redisson.create(config);
    }

}