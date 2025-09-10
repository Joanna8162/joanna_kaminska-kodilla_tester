package com.kodilla.MyExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingList {

    Map<String, List<String>> list = new HashMap<>();

    public List<String> addItemToList(String name, String item) {
        list.putIfAbsent(name, new ArrayList<>());
        list.get(name).add(item);
        return list.get(name);
    }

    public Map<String, List<String>> showMap() {
        return list;
    }

    public Map<String, Integer> countItemsPerUser() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<String>> mapEntry : list.entrySet()) {
            int numberOfItems = mapEntry.getValue().size();
            String name = mapEntry.getKey();
            result.put(name, numberOfItems);
        }
        return result;
    }
}

