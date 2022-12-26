package src.main.model;

// A card from a standard deck of cards
public class Card {
    // An int [9,14] representing the face value of the card, 9, 10 represent those values respectively, [11, 14]
    // represent Jack, Queen, King, Ace in that order
    private final int RANK;
    // The suit of the card
    private final Suit SUIT;

    // REQUIRES: 9 <= rank <= 14
    // Constructs a card with rank and suit
    public Card(int rank, Suit suit) {
        RANK = rank;
        SUIT = suit;
    }

    //Getters
    public int getRank() {
        return RANK;
    }

    public Suit getSuit() {
        return SUIT;
    }

    //REQUIRES: this != card
    //EFFECTS: returns true if this would beat card given the trump suit and initial suit played in a round of Euchre
    public boolean beats(Card card, Suit trumpSuit, Suit firstSuitPlayed) {
        return false; //stub
    }
}
