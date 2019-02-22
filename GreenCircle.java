import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GreenCircle {
    JFrame frame;
    ThisPanel panel;
    Timer timer;
    int x = 0;
    int y = 0;
    boolean xPos = true;
    boolean yPos = true;

    GreenCircle() {
        frame = new JFrame();
        panel = new ThisPanel();
        timer = new Timer(10, new TimerListener());
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        timer.start();
        //panel.move();
    }

    public static void main(String[] args) {
        GreenCircle g = new GreenCircle();
    }

    class ThisPanel extends JPanel {
        @Override 
        public void paintComponent(Graphics g) {
            Color green = new Color(0, 255, 0);
            Color black = new Color(0, 0, 0);
            g.setColor(black);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(green);
            g.fillOval(x, y, 100, 100);
        }
    }

    class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (xPos) {
                x++;
            } else {
                x--;
            }
            if (yPos) {   
                y++;
            } else {
                y--;
            }
            
            if (x <= 0) {
                xPos = true;
            }
            if (y <= 0) {
                yPos = true;
            }
            
            panel.repaint();            
        }
    }
}