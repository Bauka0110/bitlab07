package com.lessons.lesson6.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 500);
        setLayout(null);

        JLabel label = new JLabel("#");
        label.setSize(30, 30);
        label.setLocation(100, 200);
        add(label);

        JButton button = new JButton("FIRE");
        button.setSize(300, 30);
        button.setLocation(100, 100);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MyThread thread = new MyThread(label);
                thread.start();

            }
        });

        add(button);
    }

}
