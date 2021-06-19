package com.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ThreadGroup threadGroup = new ThreadGroup("Group");
        Operation op1 = new Operation("Add Cleant to Bank", 5);

        op1.start();

    }
}


