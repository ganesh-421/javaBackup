import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Prv extends JFrame implements ActionListener {
    JTextField tf;
    JLabel lb, lbresult;
    JButton btn1, btn2, btn3;
    // private int vCount;
    private String rev, input, vowels = "";

    Prv() {
        lb = new JLabel("Input any String");
        lbresult = new JLabel();
        tf = new JTextField();
        btn1 = new JButton("check-palindrome");
        btn2 = new JButton("reverse");
        btn3 = new JButton("vowels");
        setLayout(new GridLayout(4, 4, 10, 30));
        add(lb);
        add(tf);
        add(btn1);
        add(btn2);
        add(btn3);
        add(lbresult);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        lbresult.setText("");
        this.vowels = "";
        this.input = tf.getText();
        StringBuilder sb = new StringBuilder(this.input);
        this.rev = sb.reverse().toString();
        if (this.input.length() != 0) {
            if (e.getSource() == btn1) {
                lbresult.setText("");
                if (this.rev.equals(this.input))
                    lbresult.setText("Yes, the input string is palindrome");
                else
                    lbresult.setText("No, the input string is not palindrome");
            } else if (e.getSource() == btn2) {
                lbresult.setText(this.rev);
            } else if (e.getSource() == btn3) {
                for (int i = 0; i < this.input.length(); i++) {
                    if (Character.toLowerCase(this.input.charAt(i)) == 'a'
                            || Character.toLowerCase(this.input.charAt(i)) == 'e'
                            || Character.toLowerCase(this.input.charAt(i)) == 'i'
                            || Character.toLowerCase(this.input.charAt(i)) == 'o'
                            || Character.toLowerCase(this.input.charAt(i)) == 'u') {
                        this.vowels += this.input.charAt(i);
                    }
                }
                lbresult.setText(this.vowels);
            }
        } else {
            System.out.println("Enter input");
        }

    }

    public static void main(String[] args) {
        new Prv();
    }
}
