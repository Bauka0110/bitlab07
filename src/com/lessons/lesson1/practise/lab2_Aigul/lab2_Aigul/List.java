//package bitlab.askar.module2.lesson1.lab2_Aigul;
//
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class List extends JPanel {
//
//    private MainFrame parent;
//
//    private JLabel label;
//    private JButton back;
//    private JTextArea area;
//
//    private String header[] = {"id","Name","Surname", "Faculty", "Group"};
//    private JTable table;
//    private JScrollPane scrollPane;
//
//    public List(MainFrame parent) {
//        this.parent = parent;
//
//        setSize(500, 500);
//        setLayout(null);
//
//        label = new JLabel("List Student");
//        label.setSize(300, 30);
//        label.setLocation(150, 100);
//        add(label);
//
//        back = new JButton("Back");
//        back.setSize(300, 30);
//        back.setLocation(100, 150);
//        add(back);
//
//        back.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                parent.getSecondPage().setVisible(false);
//                parent.getMainMenuPage().setVisible(true);
//            }
//        });
////
////        table = new JTable();
////        table.setFont(new Font("Calibri", Font.PLAIN, 12));
////        table.setRowHeight(30);
////
////        scrollPane = new JScrollPane(table);
////        scrollPane.setSize(300, 200);
////        scrollPane.setLocation(100, 200);
////        add(scrollPane);
//
//        area = new JTextArea();
//        area.setLocation(50,210);
//        area.setSize(400,300);
//        add(area);
//    }
//
//    public void setAreaByStudents() {
//        area.setText("");
//        for (int i=0;i<MainFrame.studentsCount;i++){
//            String text = "";
//            text += MainFrame.students[i].toString();
//            area.append(text + "\n");
//        }
//    }
//
//
//    public void generateTable(Students[] students){
//
//        Object data[][] = new Object[students.length][5];
//
////        for(int i =0;i<students.length;i++){
////            data[i][0] = i+1;
////            data[i][1] = students[i].getName();
////            data[i][2] = students[i].getSurname();
////            data[i][3] = students[i].getFaculty();
////            data[i][4] = students[i].getGroup();
////        }
//
//        DefaultTableModel model = new DefaultTableModel(data, header);
//        table.setModel(model);
//    }
//}
