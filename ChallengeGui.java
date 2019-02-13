import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChallengeGui {
    JFrame frame;
    JButton buttonLeft;
    JButton buttonRight;
    JLabel label;

    String text = "[Redacted] [Redacted]";
    int left = 0;
    int right = 0;
    String[] firstWord = {"Edible", "Inedible", "Tasty"};
    String[] lastWord = {"Corn", "Nails", "Aluminum", "Takis"};
    public ChallengeGui() {
        frame = new JFrame();
        buttonLeft = new JButton("Left");
        buttonRight = new JButton("Right");
        label = new JLabel(text);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.WEST, buttonLeft);
        frame.add(BorderLayout.EAST, buttonRight);
        frame.add(BorderLayout.CENTER, label);

        frame.setSize(400, 400);
        frame.setVisible(true);

        buttonLeft.addActionListener(new ButtonLeftListener());
        buttonRight.addActionListener(new ButtonRightListener());
    }

    public static void main(String[] args) {
        ChallengeGui g = new ChallengeGui();
    }

    class ButtonLeftListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            left++;
            left = left % firstWord.length;
            text = firstWord[left] + lastWord[right];
            label.setText(text);
        }
    }

    class ButtonRightListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            right++;
            if (right >= lastWord.length) {
                right = 0;
            }
            text = firstWord[left] + lastWord[right];
            label.setText(text);
        }
    }
}