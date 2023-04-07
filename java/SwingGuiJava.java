import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingGuiJava extends JFrame {
    // JOptionPane op;

    SwingGuiJava() {
        String[] options = { "Yes please", "No way" };
        JOptionPane.showMessageDialog(rootPane, "Welcome to message");
        JOptionPane.showConfirmDialog(rootPane, "Welcome to message");
        JOptionPane.showOptionDialog(rootPane, "Welcome to message", "message", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, "yes Please");
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingGuiJava();
    }

}
