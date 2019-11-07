package com.sergames;

public class School {
    private String name;
    private Classroom classroom;

    public School(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public Classroom getClassroom() {
        return classroom;
    }

    public void createClassroom(int classroomSize){
        classroom = new Classroom(classroomSize);
    }


    @Override
    public String toString() {
        return "School:\n" +
                "-Name: " + name + "\n" +
                "-Classroom: " + classroom.toString() +
                '}';
    }
}
