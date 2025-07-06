package com.example.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CalculatorAdditionTest.class,
    CalculatorSubtractionTest.class
})
public class AllTests {
}