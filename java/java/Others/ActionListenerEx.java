package Others;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionListenerEx implements ActionListener{
    JFrame f;
    JButton b1, b2;
    ActionListenerEx() {
        f = new JFrame("The action Listener");
        f.setSize(500, 500);
        f.setLayout(null);
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b1.setBounds(100, 100, 300, 50);
        b2.setBounds(100, 200, 300, 50);
        f.add(b1);
        b1.addActionListener(this);
        f.add(b2);
        b2.addActionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            JOptionPane.showMessageDialog(null, "Button1 is clicked");
        }
        else if(e.getSource() == b2) {
            JOptionPane.showMessageDialog(null, "Button2 is clicked");
        }

    }
    public static void main(String[] args) {
        new ActionListenerEx();
    }
}
