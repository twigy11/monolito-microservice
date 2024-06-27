package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springdoc.core.GroupedOpenApi;

@SpringBootApplication(scanBasePackages = {"com.example.user", "com.example.product", "com.example.order", "com.example.payment"})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("ecommerce-api")
                .pathsToMatch("/**")
                .build();
    }
}
