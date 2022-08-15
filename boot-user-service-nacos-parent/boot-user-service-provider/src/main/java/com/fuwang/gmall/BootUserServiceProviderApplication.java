package com.fuwang.gmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDubbo
@SpringBootApplication(scanBasePackages = "com.fuwang.gmall")
@MapperScan("com.fuwang.gmall.mapper")
@RefreshScope // 动态刷新配置
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}
