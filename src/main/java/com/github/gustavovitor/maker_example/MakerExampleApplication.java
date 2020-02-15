package com.github.gustavovitor.maker_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MakerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MakerExampleApplication.class, args);
    }

}
