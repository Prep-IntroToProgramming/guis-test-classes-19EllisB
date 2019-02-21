import javax.swing.*;
import java.awt.*;

class OneShapePanel extends JPanel {
    int[] b = {0, 0, 0,};
    int[] f = {255, 255, 255};

    public void randBackColor() {
        for (int i = 0; i < 3; i++) {
            b[i] = (int) (Math.random() * 255);
        }
    }
    
    public void randForeColor() {
        for (int i = 0; i < 3; i++) {
            f[i] = (int) (Math.random() * 255);
        }
    }

    @Override 
    public void paintComponent(Graphics g) {
        Color background = new Color(b[0], b[1], b[2]);
        Color foreground = new Color(f[0], f[1], f[2]);
        
        g.setColor(background);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(foreground);
        g.fillOval(70, 70, 100, 100);
    }
}