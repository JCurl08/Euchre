package src.main.ui;

import javax.swing.*;

// Main Menu class containing all components of the main menu
class MainMenu {

    static JButton play = new JButton("NEW GAME");
    static JButton exit = new JButton("EXIT");

    // Instantiates main menu components
    MainMenu(EuchreApp euchreApp) {
        play.setActionCommand("NEW GAME");
        exit.setActionCommand("EXIT");
        play.addActionListener(euchreApp);
        exit.addActionListener(euchreApp);
    }

    // Loads main menu
    void loadScreen(EuchreApp euchreApp) {
        euchreApp.add(play);
        euchreApp.add(exit);
    }

    public void clearComponents(EuchreApp euchreApp) {
        euchreApp.remove(play);
        euchreApp.remove(exit);
    }
}
