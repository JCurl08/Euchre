package src.main.ui;

import src.main.model.Game;
import src.main.model.Player;
import src.main.model.Round;
import src.main.ui.pages.GamePage;
import src.main.ui.pages.MainPage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

// Executable Euchre App class
public class EuchreApp extends JFrame implements EventListener {

    // Contains components for mainMenu
    CardLayout cardLayout;
    JPanel panelContainer;
    private Game game;

    // EuchreApp constructor
    EuchreApp() {
        super("Euchre App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);

        cardLayout = new CardLayout();
        panelContainer = new JPanel(cardLayout);
        initiateMainPage();
        add(panelContainer);
        setVisible(true);
    }

    private void initiateMainPage() {
        MainPage mainPage = new MainPage();

        panelContainer.add(mainPage, "MainPage");

        JButton playButton = new JButton("Play");
        JButton exitButton = new JButton("Exit");

        mainPage.add(playButton);
        mainPage.add(exitButton);

        playButton.addActionListener(e -> initiateGamePage());
        exitButton.addActionListener(e -> System.exit(0));
    }

    private void startGame(List<String> playerNames) {
        List<Player> players = new ArrayList<>();
        for (String name : playerNames) {
            players.add(new Player(name));
        }
        game = new Game(players);

        while (game.getWinner() < 0) {
            Round round = game.startNewRound();
            displayRound(round);
            while (!round.isOver()) {
                break;
            }
            break;
        }
    }

    private void displayRound(Round round) {
        RoundPage roundPage = new RoundPage(round);
        panelContainer.add(roundPage, "RoundPage");
        roundPage.initiateComponents();
        cardLayout.show(panelContainer, "RoundPage");

    }

    private void initiateGamePage() {
        GamePage gamePage = new GamePage();
        panelContainer.add(gamePage, "GamePage");
        for (int i = 0; i < 4; i++) {
            JTextField player = new JTextField("Player " + i);
            gamePage.add(player);
        }
        JButton submitButton = new JButton("Submit");
        JButton backButton = new JButton("Back");

        submitButton.addActionListener(e -> startGame(gamePage.getPlayerNames()));
        backButton.addActionListener(e -> initiateMainPage());

        gamePage.add(submitButton);
        gamePage.add(backButton);

        cardLayout.show(panelContainer, "GamePage");
    }

//    public void addActionListener(JButton button, String name) {
//        button.addActionListener(e -> cardLayout.show(panelContainer, name));
//    }
}
