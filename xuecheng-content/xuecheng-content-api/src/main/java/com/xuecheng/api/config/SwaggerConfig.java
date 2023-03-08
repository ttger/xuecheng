package com.xuecheng.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@Data
//@Component
@EnableSwagger2
@Configuration
@ConfigurationProperties(prefix = "swagger")
public class SwaggerConfig {
    private boolean enable;     //true
    private String title;       //: 猎聘云系统API在线文档
    private String version;     //: v1.0.0
    private String description; //: swagger2在线生成文档
    private String basepackage; //: com.hzdl.cloud.controller
    private Map<String, String> contact;

    /**
     * 创建API应用
     */
//    @Bean
    public  Docket sysApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(enable)
                .groupName("s")
                .select().apis(RequestHandlerSelectors.basePackage(basepackage)).paths(PathSelectors.any())
                .build()
                .securitySchemes(Arrays.asList(apiKey()))
                .securityContexts(Arrays.asList(securityContext()))
                ;
    }


    /**
     * 创建API的基本信息，会在文档页面中显示
     */

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title(title)
                .version(version)
                .description(description)
                .contact(new Contact(contact.get("name"),contact.get("url"),contact.get("email")))
                .build();
    }

    //设置swagger 的  jwt授权功能
    //  在请求头加上 token
    /**请求头设置*/
    private ApiKey apiKey(){
        return new ApiKey("Authorization","Authorization","header");
    }

    /**需要认证的路径     */
    private SecurityContext securityContext(){
        return SecurityContext.builder()
                .securityReferences(Collections.singletonList(securityReference()))
                .forPaths(PathSelectors.regex("/.*"))
                .build();
    }

    public SecurityReference securityReference(){
        //验证范围
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = new AuthorizationScope("global","accessEverything");
        return new SecurityReference("Authorization",authorizationScopes);
    }

}
