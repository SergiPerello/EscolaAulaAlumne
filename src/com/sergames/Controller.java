package com.sergames;

import java.util.Scanner;

public class Controller {
    public static String askUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void menu(){
        System.out.print("Options available:\n"+
                "Escola:\n"+
                "1- Donar d’alta una escola\n"+
                "2- Mostra la info de tota l’escola\n"+
                "Alumne:\n"+
                "3- Donar alta alumne\n"+
                "7- Fer progressar un alumne\n"+
                "4- Mostrar tota la info d’un alumne\n"+
                "5- Modificar les dades d’un alumne\n"+
                "6- Dona de baixa alumne\n"
        );
    }

    public void theSwitch(int option) {
        String result = "";
        switch (option){
            case 1://Create school
                createSchool("SchoolName");
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
                result = "Not valid input!";
                break;
        }
    }

    private void createSchool(String name) {
        School school = new School(name);
    }
}
