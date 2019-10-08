package com.sergames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
        askUser();
    }

    private static String askUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void menu(){
        System.out.print("Options available:\n"+
                "1- Donar d’alta una escola\n"+
                "2- Donar alta alumne\n"+
                "3- Dona de baixa alumne\n"+
                "4- Fer progressar un alumne\n"+
                "5- Modificar les dades d’un alumne\n"+
                "6- Mostrar tota la info d’un alumne\n"+
                "7- Mostra la info de tota l’escola\n");
    }
}
