package com.sumit.week1.SBCohort40;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1Application implements CommandLineRunner {

    private final CakeBaker cakeBaker;

    public Week1Application(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker;
    }

    public static void main(String[] args) {

        SpringApplication.run(Week1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.cakeBaker.bakeCake();
    }
}
