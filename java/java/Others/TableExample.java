package Others;
import javax.swing.*;
public class TableExample {
    JFrame f;
    JTable jt;
    TableExample() {
        f = new JFrame();
        f.setTitle("Table Example");
        String[][] data = new String[40][3];
        for(int i=0; i < 40; i++) 
        for(int j=0; j < 3; j++){
            data[i][j] = "xyz";
        }
        String[] column = {"Id", "Name", "Sallary"};
        jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        f.add(jt);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(500, 500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}
