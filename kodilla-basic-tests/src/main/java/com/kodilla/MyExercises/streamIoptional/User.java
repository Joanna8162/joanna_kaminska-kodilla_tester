package com.kodilla.MyExercises.streamIoptional;

import java.util.Optional;

public class User {

    private String id;
    private Optional<String> phoneNumber;

    public User(String id, Optional<String> phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }
}
