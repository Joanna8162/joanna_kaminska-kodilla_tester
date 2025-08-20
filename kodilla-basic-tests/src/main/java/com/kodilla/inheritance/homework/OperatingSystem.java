package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int year;

    public OperatingSystem(int year){
        this.year = year;
    }

    public void turnOn(){
        System.out.println("System is on.");
    }

    public void turnOff(){
        System.out.println("System is off.");
}
}
