import java.awt.event.*;
import javax.swing.*;

public class JButton{
       public static void main(String[] args) {
           JFrame jf = new JFrame("My Button");
           JLabel jl = new JLabel();
           jl.setBounds(50,50,150,300);
           JButton bn = new JButton("ok");
           bn.setBounds(100,100,120,50);
           bn.addActionListener(new ActionListener())
           {
               public void actionPerformed(ActionEvent e)
               {
                   jl.setText("Successful!!");
               }
           }
           jf.add(bn);
           jf.add(jl);
           jf.setSize(500,300);
           jf.setLayout(null);
           jf.setVisible(true);
           jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
}