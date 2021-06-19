package com.lessons.lesson8;

import com.lessons.lesson7.PackageData;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert Name");
        String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1",2000);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            ArrayList<Book> books = new ArrayList<>();
            Book book;
            while (true) {
                System.out.println("[1] LIST BOOKS");
                System.out.println("[2] ADD BOOKS");
                System.out.println("[0] DISCONNECT FROM SERVER");
                int choise = in.nextInt();
                if (choise == 1) {
                    String operationType = "list";
                    Package Dataa pd = null;
                    if((pd = (PackageDataa) inputStream.readObject())!=null) {

                    }

                }
                else if (choise == 2) {
                    System.out.println("id");
                    int id = in.nextInt();
                    System.out.println("Name");
                    String name1 = in.next();
                    System.out.println("Author");
                    String author = in.next();
                    String operationType = "add";
                    book = new Book(id,name1,author);
                    books.add(book);
                    PackageDataa pd = new PackageDataa(operationType, books, book);
                    outputStream.writeObject(pd);
//                    if((pd = (PackageDataa) inputStream.readObject())!=null) {
//                        System.out.println(pd.getBooks());
//                    }
                }
                else {
                    break;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
