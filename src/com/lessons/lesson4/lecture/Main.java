package com.lessons.lesson4.lecture;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> arr = readerText();

        while (true) {
            System.out.println("[1] ADD");
            System.out.println("[2] LIST");
            System.out.println("[0] EXIT");

            int choise = in.nextInt();
            if (choise == 1) {
                String s = in.next();
                arr.add(s);
                writeText(arr);
            } else if (choise == 2) {
                System.out.println(arr);
            } else {
                break;
            }
        }

    }

    public static ArrayList<String> readerText() {
        ArrayList<String> returnedArr = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
            String s;
            while ((s = reader.readLine()) != null) {
                returnedArr.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnedArr;
    }

    public static void writeText(ArrayList<String> arr) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Text.txt"));
            for (String s : arr) {
                writer.write(s + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
