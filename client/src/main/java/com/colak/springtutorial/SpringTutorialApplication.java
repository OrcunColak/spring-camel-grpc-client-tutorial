package com.colak.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTutorialApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringTutorialApplication.class, args);

        // The synchronized block ensures the application keeps running indefinitely by making the main thread wait.
        synchronized (SpringTutorialApplication.class) {
            SpringTutorialApplication.class.wait();
        }
    }
}
