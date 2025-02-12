package src.main.ui.components.CardComponent;

import src.main.model.Card.Card;

import javax.swing.*;
import java.awt.*;

public class CardButton extends JButton implements CardComponent {
    private Card card;

    public CardButton(Card card) {
        this.card = card;
        setLayout(new GridLayout(2, 1));
        add(new JTextArea(card.getRank() + ""));
        add(new JTextArea(card.getSuit() + ""));
    }
}
