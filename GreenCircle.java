import javax.swing.*;
import java.awt.*;

class GreenCircle {
    JFrame frame;
    ThisPanel panel;

    GreenCircle() {
        frame = new JFrame();
        panel = new ThisPanel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        panel.move();
    }

    public static void main(String[] args) {
        GreenCircle g = new GreenCircle();
    }

    class ThisPanel extends JPanel {
        int x = 0;
        int y = 0;
        @Override 
        public void paintComponent(Graphics g) {
            Color green = new Color(0, 255, 0);
            Color black = new Color(0, 0, 0);
            g.setColor(black);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(green);
            g.fillOval(x, y, 100, 100);
        }
        
        public void move() {
            while (true) {
                x++;
                y++;
                try {
                    Thread.sleep(17);
                } catch (InterruptedException e) {
                    //
                }
                repaint();
            }
        }
    }
}