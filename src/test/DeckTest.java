package src.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.model.Deck;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckTest {
    static Deck deck;

    @BeforeEach
    void runBefore() {
        deck = Deck.getInstance();
    }

    @Test
    void testGetInstance() {
        assertEquals(24, Deck.getInstance().size());
    }
}
