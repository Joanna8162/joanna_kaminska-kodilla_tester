package com.kodilla.abstracts.homework;

public class Lawyer extends Job {
    public Lawyer() {
        super(8600, "to represent and advise clients on legal matters.");
    }

    @Override
    public void describeJob() {
        System.out.println
                ("Lawyer's main responsibility is to " + responsibilities + " Their average salary is: " + salary + ".");
    }
}
