package LoginRagiesterFrom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ragistretion extends JFrame {
    Ragistretion(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setLayout(null);
        panel.setBounds(370,110,500,400);
        // panel.setBackground(new Color(3, 45, 48))
        panel.setBackground(new Color(0,0,0,100));
        add(panel);

        JLabel a = new JLabel("Registrar From");
        a.setFont(new Font("Tahoma",Font.BOLD,20));
        a.setForeground(Color.white);
        a.setBounds(200,10,200,23);
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

        JLabel l3 = new JLabel("Password");
        l3.setFont(new Font("Tahoma",Font.BOLD,17));
        l3.setForeground(Color.white);
        l3.setBounds(185,130,90,14);
        panel.add(l3);

        JTextField t2 = new JTextField();
        t2.setFont(new Font("Tahoma",Font.BOLD,17));
        t2.setForeground(Color.white);
        t2.setBackground(new Color(16,108,115));
        t2.setBounds(185,150,160,23);
        panel.add(t2);

        JLabel l4 = new JLabel(" Confirm Password");
        l4.setFont(new Font("Tahoma",Font.BOLD,17));
        l4.setForeground(Color.white);
        l4.setBounds(185,190,200,14);
        panel.add(l4);

        JPasswordField p1 = new JPasswordField();
        p1.setForeground(Color.white);
        p1.setFont(new Font("Tahoma",Font.BOLD,17));
        p1.setBackground(new Color(16,108,115));
        p1.setBounds(185,210,160,23);
        panel.add(p1);

        JLabel l5 = new JLabel("Gmail");
        l5.setFont(new Font("Tahoma",Font.BOLD,17));
        l5.setForeground(Color.white);
        l5.setBounds(185,250,200,14);
        panel.add(l5);

        JTextField t3 = new JTextField();
        t3.setFont(new Font("Tahoma",Font.BOLD,17));
        t3.setForeground(Color.white);
        t3.setBackground(new Color(16,108,115));
        t3.setBounds(185,270,160,23);
        panel.add(t3);







        JButton b1 = new JButton("Clear");
        b1.setFont(new Font("Tahoma",Font.BOLD,12));
        b1.setBackground(new Color(15, 29, 31));
        b1.setForeground(Color.white);
        b1.setBounds(305,350,70,30);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              try{
                  if (e.getSource()==b1){
                      t1.setText("");
                      t2.setText("");
                      t3.setText("");

                  }

              }catch (Exception E){
                  E.printStackTrace();
              }

            }
        });

        JButton b2 = new JButton(" Register");
        b2.setFont(new Font("Tahoma",Font.BOLD,12));
        b2.setBackground(new Color(5, 45, 48));
        b2.setForeground(Color.white);
        b2.setBounds(95,350,165,30);
        panel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                if (e.getSource() == b2) {
                    String user = t1.getText();
                    String pass = t2.getText();
                    String Con_pass = String.valueOf(p1.getPassword());
                    String mail = t3.getText();
                    if (t1.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Please Fill the Username First");
                    }else if (t2.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Fill the Password");
                    }else
                    {
                        Con_database c = new Con_database();
                        String q = "insert into login3 values('"+user+"', '"+pass+"' , '"+Con_pass+"' , '"+mail+"' )";
                        c.statement.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Ragistretion Successfully ");
                        new Login1();
                        setVisible(false);
                    }

                }


                    }catch(Exception E){
                        E.printStackTrace();

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

    public static void main(String[] args) {
        new Ragistretion();

    }
}
