package com.kodilla.MyExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTestSuite {

   ToDoList test;

    @BeforeEach
    public void setUp(){
        test = new ToDoList();
        test.addAllTasks(Arrays.asList("wynieść śmieci", "task2", "task3", "task4", "task5", "task6", "task7", "task8", "task9", "task10"));
    }

    @Test
    void testAddTask() {
        assertTrue(test.ifTaskExists("wynieść śmieci"));
    }

    @Test
    void testRemoveTask() {
        test.removeTask("wynieść śmieci");
        assertFalse(test.ifTaskExists("wynieść śmieci"));
    }

    @Test
    void TestIfTaskExistsPositive() {
        boolean result = test.ifTaskExists("wynieść śmieci");
        assertTrue(result);
    }

    @Test
    void TestIfTaskExistsNegative() {
        boolean result = test.ifTaskExists("umyć podłogi");
        assertFalse(result);
    }

    @Test
    void testAddTaskOutOfBound() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            test.addTask("task11");
        });
    }

    @Test
    void TestGetAllTasks() {
        List<String> expectedList = Arrays.asList("wynieść śmieci", "task2", "task3", "task4", "task5", "task6", "task7", "task8", "task9", "task10");
        List<String> actualList = test.getAllTasks();
        assertEquals(expectedList, actualList);
    }
}