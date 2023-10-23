package GUI;
import javax.swing.JFrame;
import java.awt.Color;

public class basics {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("My app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setResizable(false);

        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(0x123456));
    }
    
}