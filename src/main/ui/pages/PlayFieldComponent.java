package src.main.ui.pages;

import src.main.model.Card.Card;
import src.main.ui.components.CardComponent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PlayFieldComponent extends JComponent {
    private CardComponent kitComponent;
    private List<Card> cardsPlayed;
    public PlayFieldComponent(Card kit) {
        cardsPlayed = new ArrayList<Card>();
        kitComponent = new CardComponent(kit);
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            if (i == 4) {
                add(kitComponent);
            } else {
                add(new JPanel());
            }
        }
    }

    public void startPlayField() {
        this.removeAll();
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            add(new JPanel());
        }
    }
}
