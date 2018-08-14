package com.diviner;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.diviner.modules.*.dao")
public class EasyeeAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyeeAdminApplication.class,args);
    }
}
