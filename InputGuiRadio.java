import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class InputGuiRadio {
    JFrame frame;
    JFrame frame2;
    JButton button;
    JLabel label;
    ButtonGroup bGroup;
    String answer = "This button was clicked";
    String guess = "f";
    
    public InputGuiRadio() {
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        
        button = new JButton();
        frame.add(button);
        button.addActionListener(new ButtonListener());
    }
    
    public static void main(String[] args) {
        InputGuiRadio g = new InputGuiRadio();
    }
    
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            
        }
    }
}