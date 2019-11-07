package com.sergames;

import java.util.Arrays;

public class Classroom {
    Student[] students;

    public Classroom(int size) {
        students = new Student[size];
    }

    public void addStudent(String name, String enrollment){
        students[getLastPosition()]= new Student(name, enrollment);
    }
    public Student getStudent(String enrollment){
        int i=0;
        Student student = null;
        do{
            if(students[i].getEnrollment().equals(enrollment)) student = students[i];
        }while(i<students.length);
        return student;
    }

    public int getLastPosition(){
        int i = 0;
        while (students[i]!=null){
            i++;
        }
        return i;
    }
    @Override
    public String toString() {
        return "Classroom{" +
                "students=" + Arrays.toString(students) +
                ", size=" + students.length +
                '}';
    }
}