package src.main.ui.components;

import src.main.ui.pages.RoundPage;

import javax.swing.*;
import java.awt.*;

public class DecideTrumpComponent extends JPanel {
    private RoundPage roundPage;
    public DecideTrumpComponent(RoundPage roundPage) {
        this.roundPage = roundPage;

        setLayout(new GridLayout(1, 4));
        add(new JTextArea("Order Up Dealer?"));

        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        JButton yesAloneButton = new JButton("YesAlone");

        yesButton.addActionListener(e -> RoundPage.orderUp(true));
        noButton.addActionListener(e -> RoundPage.orderUp(false));
        yesAloneButton.addActionListener(e -> RoundPage.goAlone());

        add(yesButton);
        add(noButton);
        add(yesAloneButton);
    }

    @Override
    public void removeAll() {
        super.removeAll();
        revalidate();
        repaint();
    }
}
