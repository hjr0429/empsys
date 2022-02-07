package com.lanqiao.empsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lanqiao.empsys.mapper"})
public class EmpsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpsysApplication.class, args);
    }

}
