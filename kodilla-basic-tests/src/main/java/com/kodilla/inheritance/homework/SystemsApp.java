package com.kodilla.inheritance.homework;

public class SystemsApp {
    public static void main(String[] args) {

        OldSystems retroOS = new OldSystems(2000);
        NewSystems smartOS = new NewSystems(2022);

        retroOS.turnOn();
        retroOS.turnOff();

        smartOS.turnOn();
        smartOS.turnOff();
    }
}
