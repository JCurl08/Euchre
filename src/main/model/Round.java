package src.main.model;

import src.main.model.Card.Card;
import src.main.model.Card.Suit;

import java.util.ArrayList;
import java.util.List;

public class Round {
    // Player Hands
    private List<Hand> hands;

    // index of the dealer
    private int dealer;

    // the kit (set during the first game state)
    private Card kit;

    // Enum representing different game states
    private GameState gameState;

    // index representing who's turn it is
    private int turn;

    // cards played in a single lift
    private List<Card> cardsPlaied;

    // the trump suit for the round
    private Suit trump;

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

    public void orderUp() {
        hands.get(dealer).add(kit);
        trump = kit.getSuit();
        turn = dealer;
    }

    public void playCard(Card card, int player) {

    }
}
