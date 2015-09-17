package towerdefense;

import javax.swing.*;

public class MainPanel extends JPanel {

    public JLabel enterName;

    private JFrame application;

    public JButton easy;

    public JButton medium;

    public JButton hard;

    public JTextField player_name;

    public JTextArea high_scores;

    public JTextArea instructions;

    public MainPanel() {

        easy = new JButton("Easy");
        add(easy);
        medium = new JButton("Medium");
        add(medium);
        hard = new JButton("Hard");
        add(hard);
        enterName = new JLabel("Enter Name: ");
        add(enterName);
        player_name = new JTextField(23);
        add(player_name);
      
        // public String[] setName()
        {

        }

        // public String[] getScore()
        {

        }

    }

}
