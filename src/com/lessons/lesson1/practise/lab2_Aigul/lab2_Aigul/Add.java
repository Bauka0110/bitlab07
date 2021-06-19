//package bitlab.askar.module2.lesson1.lab2_Aigul;
//
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Add extends JPanel {
//    private MainFrame parent;
//
//    private JLabel labelName;
//    private JLabel labelSurname;
//    private JLabel labelFaculty;
//    private JLabel labelGroup;
//
//    private JTextField nameField;
//    private JTextField surnameField;
//    private JTextField groupField;
//
//    private String[] faculty = new String[]{"Information Technologies", "Economics", "Mathematics"};
//
//    private JButton add;
//    private JButton back;
//
//    public Add(MainFrame parent) {
//
//        for (int i = 0; i<faculty.length; i++) {
//        }
//
//        this.parent = parent;
//
//        setSize(500,500);
//        setLayout(null);
//
//        labelName = new JLabel("NAME:");
//        labelName.setSize(100,30);
//        labelName.setLocation(100,80);
//        add(labelName);
//
//        labelSurname = new JLabel("SURNAME:");
//        labelSurname.setSize(100,30);
//        labelSurname.setLocation(100,130);
//        add(labelSurname);
//
//        labelFaculty = new JLabel("FACULTY:");
//        labelFaculty.setSize(100,30);
//        labelFaculty.setLocation(100,180);
//        add(labelFaculty);
//
//        labelGroup = new JLabel("GROUP:");
//        labelGroup.setSize(100,30);
//        labelGroup.setLocation(100,230);
//        add(labelGroup);
//
//        nameField = new JTextField();
//        nameField.setSize(150,30);
//        nameField.setLocation(220,80);
//        add(nameField);
//
//        surnameField = new JTextField();
//        surnameField.setSize(150,30);
//        surnameField.setLocation(220,130);
//        add(surnameField);
//
//        groupField = new JTextField();
//        groupField.setSize(150,30);
//        groupField.setLocation(220,230);
//        add(groupField);
//
//        JComboBox facultyBox = new JComboBox(faculty);
//        facultyBox.setSize(150,30);
//        facultyBox.setLocation(220,180);
//        add(facultyBox);
//
//        add = new JButton("ADD");
//        add.setSize(120,30);
//        add.setLocation(100,300);
//        add(add);
//
//        add.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = nameField.getText();
//                String surname = surnameField.getText();
//                String group = groupField.getText();
//                String faculty = (String) facultyBox.getSelectedItem();
//
//                if (!name.equals("") && !surname.equals("") && !group.equals("")){
//                    Students students = new Students(MainFrame.studentsCount, name, surname, faculty, group);
//                    System.out.println(students.toString());
//                    MainFrame.students[MainFrame.studentsCount] = students;
//                    MainFrame.studentsCount++;
//                    nameField.setText("");
//                    surnameField.setText("");
//                    groupField.setText("");
//                    facultyBox.setSelectedIndex(0);
//                }
//            }
//        });
//
//        back = new JButton("Back");
//        back.setSize(120,30);
//        back.setLocation(250,300);
//        add(back);
//
//        back.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                parent.getFirstPage().setVisible(false);
//                parent.getMainMenuPage().setVisible(true);
//            }
//        });
//    }
//}