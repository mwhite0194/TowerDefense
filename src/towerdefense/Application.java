package towerdefense;


import java.awt.*;
import javax.swing.*;

public class Application {


    public static void main(String[] args) 
    {
       MainMenuGUI frame = new MainMenuGUI();
       frame.setTitle("Tower Defense");
       //frame.setLayout(null);
       frame.setPreferredSize(new Dimension(700, 500));
       frame.setResizable(false);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    
}
