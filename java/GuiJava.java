import javax.swing.*;
import java.awt.*;
public class GuiJava extends JFrame{
    
    public static void main(String[] args) {
        // create a form and save data in database
        GuiJava gui = new GuiJava();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400, 400);
        gui.setVisible(true);
        gui.setTitle("My First GUI");
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setLayout(new FlowLayout());
        gui.add(new JLabel("Name: "));
        gui.add(new JTextField(20));
        gui.add(new JLabel("Email: "));
        gui.add(new JTextField(20));
        gui.add(new JLabel("Password: "));
        gui.add(new JPasswordField(20));
        gui.add(new JButton("Submit"));
        


    }    
}
