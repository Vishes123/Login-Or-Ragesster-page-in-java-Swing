package LoginRagiesterFrom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login1 extends JFrame {


    Login1(){
        JPanel panel = getPanel();
        panel.setLayout(null);
        panel.setLayout(null);
        panel.setBounds(370,110,500,300);
       // panel.setBackground(new Color(3, 45, 48))
        panel.setBackground(new Color(0,0,0,100));
        add(panel);

        JLabel a = new JLabel("Login From");
        a.setFont(new Font("Tahoma",Font.BOLD,20));
        a.setForeground(Color.white);
        a.setBounds(200,10,130,23);
        panel.add (a);

        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("Tahoma",Font.BOLD,17));
        l1.setForeground(Color.white);
        l1.setBounds(185,66,90,14);
        panel.add(l1);

        JTextField t1 = new JTextField();
        t1.setFont(new Font("Tahoma",Font.BOLD,17));
        t1.setForeground(Color.white);
        t1.setBackground(new Color(16,108,115));
        t1.setBounds(185,85,160,23);
        panel.add(t1);

        JLabel l2 = new JLabel("Password");
        l2.setFont(new Font("Tahoma",Font.BOLD,17));
        l2.setForeground(Color.white);
        l2.setBounds(185,130,90,13);
        panel.add(l2);



        JPasswordField p =new JPasswordField();
        p.setBackground(new Color(16,108,115));
        p.setBounds(185,150,160,23);
        p.setForeground(Color.white);
        panel.add(p);

        JButton b1 = new JButton("Login");
        b1.setFont(new Font("Tahoma",Font.BOLD,12));
        b1.setBackground(new Color(15, 29, 31));
        b1.setForeground(Color.white);
        b1.setBounds(285,220,70,30);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == b1) {

                        Con_database c = new Con_database();
                        String user = t1.getText();
                        String pass = p.getText();

                        String q = "select * from  login3 where username = '" + user + "' and  password = '" + pass + "'  ";
                        // ResultSet resultSet= c.statement.executeQuery(q);
                        ResultSet resultSet = c.statement.executeQuery(q);
                        if (resultSet.next()) {
                            new welcome();
                            setVisible(false);

                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrect Card no or Pin");

                        }
                    }

                    } catch(Exception E){
                        E.printStackTrace();
                    }




            }

        });

        JButton b2 = new JButton("Forget/New Register");
        b2.setFont(new Font("Tahoma",Font.BOLD,12));
        b2.setBackground(new Color(5, 45, 48));
        b2.setForeground(Color.white);
        b2.setBounds(95,220,165,30);
        panel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b2){
                    new Ragistretion();
                    setVisible(false);
                }
            }
        });

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("money s6.jpg"));
        Image i = img1.getImage().getScaledInstance(1190,650 , Image.SCALE_DEFAULT) ;
        ImageIcon  imageIcon = new ImageIcon(i);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,1190,650);
        add(label);



        getContentPane().setBackground(new Color(3,45,48));
      //  setSize(400,400);
        setSize(1190,650);
        setLocation(100,40);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }

    private static JPanel getPanel() {
        return new JPanel();
    }

    public static void main(String[] args) {
        new Login1();

    }
}
