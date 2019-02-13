import javax.swing.*;
import java.awt.*;

class TestPaintedPanel {
    JFrame frame;
    
    public TestPaintedPanel() {
        frame = new JFrame();
        frame.add(new PaintedPanel());
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        TestPaintedPanel t = new TestPaintedPanel();
    }   
}