package towerdefense;

import javax.swing.*;

public class MainMenuGUI extends JFrame {
    
    MainPanel main;
    GamePanel gamePanel;
    
    public MainMenuGUI() 
    {
        super();
        main = new MainPanel(this);
        gamePanel = new GamePanel(main);
        add(main);       
        pack();
        setLocationByPlatform(true);
        setVisible(true);
        
    }

}
