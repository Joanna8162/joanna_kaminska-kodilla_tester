package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static double averageNumberOfPostsOfUsersAboveOrEqual40(List<User> users) {
        return users.stream()
                .filter((user -> user.getAge() >= 40))
                .mapToDouble(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static double averageNumberOfPostsOfUsersBelow40(List<User> users) {
        return users.stream()
                .filter((user -> user.getAge() < 40))
                .mapToDouble(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        double avgAboveOrEqual40 = averageNumberOfPostsOfUsersBelow40(users);
        double avgBelow40 = averageNumberOfPostsOfUsersAboveOrEqual40(users);
        System.out.println(avgAboveOrEqual40);
        System.out.println(avgBelow40);
    }
}
