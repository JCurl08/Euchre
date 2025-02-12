package src.main.ui.pages;

import src.main.model.Card.Card;
import src.main.model.Hand;
import src.main.model.Player;
import src.main.model.Round;
import src.main.ui.EuchreApp;
import src.main.ui.components.DecideTrumpComponent;
import src.main.ui.components.HandComponent;
import src.main.ui.components.ScoreComponent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RoundPage extends JPanel {
    private static RoundPage instance;
    private Round round;
    private List<HandComponent> handComponents;
    private ScoreComponent scoreComponent;
    private DecideTrumpComponent decideTrumpComponent;
    private PlayFieldComponent playFieldComponent;

    private RoundPage(Round round) {
        this.round = round;
        setLayout(new GridLayout(3, 3));

        setBackground(Color.BLACK);
    }

    public static RoundPage getInstance(Round round) {
        RoundPage.instance = new RoundPage(round);
        return instance;
    }

    public static RoundPage getInstance() {
        return instance;
    }

    public static void orderUp(boolean orderUp) {
        if (orderUp) {
            instance.orderUp();
        }
    }

    private void orderUp() {
        round.orderUp();
        playFieldComponent.startPlayField();
        decideTrumpComponent.removeAll();
        repaint();
    }

    public static void goAlone() {
    }

    public static void playCard(Card card, Player player) {

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
        decideTrumpComponent = new DecideTrumpComponent(this);
        playFieldComponent = new PlayFieldComponent(round.getKit());

        addComponents();
    }

    private void addComponents() {
        add(new JPanel());
        add(handComponents.get(2));
        add(scoreComponent);

        add(handComponents.get(1));
        add(playFieldComponent);
        add(handComponents.get(3));

        add(new JPanel());
        add(handComponents.get(0));
        add(decideTrumpComponent);
    }
}
