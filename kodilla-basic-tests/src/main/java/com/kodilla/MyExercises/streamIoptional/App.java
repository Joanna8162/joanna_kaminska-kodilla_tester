package com.kodilla.MyExercises.streamIoptional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {
    public static final UserRepository userRepository = new UserRepository();

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Numery telefonów: " + app.showPhoneNumbers());
        System.out.println("Średnia długość ID: " + app.avgIdLength());
    }

    public List<String> showPhoneNumbers() {
        return userRepository.getUserList().stream()
                .map(User::getPhoneNumber)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }

    public double avgIdLength() {
        return userRepository.getUserList().stream()
                .mapToInt(u -> u.getId().length())
                .average()
                .orElse(0);
    }

    public List<User> getUsers() {
        return userRepository.getUserList();
    }
}
