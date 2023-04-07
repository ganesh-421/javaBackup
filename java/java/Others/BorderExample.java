package Others;
import java.awt.Color;

// import javax.swing.BorderFactory;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
import javax.swing.*;
public class BorderExample extends JFrame{
    BorderExample() {
        this.setSize(500, 500);
        this.setLayout(null);
        this.createUi();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void createUi() {
        JPanel p = new JPanel();
        Border blackLine = BorderFactory.createLineBorder(Color.BLACK);
        p.setBounds(50, 100, 300, 100);
        p.setBackground(Color.cyan);
        p.add(new JLabel("Hello I am Java p."));
        p.setBorder(blackLine);
        add(p);
    }
    public static void main(String[] args) {
        new BorderExample();
    }
}
