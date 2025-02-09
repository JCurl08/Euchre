package src.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.model.Player;

public class PlayerTest {
    Player player;



    @BeforeEach
    void runBefore() {
        player = new Player("Jonah");
    }

    @Test
    void testDealCard() {

    }
}
