package Others;
import java.awt.*;
public class frame1 extends Frame{
    TextField tuser;
    Label user;
    Label pass;
    frame1() {
        setTitle("Home");
        user = new Label("User Name");
        tuser = new TextField();
        pass = new Label("Password");
        tuser.setBounds(100, 100, 100, 20);
        user.setBounds(20, 100, 100, 20);
        pass.setBounds(20, 120, 100, 20);
        add(pass);
        add(user);
        add(tuser);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]) {
        new frame1();

    }
    
}
