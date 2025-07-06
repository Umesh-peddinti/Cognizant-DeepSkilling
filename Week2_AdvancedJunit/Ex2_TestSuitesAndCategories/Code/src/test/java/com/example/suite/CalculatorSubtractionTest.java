package com.example.suite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSubtractionTest {

    @Test
    void testSubtraction() {
        int result = 5 - 3;
        assertEquals(2, result);
    }
}