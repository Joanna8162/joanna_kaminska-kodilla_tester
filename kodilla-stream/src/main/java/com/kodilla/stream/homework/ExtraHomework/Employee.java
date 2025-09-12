package com.kodilla.stream.homework.ExtraHomework;

public class Employee {
    String name;
    String lastname;
    Double salary;
    int age;

    public Employee(String name, String lastname, Double salary, int age) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}