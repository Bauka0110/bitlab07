package com.lessons.lesson7.practise;

import com.lessons.lesson7.PackageData;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            System.out.println("WAITING FOR CLIENT");
            Socket socket = server.accept();
            System.out.println("CLIENT CONNECTED");
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            MessageData md = null;
            while ((md = (MessageData) inputStream.readObject()) != null) {
                System.out.println(md.toString());
                outputStream.writeObject(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
