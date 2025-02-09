package src.main.ui.pages;

import src.main.model.Hand;
import src.main.model.Round;
import src.main.ui.EuchreApp;
import src.main.ui.components.CardComponent;
import src.main.ui.components.DecideTrumpComponent;
import src.main.ui.components.HandComponent;
import src.main.ui.components.ScoreComponent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RoundPage extends JPanel {
    private Round round;
    private List<HandComponent> handComponents;
    private ScoreComponent scoreComponent;
    private DecideTrumpComponent decideTrumpComponent;
    private CardComponent kitComponent;

    public RoundPage(Round round) {
        this.round = round;
        setLayout(new GridLayout(3, 3));

        setBackground(Color.BLACK);
    }

    public void initiateComponents() {
        List<Hand> hands = round.getHands();
        handComponents = new ArrayList<>();
        int i = 0;
        for (Hand hand : hands) {
            handComponents.add(new HandComponent(hand, EuchreApp.getGame().getPlayers().get(i)));
            i++;
        }
        scoreComponent = new ScoreComponent(0, 0);
        decideTrumpComponent = new DecideTrumpComponent();
        kitComponent = new CardComponent(round.getKit());

        addComponents();
    }

    private void addComponents() {
        add(new JPanel());
        add(handComponents.get(2));
        add(scoreComponent);

        add(handComponents.get(1));
        add(kitComponent);
        add(handComponents.get(3));

        add(new JPanel());
        add(handComponents.get(0));
        add(decideTrumpComponent);
    }
}
