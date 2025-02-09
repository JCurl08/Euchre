package src.main.ui.components;

import javax.swing.*;
import java.awt.*;

public class DecideTrumpComponent extends JPanel {
    public DecideTrumpComponent() {
        setLayout(new GridLayout(1, 4));
        add(new JTextArea("Order Up Dealer?"));

        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        JButton yesAloneButton = new JButton("YesAlone");

        add(yesButton);
        add(noButton);
        add(yesAloneButton);
    }
}
