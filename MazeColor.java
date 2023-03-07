package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
   
   public class MazeColor extends JFrame implements ActionListener {
    
    MazeColor() {
    
     JLabel imageLabel = new JLabel();
     ImageIcon diffImage = new ImageIcon("MazeColor.gif");
     imageLabel.setIcon(diffImage);
     this.add(imageLabel);

     ImageIcon blueImage = new ImageIcon("blue.png");
     JButton BLUE = new JButton(blueImage);
     this.add(BLUE);
     BLUE.setBorder(BorderFactory.createEmptyBorder());
     BLUE.setContentAreaFilled(false);
     EventHandler blueBtn = new EventHandler();
     BLUE.addActionListener(blueBtn);

     ImageIcon greenImage = new ImageIcon("green.png");
     JButton GREEN = new JButton(greenImage);
     this.add(GREEN);
     GREEN.setBorder(BorderFactory.createEmptyBorder());
     GREEN.setContentAreaFilled(false);
     EventHandler greenBtn = new EventHandler();
     GREEN.addActionListener(greenBtn);

     ImageIcon redImage = new ImageIcon("red.png");
     JButton RED = new JButton(redImage);
     this.add(RED);
     RED.setBorder(BorderFactory.createEmptyBorder());
     RED.setContentAreaFilled(false);
     EventHandler redBtn = new EventHandler();
     RED.addActionListener(redBtn);

     this.setLayout(new FlowLayout());
     this.setTitle("PAC - MAN");
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setSize(465, 520);
     this.setResizable(false);
     this.setVisible(true);
     this.setLocationRelativeTo(null);
     this.getContentPane().setBackground(new Color(8,15,61));

     ImageIcon backImage = new ImageIcon("back.png");
     JButton BACK = new JButton(backImage);
     this.add(BACK);
     BACK.setBorder(BorderFactory.createEmptyBorder());
     BACK.setContentAreaFilled(false);
     BackEventHandler backBtn = new BackEventHandler();
     BACK.addActionListener(backBtn);

    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            // new GameFrame();
            dispose();
        }
    }

    private class BackEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            new Difficulty();
            dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}