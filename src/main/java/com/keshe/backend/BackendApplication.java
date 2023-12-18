package com.keshe.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Slf4j
@ComponentScan(basePackages = {"com.keshe"})
public class BackendApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(BackendApplication.class, args);
        }catch (Throwable e){
            e.printStackTrace();
        }
        log.info("启动成功");
    }

}
