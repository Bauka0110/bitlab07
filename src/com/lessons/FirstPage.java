package com.lessons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends Container {
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JComboBox agesBox;
    private JTextArea textArea;
    Integer[] ages = new Integer[100];

    public FirstPage() {
        for (int i = 0; i < 100; i++) {
            ages[i] = i;
        }
        setSize(450, 450);

        setLayout(null);

        label = new JLabel("Hello, How are you?");

        label.setSize(300, 30);
        label.setLocation(75, 100);
        add(label);

        textField = new JTextField();
        textField.setSize(300, 25);
        textField.setLocation(75, 130);
        add(textField);

        agesBox = new JComboBox(ages);
        agesBox.setSize(300, 25);
        agesBox.setLocation(75, 165);
        add(agesBox);

        textArea = new JTextArea();
        textArea.setSize(300, 100);
        textArea.setLocation(75, 240);
        textArea.setEditable(false);
        add(textArea);

        button = new JButton("CONFIRM");
        button.setSize(300, 30);
        button.setLocation(75, 200);
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if (!text.equals("")) {
//                    label.setText(text + " : " + age);
                    textArea.append(text + " : " + age + "\n");
                    textField.setText("");
                    agesBox.setSelectedIndex(0);
                }
            }
        });

        JButton back = new JButton("BACK");
        back.setSize(300, 30);
        back.setLocation(75, 350);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showMenu();
            }
        });
    }
}
