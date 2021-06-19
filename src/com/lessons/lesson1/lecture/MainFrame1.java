package com.lessons.lesson1.lecture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame1 extends JFrame {
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JTextArea area;
    private JComboBox agesBox;
    private Integer[] ages = new Integer[100];

    public MainFrame1() {
        for (int i = 0; i < 100; i++) {
            ages[i] = i;
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bitlab Application");
        setSize(500, 500);
        setLayout(null);

        label = new JLabel("HELLO BITLAB APPLICATION");
        label.setSize(300, 30);
        label.setLocation(100, 100);
        add(label);

        textField = new JTextField();
        textField.setSize(300, 30);
        textField.setLocation(100, 150);
        add(textField);

        agesBox = new JComboBox(ages);
        agesBox.setSize(300, 30);
        agesBox.setLocation(100, 200);
        add(agesBox);

        area = new JTextArea();
        area.setSize(300, 100);
        area.setLocation(100, 300);
        add(area);

        button = new JButton("CONFIRM");
        button.setSize(300, 30);
        button.setLocation(100, 250);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if (!text.equals("")) {
                    area.append(text + " - " + age + "\n");
                    textField.setText("");
                    agesBox.setSelectedIndex(0);
                }
            }
        });
    }
}
