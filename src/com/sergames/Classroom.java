package com.sergames;

public class Classroom {
    private Student[] students;

    public Classroom(int size) {
        students = new Student[size];
    }

    public void addStudent(String name, String enrollment){
        students[getLastPosition()]= new Student(name, enrollment);
    }

    public void deleteStudent(String enrollment) {
        for (int i = 0;i<students.length;i++) {
            if(students[i]!=null){
                if(students[i].getEnrollment().equals(enrollment)) {
                    System.out.println(students[i].getName()+" has been removed");
                    students[i] = null;
                }
            }
        }
    }

    public Student getStudent(String enrollment){
        int i=0;
        Student student = null;
        do{
            if(students[i].getEnrollment().equals(enrollment)) student = students[i];
            i++;
        }while(student == null && i<students.length);
        return student;
    }

    private int getLastPosition(){
        int i = 0;
        while (students[i]!=null){
            i++;
        }
        return i;
    }

    public void checkStudentsProgress(){
        for (int i = 0;i<students.length;i++) {
            if(students[i]!=null){
                if (students[i].getStudy()>=10) {
                    System.out.println(students[i].getName()+" has been removed due to hitting max study points(10)");
                    students[i] = null;
                }
            }
        }
    }
    @Override
    public String toString() {
        String result =  "Classroom{size=" + students.length +", students=[";
        for (int i = 0;i<students.length;i++) {
            if (students[i] == null) result += "null, ";
            else result += students[i].toString();
        }
        return result;
    }
}