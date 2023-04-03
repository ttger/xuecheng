package com.xuecheng.api;

import com.spring4all.swagger.EnableSwagger2Doc;
import com.xuecheng.base.utils.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableSwagger2Doc
@Slf4j
@SpringBootApplication
@MapperScan("com.xuecheng.service.mapper")
@ComponentScan(basePackages = {"com.xuecheng.base","com.xuecheng.model","com.xuecheng.api","com.xuecheng.service"})
@EnableDiscoveryClient
public class SystemApiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SystemApiApplication.class, args);
        SpringUtil.set(context);
    }

}
