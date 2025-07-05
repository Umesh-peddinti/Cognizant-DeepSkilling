package com.example.assertions;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    void testStringEquality() {
        String expected = "JUnit";
        String actual = "JUnit";
        assertEquals(expected, actual, "Strings should match");
    }

    @Test
    void testBooleanCondition() {
        int number = 10;
        assertTrue(number > 5, "Number should be greater than 5");
        assertFalse(number < 0, "Number should not be negative");
    }

    @Test
    void testNullChecks() {
        Object obj = null;
        Object str = "Hello";

        assertNull(obj, "Object should be null");
        assertNotNull(str, "String should not be null");
    }

    @Test
    void testArrayEquality() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual, "Arrays should be equal");
    }

    @Test
    void testSameObject() {
        String a = "Hello";
        String b = a;
        String c = new String("Hello");

        assertSame(a, b, "Both references should point to the same object");
        assertNotSame(a, c, "References should not point to the same object");
    }
}
