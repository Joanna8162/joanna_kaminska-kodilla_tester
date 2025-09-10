package com.kodilla.MyExercises;

import java.sql.SQLOutput;

public class TemperatureConverter {

    double celsiusToFahrenheit(double C) {
        double F = 0;
        if (C < -273.15) {
            throw new IllegalArgumentException("Temperatura poniżej zera absolutnego!");
        } else {
            F = C * 9.0 / 5.0 + 32.0;
        }
        return F;
    }

    double fahrenheitToCelsius(double F) {
        double C = 0;
        if (F < -459.67) {
            throw new IllegalArgumentException("Temperatura poniżej zera absolutnego!");
        } else {
            C = (F - 32.0) * 5.0 / 9.0;
        }
        return C;
    }
}
