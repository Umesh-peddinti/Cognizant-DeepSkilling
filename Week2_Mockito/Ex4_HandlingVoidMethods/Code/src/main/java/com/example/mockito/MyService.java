package com.example.mockito;

public class MyService {
    private final Logger logger;

    public MyService(Logger logger) {
        this.logger = logger;
    }

    public void doWork(String task) {
        // Some logic here
        logger.log("Task done: " + task);
    }
}
