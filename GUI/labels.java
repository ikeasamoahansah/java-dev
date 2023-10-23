package GUI;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class labels {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Do you even code, bro?"); //new text
        label.setIcon(image); //change icon
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, RIGHT, CENTER of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, BOTTOM, CENTER of imageicon
        label.setForeground(Color.green); //text color
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); //text font
        label.setIconTextGap(-25); //Gap btn icon and text
        label.setBackground(Color.black); //Set background color
        label.setOpaque(true); //display background color
        label.setBorder(border); //sets border of label
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
