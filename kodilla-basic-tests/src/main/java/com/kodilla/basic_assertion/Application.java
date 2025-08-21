package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);

        boolean correctSubstract = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSubstract) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = (int) calculator.squared(a);

        boolean correctSquare = ResultChecker.assertEquals(25, squareResult);
        if (correctSquare) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczb " + a);
        }
    }
}
