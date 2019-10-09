package com.sergames;

import java.util.Scanner;

public class Controller {
    public static String askOptionToUser(String pattern) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (!answer.matches(pattern)){
            System.out.println(ViewTexts.InvalidInput);
            answer = askOptionToUser(pattern);
        }
        return answer;
    }

    public static void menu(){
        System.out.print("Options available:\n"+
                "Escola:\n"+
                "1- Donar d’alta una escola\n"+
                "2- Mostra la info de tota l’escola\n"+
                "Alumne:\n"+
                "3- Donar alta alumne\n"+
                "4- Fer progressar un alumne\n"+
                "5- Mostrar tota la info d’un alumne\n"+
                "6- Modificar les dades d’un alumne\n"+
                "7- Dona de baixa alumne\n"
        );
    }

    public void theSwitch(int option) {
        String result = "";
        switch (option){
            case 1://Create school
                createSchool("SchoolName", 40);
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
    }

    private void createSchool(String name, int classRoomSize) {
        School school = new School(name, classRoomSize);
    }
}
