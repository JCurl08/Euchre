package src.main.ui;

import src.main.model.Card;

import javax.swing.*;
import java.awt.*;

public class CardComponent extends JPanel {
    private Card card;
    public CardComponent(Card card) {
        this.card = card;
        setLayout(new GridLayout(2, 1));
        add(new JTextArea(card.getRank() + ""));
        add(new JTextArea(card.getSuit() + ""));
    }
}
