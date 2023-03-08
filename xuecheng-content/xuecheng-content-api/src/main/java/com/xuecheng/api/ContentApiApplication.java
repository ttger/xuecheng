package com.xuecheng.api;

import com.spring4all.swagger.EnableSwagger2Doc;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@EnableSwagger2Doc
@Slf4j
@SpringBootApplication
@MapperScan("com.xuecheng.model.mapper")
@ComponentScan(basePackages = {"com.xuecheng.model","com.xuecheng.api"})
public class ContentApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentApiApplication.class, args);
        log.info("Content Api Service 启动成功");
    }

}
