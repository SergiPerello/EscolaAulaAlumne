package com.sergames;

public class School {
    private String name;
    private Classroom classroom;

    public School(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
