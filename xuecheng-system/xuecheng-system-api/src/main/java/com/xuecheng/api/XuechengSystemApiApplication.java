package com.xuecheng.api;

import com.spring4all.swagger.EnableSwagger2Doc;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableSwagger2Doc
@Slf4j
@SpringBootApplication
@MapperScan("com.xuecheng.service.mapper")
@ComponentScan(basePackages = {"com.xuecheng.model","com.xuecheng.api","com.xuecheng.service"})
public class XuechengSystemApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuechengSystemApiApplication.class, args);
    }

}
