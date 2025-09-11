package com.kodilla.optional.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {

    @Test
    void shouldReturnTeacherNameWhenTeacherIsAssigned() {
        Teacher teacher = new Teacher("Profesor Kowalski");
        Student student = new Student("Marek Nowak", teacher);
        String result = Application.getTeacherName(student);
        assertEquals("Profesor Kowalski", result);
    }

    @Test
    void shouldReturnTeacherNameWhenTeacherIsNull() {
        Student student = new Student("Anna Wrona", null);
        String result = Application.getTeacherName(student);
        assertEquals("<undefined>", result);
    }

    @Test
    void shouldShowStudentsWithoutTeacher() {
        Application application = new Application();
        List<Student> realResult = application.showStudentsWithoutTeacher();
        List<Student> expectedResult = new ArrayList<>();
        expectedResult.add(new Student("Anna Wrona", null));
        expectedResult.add(new Student("Klaudia Juszczyk", null));
        assertEquals(expectedResult, realResult);
    }

    @Test
    void shouldReturnFiveSampleStudents() {
        List<Student> students = Application.getSampleStudents();
        assertEquals(5, students.size());
    }

}