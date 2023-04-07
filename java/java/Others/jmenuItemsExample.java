package Others;
import javax.swing.*;
public class jmenuItemsExample {
    JFrame f;
    JMenuBar mb;
    JMenu m1, m2, save;
    JMenuItem i1, i2, i3, i4, i5;
    jmenuItemsExample() {
        f = new JFrame("Menu Items");
        f.setSize(500, 500);
        mb = new JMenuBar();
        m1 = new JMenu("file");
        mb.add(m1);
        m2 = new JMenu("services");
        mb.add(m2);
        save = new JMenu("Save as");
        mb.add(save);
        i1 = new JMenuItem("Copy");
        m1.add(i1);
        i2 = new JMenuItem("Edit");
        m1.add(i2);
        i3 = new JMenuItem("Move");
        m1.add(i3);
        i4 = new JMenuItem("pdf");
        save.add(i4);
        i5 = new JMenuItem("docs");
        save.add(i5);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setDefaultCloseOperation(0);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new jmenuItemsExample();
    }
}
