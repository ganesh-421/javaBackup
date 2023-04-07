package Others;
import java.awt.*;
public class SampleUi extends Frame {
    public Button b1 = new Button("Submit");
    public TextField t1 = new TextField();
    Label user;
    SampleUi() {
        user = new Label("User Name");
        user.setBounds(100,50, 100, 50);
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        b1.setBounds(50,100,100,50);
        add(b1);
        add(user);
        t1.setBounds(100, 50, 100, 50);
        add(t1);
    }
    public static void main(String args[]) {
        new SampleUi();
    }
}