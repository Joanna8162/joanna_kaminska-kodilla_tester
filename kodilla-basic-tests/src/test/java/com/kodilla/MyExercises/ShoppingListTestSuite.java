package com.kodilla.MyExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTestSuite {

    ShoppingList shoppingList;

    @BeforeEach
    public void setUp(){
        shoppingList = new ShoppingList();
        shoppingList.addItemToList("Ania", "mleko");
        shoppingList.addItemToList("Marek", "jajka");
    }

    @Test
    void TestAddItemToList() {
        shoppingList.addItemToList("Ania", "masło");
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("mleko");
        expectedResult.add("masło");

        Map<String, List<String>> map = shoppingList.showMap();
        assertEquals(expectedResult, map.get("Ania"));
    }

    @Test
    void TestCountItemsPerUser() {
        shoppingList.addItemToList("Ania", "masło");
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Ania", 2);
        expectedResult.put("Marek", 1);

        assertEquals(expectedResult, shoppingList.countItemsPerUser());
    }
}