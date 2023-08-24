package src.main.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

// Executable Euchre App class
public class EuchreApp extends JFrame implements ActionListener {

    // Contains components for mainMenu
    static MainMenu mainMenu;

    // EuchreApp constructor
    EuchreApp() {
        super("Euchre");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 800));
        ((JPanel) getContentPane()).setBorder(new EmptyBorder(13, 13, 13, 13));
        setLayout(new FlowLayout());
        runEuchreApp();
    }

    // initiates and runs EuchreApp
    private void runEuchreApp() {
        initiate();
        mainMenu = new MainMenu(this);
        mainMenu.loadScreen(this);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Initiates app and sets destination for saved files
    private void initiate() {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();
        if (event.equals("EXIT")) {
            System.exit(0);
        } else if (event.equals("NEW GAME")) {
            mainMenu.clearComponents(this);
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }
}
