package com.cx.other;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
//@MapperScan("com.cx.damai.mapper")
public class DamaiOtherApplication {

    public static void main(String[] args) {
        SpringApplication.run(DamaiOtherApplication.class, args);
    }

}
