package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    int speed;

    public Toyota(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 25;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = Math.max(0, this.speed - 30);
    }
}
