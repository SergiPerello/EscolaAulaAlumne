package com.sergames;

public class Student {
    private String name;
    private String enrollment;
    private int studyProgress;

    public Student(String name, String enrollment) {
        this.name = name;
        this.enrollment = enrollment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void study(int value){
        this.studyProgress+=value;
    }
    public int getStudy() { return this.studyProgress; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enrollment='" + enrollment + '\'' +
                ", studyProgress=" + studyProgress +
                '}';
    }
}