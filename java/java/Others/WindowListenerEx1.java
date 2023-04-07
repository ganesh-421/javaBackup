package Others;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowListenerEx1 {
    JFrame f;
    WindowListenerEx1() {
        f = new JFrame("Window Listener");
        f.setSize(400, 400);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
                f.dispose();
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }    
    public static void main(String[] args) {
        new WindowListenerEx1();
    }
}
