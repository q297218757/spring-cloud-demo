package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringCloudZuulSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulSimpleApplication.class, args);
    }

}

