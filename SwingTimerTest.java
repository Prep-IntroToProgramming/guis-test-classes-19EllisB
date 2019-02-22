import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingTimerTest {
    JFrame frame;
    JLabel label;
    int milleseconds = 0;
    int seconds = 5;
    int period1 = 1;
    int period2 = 1000;
    Timer timerOne = new Timer(period1, new TimerOneListener());
    Timer timerTwo = new Timer(period2, new TimerTwoListener());

    SwingTimerTest() {
        frame = new JFrame();
        label = new JLabel("" + seconds);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        timerOne.start();
    }

    public static void main(String[] args) {
        SwingTimerTest s = new SwingTimerTest();
    }

    class TimerOneListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            milleseconds++;
            label.setText("" + milleseconds);
            if (milleseconds >= 5000) {
                timerOne.stop();
                timerTwo.start();
            }
        }
    }
    
    class TimerTwoListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            seconds++;
            label.setText("" + seconds);
        }
    }
}