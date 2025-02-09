package src.main.ui;

import src.main.model.Hand;
import src.main.model.Round;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RoundPage extends JPanel {
    private Round round;

    public RoundPage(Round round) {
        this.round = round;
        setLayout(new GridLayout(3, 3));

        setBackground(Color.BLACK);
    }

    public void initiateComponents() {
        List<Hand> hands = round.getHands();
        add(new JPanel());
        add(new HandComponent(hands.get(2)));
        add(new ScoreComponent(0, 0));
        add(new HandComponent(hands.get(1)));
        add(new CardComponent(round.getKit()));
        add(new HandComponent(hands.get(3)));
        add(new JPanel());
        add(new HandComponent(hands.get(0)));
        add(new DecideTrumpComponent());
    }
}
