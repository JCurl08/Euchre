package src.main.ui;

import src.main.model.Card;
import src.main.model.Hand;

import javax.swing.*;
import java.awt.*;

public class HandComponent extends JComponent {
    private Hand hand;
    public HandComponent(Hand hand) {
        this.hand = hand;
        setLayout(new GridLayout(1, 5));
        for (Card card : hand.getCards()) {
            add(new CardComponent(card));
        }
    }
}
