package src.main.model;

import src.main.model.Card.Card;

import java.util.ArrayList;
import java.util.List;

// A players hand with a list of cards
public class Hand {
    // Max size of a hand, this can be 6 when a dealer is ordered up, but they must discard a card immediately after.
    private final int MAX_SIZE = 5;

    //The cards in a players hand
    private List<Card> cards;

    // Constructor
    public Hand() {
        cards = new ArrayList<>();
    }

    // REQUIRES: size() <= MAX_SIZE
    // MODIFIES: this
    // EFFECTS: adds card to hand
    public void add(Card card) {
        cards.add(card);
    }

    // REQUIRES: hand.contains(card)
    // MODIFIES: this
    // EFFECTS: removes chosen card from hand and returns it
    public Card play(Card card) {
        cards.remove(card);
        return card;
    }

    // EFFECTS: returns the amount of cards in the hand
    public int size() {
        return cards.size();
    }

    // EFFECTS: returns true if a card is in hand
    public boolean contains(Card card) {
        return cards.contains(card);
    }

    public boolean empty() {
        return cards.isEmpty();
    }

    public List<Card> getCards() {
        return this.cards;
    }
}
