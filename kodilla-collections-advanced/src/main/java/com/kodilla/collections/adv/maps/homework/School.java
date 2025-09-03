package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    String schoolName;
    List<Integer> studentsNumberInClasses = new ArrayList<>();

    public School(String schoolName, ArrayList<Integer> studentsNumberInClasses) {
        this.schoolName = schoolName;
        this.studentsNumberInClasses = studentsNumberInClasses;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getStudentsNumberInClasses() {
        return studentsNumberInClasses;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) && Objects.equals(studentsNumberInClasses, school.studentsNumberInClasses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, studentsNumberInClasses);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentsNumberInClasses=" + studentsNumberInClasses +
                '}';
    }
}