package ComponentDemos;

import java.util.*;
import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 

public class BoxDemo2 implements ItemListener{
    ArrayList<JCheckBox> boxes = new ArrayList<JCheckBox>();
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Pick em");
    
    public BoxDemo2() {
        for (int i = 1; i <= 5; i++) {
            JCheckBox box = new JCheckBox("Box " + i);
            box.addItemListener(this);
            boxes.add(box);
            panel.add(box);
        }
        frame.add(panel);
        frame.add(label, BorderLayout.SOUTH);
        frame.setSize(300, 160);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        String labelString = "Selected: ";
        for (JCheckBox box: boxes) {
            if (box.isSelected()) {
                labelString += box.getText() + "; ";
            }
        }
        label.setText(labelString);
    }
   
    public static void main(String[] args) {
        BoxDemo2 gui = new BoxDemo2();
    }
}
