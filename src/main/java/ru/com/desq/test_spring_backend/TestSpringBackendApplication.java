package ru.com.desq.test_spring_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringBackendApplication implements CommandLineRunner {

    public static void main(String... args) {
        SpringApplication.run(TestSpringBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {}
}
