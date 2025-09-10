package com.kodilla.MyExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyExercisesTestSuite {

    private MyExercises test;

    @BeforeEach
    public void setUp() {
        test = new MyExercises();
    }

    @Test
    public void isPalindromeKajak() {
        boolean result = test.isPalindrome("kajak");
        assertTrue(result);
    }

    @Test
    public void isPalindromeAnna() {
        boolean result = test.isPalindrome("anna");
        assertTrue(result);
    }

    @Test
    public void isPalindromeKajakZDuzej() {
        boolean result = test.isPalindrome("Kajak");
        assertTrue(result);
    }

    @Test
    public void isPalindromeTest() {
        boolean result = test.isPalindrome("test");
        assertFalse(result);
    }

    @Test
    public void isPalindromePustyString() {
        boolean result = test.isPalindrome("");
        assertTrue(result);
    }

    @Test
    public void isPalindromeNull() {
        boolean result = test.isPalindrome(null);
        assertFalse(result);
    }
}