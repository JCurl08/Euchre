package src.main.model;

import java.util.List;

public class Game {
    private Deck deck = Deck.getInstance();
    private List<Player> players;
    private Card kit;
    private Player dealer;

    // REQUIRES: players.size() == 3 or 4 && dealer in players
    Game(List<Player> players, Player dealer) {
        this.players = players;
        this.dealer = dealer;
        dealer.setIsDealer(true);
        players.get((players.indexOf(dealer) - 1) % 4).setIsDealer(false);

        for (int i = 0; i < 5; i++) {
            for (int j = players.indexOf(dealer) + 1; j != players.indexOf(dealer); j++) {
                if (j >= players.size()) {
                    j = 0;
                }
                deck.dealCard(players.get(i));
            }
        }
        kit = deck.dealCard();
    }

    Game(List<Player> players) {
        this(players, decideDealer(players));
    }

    private static Player decideDealer(List<Player> players) {
        Player dealer;
        int i;
        Card card;
        Card js = new Card(11, Suit.SPADES);
        Card jc = new Card(11, Suit.CLUBS);
        for (i = 0; true; i++) {
            if (i == players.size()) {
                i = 0;
            }
            card = Deck.dealCard();
            if (card.equals(js) || card.equals(jc)) {
                break;
            }
        }
        return players.get(i);
    }
}
