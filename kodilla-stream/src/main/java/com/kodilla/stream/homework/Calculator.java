package com.kodilla.stream.homework;


public class Calculator {

    // --- ADDITION ---

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    // --- SUBTRACTION ---

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // --- MULTIPLICATION ---

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // --- DIVISION ---

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nie dzielimy przez zero (int)!");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Nie dzielimy przez zero (double)!");
        }
        return a / b;
    }
}
