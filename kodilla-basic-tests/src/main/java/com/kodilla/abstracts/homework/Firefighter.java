package com.kodilla.abstracts.homework;

public class Firefighter extends Job {

    public Firefighter() {
        super(5900, "to protect life and property by responding to and mitigating emergencies, primarily fires.");
    }

    @Override
    public void describeJob() {
        System.out.println
                ("Firefighter's main responsibility is to " + responsibilities + " Their average salary is: " + salary + ".");
    }
}
