package com.kodilla.MyExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradesTestSuite {

    StudentGrades studentGrades;
    Student student;
    Student student2;

@BeforeEach
public void setUp(){
    studentGrades = new StudentGrades();
    student = new Student("Anna", "Nowak");
    studentGrades.addGrade(student, 4.5);
    studentGrades.addGrade(student, 5.0);
    student2 = new Student("Wojciech", "Kowalski");
    studentGrades.addGrade(student2, 0.0);
}

    @Test
    void testAddGrade() {
        studentGrades.addGrade(student, 3.0);
        List<Double> expectedGrades = Arrays.asList(4.5, 5.0, 3.0);
        List<Double> actualGrades = studentGrades.getGrades(student);
        assertEquals(expectedGrades, actualGrades);
    }

    @Test
    void testGetGrades() {
        List<Double> expectedGrades = Arrays.asList(4.5, 5.0);
        List<Double> actualGrades = studentGrades.getGrades(student);
        assertEquals(expectedGrades, actualGrades);

    }

    @Test
    void calculateAverage() {
        assertEquals(4.75, studentGrades.calculateAverage(student), 0.0001);
    }

    @Test
    void getAllStudents() {
    List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Anna", "Nowak"));
        studentList.add(new Student("Wojciech", "Kowalski"));
        assertEquals(studentList, studentGrades.getAllStudents());
    }

    @Test
    void getAllGrades() {
        List<Double> expectedGrades = Arrays.asList(4.5, 5.0, 0.0);
        List<Double> actualGrades = studentGrades.getAllGrades();
        assertEquals(expectedGrades, actualGrades);
    }
}