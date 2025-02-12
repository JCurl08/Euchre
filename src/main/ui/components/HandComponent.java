package src.main.ui.components;

import src.main.model.Card.Card;
import src.main.model.Hand;
import src.main.ui.components.CardComponent.CardButton;
import src.main.ui.pages.RoundPage;

import javax.swing.*;
import java.awt.*;

public class HandComponent extends JComponent {
    private Hand hand;
    private int player;
    public HandComponent(Hand hand, int player, String player_name) {
        this.hand = hand;
        this.player = player;
        this.player = player;
        setLayout(new GridLayout(1, 5));
        add(new PlayerComponent(player, player_name));
        for (Card card : hand.getCards()) {
            CardButton cardComponent = new CardButton(card);
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
