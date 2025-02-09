package src.main.model;

// A card from a standard deck of cards
public class Card {
    // An int [9,14] representing the face value of the card, 9, 10 represent those values respectively, [11, 14]
    // represent Jack, Queen, King, Ace in that order
    private final int rank;
    // The suit of the card
    private final Suit suit;

    // REQUIRES: 9 <= rank <= 14
    // Constructs a card with rank and suit
    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //Getters
    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
