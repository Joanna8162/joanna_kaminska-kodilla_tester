package com.kodilla.abstracts.homework;

public class Square extends Shape {

    double sideLength;

    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = sideLength*sideLength;
        System.out.println("Square's surface area is: " + surfaceArea);
        return surfaceArea;
    }

    @Override
    public double circumference() {
        double circumference = sideLength*4;
        System.out.println("Square's circumference is: " + circumference);
        return circumference;
    }
}
