package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
   
   public class Difficulty extends JFrame implements ActionListener {
   
    
    Difficulty() {
    
     JLabel imageLabel = new JLabel();
     ImageIcon diffImage = new ImageIcon("SelectDifficulty.gif");
     imageLabel.setIcon(diffImage);
     this.add(imageLabel);

     ImageIcon easyImage = new ImageIcon("easy.png");
     JButton EASY = new JButton(easyImage);
     this.add(EASY);
     EASY.setBorder(BorderFactory.createEmptyBorder());
     EASY.setContentAreaFilled(false);
     EventHandler easyBtn = new EventHandler();
     EASY.addActionListener(easyBtn);

     ImageIcon mediumImage = new ImageIcon("medium.png");
     JButton MEDIUM = new JButton(mediumImage);
     this.add(MEDIUM);
     MEDIUM.setBorder(BorderFactory.createEmptyBorder());
     MEDIUM.setContentAreaFilled(false);
     EventHandler medBtn = new EventHandler();
     MEDIUM.addActionListener(medBtn);

     ImageIcon hardImage = new ImageIcon("hard.png");
     JButton HARD = new JButton(hardImage);
     this.add(HARD);
     HARD.setBorder(BorderFactory.createEmptyBorder());
     HARD.setContentAreaFilled(false);
     EventHandler hardBtn = new EventHandler();
     HARD.addActionListener(hardBtn);

     ImageIcon backImage = new ImageIcon("back.png");
     JButton BACK = new JButton(backImage);
     this.add(BACK);
     BACK.setBorder(BorderFactory.createEmptyBorder());
     BACK.setContentAreaFilled(false);
     BackEventHandler backBtn = new BackEventHandler();
     BACK.addActionListener(backBtn);

     this.setLayout(new FlowLayout());
     this.setTitle("PAC - MAN");
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setSize(465, 520);
     this.setResizable(false);
     this.setVisible(true);
     this.setLocationRelativeTo(null);
     this.getContentPane().setBackground(new Color(8,15,61));

     
    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            new MazeColor();
            dispose();
        }
    }

    private class BackEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            new Welcome();
            dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}