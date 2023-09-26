package com.example.finalsdaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalSdaProjectApplication {

    public static void main(String[] args) {
        // Start the Spring Boot application
        SpringApplication.run(FinalSdaProjectApplication.class, args);
    }

    public String myMethod() {
        return "Real Result";
    }
}
