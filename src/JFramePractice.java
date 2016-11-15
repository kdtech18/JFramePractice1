/* JFramePractice.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   11/15/2016
*/
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class JFramePractice
    {
    public static void main(String[] args)
        {
        JFrame aFrame = new JFrame("This is my first frame.");
        JLabel alabel = new JLabel("Kenton Duprey");
        JButton pressBtn = new JButton("Press Me");
        
        
        // setSize(width, height)
        aFrame.setSize(450, 450);
        // set title
        aFrame.setTitle("This is a set title");
        // set if resizable
        aFrame.setResizable(false);
        aFrame.add(alabel);
        aFrame.add(pressBtn);
        aFrame.setDefaultCloseOperation(aFrame.EXIT_ON_CLOSE);
        aFrame.setVisible(true);
        }// end main method
    }