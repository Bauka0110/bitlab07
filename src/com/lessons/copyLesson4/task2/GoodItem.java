package com.lessons.copyLesson4.task2;

public class GoodItem {
    private String name;
    private int price;

    public GoodItem() {
    }

    public GoodItem(String name, int price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Price: " + price;
    }
}
