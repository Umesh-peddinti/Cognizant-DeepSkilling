package com.example.junitdemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 7;
        int expected = 12;
        int result = a + b;
        System.out.println("Running testAddition: " + a + " + " + b + " = " + result);
        assertEquals("Addition result should be 12", expected, result);
    }

    @Test
    public void testStringConcatenation() {
        String part1 = "Hello";
        String part2 = "World";
        String result = part1 + " " + part2;
        System.out.println("Running testStringConcatenation: " + result);
        assertEquals("Concatenated string should be 'Hello World'", "Hello World", result);
    }

    @Test
    public void testArrayEquality() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        System.out.println("Running testArrayEquality");
        assertArrayEquals("Arrays should be equal", expected, actual);
    }
}
