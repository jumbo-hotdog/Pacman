package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
   
   public class Welcome extends JFrame implements ActionListener {
    
    Welcome() {
    
     JLabel imageLabel = new JLabel();
     ImageIcon wcImage = new ImageIcon("Welcome.gif");
     imageLabel.setIcon(wcImage);
     this.add(imageLabel);

     JTextField Username = new JTextField(27);
     this.add(Username);

     ImageIcon contImage = new ImageIcon("continue.png");
     JButton CONTINUE = new JButton(contImage);
     CONTINUE.setBorder(BorderFactory.createEmptyBorder());
     CONTINUE.setContentAreaFilled(false);
     this.add(CONTINUE);
     EventHandler contBtn = new EventHandler();
     CONTINUE.addActionListener(contBtn);
     
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