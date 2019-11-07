package com.cyt.cunyuetang.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.cyt.cunyuetang.service.modules.*.dao"})
public class CunyuetangServiceApplication {
    public static void main( String[] args ) {
        SpringApplication.run(CunyuetangServiceApplication.class);
        System.out.println( "^~^ ---------- cunyuetang server服务启动成功! ----------^~^" );
    }
}
