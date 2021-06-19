package com.lessons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    protected MainMenu menu;
    protected FirstPage first;

    public MainFrame() {
        setSize(450,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bitlab Application");
        setLayout(null);

        menu = new MainMenu();
        menu.setVisible(true);
        add(menu);

        first = new FirstPage();
        first.setVisible(false);
        add(first);
    }

    public void showFirst() {
        menu.setVisible(false);
        first.setVisible(true);
    }

    public void showMenu() {
        first.setVisible(false);
        menu.setVisible(true);
    }
}
