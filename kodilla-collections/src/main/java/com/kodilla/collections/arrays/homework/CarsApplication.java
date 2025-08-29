package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car c : cars) {
            CarUtils.displayCarInfo(c);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(3);
        int s = getRandomSpeed(random);
        Car car;
        if (drawCarKind == 0) {
            car = new Opel(s);
        } else if (drawCarKind == 1) {
            car = new Ford(s);
        } else {
            car = new Toyota(s);
        }
        int times = random.nextInt(4);
        for (int i = 0; i < times; i++) {
            car.increaseSpeed();
        }
        return car;
    }

    public static int getRandomSpeed(Random random) {
        return random.nextInt((70) + 1);
    }
}
