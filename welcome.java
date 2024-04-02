package LoginRagiesterFrom;

import javax.swing.*;
import java.awt.*;

public class welcome extends JFrame {
    welcome(){
        JLabel l1 = new JLabel("WELCOME");
        l1.setBounds(550,300,300,100);
        l1.setFont(new Font("Tahoma",Font.BOLD,50));
        l1.setForeground(Color.black);
        add(l1);

        setSize(1550,1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(181, 241, 152));


    }
    public static void main(String[] args) {
        new welcome();

    }
}
