package com.company;

import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(375,400);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }


}
