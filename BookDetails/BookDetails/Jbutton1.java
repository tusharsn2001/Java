import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jbutton1{
       public static void main(String[] args) {
           Frame f = new Frame("My Button");
           Label l = new Label();
           l.setBounds(50,50,150,300);
           Button b = new Button("ok");
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
           f.setDefaultCloseOperation()
       }
}