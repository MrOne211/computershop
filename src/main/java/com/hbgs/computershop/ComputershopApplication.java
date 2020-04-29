package com.hbgs.computershop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hbgs.computershop.dao")
public class ComputershopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputershopApplication.class, args);
    }

}
