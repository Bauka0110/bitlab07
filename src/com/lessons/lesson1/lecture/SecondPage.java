package com.lessons.lesson1.lecture;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JPanel {
    private MainFrame parent;

    private JLabel label;
    private JButton back;

    private String header[] = {"Name","Price","Club"};
    private JTable table;
    private JScrollPane scrollPane;

    public SecondPage(MainFrame parent) {

        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        label = new JLabel("SECOND PAGE");
        label.setSize(300, 30);
        label.setLocation(100, 100);
        add(label);

        back = new JButton("Back");
        back.setSize(300, 30);
        back.setLocation(100, 150);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getSecondPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });

        //Создаем Таблицу
        table = new JTable();
        table.setFont(new Font("Calibri", Font.PLAIN, 12));
        table.setRowHeight(30);

        //Создаем Панель Для Прокрутки
        scrollPane = new JScrollPane(table);
        scrollPane.setSize(300,200);
        scrollPane.setLocation(100,200);
        add(scrollPane);

    }
    public void generateTable(Player[] players){
        Object data[][] = new Object[players.length][3];

        for(int i =0;i<players.length;i++){
            data[i][0] = players[i].getName();
            data[i][1] = players[i].getPrice();
            data[i][2] = players[i].getClub();
        }

        DefaultTableModel model = new DefaultTableModel(data, header);
        table.setModel(model);

    }
}
