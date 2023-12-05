package com.jfp.co;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.jfp.co")

@SpringBootApplication(scanBasePackages = "com.jfp.co")
@EntityScan(basePackages = "com.jfp.co.model")

public class GestionAfiliadosEmssanarApplication {
    public static void main(String[] args) {
        SpringApplication.run(GestionAfiliadosEmssanarApplication.class, args);
    }
}