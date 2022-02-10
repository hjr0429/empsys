package com.lanqiao.empsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = {"com.lanqiao.empsys.mapper"})
@EnableCaching//启用缓存
public class EmpsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpsysApplication.class, args);
    }

}
