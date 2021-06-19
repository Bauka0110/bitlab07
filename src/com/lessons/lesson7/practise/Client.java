package com.lessons.lesson7.practise;

import com.lessons.lesson7.PackageData;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert Name");
        String name = in.next();
        try {
            Socket socket = new Socket("127.0.0.1", 9999);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true) {
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [2] TO EXIT");
                int choise = in.nextInt();
                if (choise == 1) {
                    System.out.println("Insert message");
                    String message = in.next();
                    Date date = new Date();
                    MessageData md = new MessageData(name, message, date);
                    outputStream.writeObject(md);
                    if ((md = (MessageData) inputStream.readObject()) != null) {
                        System.out.println(md.getMessageText());
                    }
                }
                if (choise == 2) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
