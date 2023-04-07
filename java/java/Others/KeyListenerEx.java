package Others;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerEx implements KeyListener{ 
    JFrame f;
    JTextArea a;
    KeyListenerEx() {
        f = new JFrame("Key Listener");
        f.setSize(400, 400);
        a = new JTextArea();
        a.setBounds(0,0, 400, 400);
        f.add(a);
        a.addKeyListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setLayout(null);
        
    }
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
    }
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }
    public static void main(String[] args) {
        new KeyListenerEx();
    }
        
}
