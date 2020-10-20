package com.example.arek.dayroutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.HashMap;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DayRoutineApplication {




    public static void main(String[] args) {
        SpringApplication.run(DayRoutineApplication.class, args);
    }

}
