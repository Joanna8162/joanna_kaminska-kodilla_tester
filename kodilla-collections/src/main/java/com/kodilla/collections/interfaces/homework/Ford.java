package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 30;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = Math.max(0, this.speed - 20);
    }
}
