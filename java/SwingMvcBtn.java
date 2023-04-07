import java.awt.*;
import javax.swing.*;

public class SwingMvcBtn extends JFrame {
    JButton btn;

    public SwingMvcBtn() {
        setTitle("Swing MVC Demo");
        setSize(500, 300);
        btn = new JButton("Submit"); // this will automatically instantiate ButtonModel
        DefaultButtonModel dBtn = new DefaultButtonModel();
        dBtn = (DefaultButtonModel) btn.getModel(); // Model (ButtonModel btn cast to DefaultButtonModel and the model
                                                    // associated to btn is assigned to dBtn)
        dBtn.setEnabled(false); // controller (once we are in model, we can change the state and behaviour of
                                // the model)
        setLayout(new FlowLayout());
        add(btn);
        setVisible(true); // view
    }

    public static void main(String[] args) {
        new SwingMvcBtn();
    }
}