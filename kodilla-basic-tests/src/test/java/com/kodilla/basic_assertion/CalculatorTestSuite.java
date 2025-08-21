package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    Calculator calculator = new Calculator();
    int a = 5;
    int b = 8;
    double c = 0;
    double d = -3;
    double e = 9;

    @Test
    public void testSum() {
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }
    @Test
        public void testSquare1() {
            double squareResult = calculator.squared(c);
            assertEquals(0, squareResult, 0.001);
        }

    @Test
    public void testSquare2() {
        double squareResult = calculator.squared(d);
        assertEquals(9, squareResult, 0.001);
    }

    @Test
    public void testSquare3() {
        double squareResult = calculator.squared(e);
        assertEquals(81, squareResult, 0.001);
    }
}