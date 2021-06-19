package com.lessons.lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1978);
            System.out.println("WAITING FOR CLIENT");
            Socket socket = server.accept();
            System.out.println("CLIENT CONNECTED");
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData pd = null;
            while ((pd = (PackageData) inputStream.readObject()) != null) {
                System.out.println(pd.toString());
                if(pd.getMessage().toLowerCase().contains("hello")) {
                    pd.setMessage("HELLO FROM SERVER!!!");
                    outputStream.writeObject(pd);
                }
                else {
                    outputStream.writeObject(null);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
