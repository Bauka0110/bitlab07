package com.lessons.lesson8;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageDataa implements Serializable {
    private String operationType;
    private ArrayList<Book> books;
    private Book book;

    public PackageDataa() {
    }

    public PackageDataa(String operationTye, ArrayList<Book> books, Book book) {
        this.operationType = operationTye;
        this.books = books;
        this.book = book;
    }

    public String getOperationTye() {
        return operationType;
    }

    public void setOperationTye(String operationTye) {
        this.operationType = operationTye;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String toString() {
        return book + " ||| " + books + " | OperationType: " + operationType;
    }
}
