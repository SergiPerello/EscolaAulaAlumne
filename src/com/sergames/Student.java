package com.sergames;

public class Student {
    private String name;
    private String enrollment;
    private int studyProgress;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEnrollment() {
        return enrollment;
    }
    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public void study(int value){
        this.studyProgress+=value;
    }
}


