package com.syoki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class Springboot2MorphiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2MorphiaApplication.class, args);
    }
}
