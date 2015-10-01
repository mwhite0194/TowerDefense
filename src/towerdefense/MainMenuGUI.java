package towerdefense;

import java.awt.CardLayout;
import javax.swing.*;

public class MainMenuGUI extends JFrame {
    
    JPanel mainPanel;
    CardLayout cardLayout;
    GamePanelLeft gameleft;
    MainPanel main;
    GamePanelRight gameright;
    
    public MainMenuGUI() 
    {
        super();
        main = new MainPanel(this);
        gameleft = new GamePanelLeft();
        gameright = new GamePanelRight();
        add(main);       
        pack();
        setLocationByPlatform(true);
        setVisible(true);
        
    }


    public void game()
    {   
        main.setVisible(false);
        add(gameleft);
        add(gameright);    
        gameleft.setVisible(true);
        gameright.setVisible(true);
    }
}
