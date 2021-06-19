package com.lessons.lesson55.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Subject> subjects = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("[1] ADD STUDENT");
            System.out.println("[2] LIST STUDENTS");
            System.out.println("[0] EXIT");
            int choise = in.nextInt();
            if (choise == 1) {
                System.out.print("Name: ");
                String name = in.next();
                System.out.print("Surname: ");
                String surname = in.next();
                System.out.println("[1] ADD SUBJECT");
                System.out.println("[0] MAIN MENU");
                int choise1 = in.nextInt();
                if (choise1 == 1) {
                    System.out.print("Name: ");
                    String name1 = in.next();
                    System.out.print("Credits: ");
                    int credits = in.nextInt();
                    Subject subject = new Subject(name1, credits);
                    subjects.add(subject);
                    Student student = new Student(name, surname, subjects);
                    students.add(student);
                    writeStudents(students);
                } else if (choise1 == 0) {
                    continue;
                }
            } else if (choise == 2) {
                students = readStudents();
                for (Student s : students) {
                    System.out.println(s);
                    System.out.println("------------------------------------");
                }
            } else if (choise == 0) {
                break;
            }
        }
    }

    public static void writeStudents(ArrayList students) {
        try {
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("information.dat"));
            outStream.writeObject(students);
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList readStudents() {
        ArrayList students = new ArrayList<>();
        try {
            File file = new File("information.txt");
            if (file.exists()) {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("information.dat"));
                students = (ArrayList<Student>) inputStream.readObject();
                inputStream.close();
            } else {
                System.out.println("NO SUCH FILE!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
