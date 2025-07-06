package com.example.performance;

public class PerformanceTester {

    public void performTask() {
        try {
            // Simulating a task that takes 300ms
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
