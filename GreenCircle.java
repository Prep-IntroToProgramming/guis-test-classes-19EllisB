import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GreenCircle {
    JFrame frame;
    ThisPanel panel;
    Timer timer;
    int bWidth;//width of the ball
    int bHeight;//height of the ball
    int x = 0; //records x position of the ball from the upper right hand corner
    int y = 0; //records y position
    boolean xPos = true; //true if moving in the positive x direction
    boolean yPos = true; //true if moving in the positive y direction

    GreenCircle(int bWidth, int bHeight) {
        if (bWidth > 0) {
            this.bWidth = bWidth;
        } else {//default value if the inputed width is non positive
            this.bWidth = 100;
        }
        if (bHeight > 0) {    
            this.bHeight = bHeight;
        } else {//default value if the inputed height is non positive
            this.bHeight = 100;
        }
        frame = new JFrame();
        panel = new ThisPanel();
        timer = new Timer(10, new TimerListener()); //ticks every 10 ms
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        timer.start();
    }

    public static void main(int ballWidth, int ballHeight) {
        GreenCircle g = new GreenCircle(ballWidth, ballHeight);
    }

    class ThisPanel extends JPanel {//panel which contains the ball and it's flat background
        @Override 
        public void paintComponent(Graphics g) {
            Color green = new Color(0, 255, 0);
            Color black = new Color(0, 0, 0);
            g.setColor(black);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(green);
            g.fillOval(x, y, bWidth, bHeight);//ball itself, it's position is dependent on x and y, witdh = bWidth, height = bHeight
        }
    }

    class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (xPos) { //If the ball is moving in the positive x direction, the x coordinate of the ball will increase
                x++;
            } else { // Otherwise it will decrease
                x--;
            }
            if (yPos) {   
                y++;
            } else {
                y--;
            }

            if (x <= 0) {//if the ball contacts the left wall
                xPos = true;
            }
            if (y <= 0) {//if the ball contacts the upper wall
                yPos = true;
            }
            if ((x + bWidth) >= panel.getWidth()) {//if the right edge of the ball contacts the right wall
                xPos = false;
            }
            if ((y + bHeight) >= panel.getHeight()) {//if the lower edge of the ball contacts the lower wall
                yPos = false;
            }

            panel.repaint();            
        }
    }
}