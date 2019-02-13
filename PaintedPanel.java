import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PaintedPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        for (int i = 0; i <= 255; i++) {
            g.setColor(new Color(0, 0, i));
            g.fillRect(20 + i, 50, 1, 100);
        }

    }
}
