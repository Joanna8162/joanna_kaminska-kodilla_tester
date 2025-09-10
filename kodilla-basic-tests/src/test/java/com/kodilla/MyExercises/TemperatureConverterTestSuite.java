package com.kodilla.MyExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTestSuite {

    TemperatureConverter test;

    @BeforeEach
    public void setUp() {
        test = new TemperatureConverter();
    }

    @Test
    void celsiusToFahrenheit() {
        double result = test.celsiusToFahrenheit(40);
        assertEquals(40, result, 0.0001);
    }

    @Test
    void fahrenheitToCelsius() {
        double result = test.fahrenheitToCelsius(40);
        assertEquals(40, result, 0.0001);
    }

    @Test
    void fahrenheitToCelsiusZero() {
        double result = test.fahrenheitToCelsius(0);
        double expectedResult = (0 - 32.0) * 5.0 / 9.0;
        assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    void fahrenheitToCelsiusGraniczna() {
        double result = test.fahrenheitToCelsius(-459.67);
        double expectedResult = (-459.67 - 32.0) * 5.0 / 9.0;
        assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    void celsiusToFahrenheitZero() {
        double result = test.celsiusToFahrenheit(0);
        double expectedResult = (0 * 9.0 / 5.0 + 32.0);
        assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    void celsiusToFahrenheitGraniczna() {
        double result = test.celsiusToFahrenheit(-273.15);
        double expectedResult = (-273.15 * 9.0 / 5.0 + 32.0);
        assertEquals(expectedResult, result, 0.0001);
    }

    void fahrenheitToCelsiusBelowAbsoluteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> {
            test.fahrenheitToCelsius(-500);
        });
    }

    void celsiusToFahrenheitBelowAbsoluteZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> {
            test.celsiusToFahrenheit(-300);
        });
    }
}