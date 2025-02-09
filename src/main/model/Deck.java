package src.main.model;

import src.main.model.Card.Card;
import src.main.model.Card.Suit;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    public Stack<Card> cards;

    public Deck() {
        shuffle();
    }

    // EFFECTS: returns the size of hand
    public int size() {
        return cards.size();
    }

    // REQUIRES: deck not empty
    // MODIFIES: this and player
    // EFFECTS: removes card from deck and adds it to player's hand
    public void dealCard(Player player) {
        player.dealCard(cards.pop());
    }

    public void shuffle() {
        cards = new Stack<>();
        for (Suit suit : Suit.values()) {
            for (int value = 9; value <= 14; value++) {
                cards.add(new Card(value, suit));
            }
        }
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        return cards.pop();
    }
}
