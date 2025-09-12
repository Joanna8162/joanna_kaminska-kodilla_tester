package com.kodilla.stream.homework.ExtraHomework;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Anna", "Kowalska", 4500.0, 29));
        employeeList.add(new Employee("Marek", "Nowak", 3200.0, 41));
        employeeList.add(new Employee("Zofia", "Wiśniewska", 6100.0, 35));
        employeeList.add(new Employee("Tomasz", "Wójcik", 2800.0, 50));
        employeeList.add(new Employee("Ewa", "Kamińska", 3900.0, 26));
        employeeList.add(new Employee("Jan", "Lewandowski", 7000.0, 45));
        employeeList.add(new Employee("Ola", "Dąbrowska", 5500.0, 33));
        employeeList.add(new Employee("Kacper", "Zieliński", 2200.0, 23));
        employeeList.add(new Employee("Karolina", "Szymańska", 5100.0, 31));
        employeeList.add(new Employee("Bartek", "Kozłowski", 3400.0, 38));

        employeeList
                .stream()
                .filter(employee -> employee.getSalary() >= 3000 && employee.getSalary() <= 6000)
                .map(Employee::getName)
                .forEach(employee -> System.out.println(employee));
    }
}
