import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleGuiTwoComps implements ActionListener {
    JFrame frame;
    JButton button;
    RandomPanel panel;
    
    public SimpleGuiTwoComps() {
        frame = new JFrame();
        button = new JButton("Press Me!");
        panel = new RandomPanel();
        frame.add(BorderLayout.CENTER, panel);
        frame.add(BorderLayout.WEST, button);
        
        frame.setSize(300, 300);
        frame.setVisible(true);
        
        button.addActionListener(this);
    }
    
    public static void main(String[] args) {
        SimpleGuiTwoComps t = new SimpleGuiTwoComps();
    }  
    
    public void actionPerformed(ActionEvent event) {
        panel.repaint();
    }
}