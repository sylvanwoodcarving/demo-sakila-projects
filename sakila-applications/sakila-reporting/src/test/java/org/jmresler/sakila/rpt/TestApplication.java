package org.jmresler.sakila.rpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(TestApplication.class, args)));
    }
}