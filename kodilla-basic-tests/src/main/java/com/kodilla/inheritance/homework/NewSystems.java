package com.kodilla.inheritance.homework;

public class NewSystems extends OperatingSystem {

    public NewSystems(int year) {
        super(year);
    }

    @Override
    public void turnOn(){
        System.out.println("System is now online. Welcome!");
    }

    @Override
    public void turnOff(){
        System.out.println("Goodbye! System is powering down.");
    }
}
