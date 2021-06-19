package com.lessons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    protected JButton first;
    protected JButton second;

    public MainMenu() {
        setSize(450, 450);
        setLayout(null);
        first = new JButton("FIRST PAGE");
        first.setSize(300, 30);
        first.setLocation(75,100);
        add(first);
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showFirst();
            }
        });

        second = new JButton("SECOND PAGE");
        second.setSize(300, 30);
        second.setLocation(75,140);
        add(second);
    }

}
