package src.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.model.Player;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    Player player;



    @BeforeEach
    void runBefore() {
        player = new Player("Jonah");
    }

    @Test
    void testConstructor() {
        assertEquals("Jonah", player.getName());
        assertEquals(0, player.getHand().size());
        assertFalse(player.getIsDealer());
    }

    @Test
    void testSetIsDealer() {
        player.setIsDealer(true);
        assertTrue(player.getIsDealer());
        player.setIsDealer(false);
        assertFalse(player.getIsDealer());
    }

    @Test
    void testDealCard() {

    }
}
