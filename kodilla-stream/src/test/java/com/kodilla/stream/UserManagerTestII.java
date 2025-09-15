package com.kodilla.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.kodilla.stream.UsersManager.*;
import static org.junit.jupiter.api.Assertions.*;

class UserManagerTestII {

    List<User> users;
    List<String> expectedStringResult;
    List<User> expectedUserList;
    User expectedUser;

    @BeforeEach
    public void setUp() {
        users = UsersRepository.getUsersList();
        expectedStringResult = new ArrayList<>();
        expectedUserList = new ArrayList<>();
    }

    @Test
    void shouldVerifyFilterChemistGroupUsernames() {

        expectedStringResult = users.stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .collect(Collectors.toList());

        assertEquals(expectedStringResult, filterChemistGroupUsernames());
    }

    @Test
    void shouldVerifyFilterUsernamesOlderThan50() {
        expectedUserList = users.stream()
                .filter(user -> user.getAge() > 50)
                .collect(Collectors.toList());
        assertEquals(expectedUserList, filterUsersOlderThan(50));
    }

    @Test
    void shouldVerifyFilterUsernamesOlderThan40() {
        expectedUserList = users.stream()
                .filter(user -> user.getAge() > 40)
                .collect(Collectors.toList());
        assertEquals(expectedUserList, filterUsersOlderThan(40));
    }

    @Test
    void shouldVerifyFilterUsernamesOlderThan25() {
        expectedUserList = users.stream()
                .filter(user -> user.getAge() > 25)
                .collect(Collectors.toList());
        assertEquals(expectedUserList, filterUsersOlderThan(25));
    }

    @Test
    void shouldVerifyFindUserWithMostPosts() {
        expectedUser = users.stream()
                .max(Comparator.comparing(User::getNumberOfPost))
                .orElse(null);

        assertEquals(expectedUser, findUserWithMostPosts());
    }
}