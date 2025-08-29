package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {

    public static void displayCarInfo(Car car) {
        System.out.println("-----------------------------");
        describeCar(car);
        System.out.println("Car current speed: " + car.getSpeed());
    }

    public static void describeCar(Car car) {
        if (car instanceof Opel) {
            System.out.println("Car kind: Opel");
        } else if (car instanceof Ford) {
            System.out.println("Car kind: Ford");
        } else if (car instanceof Toyota) {
            System.out.println("Car kind: Toyota");
        } else {
            System.out.println("Car kind: Unknown");
        }
    }
}
