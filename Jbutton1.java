
import java.awt.event.*;
import javax.swing.*;

public class Jbutton1{
       public static void main(String[] args) {
           JFrame f = new JFrame("My Button");
           JLabel l = new JLabel();
           l.setBounds(50,50,150,300);
           JButton b = new JButton("ok");
           b.setBounds(100,100,120,50);
           b.addActionListener(new ActionListener()
           {
               public void actionPerformed(ActionEvent e)
               {
                   l.setText("Successful!!");
               }
           });
           f.add(b);
           f.add(l);
           f.setSize(500,300);
           f.setLayout(null);
           f.setVisible(true);
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
}