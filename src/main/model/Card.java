package src.main.model;

// A card from a standard deck of cards
public class Card {
    // An int [9,14] representing the face value of the card, 9, 10 represent those values respectively, [11, 14]
    // represent Jack, Queen, King, Ace in that order
    private final int rank;
    // The suit of the card
    private final Suit suit;
    // The suit of the left bower if this card is the right bower
    private Suit leftSuit;

    // REQUIRES: 9 <= rank <= 14
    // Constructs a card with rank and suit
    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        if (this.rank == 11) {
            switch (this.suit) {
                case SPADES:
                    leftSuit = Suit.CLUBS;
                    break;
                case CLUBS:
                    leftSuit = Suit.SPADES;
                    break;
                case DIAMONDS:
                    leftSuit = Suit.HEARTS;
                    break;
                case HEARTS:
                    leftSuit = Suit.DIAMONDS;
                    break;
            }
        }
    }

    //Getters
    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    //REQUIRES: this != card, this is of suit trumpSuit or firstSuitPlayed
    //EFFECTS: returns true if this would beat card given the trump suit and initial suit played in a round of Euchre
    public boolean beats(Card card, Suit trumpSuit) {
        if (this.isTrump(trumpSuit)) {
            if (card.isTrump(trumpSuit)) {
                if (card.isRightBower(trumpSuit)) {
                    return false;
                } else if (this.isRightBower(trumpSuit)) {
                    return true;
                } else if (card.isLeftBower(trumpSuit)) {
                    return false;
                } else if (this.isLeftBower(trumpSuit)) {
                    return true;
                }
                return this.rank > card.rank;
            }
            return true;
        } else if (card.isTrump(trumpSuit)) {
            return false;
        } else if (this.suit != card.suit) {
            return true;
        }
        return this.rank > card.rank;
    }

    //EFFECTS: returns true if RANK == 11 and SUIT == trumpSuit
    private boolean isRightBower(Suit trumpSuit) {
        return rank == 11 && suit == trumpSuit;
    }

    //EFFECTS: returns true if RANK == 11 and SUIT ==
    public boolean isLeftBower(Suit trumpSuit) {
        if (rank != 11) {
            return false;
        }
        return trumpSuit == leftSuit;
    }

/*
    //EFFECTS: returns true if this.SUIT == trumpSuit and this.SUIT != card.SUIT
    private boolean trumps(Card card, Suit trumpSuit) {
        if (this.SUIT == trumpSuit || (this.RANK == 11 && this.leftSuit == trumpSuit)) {
            return card.SUIT != trumpSuit;
        }
        return false;
    }
*/

    //EFFECTS: returns true if this card is the same suit of the trump in a hand of Euchre
    private boolean isTrump(Suit trumpSuit) {
        return (this.suit == trumpSuit || (this.rank == 11 && this.leftSuit == trumpSuit));
    }

    @Override
    // EFFECTS: returns true if this and card have the same value and suit
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Card)) {
            return false;
        }
        Card that = (Card) obj;
        if (this.suit == that.suit) {
            return this.rank == that.rank;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int i = suit.hashCode()*10;
        return i + rank;
    }

    public boolean isSuit(Suit suit, Suit trump) {
        if (suit == trump) {
            return (this.suit == suit || this.isLeftBower(trump));
        }
        return this.suit == suit && !this.isLeftBower(trump);
    }



/*
    //REQUIRES: All cards are not equal
    //EFFECTS: returns a number from 1 to 4 representing the winner of one round, where 1 is the player who played the
    // first card and 4 is the player who played the last card
    public int winner(Card card2, Card card3, Card card4, Suit trumpSuit) {
        return 0; //stub
    }
*/
}
