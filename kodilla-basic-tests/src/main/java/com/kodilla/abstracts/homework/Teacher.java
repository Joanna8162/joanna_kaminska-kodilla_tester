package com.kodilla.abstracts.homework;

public class Teacher extends Job {

       public Teacher() {
        super(6600, "facilitate student learning and development.");
    }

    @Override
    public void describeJob() {
            System.out.println
                    ("Teacher's main responsibility is to " + responsibilities + " Their average salary is: " + salary + ".");
        }
    }
