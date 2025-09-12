package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Order> listOfOrders = new ArrayList<>();

    public void addOrder(Order order) {
        listOfOrders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return listOfOrders.stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException());
    }
}