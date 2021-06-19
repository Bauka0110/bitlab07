package com.lessons.lesson2.practise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        User[] users = new User[5];
        for (int i = 0; i< users.length; i++) {
            String name = in.next();
            String surname = in.next();
            int age;
            try {
                age = in.nextInt();
            }
            catch(Exception e) {
                age = 0;
                e.printStackTrace();
                users[i] = new User(name, surname, age);
            }
            System.out.println(age);
            System.out.println("Finished");
        }
    }
}
