package Others;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowListenerEx implements WindowListener{
    JFrame f;
    WindowListenerEx() {
        f = new JFrame("Window Listener");
        f.setSize(400, 400);
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Dieconified");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }
    public static void main(String[] args) {
        new WindowListenerEx();
    }
}
