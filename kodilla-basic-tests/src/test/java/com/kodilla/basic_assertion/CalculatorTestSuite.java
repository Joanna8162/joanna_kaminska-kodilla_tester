package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        double result = calculator.sum(5, 8);
        assertEquals(13, result, 0.0001);
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(5, 8);
        assertEquals(-3, result, 0.0001);
    }

    @Test
    public void testSquare1() {
        double result = calculator.square(0);
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void testSquare2() {
        double result = calculator.square(-3);
        assertEquals(9, result, 0.0001);
    }

    @Test
    public void testSquare3() {
        double result = calculator.square(9);
        assertEquals(81, result, 0.0001);
    }
}