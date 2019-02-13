import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FiveButton implements ActionListener{ 
    public FiveButton() {
        JFrame frame = new JFrame();
        JButton cButton = new JButton("center");
        JButton nButton = new JButton("north");
        JButton sButton = new JButton("south");
        JButton eButton = new JButton("east");
        JButton wButton = new JButton("west");
        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.CENTER, cButton);
        cButton.addActionListener(this);
        frame.add(BorderLayout.NORTH, nButton);
        frame.add(BorderLayout.SOUTH, sButton);
        frame.add(BorderLayout.EAST, eButton);
        frame.add(BorderLayout.WEST, wButton);
        //frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event){
        
    }

    public static void main(String[] args) {
        FiveButton gui = new FiveButton();
    }
} 
