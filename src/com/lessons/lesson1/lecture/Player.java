package com.lessons.lesson1.lecture;

public class Player {
    private String name;
    private int price;
    private String club;

    public Player() {
    }

    public Player(String name, int price, String club) {
        this.name = name;
        this.price = price;
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", club='" + club + '\'' +
                '}';
    }
}
