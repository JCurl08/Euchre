package src.main.model;

import src.main.model.Card.Card;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private List<Hand> hands;
    private int dealer;
    private Card kit;

    private GameState gameState;
    private int turn;

    private List<Card> cardsPlaied;

    public Round(int dealer) {
        hands = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            hands.add(new Hand());
        }
        this.dealer = dealer;
        Deck deck = new Deck();
        for (int i = 0; i < 5; i++) {
            for (Hand hand: hands) {
                hand.add(deck.dealCard());
            }
        }
        kit = deck.dealCard();
        turn = dealer + 1 % 4;
    }

    public boolean isOver() {
        for (Hand hand : hands) {
            if (!hand.empty()) {
                return false;
            }
        }
        return true;
    }

    public List<Hand> getHands() {
        return hands;
    }

    public Card getKit() {
        return kit;
    }
}
