package com.fuwang.gmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDubbo
@SpringBootApplication(scanBasePackages = "com.fuwang.gmall")
@RefreshScope // 动态刷新配置
public class BootUserServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceConsumerApplication.class, args);
    }

}
