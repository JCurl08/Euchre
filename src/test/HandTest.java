package src.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.model.Card;
import src.main.model.Hand;
import src.main.model.Suit;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {
    Hand hand;
    Card card1;
    Card card2;
    Card card3;

    @BeforeEach
    void runBefore() {
        hand = new Hand();
        card1 = new Card(9, Suit.SPADES);
        card2 = new Card(12, Suit.DIAMONDS);
        card3 = new Card(14, Suit.HEARTS);
    }

    @Test
    void testConstructor() {
        assertEquals(0, hand.size());
    }

    @Test
    void testAddCard() {
        addThreeCardsToHand();
        assertEquals(3, hand.size());
        assertTrue(hand.contains(card1));
        assertTrue(hand.contains(card2));
        assertTrue(hand.contains(card3));
    }

    // MODIFIES: this
    // EFFECTS: adds 3 cards to hand
    private void addThreeCardsToHand() {
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
    }

    @Test
    void testPlayThreeCards() {
        addThreeCardsToHand();

        assertEquals(card1, hand.play(card1));
        assertEquals(2, hand.size());
        assertFalse(hand.contains(card1));

        assertEquals(card2, hand.play(card2));
        assertFalse(hand.contains(card2));
        assertEquals(1, hand.size());

        assertEquals(card3, hand.play(card3));
        assertFalse(hand.contains(card3));
        assertEquals(0, hand.size());
    }
}
