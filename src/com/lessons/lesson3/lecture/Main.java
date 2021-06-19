package com.lessons.lesson3.lecture;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            System.out.println("[1] ADD NAME");
            System.out.println("[2] LIST NAME");
            System.out.println("[3] EDIT NAME");
            System.out.println("[4] REMOVE NAME");
            int choise = in.nextInt();
            if (choise == 1) {
                System.out.print("INSERT NEW NAME: ");
                String name = in.next();
                names.add(name);
            } else if (choise == 2) {
                for (int i = 0; i < names.size(); i++) {
                    String n = names.get(i);
                    System.out.println(i + " " + n);
                }
            } else if (choise == 3) {
                System.out.print("INSERT INDEX: ");
                int index = in.nextInt();
                if (index >= 0 && index <= names.size()) {
                    System.out.print("INSERT NAME: ");
                    String name = in.next();
                    names.set(index, name);
                } else {
                    System.out.println("WRONG INDEX!");
                }
            } else if (choise == 4) {
                System.out.print("INSERT INDEX: ");
                int index = in.nextInt();
                if (index >= 0 && index <= names.size()) {
                    System.out.println("ARE YOU SURE? Y/N");
                    String choiseIn = in.next();
                    choiseIn = choiseIn.toUpperCase();
                    if (choiseIn.equals("Y")) {
                        names.remove(index);
                        System.out.println("USER DELETED!");
                    }
                    else {
                        System.out.println("OK");
                    }
                }
            }
        }
    }
}
