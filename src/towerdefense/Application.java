package towerdefense;

import javax.swing.*;

public class Application {

    MainMenuGUI mgui;

    public static void main(String[] args) 
    {
       MainMenuGUI frame = new MainMenuGUI();
       frame.setTitle("Tower Defense");
       frame.setVisible(true);
       frame.setSize(700,500);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
