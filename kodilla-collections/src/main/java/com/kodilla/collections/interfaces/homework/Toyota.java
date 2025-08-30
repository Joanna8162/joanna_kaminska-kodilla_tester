package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return speed == toyota.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "speed=" + speed +
                '}';
    }
}
