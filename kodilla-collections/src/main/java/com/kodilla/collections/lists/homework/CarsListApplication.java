package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Opel(50));
        cars.add(new Ford(120));
        cars.add(new Toyota(75));

        System.out.println("Cars in the collection:");
        for (Car car : cars){
            describeCar(car);
        }
        cars.remove(1); // usuwamy Forda

        Car toyota = new Toyota(75);
        cars.remove(toyota); // usuwamy Toyotę

        System.out.println("Collection after modifications: ");
        for (Car car : cars) {
            describeCar(car);
        }
        System.out.println("Current number of cars in collection: " + cars.size());

    }
}
