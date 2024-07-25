package org.jmresler.sakila.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationTestApplication {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(IntegrationTestApplication.class, args)));
    }

}
