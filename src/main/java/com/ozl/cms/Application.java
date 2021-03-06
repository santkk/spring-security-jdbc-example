package com.ozl.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }
    
}