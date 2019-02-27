import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class InputGuiRadio {
    JFrame frame;
    JFrame frame2;
    JButton button;
    JLabel label;
    JPanel panel;
    JRadioButton rButton1;
    JRadioButton rButton2;
    JRadioButton rButton3;
    ButtonGroup bGroup;
    String answer = "This button was clicked";
    String guess = "f";
    
    public InputGuiRadio() {
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button = new JButton();
        //frame.add(button);
        button.addActionListener(new ButtonListener());
        panel = new JPanel();
        frame.add(panel);
        bGroup = new ButtonGroup();
        panel.add(button);
        rButton1 = new JRadioButton("Click me");
        rButton2 = new JRadioButton("Me too");
        rButton3 = new JRadioButton("Me three");
        bGroup.add(rButton1);
        bGroup.add(rButton2);
        bGroup.add(rButton3);
        panel.add(rButton1);
        panel.add(rButton2);
        panel.add(rButton3);
        rButton1.setActionCommand(rButton1.getText());
        rButton2.setActionCommand(rButton2.getText());
        rButton3.setActionCommand(rButton3.getText());
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        InputGuiRadio g = new InputGuiRadio();
    }
    
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println(bGroup.getSelection().getActionCommand());
        }
    }
}