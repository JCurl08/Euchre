package src.main.ui.components;

import src.main.model.Card.Card;
import src.main.model.Hand;
import src.main.model.Player;

import javax.swing.*;
import java.awt.*;

public class HandComponent extends JComponent {
    private Hand hand;
    public HandComponent(Hand hand, Player player) {
        this.hand = hand;
        setLayout(new GridLayout(1, 5));
        add(new PlayerComponent(player));
        for (Card card : hand.getCards()) {
            add(new CardComponent(card));
        }
        add(new JPanel());
    }
}
