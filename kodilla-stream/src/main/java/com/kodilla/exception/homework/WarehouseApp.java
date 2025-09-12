package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("674438uh72788jq2"));
        warehouse.addOrder(new Order("66r74hf398rfh3fw"));
        warehouse.addOrder(new Order("367r89jrf38r5ifo"));
        warehouse.addOrder(new Order("183yrjf389hjf93a"));
        warehouse.addOrder(new Order("hfuwhfn9wru35i33"));

        try {
            warehouse.getOrder("wwwwwwwwwwwwwww");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order does not exist");
        }
    }
}
