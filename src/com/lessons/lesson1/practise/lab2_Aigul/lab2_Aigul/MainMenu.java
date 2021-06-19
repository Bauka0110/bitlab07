//package bitlab.askar.module2.lesson1.lab2_Aigul;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class MainMenu extends JPanel {
//    private MainFrame parent;
//
//
//    private JButton addButton;
//    private JButton listButton;
//    private JButton exitButton;
//
//    public MainMenu(MainFrame parent) {
//
//        this.parent = parent;
//
//        setSize(500,500);
//        setLayout(null);
//
//        addButton = new JButton("ADD STUDENT");
//        addButton.setSize(300,30);
//        addButton.setLocation(100,100);
//        add(addButton);
//        addButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                parent.getMainMenuPage().setVisible(false);
//                parent.getFirstPage().setVisible(true);
//            }
//        });
//
//        listButton = new JButton("LIST STUDENT");
//        listButton.setSize(300,30);
//        listButton.setLocation(100,150);
//        add(listButton);
//        listButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
////                parent.getSecondPage().generateTable(parent.getStudents());
//                parent.getMainMenuPage().setVisible(false);
//                parent.getSecondPage().setVisible(true);
//                parent.getSecondPage().setAreaByStudents();
//            }
//        });
//
//        exitButton = new JButton("EXIT");
//        exitButton.setSize(300,30);
//        exitButton.setLocation(100,200);
//        add(exitButton);
//        exitButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                System.exit(0);
//            }
//        });
//    }
//}