package com.wk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.wk.mapper"})
public class Boot2SsmApplication {

    public static void main(String[] args) {

        SpringApplication.run(Boot2SsmApplication.class, args);
        System.out.println("hhhhhhhhhhh");
    }

}
