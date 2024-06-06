package com.banking.project.banking_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to bootstrap the Banking Application.
 * This class contains the main method to start the Spring Boot application.
 */
@SpringBootApplication
public class BankingAppApplication {

    /**
     * Main method to start the Spring Boot application.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(BankingAppApplication.class, args);
    }

}