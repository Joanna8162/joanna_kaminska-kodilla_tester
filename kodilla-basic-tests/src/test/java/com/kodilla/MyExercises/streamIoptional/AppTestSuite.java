package com.kodilla.MyExercises.streamIoptional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTestSuite {
    App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    void shouldVerifyifNullIsSkipped() {
        int result = app.showPhoneNumbers().size();
        assertEquals(3, result);
    }

    @Test
    void shouldCalculateAverageLengthOfUserIds() {
        double result = app.avgIdLength();
        assertEquals(12.0, result, 0.0000001);
    }

    @Test
    void shouldReturnOnlyUsersWithPhoneNumbers() {
        long expected = app.getUsers().stream()
                .filter(u -> u.getPhoneNumber().isPresent())
                .count();

        int actualCount = app.showPhoneNumbers().size();

        assertEquals(expected, actualCount);
    }

    @Test
    void shouldReturnAverageLengthWithinValidRange() {
        double average = app.avgIdLength();
        assertTrue(average >= 0);
        assertTrue(average <= app.getUsers().stream()
                .mapToInt(u -> u.getId().length())
                .max()
                .orElse(0));
    }
}