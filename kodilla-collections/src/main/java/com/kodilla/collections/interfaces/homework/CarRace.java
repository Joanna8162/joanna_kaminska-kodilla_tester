package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Opel opel = new Opel(50);
        Toyota toyota = new Toyota(80);
        Ford ford = new Ford(65);

        doRace(opel);
        doRace(toyota);
        doRace(ford);
    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
