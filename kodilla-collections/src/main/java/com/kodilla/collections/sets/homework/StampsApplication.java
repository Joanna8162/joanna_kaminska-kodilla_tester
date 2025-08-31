package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Polska 100-lecie Niepodległości", "30x40mm", true));
        stamps.add(new Stamp("USA Liberty Forever", "25x38mm", false));
        stamps.add(new Stamp("Japonia Sakura 2020", "40x40mm", true));
        stamps.add(new Stamp("Niemcy Brama Brandenburska", "35x45mm", false));
        stamps.add(new Stamp("Francja Wieża Eiffla", "30x30mm", true));
        stamps.add(new Stamp("Japonia Sakura 2020", "40x40mm", true)); // // Dodany duplikat, żeby sprawdzić, czy HashSet działa poprawnie – nie powinien się pojawić drugi raz
        stamps.add(new Stamp("Niemcy Brama Brandenburska", "35x45mm", false)); // // Dodany duplikat, żeby sprawdzić, czy HashSet działa poprawnie – nie powinien się pojawić drugi raz

        int counter = 1;
        for (Stamp s : stamps) {
            System.out.println(counter + ". " + s);
            counter++;
        }
    }
}
