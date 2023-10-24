package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myButtonFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    
    myButtonFrame() {
        label = new JLabel();
        label.setText("Hehe");
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);


        button = new JButton("Click me!");
        button.addActionListener(this);
        button.setForeground(Color.cyan);
        button.setBackground(Color.blue);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFocusable(false);
        

        this.setTitle("New Box");
        this.setSize(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            label.setVisible(true);
        }
    }
}
