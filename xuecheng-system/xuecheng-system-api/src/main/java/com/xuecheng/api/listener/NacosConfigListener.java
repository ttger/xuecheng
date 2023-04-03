package com.xuecheng.api.listener;


import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacos.NacosConfigProperties;
import com.alibaba.cloud.nacos.configdata.NacosConfigDataLoader;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.config.ConfigDataLocation;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

@Component
@Slf4j
public class NacosConfigListener implements ApplicationRunner {

    @Autowired
    NacosConfigProperties nacosConfigProperties;

//    @Autowired

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ConfigService configService = new NacosConfigManager(nacosConfigProperties).getConfigService();
//        NacosConfigProperties.Config config = nacosConfigProperties.getSharedConfigs().get(0);

//        configService.addListener(config.getDataId(), config.getGroup(), new Listener() {
        configService.addListener("mybatis-xuecheng.yml", "xuecheng", new Listener() {
            @Override
            public Executor getExecutor() {
                return null;
            }

            @Override
            public void receiveConfigInfo(String s) {
                if (!StringUtils.isEmpty(s)){
                    log.info("配置文件更新l:"+s);
                }
            }
        });
        log.info("配置文件监听已添加");
    }
}
