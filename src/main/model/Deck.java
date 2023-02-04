package src.main.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static Deck instance;
    private static List<Card> deck;

    private Deck() {
        shuffle();
    }

    public static Deck getInstance() {
        if (instance == null) {
            instance = new Deck();
        }
        return instance;
    }

    // EFFECTS: returns the size of hand
    public int size() {
        return deck.size();
    }

    // REQUIRES: deck not empty
    // MODIFIES: this and player
    // EFFECTS: removes card from deck and adds it to player's hand
    public void dealCard(Player player) {
        player.dealCard(deck.remove(0));
    }

    public void shuffle() {
        deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (int value = 9; value <= 14; value++) {
                deck.add(new Card(value, suit));
            }
        }
        Collections.shuffle(deck);
    }

    public static Card dealCard() {
        return deck.remove(0);
    }
}
