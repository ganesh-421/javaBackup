package Others;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseEventJava implements MouseListener, MouseMotionListener{
    JFrame f;
    MouseEventJava() {
        f =  new JFrame("Mouse Event Handling");
        f.setSize(400, 400);
        f.setLayout(null);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }   
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getClickCount());

    } 
    public void mouseEntered(MouseEvent e) {
        System.out.println("The mouse has been entered");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("The mouse has been exited");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("The mouse has been pressed");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("The mouse has been released");
    }
    public void mouseMoved(MouseEvent e) {
        System.out.println("The mouse has been moved");
    }
    public void mouseDragged(MouseEvent e) {
        System.out.println("The mouse has been Dragged");
    }
    public static void main(String[] args) {
        new MouseEventJava();
        
    }
    
}
