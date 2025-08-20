package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {

        Person anna = new Person("Anna", 29, new Teacher());
        Person marek = new Person("Marek", 37, new Lawyer());
        Person zbigniew = new Person("Zbigniew", 45, new Firefighter());

        anna.getNameAndAge();
        anna.showResponsibilities();
        marek.getNameAndAge();
        marek.showResponsibilities();
        zbigniew.getNameAndAge();
        zbigniew.showResponsibilities();

    }
    }
