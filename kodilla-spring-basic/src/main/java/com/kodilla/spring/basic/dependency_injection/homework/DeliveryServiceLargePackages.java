package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryServiceLargePackages implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight < 30) {
            System.out.println("Package has normal size, can be sent with normal procedure");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}
