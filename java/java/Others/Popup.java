package Others;
import javax.swing.*;
import java.awt.event.*;

public class Popup {
    JFrame f;
    JPopupMenu popup;
    JMenuItem copy, cut, paste, delete;
    Popup() {
        f = new JFrame("Popup Menu");
        f.setSize(700, 700);
        f.setLayout(null);
        popup = new JPopupMenu("Edit");
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");
        delete = new JMenuItem("Delete");
        popup.add(copy);
        popup.add(cut);
        popup.add(paste);
        popup.add(delete);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popup.show(f, e.getX(), e.getY()); 
            }
        });
    }
    public static void main(String[] args) {
        new Popup();
    }
}
