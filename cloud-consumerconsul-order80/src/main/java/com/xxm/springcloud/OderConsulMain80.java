package com.xxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OderConsulMain80.class, args);
    }
}
