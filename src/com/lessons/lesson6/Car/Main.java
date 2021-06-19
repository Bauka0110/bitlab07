package com.lessons.lesson6.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("group");

        Car car = new Car(group, "thread", "BMW", 180, 1000);
        Car car2 = new Car(group, "thread", "Mercedes", 200, 1000);
        Car car3 = new Car(group, "thread", "Bugatti", 300, 1000);
        Car car4 = new Car(group, "thread", "Maserati", 240, 1000);
        Car car5 = new Car(group, "thread", "Toyota", 140, 1000);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        for (Car c : cars) {
            c.start();
        }

        ArrayList<Car> sorted = new ArrayList<>();

        while (group.activeCount() > 0) {
            Car removing = null;
            for (Car c : cars) {
                if (!c.isAlive()) {
                    sorted.add(c);
                    removing = c;
                }
            }
            cars.remove(removing);
        }
        sorted.add(cars.get(0));

        for (int i = 0; i < sorted.size(); i++) {
            System.out.println(i + 1 + " is: " + sorted.get(i).carName + " --> " + (sorted.get(i).distance / sorted.get(i).speed) + " seconds");
        }
    }
}
