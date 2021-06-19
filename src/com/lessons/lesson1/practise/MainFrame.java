package com.lessons.lesson1.practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextArea textArea;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JComboBox agesBox;
    private JButton button;
    Integer[] ages = new Integer[100];

    public MainFrame() {
        for (int i = 0; i < 100; i++) {
            ages[i] = i;
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(520, 700);
        setLayout(null);

        label1 = new JLabel("Name:");
        label1.setSize(100, 30);
        label1.setLocation(100, 100);
        add(label1);

        label2 = new JLabel("Phone:");
        label2.setSize(100, 30);
        label2.setLocation(100, 150);
        add(label2);

        label3 = new JLabel("Age:");
        label3.setSize(100, 30);
        label3.setLocation(100, 200);
        add(label3);

        textField1 = new JTextField();
        textField1.setSize(200, 30);
        textField1.setLocation(200, 100);
        add(textField1);

        textField2 = new JTextField();
        textField2.setSize(200, 30);
        textField2.setLocation(200, 150);
        add(textField2);

        agesBox = new JComboBox(ages);
        agesBox.setSize(200, 30);
        agesBox.setLocation(200, 200);
        add(agesBox);

        button = new JButton("ADD CONTACT");
        button.setSize(300, 30);
        button.setLocation(100, 260);
        add(button);

        textArea = new JTextArea();
        textArea.setSize(400, 200);
        textArea.setLocation(50, 325);
        textArea.setEditable(false);
        add(textArea);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                String text2 = textField2.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if (!text.equals("")) {
                    if (!text2.equals("")) {
                        textArea.append((text + " - " + text2 + " - " + age + " years" + "\n"));
                        textField1.setText("");
                        textField2.setText("");
                        agesBox.setSelectedIndex(0);
                    }
                }
            }
        });


    }
}
