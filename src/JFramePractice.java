/* JFramePractice.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   11/15/2016
*/
import javax.swing.*;
import java.awt.Color;

public class JFramePractice
    {
    public static void main(String[] args)
        {
        JFrame aFrame = new JFrame("This is my first frame.");
        JLabel alabel = new JLabel("Kenton Duprey");
        JButton pressBtn = new JButton("Press Me");
        
        aFrame.setSize(450, 450);
        aFrame.setTitle("This is a set title");
        aFrame.setResizable(false);
        aFrame.add(alabel);
        aFrame.add(pressBtn);
        aFrame.setVisible(true);
        }// end main method
    }