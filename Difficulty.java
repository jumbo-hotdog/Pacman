package Menu1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
   
   public class Difficulty extends JFrame implements ActionListener {
   
    JButton Easy;
    JButton Medium;
    JButton Hard;
    
    Difficulty() {
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

     // Difficulty label
     JLabel difficulty = new JLabel("Select Difficulty");
     difficulty.setForeground(Color.white);

     // JRadioButtons Text Colors
     Easy = new JButton("Easy");
     Easy.setForeground(Color.black);

     Medium = new JButton("Medium");
     Medium.setForeground(Color.black);

     Hard = new JButton("Hard");
     Hard.setForeground(Color.black);

     // Pacman speed
     EventHandler easyMode = new EventHandler(300);
     EventHandler mediumMode = new EventHandler(150);
     EventHandler hardMode = new EventHandler(50);

     Easy.addActionListener(easyMode);
     Medium.addActionListener(mediumMode);
     Hard.addActionListener(hardMode);
     
     userPanel.add(Username);
     userPanel.add(userLabel);
     panel1.add(difficulty);
     panel1.add(Easy);
     System.out.println();
     panel1.add(Medium);
     panel1.add(Hard);
     
     add(userPanel, BorderLayout.NORTH);
     add(panel1, BorderLayout.CENTER);
     add(startPanel, BorderLayout.SOUTH);

     this.pack();
     this.setVisible(true);
     this.setResizable(false);
     
    }
    
    private class EventHandler implements ActionListener {

        int speed;

        EventHandler(int pacmanSpeed) {
            this.speed = pacmanSpeed;

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