import javax.swing.*;

public class SimpleGui2{ 
    public SimpleGui2() {
        JFrame frame = new JFrame();
        ImagePanel panel = new ImagePanel();
 
        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        //frame.add(panel2);
        //frame.add(label);
        frame.setSize(panel.imageIcon.getIconWidth() + 20, panel.imageIcon.getIconHeight() + 45);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
    }
} 
