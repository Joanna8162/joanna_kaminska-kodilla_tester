package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();
        directory.put(
                new Principal("Marek Nowak"),
                new School("XI LO", new ArrayList<>(Arrays.asList(28, 40, 21, 30, 27))));

        directory.put(
                new Principal("Anna Kowalska"),
                new School("II LO", new ArrayList<>(Arrays.asList(12, 30, 29, 33, 19))));

        directory.put(
                new Principal("Jan Malinowski"),
                new School("Zespół Szkół Ekonomicznych", new ArrayList<>(Arrays.asList(28, 31, 18, 42, 25))));

        directory.put(
                new Principal("Tomasz Lis"),
                new School("Liceum Sportowe", new ArrayList<>(Arrays.asList(31, 20, 35, 15, 20))));


        for (Map.Entry<Principal, School> school : directory.entrySet()) {
            System.out.println("Dyrektor: " + school.getKey().getPrincipal());
            System.out.println("Szkoła: " + school.getValue().getSchoolName());
            System.out.println("Liczby uczniów w klasach: " + school.getValue().getStudentsNumberInClasses());
            int suma = 0;
            for (Integer n : school.getValue().getStudentsNumberInClasses()) {
                suma += n;
            }
            System.out.println("Łączna liczba uczniów w szkole: " + suma);
            System.out.println("-------------------");
        }
    }
}
