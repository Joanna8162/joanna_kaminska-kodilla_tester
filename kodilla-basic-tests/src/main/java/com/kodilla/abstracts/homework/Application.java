package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(8);
        Circle circle = new Circle(3.5);
        Triangle triangle = new Triangle(12, 9, 7, 10);

        square.surfaceArea();
        square.circumference();
        circle.surfaceArea();
        circle.circumference();
        triangle.surfaceArea();
        triangle.circumference();
    }
}
