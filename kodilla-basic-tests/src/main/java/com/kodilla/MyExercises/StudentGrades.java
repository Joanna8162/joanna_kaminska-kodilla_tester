package com.kodilla.MyExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StudentGrades {
    Map<Student, List<Double>> grades = new HashMap<>();

    public void addGrade(Student student, double grade) {
        grades.putIfAbsent(student, new ArrayList<>());
        grades.get(student).add(grade);
    }

    public List<Double> getGrades(Student student) {
        if (!grades.containsKey(student)) {
            throw new IllegalArgumentException("Student nie istnieje w systemie.");
        }
        return grades.get(student);
    }

    public double calculateAverage(Student student) {
        if (!grades.containsKey(student)) {
            throw new IllegalArgumentException("Student nie istnieje w systemie.");
        } else {
            List<Double> listOfGrades = grades.get(student);
            if (listOfGrades.isEmpty()) {
                return 0.0;
            }
            double sum = 0;
            for (double note : listOfGrades) {
                sum += note;
            }
            return sum / listOfGrades.size();
        }
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(grades.keySet());
    }

    public List<Double> getAllGrades() {
        List<Double> allGrades = new ArrayList<>();
        for (List<Double> gradesList : grades.values()) {
            allGrades.addAll(gradesList);
        }
        return allGrades;
    }
}
