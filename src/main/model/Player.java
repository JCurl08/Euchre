package src.main.model;

// Euchre player with name and hand
public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }

    // Getters
    public String getName() {
        return name;
    }

    public Hand getHand() { return hand; }

    // REQUIRES: hand.size() <= MAX_HAND_SIZE
    public void dealCard(Card card) {
        hand.add(card);
    }

    // REQUIRES: dealer
    // MODIFIES: this
    // EFFECTS: Adds ordered up to hand and returns the suit of this card, removes selected card from hand
    public Suit orderUp(Card orderedUp, Card toRemove) {
        hand.add(orderedUp);
        hand.play(toRemove);
        return orderedUp.getSuit();
    }
}
