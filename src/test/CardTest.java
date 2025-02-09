package src.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.model.Card;
import src.main.model.Suit;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {


    private Card js;
    private Card ts;
    private Card as;
    private Card nh;
    private Card jh;
    private Card jc;
    private Card ac;
    private Card jd;
    private Card qd;

    @BeforeEach
    void runBefore() {
        js = new Card(11, Suit.SPADES);
        ts = new Card(10, Suit.SPADES);
        as = new Card(14, Suit.SPADES);
        nh = new Card(9, Suit.HEARTS);
        jh = new Card(11, Suit.HEARTS);
        jc = new Card(11, Suit.CLUBS);
        ac = new Card(14, Suit.CLUBS);
        jd = new Card(11, Suit.DIAMONDS);
        qd = new Card(12, Suit.DIAMONDS);
    }

    @Test
    void testConstructor() {
        assertEquals(11, js.getRank());
        assertEquals(Suit.SPADES, js.getSuit());

        assertEquals(9, nh.getRank());
        assertEquals(Suit.HEARTS, nh.getSuit());

        assertEquals(14, ac.getRank());
        assertEquals(Suit.CLUBS, ac.getSuit());

        assertEquals(12, qd.getRank());
        assertEquals(Suit.DIAMONDS, qd.getSuit());
    }

    @Test
    void testEquals() {
        Card js2 = new Card(11, Suit.SPADES);
        assertTrue(js.equals(js));
        assertTrue(js.equals(js2));
        assertTrue(js2.equals(js));

        assertEquals(js.hashCode(), js2.hashCode());

        assertFalse(js.equals(jc));
        assertFalse(jc.equals(js));
        assertFalse(js.equals(as));
        assertFalse(as.equals(js));
        assertFalse(js.equals(nh));
        assertFalse(nh.equals(js));

        assertFalse(js.equals(null));
        assertFalse(js.equals(11));
        assertFalse(js.equals(Suit.SPADES));
    }
}
