import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CustomDialog {
    JFrame fr;
    JDialog d2, d4;
    JLabel lb;

    CustomDialog() {
        fr = new JFrame("My frame");
        lb = new JLabel("to be kept inside dialog");
        fr.setSize(400, 400);
        // calling different constructors of JDialog
        d2 = new JDialog(fr, "My Dialog with title i am d2");
        // d3 = new JDialog(fr, true);
        d4 = new JDialog(fr, "dialog with modal and title d4", true);
        d2.setSize(200, 200);
        d2.setTitle("d2 with true modal");
        // d3.setSize(200, 200);
        d4.setSize(200, 200);
        // adding label to dialog
        d4.add(lb);
        // d3.add(lb);
        d2.add(lb);
        // setting visibility of frame and dialogs
        fr.setVisible(true);
        d2.setVisible(true);
        // d3.setVisible(true);
        d4.setVisible(true);
        fr.setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new CustomDialog();
    }
}
