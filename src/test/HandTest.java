package src.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.model.Card;
import src.main.model.Hand;
import src.main.model.Suit;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {
    Hand hand;
    Card ns;
    Card qd;
    Card ah;
    Card js;

    @BeforeEach
    void runBefore() {
        hand = new Hand();
        ns = new Card(9, Suit.SPADES);
        qd = new Card(12, Suit.DIAMONDS);
        ah = new Card(14, Suit.HEARTS);
        js = new Card(11, Suit.SPADES);
    }

    @Test
    void testConstructor() {
        assertEquals(0, hand.size());
    }

    @Test
    void testAddCard() {
        addThreeCardsToHand();
        assertEquals(3, hand.size());
        assertTrue(hand.contains(ns));
        assertTrue(hand.contains(qd));
        assertTrue(hand.contains(ah));
    }

    // MODIFIES: this
    // EFFECTS: adds 3 cards to hand
    private void addThreeCardsToHand() {
        hand.add(ns);
        hand.add(qd);
        hand.add(ah);
    }

    @Test
    void testPlayThreeCards() {
        addThreeCardsToHand();

        assertEquals(ns, hand.play(ns));
        assertEquals(2, hand.size());
        assertFalse(hand.contains(ns));

        assertEquals(qd, hand.play(qd));
        assertFalse(hand.contains(qd));
        assertEquals(1, hand.size());

        assertEquals(ah, hand.play(ah));
        assertFalse(hand.contains(ah));
        assertEquals(0, hand.size());
    }

    @Test
    void testGetCardsOfSuitContainsRightBower() {
        addThreeCardsToHand();
        hand.add(js);

        List<Card> filtered = hand.getCardsOfSuit(Suit.SPADES, Suit.SPADES);
        assertEquals(2, filtered.size());
        assertTrue(filtered.contains(js));
        assertTrue(filtered.contains(ns));

        List<Card> filtered2 = hand.getCardsOfSuit(Suit.CLUBS, Suit.SPADES);
        assertEquals(hand.getCardsOfSuit(null, Suit.SPADES), filtered2);
    }

    @Test
    void testGetCardsOfSuitContainsLeftBower() {
        addThreeCardsToHand();
        hand.add(js);
        List<Card> filtered = hand.getCardsOfSuit(Suit.CLUBS, Suit.CLUBS);
        assertEquals(1, filtered.size());
        assertTrue(filtered.contains(js));

        List<Card> filtered2 = hand.getCardsOfSuit(Suit.SPADES, Suit.CLUBS);
        assertEquals(1, filtered2.size());
        assertTrue(filtered2.contains(ns));
    }

    @Test
    void testGetCardsOfSuitContainsNoBowers() {
        addThreeCardsToHand();
        List<Card> filtered = hand.getCardsOfSuit(Suit.SPADES, Suit.HEARTS);
        assertEquals(1, filtered.size());
        assertTrue(filtered.contains(ns));
    }
}
