package com.sergames;

import java.util.Scanner;

import static com.sergames.ViewTexts.*;

public class Controller {
    private School school;
    private String menuOptions = "[1-7]";
    private String maxClassroomSize = "[1-9]|[1-9][0-9]";
    private String maxStudyAmount = "[1-9]|10";
    private String updateStudentOptions = "[1-3]";

    public boolean start(){
        while(true) System.out.println(theSwitch(Integer.parseInt(askOptionToUser(menuOptions, menu))));
    }

    private String askOptionToUser(String textToDisplay) {
        System.out.println(textToDisplay);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    private String askOptionToUser(String pattern, String textToDisplay) {
        System.out.println(textToDisplay);
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if (!answer.matches(pattern)){
            System.out.println(InvalidInput);
            answer = askOptionToUser(pattern,textToDisplay);
        }
        return answer;
    }

    private String theSwitch(int option) {
        String result = "";
        switch (option){
            case 1://Create school
                school = createSchool(askOptionToUser(WriteSchoolName), Integer.parseInt(askOptionToUser(maxClassroomSize, WriteClassroomSize)));
                result = SchoolCreateSuccessfully;
                break;
            case 2://Read school
                System.out.println(readSchool(this.school));
                break;
            case 3://Create student
                createStudent(askOptionToUser(WriteStudentName),askOptionToUser(WriteStudentEnrollment));
                result = StudentCreateSuccessfully;
                break;
            case 4://Study student
                studyStudent(readStudent(askOptionToUser(WriteStudentEnrollment)),askOptionToUser(maxStudyAmount,StudentAskStudy));
                school.getClassroom().checkStudentsProgress();
                break;
            case 5://Read student
                System.out.println(readStudent(askOptionToUser(WriteStudentEnrollment)));
                break;
            case 6://Update student
                updateStudent(readStudent(askOptionToUser(WriteStudentEnrollment)));
                break;
            case 7://Delete student
                deleteStudent(askOptionToUser(WriteNewStudentEnrollment));
                break;
        }
        return result;
    }

    private void deleteStudent(String enrollment) {
        school.getClassroom().deleteStudent(enrollment);
    }

    private School createSchool(String name, int classRoomSize) {
        School school = new School(name);
        school.createClassroom(classRoomSize);
        return school;
    }

    private String readSchool(School school){
        return (school == null)?InvalidSchool:school.toString();
    }

    private void createStudent(String name, String enrollment) {
        school.getClassroom().addStudent(name, enrollment);
    }

    private void studyStudent(Student user, String value) {
        user.study(Integer.parseInt(value));
    }

    private Student readStudent(String enrollment) {
        return school.getClassroom().getStudent(enrollment);
    }

    private void updateStudent(Student student) {
        switch (Integer.parseInt(askOptionToUser(updateStudentOptions,studentUpdateMenu))){
            case 1:
                student.setName(askOptionToUser(WriteNewStudentName));
                break;
            case 2:
                student.setEnrollment(askOptionToUser(WriteNewStudentEnrollment));
                break;
            case 3:
                student.setStudyProgress(Integer.parseInt(askOptionToUser(maxStudyAmount,WriteNewStudyProgress)));
                break;

        }
    }
}
