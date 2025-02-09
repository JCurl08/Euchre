package src.main.ui.pages;

import javax.swing.*;
import java.awt.*;

// Main Menu class containing all components of the main menu
public class MainPage extends JPanel {

    static JButton play = new JButton("NEW GAME");
    static JButton exit = new JButton("EXIT");

    // Instantiates main menu components
    public MainPage() {
        setLayout(new GridLayout(2, 1, 10, 10));
//        initiateComponents();
    }

//    private void initiateComponents() {
//        JButton playButton = new JButton("Play");
//        JButton exitButton = new JButton("Exit");
//
//        euchreApp.addActionListener(playButton, "GamePage");
//        exitButton.addActionListener(e -> System.exit(0));
//
//        add(playButton);
//        add(exitButton);
//
//
//    }
}
