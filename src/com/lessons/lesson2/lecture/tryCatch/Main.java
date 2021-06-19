package com.lessons.lesson2.lecture.tryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        try {
            num = in.nextInt();
        }
        catch (Exception e) {
            num = 0;
            e.printStackTrace();
        }
        System.out.println(num * num);
        System.out.println("Finished");
    }
}
