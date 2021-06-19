package com.lessons.lesson8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread{
    private Socket socket;
    private int id;

    public ClientHandler(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }

    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            PackageDataa pd = null;
            while((pd = (PackageDataa) inputStream.readObject())!=null) {
                if(pd.getOperationTye().equals("add")) {
                    System.out.println(pd.toString());
                    outputStream.writeObject(pd.toString());
                }
                else if(pd.getOperationTye().equals("list")) {
                    pd.toString();
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
