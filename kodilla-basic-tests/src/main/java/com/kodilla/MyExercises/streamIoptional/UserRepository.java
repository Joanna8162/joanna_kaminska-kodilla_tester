package com.kodilla.MyExercises.streamIoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    List<User> userList = new ArrayList<>();

    public UserRepository() {
        userList.add(new User("kasia81383", Optional.empty()));
        userList.add(new User("wojtekaaaa4567", Optional.of("123-456-789")));
        userList.add(new User("klaudusia56", Optional.empty()));
        userList.add(new User("monikaiadam12", Optional.of("144-186-777")));
        userList.add(new User("krzysztofz99", Optional.of("375-515-629")));
    }

    public List<User> getUserList() {
        return userList;
    }
}
