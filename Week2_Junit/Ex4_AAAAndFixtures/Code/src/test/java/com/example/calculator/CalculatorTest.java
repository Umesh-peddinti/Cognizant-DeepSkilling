package com.example.calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    void beforeAllTests() {
        System.out.println("Running CalculatorTest class setup...");
    }

    @BeforeEach
    void setup() {
        calculator = new Calculator(); // Arrange
        System.out.println("Test setup done.");
    }

    @AfterEach
    void cleanup() {
        System.out.println("Test cleanup done.");
    }

    @AfterAll
    void afterAllTests() {
        System.out.println("Completed all CalculatorTest methods.");
    }

    @Test
    void testAddition() {
        // Act
        int result = calculator.add(5, 3);

        // Assert
        assertEquals(8, result, "Addition failed");
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "Subtraction failed");
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(6, 7);
        assertEquals(42, result, "Multiplication failed");
    }

    @Test
    void testDivision() {
        double result = calculator.divide(20, 4);
        assertEquals(5.0, result, "Division failed");
    }

    @Test
    void testDivideByZeroThrows() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
