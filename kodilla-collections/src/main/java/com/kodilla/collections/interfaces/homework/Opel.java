package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    int speed;

    public Opel(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 42;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = Math.max(0, this.speed - 35);
    }
}
