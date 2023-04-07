package Others;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButtonEx implements ActionListener{    
    String gend = "";
    JFrame f;
    ButtonGroup g;
    JRadioButton male, female;
    RadioButtonEx() {
        f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(null);
        male = new JRadioButton("male"); 
        female = new JRadioButton("female"); 
        g = new ButtonGroup();
        male.setBounds(100, 100, 300, 50);
        female.setBounds(100, 200, 300, 50);
        f.add(male);
        g.add(male);
        male.addActionListener(this);
        f.add(female);
        g.add(female);
        female.addActionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == male) {
            this.gend = "male";
            JOptionPane.showMessageDialog(null, "male is clicked");
            System.out.println("Selected=" + this.gend);
        }
        else if(e.getSource() == female) {
            this.gend = "female";
            JOptionPane.showMessageDialog(null, "female is clicked");
            System.out.println("Selected=" + this.gend);
        }

    }
    public static void main(String[] args) {
       new RadioButtonEx();
    }
    
}
