package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.UsersRepository.getUsersList;
import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTestSuite {

    List<User> userList;

    @BeforeEach
    public void setUp() {
        userList = new ArrayList<>();
        userList.add(new User("Walter White", 40, 7, "Chemists"));
        userList.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        userList.add(new User("Tuco Salamanca", 39, 116, "Manager"));
    }

    @Test
    void shouldVerifyAverageNumberOfPostsOfUsersAboveOrEqual40() {
        double actualResult = ForumStats.averageNumberOfPostsOfUsersAboveOrEqual40(userList);
        double expectedResult = 7.0;
        assertEquals(expectedResult, actualResult, 0.0000001);
    }

    @Test
    void shouldVerifyAverageNumberOfPostsOfUsersBelow40() {
        double actualResult = ForumStats.averageNumberOfPostsOfUsersBelow40(userList);
        double expectedResult = 2382.0;
        assertEquals(expectedResult, actualResult, 0.0000001);
    }
}