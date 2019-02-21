import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingTimerTest {
    JFrame frame;
    JLabel label;
    int seconds = 0;
    int period = 1;
    Timer timer = new Timer(period, new TimerListener());

    SwingTimerTest() {
        frame = new JFrame();
        label = new JLabel("" + seconds);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        timer.start();
    }

    public static void main(String[] args) {
        SwingTimerTest s = new SwingTimerTest();
    }

    class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            seconds++;
            label.setText("" + seconds);
        }
    }
}