package com.kodilla.MyExercises;

public class MyExercises {

    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        text = text.toLowerCase();
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
