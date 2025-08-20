package com.kodilla.inheritance.homework;

public class OldSystems extends OperatingSystem {

    public OldSystems(int year) {
        super(year);
    }

    @Override
    public void turnOn(){
        System.out.println("Loading system... please wait.");
    }

    @Override
    public void turnOff(){
        System.out.println("Power off in progress...");
    }
}
