import java.awt.*;
import java.util.concurrent.Flow;

public class FlowLayoutJava {
    Frame fr;
    Button b1, b2, b3;

    FlowLayoutJava(FlowLayout l) {

        fr = new Frame("Flow Layout");
        fr.setSize(400, 400);
        fr.setLayout(l);
        b1 = new Button("btn1");
        b2 = new Button("btn2");
        b3 = new Button("btn3");
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        FlowLayout l1 = new FlowLayout((FlowLayout.TRAILING)); //right in left-right orientation of container
        FlowLayout l2 = new FlowLayout((FlowLayout.LEADING), 20, 20); //left in left-right orientation of container
        FlowLayout l3 = new FlowLayout((FlowLayout.CENTER), 20, 30);
        FlowLayout l4 = new FlowLayout((FlowLayout.RIGHT), 20, 30);
        FlowLayout l5 = new FlowLayout((FlowLayout.LEFT), 20, 30);
        new FlowLayoutJava(l1);
    }
}