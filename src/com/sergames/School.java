package com.sergames;

public class School {
    private String name;
    private Classroom classroom;

    public School(String name, int classRoomSize) {
        this.setName(name);
        Classroom classroom = new Classroom(classRoomSize);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
