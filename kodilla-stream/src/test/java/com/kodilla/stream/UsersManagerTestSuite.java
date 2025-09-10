package com.kodilla.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.UsersManager.*;
import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTestSuite {

    @Test
    void shouldVerifyFilterChemistGroupUsernames() {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Walter White");
        expectedResult.add("Gale Boetticher");
        assertEquals(expectedResult, filterChemistGroupUsernames());
    }

    @Test
    void shouldVerifyFilterUsernamesOlderThan50() {
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedResult, filterUsersOlderThan(50));
    }

    @Test
    void shouldVerifyFilterUsernamesOlderThan40() {
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(new User("Walter White", 50, 7, "Chemists"));
        expectedResult.add(new User("Gus Firing", 49, 0, "Board"));
        expectedResult.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedResult.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedResult, filterUsersOlderThan(40));
    }

    @Test
    void shouldVerifyFilterUsernamesOlderThan25() {
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(new User("Walter White", 50, 7, "Chemists"));
        expectedResult.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        expectedResult.add(new User("Gus Firing", 49, 0, "Board"));
        expectedResult.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedResult.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedResult, filterUsersOlderThan(25));
    }

    @Test
    void shouldVerifyFindUserWithMostPosts() {
        User expectedResult = new User("Jessie Pinkman", 25, 4648, "Sales");
        assertEquals(expectedResult, findUserWithMostPosts());
    }
}