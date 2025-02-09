package src.main.ui.components;

import javax.swing.*;
import java.awt.*;

public class ScoreComponent extends JPanel {
    private JTextArea team1Score;
    private JTextArea team2Score;

    public ScoreComponent(int i, int j) {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(2, 1));

        team1Score = new JTextArea("Team 1: " + i);
        team2Score = new JTextArea("Team 2: " + i);

        add(team1Score);
        add(team2Score);
    }

    public void setTeam1Score(int i) {
        team1Score.setText("Team 1: " + i);
    }

    public void setTeam2Score(int i) {
        team2Score.setText("Team 2: " + i);
    }
}
