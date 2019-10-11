package com.sergames;

import javax.swing.text.View;
import java.util.Scanner;

public class Controller {
    String menuOptions = "[1-7]";
    String maxClassroomSize = "[1-100]";
    public void start(){
        theSwitch(Integer.parseInt(askOptionToUser(menuOptions,ViewTexts.menu)));
    }


    public String askOptionToUser(String textToDisplay) {
        System.out.println(textToDisplay);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String askOptionToUser(String pattern, String textToDisplay) {
        System.out.println(textToDisplay);
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (!answer.matches(pattern)){
            System.out.println(ViewTexts.InvalidInput);
            answer = askOptionToUser(pattern);
        }
        return answer;
    }

    public void theSwitch(int option) {
        String result = "";
        switch (option){
            case 1://Create school
                createSchool(askOptionToUser(ViewTexts.CreateSchoolName), Integer.parseInt(askOptionToUser(maxClassroomSize,ViewTexts.CreateClassroomSize));
                result = ViewTexts.CreateSchoolSuccess;
                break;
            case 2://Read school
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
            default:
                result = ViewTexts.InvalidInput;
                break;
        }
        //return result;
    }

    private void createSchool(String name, int classRoomSize) {
        School school = new School(name);
        school.createClassroom(classRoomSize);
        System.out.println(school.toString());
    }
}
