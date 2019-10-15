package com.sergames;

import java.util.Scanner;

import static com.sergames.ViewTexts.*;

public class Controller {
    String menuOptions = "[1-7]";
    String maxClassroomSize = "[1-9]|[1-9][0-9]";
    School school;
    public void start(){
        System.out.println(theSwitch(Integer.parseInt(askOptionToUser(menuOptions, menu))));
    }


    public String askOptionToUser(String textToDisplay) {
        System.out.println(textToDisplay);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String askOptionToUser(String pattern, String textToDisplay) {
        System.out.println(textToDisplay);
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if (!answer.matches(pattern)){
            System.out.println(InvalidInput);
            answer = askOptionToUser(pattern,textToDisplay);
        }
        return answer;
    }

    public String theSwitch(int option) {
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
                break;
            case 4://Study student
                break;
            case 5://Read student
                break;
            case 6://Update student
                break;
            case 7://Delete student
                break;
        }
        return result;
    }

    private School createSchool(String name, int classRoomSize) {
        School school = new School(name);
        school.createClassroom(classRoomSize);
        return school;
    }

    private String readSchool(School school){
        String result;
        if (school == null){
            result = InvalidSchool;
        }
        result = school.toString();
        return result;
    }
}
