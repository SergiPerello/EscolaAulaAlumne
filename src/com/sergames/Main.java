package com.sergames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller a = new Controller();
        String pattern = "[1-7]";
        a.menu();
        a.askOptionToUser(pattern);
        //a.theSwitch();
    }
}
