package com.example.performance;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Test;

public class PerformanceTesterTest {

    @Test
    void testTaskCompletesWithinTime() {
        PerformanceTester tester = new PerformanceTester();
        assertTimeout(Duration.ofMillis(500), tester::performTask);
    }
}
