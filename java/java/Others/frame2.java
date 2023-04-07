package Others;
import java.awt.*;
public class frame2 {
    Button b;
    frame2() {
        Frame f = new Frame("Home");
        b = new Button("Submit");
        b.setBounds(2, 2, 3, 1);
        f.add(b);
        f.setVisible(true);
        f.setSize(500, 500);
    }
    public static void main(String args[]) {
        new frame2();
    }
    
}
