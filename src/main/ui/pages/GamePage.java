package src.main.ui.pages;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GamePage extends JPanel {

    public GamePage() {
        setBackground(Color.CYAN);
    }

    public List<String> getPlayerNames() {
        List<String> result = new ArrayList<>();
        for (Component component : getComponents()) {
            if (component instanceof JTextField) {
                result.add(((JTextField) component).getText());
            }
        }
        return result;
    }

//    private void initiateComponents(EuchreApp euchreApp) {
//        add(new JLabel("Game Started!"));
//        JButton backButton = new JButton("Back to Menu");
//        euchreApp.addActionListener(backButton, "MainPage");
//        add(backButton);
//    }
}
