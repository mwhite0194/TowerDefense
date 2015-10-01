package towerdefense;

import java.awt.CardLayout;
import javax.swing.*;

public class MainMenuGUI extends JFrame {
    
    MainPanel main;
    GamePanel gamePanel;
    
    public MainMenuGUI() 
    {
        super();
        main = new MainPanel(this);
        gamePanel = new GamePanel();
        add(main);       
        pack();
        setLocationByPlatform(true);
        setVisible(true);
        
    }

}
