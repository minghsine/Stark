package com.minghsin.stark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.minghsin.stark.mapper")
public class StarkApplication {

    public static void main(String[] args) {

        SpringApplication.run(StarkApplication.class, args);
    }

}
