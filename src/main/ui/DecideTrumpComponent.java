package src.main.ui;

import javax.swing.*;
import java.awt.*;

public class DecideTrumpComponent extends JPanel {
    public DecideTrumpComponent() {
        setLayout(new GridLayout(1, 4));
        add(new JTextArea("Order Up Dealer?"));
        add(new JButton("Yes"));
        add(new JButton("No"));
        add(new JButton("Yes (Alone)"));
    }
}
