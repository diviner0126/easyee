package com.diviner;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.diviner.modules.*.dao")
public class EasyeeAdminApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(EasyeeAdminApplication.class, args);
        try {
            Runtime.getRuntime().exec("cmd /c start chrome.exe http://localhost:8080/admin/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
