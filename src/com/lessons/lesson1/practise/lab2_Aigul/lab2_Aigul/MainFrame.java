//package bitlab.askar.module2.lesson1.lab2_Aigul;
//
//import javax.swing.*;
//
//public class MainFrame extends JFrame {
//
//    private MainMenu mainMenuPage;
//    private Add firstPage;
//    private List secondPage;
//
//
//    public static Students[] students = new Students[10];
//    public static int studentsCount = 0;
//
//    public MainFrame(){
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("Student Application");
//        setSize(500,500);
//        setLayout(null);
//
//        mainMenuPage = new MainMenu(this);
//        mainMenuPage.setVisible(true);
//        add(mainMenuPage);
//
//        firstPage = new Add(this);
//        firstPage.setVisible(false);
//        add(firstPage);
//
//        secondPage = new List (this);
//        secondPage.setVisible(false);
//        add(secondPage);
//
//        students[0] = new Students(1, "Cristiano", "Ronaldo", "Economics", "Juventus");
//        students[1] = new Students(2, "Eden", "Hazard", "Mathematics", "Real Madrid");
//        students[2] = new Students(3, "Leo", "Messi", "Mathematics", "Barcelona");
//        students[3] = new Students(4, "Kylian", "Mbappe", "Economics", "PSG");
//        studentsCount = 4;
//
//    }
//
//    public MainMenu getMainMenuPage() {
//        return mainMenuPage;
//    }
//
//    public Add getFirstPage() {
//        return firstPage;
//    }
//
//    public List getSecondPage() {
//        return secondPage;
//    }
//
//    public Students[] getStudents() {
//        return students;
//    }
//
//    public void setPlayers(Students[] students) {
//        this.students = students;
//    }
//}