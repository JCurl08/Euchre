package src.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.model.Card;
import src.main.model.Deck;
import src.main.model.Player;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DeckTest {
    static Deck deck;
    Player player;

    @BeforeEach
    void runBefore() {

        deck = Deck.getInstance();
        deck.shuffle();
        player = new Player("Jonah");
    }

    @Test
    void testGetInstance() {

        assertEquals(24, deck.size());
    }

    @Test
    void testShuffle() {
        for (int i = 0; i < 5; i++) {
            deck.dealCard(player);
        }
        List<Card> cards = player.getHand().getCardsOfSuit(null, null);
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                assertFalse(cards.get(i).equals(cards.get(j)));
            }
        }
    }
}
