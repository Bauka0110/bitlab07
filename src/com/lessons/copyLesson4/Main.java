package com.lessons.copyLesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("[1] ADD USERS");
            System.out.println("[2] LIST USERS");
            System.out.println("[3] DELETE USERS");
            System.out.println("[4] EXIT");
            int choise = in.nextInt();
            if (choise == 1) {
                System.out.print("Insert Id: ");
                int id = in.nextInt();
                System.out.print("Insert Login: ");
                String login = in.next();
                System.out.print("Insert password: ");
                String password = in.next();

                User user = new User(id, login, password);
                users = getUsersList();
                users.add(user);
                saveUsersList(users);
            } else if (choise == 2) {
                users = getUsersList();
                for (int i = 0; i < users.size(); i++) {
                    System.out.println(i + 1 + ") " + users.get(i));
                }
            }
            else if (choise == 3) {
                System.out.print("Insert index: ");
                int index = in.nextInt();
                if(index >=0 && index < users.size()) {
                    users.remove(index);
                    saveUsersList(users);
                }
            }
            else if (choise == 4) {
                break;
            }
        }
    }

    public static void saveUsersList(ArrayList<User> users) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("memory.txt"));
            for (User u : users) {
                bw.write(u.getId() + "\n");
                bw.write(u.getLogin() + "\n");
                bw.write(u.getPassword() + "\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getUsersList() {
        ArrayList<User> users = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("memory.txt"));
            String id = "";
            while ((id = br.readLine()) != null) {
                int idInt = Integer.parseInt(id);
                String login = br.readLine();
                String password = br.readLine();
                users.add(new User(idInt, login, password));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
