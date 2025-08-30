package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }
}
