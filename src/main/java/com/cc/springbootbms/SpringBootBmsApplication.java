package com.cc.springbootbms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.cc.springbootbms.dao")
@SpringBootApplication
public class SpringBootBmsApplication extends SpringBootServletInitializer {

    // 3、启动类继承SpringBootServletInitializer类，重写configure()方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootBmsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBmsApplication.class, args);
    }

}
