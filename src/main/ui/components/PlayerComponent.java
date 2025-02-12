package src.main.ui.components;

import javax.swing.*;
import java.awt.*;

public class PlayerComponent extends JComponent {
    private int player;
    private String playerName;
    private JTextArea liftsComponent;
    public PlayerComponent(int player, String playerName) {
        this.player = player;
        this.playerName = playerName;

        setLayout(new GridLayout(2, 1));
        add(new JTextArea(this.playerName));
        liftsComponent = new JTextArea("Lifts: 0");
        add(liftsComponent);
    }

    public void setLifts(int i) {
        liftsComponent.setText("Lifts: " + i);
    }
}
