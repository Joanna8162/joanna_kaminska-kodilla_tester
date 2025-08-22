package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 2.5;
        double b = 1.5;

        double sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(4, sumResult, 0.0001);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double subtractResult = calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(1, subtractResult, 0.0001);
        if (correctSubtract) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double squareResult = calculator.square(a);
        boolean correctSquare = ResultChecker.assertEquals(6.25, squareResult, 0.0001);
        if (correctSquare) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }
}