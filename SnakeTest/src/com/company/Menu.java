package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends GameField{
    JPanel panel = new JPanel();
    JButton startButton = new JButton("start");

    public void menu() {
        add(startButton);
        add(panel);
        panel.setVisible(true);
        startButton.setVisible(true);
        panel.setSize(400, 400);
        startButton.setSize(400, 400);
    }
}
