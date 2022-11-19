package com.ysy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.ysy.mapper") //扫描包
public class Spring05MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring05MybatisApplication.class, args);
    }

}
