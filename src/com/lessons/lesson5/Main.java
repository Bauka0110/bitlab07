package com.lessons.lesson5;

import bitlab.askar.module2.lesson5.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("users.txt"));
            users = (ArrayList<User>)inputStream.readObject();
            System.out.println(users);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
