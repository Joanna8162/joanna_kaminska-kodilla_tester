package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    double baseLength;
    double sideLength1;
    double sideLength2;
    double hight;

    public Triangle(double baseLength,  double sideLength1, double sideLength2, double hight){
        this.baseLength = baseLength;
        this.hight = hight;
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = 0.5 * baseLength * hight;
        System.out.println("Triangle's surface area is: " + surfaceArea);
        return surfaceArea;
    }

    @Override
    public double circumference() {
        double circumference = baseLength + sideLength1 + sideLength2;
        System.out.println("Triangle's circumference is: " + circumference);
        return circumference;
    }
}
