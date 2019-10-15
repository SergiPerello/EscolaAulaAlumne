package com.sergames;

import java.util.Arrays;

public class Classroom {
    Student[] students;

    public Classroom(int size) {
        students = new Student[size];
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "students=" + Arrays.toString(students) +
                ", size=" + students.length +
                '}';
    }
}
