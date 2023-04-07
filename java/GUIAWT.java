import java.awt.*;
import java.applet.*;

/*
 * <applet code="GUIAWT" width="300" height="300"></applet>
 */
public class GUIAWT extends Applet {
    // Window win = new Window(fr);
    // Dimension size = new Dimension();
    Frame fr = new Frame(); // we seldom do this, we extend Frame class...
    Button btn = new Button("click me");
    // Rectangle r = new Rectangle();
    Graphics graphics = getGraphics();

    // GUIAWT() {
    // /*
    // * // win.setSize(50, 50);
    // * // win.setSize(300, 300);
    // * // win.setVisible(true);
    // * // Dimension newSize = size.getSize();
    // * // System.out.println(newSize.getWidth());
    // */
    // r.x = 30;
    // r.y = 100;
    // r.height = 30;
    // r.width = 60;
    // fr.setVisible(true);
    // fr.setSize(300, 300);
    // fr.setTitle("My Frame");
    // fr.setLayout(null);
    // btn.setBounds(r);
    // // btn.setBounds(30, 100, 80, 30);
    // fr.add(btn);
    // }
    GUIAWT() {

        init();
        start();
        paint(graphics);
        stop();
    }

    public void init() {
        fr = new Frame("inside applet");
        fr.setSize(150, 150);
        fr.setVisible(true);
    }

    public void start() {
        fr.setVisible(true);
    }

    public void stop() {
        fr.setVisible(false);
    }

    public void paint(Graphics g) {
        g.drawRect(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        new GUIAWT();
    }
}
