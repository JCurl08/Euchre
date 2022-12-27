package src.main.model;

import java.util.ArrayList;
import java.util.List;

// A players hand with a list of cards
public class Hand {
    // Max size of a hand, this can be 6 when a dealer is ordered up, but they must discard a card immediately after.
    private final int MAX_SIZE = 5;

    //The cards in a players hand
    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    // REQUIRES: size() <= MAX_SIZE
    // MODIFIES: this
    // EFFECTS: adds card to hand
    public void add(Card card) {
        hand.add(card);
    }

    // EFFECTS: returns the amount of cards in the hand
    public int size() {
        return hand.size();
    }
}
