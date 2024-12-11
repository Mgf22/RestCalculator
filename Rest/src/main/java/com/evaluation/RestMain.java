package com.evaluation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class RestMain {
    public static void main(String[] args) {
        SpringApplication.run(RestMain.class, args);
    }
}