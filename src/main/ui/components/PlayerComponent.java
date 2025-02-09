package src.main.ui.components;

import src.main.model.Player;

import javax.swing.*;
import java.awt.*;

public class PlayerComponent extends JComponent {
    private Player player;
    private JTextArea liftsComponent;
    public PlayerComponent(Player player) {
        this.player = player;

        setLayout(new GridLayout(2, 1));
        add(new JTextArea(player.getName()));
        liftsComponent = new JTextArea("Lifts: 0");
        add(liftsComponent);
    }

    public void setLifts(int i) {
        liftsComponent.setText("Lifts: " + i);
    }
}
