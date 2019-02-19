import javax.swing.*;
import java.awt.*;

class TestRandomPanel {
    JFrame frame;
    
    public TestRandomPanel() {
        frame = new JFrame();
        frame.add(new RandomPanel());
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        TestRandomPanel t = new TestRandomPanel();
    }   
}