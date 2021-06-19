package com.lessons.lesson1.lecture;

import javax.swing.*;

public class MainFrame extends JFrame {
    private MainMenu mainMenuPage;
    private FirstPage firstPage;
    private SecondPage secondPage;

    private Player[] players = {
            new Player("Cristiano Ronaldo", 120000000, "Juventus"),
            new Player("Eden Hazard", 100000000, "Real Madrid"),
            new Player("Leo Messi", 140000000, "Barcelona"),
            new Player("Philippe Luis", 80000000, "Arsenal"),
            new Player("David De Gea", 92000000, "Manchester United"),
            new Player("Timo Verner", 59000000, "Chelsea"),
            new Player("Angel DiMaria", 87000000, "PSG"),
            new Player("N'Golo Kante", 145000000, "Chelsea")
    };

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        firstPage = new FirstPage(this);
        firstPage.setVisible(false);
        add(firstPage);

        secondPage = new SecondPage(this);
        secondPage.setVisible(false);
        add(secondPage);

    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public FirstPage getFirstPage() {
        return firstPage;
    }

    public SecondPage getSecondPage() {
        return secondPage;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
