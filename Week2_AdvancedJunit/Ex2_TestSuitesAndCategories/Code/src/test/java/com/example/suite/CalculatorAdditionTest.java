package com.example.suite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAdditionTest {

    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
}