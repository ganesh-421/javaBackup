// import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class AppletJava extends JApplet {
    // public void paint(Graphics g) { for applet
    // g.drawString("Welcome", 150, 150);
    // }
    // for jApplet
    public void init() {
        JLabel lbl = new JLabel("This is JApplet tutorial");
        this.add(lbl);
    }
}
/*
 * <applet code="AppletJava.class" width="300" height="300"></applet>
 */