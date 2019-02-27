import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel
{
    ImageIcon imageIcon = new ImageIcon("Prep.jpg");
    Image image = new ImageIcon("Prep.jpg").getImage();
    @Override
    public void paintComponent(Graphics g) {

        Image image = imageIcon.getImage();
        g.drawImage(image, 3, 4, this);
        
        //g.setColor(Color.blue);
        //g.fillRect(20, 50,100,100);
    }
    
    @Override 
    public Dimension getPreferredSize() {
        if (imageIcon != null) {
            return new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight());
        } else {
            return super.getPreferredSize();
        }
    }
}
