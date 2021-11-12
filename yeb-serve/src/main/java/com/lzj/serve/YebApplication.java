package com.lzj.serve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @date:2021/9/7 8:44
 * @author:yang
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.lzj.serve.mapper"})
@EnableScheduling
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class, args);
    }
}
