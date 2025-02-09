package src.main.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private List<Integer> score;
    private int dealer;

    // REQUIRES: players.size() == 3 or 4 && dealer in players
    public Game(List<Player> players) {
        this.players = new ArrayList<>();
        for (Player player : players) {
            this.players.add(player);
        }
        int i = 1;
        while (this.players.size() < 4) {
            this.players.add(new Player("Com " + i));
            i++;
        }

        score = new ArrayList<>();
        score.add(0);
        score.add(0);
        dealer = 0;
    }

    public int getWinner() {
        int i = 0;
        for (Integer score : score) {
            if (score >= 10) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Round startNewRound() {
        Round round = new Round(dealer);

        dealer = (dealer + 1) % 4;
        return round;
    }

    public List<Player> getPlayers() {
        return players;
    }

//    Game(List<String> playerNames) {
//        this(new ArrayList<>());
//    }
}
