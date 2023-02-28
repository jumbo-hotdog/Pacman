package Menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
   
   public class DifficultyMenu extends JFrame implements ActionListener {
   
    JRadioButton Easy;
    JRadioButton Medium;
    JRadioButton Hard;
    
    DifficultyMenu() {
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout(new FlowLayout());
     getContentPane().setBackground(new Color(8,15,61));

     // set Colors
     JPanel startPanel = new JPanel();
     startPanel.setBackground(new Color(8,15,61));
     JPanel userPanel = new JPanel(new GridLayout(2,1));
     userPanel.setBackground(new Color(8,15,61));
     JPanel panel1 = new JPanel(new GridLayout(4,1));
     panel1.setBackground(new Color(8,15,61));

     // Username textfield and label
     JTextField Username = new JTextField(15);
     JLabel userLabel = new JLabel("Enter username");
     userLabel.setForeground(Color.white);

     // Start Game button
     JButton startButton = new JButton("Start Game");

     // Difficulty label
     JLabel difficulty = new JLabel("Difficulty");
     difficulty.setForeground(Color.white);

     // JRadioButtons Text Colors
     Easy = new JRadioButton("Easy");
     Easy.setForeground(Color.white);
     Medium = new JRadioButton("Medium");
     Medium.setForeground(Color.white);
     Hard = new JRadioButton("Hard");
     Hard.setForeground(Color.white);

     // ButtonGroup
     ButtonGroup group = new ButtonGroup();
     group.add(startButton);
     group.add(Easy);
     group.add(Medium);
     group.add(Hard);

     // Pacman speed
     EventHandler easyMode = new EventHandler(300);
     EventHandler mediumMode = new EventHandler(150);
     EventHandler hardMode = new EventHandler(50);

     Easy.addActionListener(easyMode);
     Medium.addActionListener(mediumMode);
     Hard.addActionListener(hardMode);

     EventHandler start = new EventHandler();
     startButton.addActionListener(start);
     
     userPanel.add(Username);
     userPanel.add(userLabel);
     panel1.add(difficulty);
     panel1.add(Easy);
     panel1.add(Medium);
     panel1.add(Hard);
     startPanel.add(startButton);
     
     add(userPanel, BorderLayout.NORTH);
     add(panel1, BorderLayout.CENTER);
     add(startPanel, BorderLayout.SOUTH);

     this.pack();
     this.setVisible(true);
     
    }
    
    private class EventHandler implements ActionListener {

        int speed;

        EventHandler(int pacmanSpeed) {
            this.speed = pacmanSpeed;
        }

        EventHandler() {
            // Opens game
            // new GameFrame();
    
            dispose();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
