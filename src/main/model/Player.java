package src.main.model;

// Euchre player with name and hand
public class Player {

    private String name;
    private Hand hand;
    private boolean dealer;

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
}
