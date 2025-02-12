package src.main.ui.components;

import src.main.model.Card.Card;
import src.main.model.Hand;
import src.main.model.Player;
import src.main.ui.pages.RoundPage;

import javax.swing.*;
import java.awt.*;

public class HandComponent extends JComponent {
    private Hand hand;
    private Player player;
    public HandComponent(Hand hand, Player player) {
        this.hand = hand;
        this.player = player;
        setLayout(new GridLayout(1, 5));
        add(new PlayerComponent(player));
        for (Card card : hand.getCards()) {
            CardComponent cardComponent = new CardComponent(card);
            cardComponent.addActionListener(e -> RoundPage.playCard(card, player));
            add(cardComponent);
        }
        add(new JPanel());
    }

    public boolean update() {
        for (Card card : hand.getCards()) {

        }
        return false;
    }
}
