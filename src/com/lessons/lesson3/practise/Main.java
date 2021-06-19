package com.lessons.lesson3.practise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Players> players = new ArrayList<>();

        players.add(new Players("Bauka", 21.2, 18));
        players.add(new Players("Alan", 98.96, 11));
        players.add(new Players("Jake", 3.5, 43));
        players.add(new Players("John", 644.6, 32));
        players.add(new Players("Abay", 155.1, 20));
        players.add(new Players("Chris", 666.0, 26));
        players.add(new Players("Rocky", 885.9, 62));
        players.add(new Players("Grigori", 24.6, 15));
        players.add(new Players("Franklin", 957.8, 54));
        players.add(new Players("Robert", 144.5, 30));

        double sumOfPrice = 0;
        int sumOfAge = 0;
        int count = 0;
        double result;
        double result1;
        for (int i = 0; i < players.size(); i++) {
            Players n = players.get(i);
            sumOfPrice += n.getPrice();
            sumOfAge += n.getAge();
            count++;
            System.out.println(players.get(i).toString() + "");
            System.out.println("--------------------");
        }
        double sumOfAge1 = (double) sumOfAge;
        result1 = sumOfAge1 / count;
        result = sumOfPrice / count;
        System.out.println("Price - " + result + " || " + "Age - " + result1);
    }
}
