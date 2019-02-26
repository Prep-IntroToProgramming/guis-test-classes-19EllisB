import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class InputGuiText {
    JFrame frame;
    JButton button;
    JLabel label;
    JTextField textField;
    String answer = "This button was clicked";
    String guess = "f";
    
    public InputGuiText() {
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        
        textField = new JTextField("How do you know if this button has been clicked?");
        button = new JButton();
        frame.add(textField);
        frame.add(button);
        button.addActionListener(new ButtonListener());
    }
    
    public static void main(String[] args) {
        InputGuiText g = new InputGuiText();
    }
    
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.printf("%s%n", textField.getText());
            if (guess.equals(answer)) {
                System.out.println("Yay, you're correct");
            } else {
                System.out.println("Better luck next time");
            }
        }
    }
}