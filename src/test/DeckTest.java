package src.test;

import org.junit.jupiter.api.Test;
import src.main.model.Deck;
import src.main.model.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckTest {
    static Deck deck;
    Player player;

    @Test
    void testGetInstance() {

        assertEquals(24, deck.size());
    }
}
