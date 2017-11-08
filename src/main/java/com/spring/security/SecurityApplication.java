package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {
    public static void main(String[] args) {
        System.out.println("About to start spring security application..");
        SpringApplication.run(SecurityApplication.class, args);

    }
}
