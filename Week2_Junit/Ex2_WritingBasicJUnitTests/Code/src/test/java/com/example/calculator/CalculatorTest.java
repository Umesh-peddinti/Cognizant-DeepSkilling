package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddPositiveNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(12, 8);
        assertEquals(20, result, "Adding 12 and 8 should return 20");
    }

    @Test
    public void testSubtractNegativeResult() {
        Calculator calc = new Calculator();
        int result = calc.subtract(4, 10);
        assertEquals(-6, result, "Subtracting 10 from 4 should return -6");
    }

    @Test
    public void testMultiplyWithZero() {
        Calculator calc = new Calculator();
        int result = calc.multiply(0, 15);
        assertEquals(0, result, "Multiplying with zero should return 0");
    }

    @Test
    public void testDivideByOne() {
        Calculator calc = new Calculator();
        int result = calc.divide(99, 1);
        assertEquals(99, result, "Dividing by 1 should return the number itself");
    }
    
    @Test
void testDivideByZeroShouldThrowException() {
    Calculator calc = new Calculator();
    assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0), 
        "Division by zero must throw an exception");
}

}
