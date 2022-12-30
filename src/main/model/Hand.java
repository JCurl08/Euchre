package src.main.model;

import java.util.ArrayList;
import java.util.List;

// A players hand with a list of cards
public class Hand {
    // Max size of a hand, this can be 6 when a dealer is ordered up, but they must discard a card immediately after.
    private final int MAX_SIZE = 5;

    //The cards in a players hand
    private List<Card> hand;

    // Constructor
    public Hand() {
        hand = new ArrayList<>();
    }

    // REQUIRES: size() <= MAX_SIZE
    // MODIFIES: this
    // EFFECTS: adds card to hand
    public void add(Card card) {
        hand.add(card);
    }

    // REQUIRES: hand.contains(card)
    // MODIFIES: this
    // EFFECTS: removes chosen card from hand and returns it
    public Card play(Card card) {
        hand.remove(card);
        return card;
    }

    // EFFECTS: returns the amount of cards in the hand
    public int size() {
        return hand.size();
    }

    // EFFECTS: returns true if a card is in hand
    public boolean contains(Card card) {
        return hand.contains(card);
    }

    // EFFECTS: returns a list of cards of the given suit in hand, or returns the whole hand if there are no cards of
    // that suit or if suit == null
    public List<Card> getCardsOfSuit(Suit suit, Suit trump) {
        if (suit == null) {
            return hand;
        }
        List<Card> result = new ArrayList<>(hand);
        for (Card c : hand) {
            if (!c.isSuit(suit, trump)) {
                result.remove(c);
            }
        }
        if (result.size() == 0) {
            result = hand;
        }
        return result;
    }
}
