package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    double radius;
    double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = pi * radius * radius;
        System.out.println("Circle's surface area is: " + surfaceArea);
        return surfaceArea;
    }

    @Override
    public double circumference() {
        double circumference = 2 * pi * radius;
        System.out.println("Circle's circumference is: " + circumference);
        return circumference;
    }
}
