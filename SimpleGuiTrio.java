import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleGuiTrio {
    JFrame frame;
    JButton buttonLeft;
    JButton buttonRight;
    OneShapePanel panel;

    public SimpleGuiTrio() {
        frame = new JFrame();
        buttonLeft = new JButton("Foreground");
        buttonRight = new JButton("Background");
        panel = new OneShapePanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.WEST, buttonLeft);
        frame.add(BorderLayout.EAST, buttonRight);
        frame.add(BorderLayout.CENTER, panel);

        frame.setSize(400, 400);
        frame.setVisible(true);

        buttonLeft.addActionListener(new ButtonLeftListener());
        buttonRight.addActionListener(new ButtonRightListener());
    }

    public static void main(String[] args) {
        SimpleGuiTrio g = new SimpleGuiTrio();
    }

    class ButtonLeftListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            panel.randBackColor();
            panel.repaint();
        }
    }

    class ButtonRightListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            panel.randForeColor();
            panel.repaint();
        }
    }
}