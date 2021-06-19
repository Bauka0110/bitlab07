package com.lessons.lesson6.GUI;

import javax.swing.*;

public class MyThread extends Thread {
    JLabel label;

    public MyThread(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {

        try {
            for (int i = 100; i < 400; i += 10) {
                Thread.sleep(50);
                label.setLocation(i, 200);
            }
            for (int i = 200; i < 300; i += 10) {
                Thread.sleep(50);
                label.setLocation(399, i);
            }
            for (int i = 400; i > 99; i -= 10) {
                Thread.sleep(50);
                label.setLocation(i, 299);
            }
            for (int i = 300; i > 199; i -= 10) {
                Thread.sleep(50);
                label.setLocation(100, i);
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
