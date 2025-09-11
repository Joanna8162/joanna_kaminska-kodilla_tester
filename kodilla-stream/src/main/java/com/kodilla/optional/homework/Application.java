package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static List<Student> getSampleStudents() {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Marek Nowak", new Teacher("Profesor Kowalski")));
        listOfStudents.add(new Student("Anna Wrona", null));
        listOfStudents.add(new Student("Wojciech Lipa", new Teacher("Profesor Wojnarski")));
        listOfStudents.add(new Student("Klaudia Juszczyk", null));
        listOfStudents.add(new Student("Barbara Marzec", new Teacher("Profesor Marecki")));
        return listOfStudents;
    }

    public static String getTeacherName(Student student) {
        return Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
    }

    public static List<Student> showStudentsWithoutTeacher() {
        List<Student> studentsWithoutTeacher = new ArrayList<>();
        for (Student s : getSampleStudents()) {
            if (s.getTeacher() == null) {
                studentsWithoutTeacher.add(s);
            }
        }
        return studentsWithoutTeacher;
    }

    public static void main(String[] args) {
        List<Student> students = getSampleStudents();
        for (Student student : students) {
            String teacherName = getTeacherName(student);
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
    }
}
