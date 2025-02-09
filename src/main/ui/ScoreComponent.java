package src.main.ui;

import javax.swing.*;
import java.awt.*;

public class ScoreComponent extends JPanel {
    public ScoreComponent(int i, int j) {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(2, 1));
        add(new JTextArea("Team 1: " + i));
        add(new JTextArea("Team 2: " + i));
    }
}
