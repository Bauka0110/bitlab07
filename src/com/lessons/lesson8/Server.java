package com.lessons.lesson8;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2000);
            int id = 0;
            while (true) {
                Socket socket = server.accept();
                id++;
                System.out.println("Client #" + id + " Connected");
                ClientHandler ch = new ClientHandler(socket, id);
                ch.start();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
