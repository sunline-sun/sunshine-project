package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import java.util.Arrays;


@SpringBootApplication
@EnableAutoConfiguration(exclude = GsonAutoConfiguration.class)
public class SunshineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunshineApplication.class, args);
    }
}
