import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Mrs extends JFrame implements ActionListener {
    private String title, genre, language;
    private int length;
    JLabel titleLabel, genreLabel, languageLabel, lengthLabel, successMessage;
    JTextField titleField, genreField, languageField, lengthField;
    GridBagConstraints gc;
    JButton btn;

    Mrs() {
        gc = new GridBagConstraints();
        titleLabel = new JLabel("Title: ");
        genreLabel = new JLabel("Genre: ");
        languageLabel = new JLabel("Language: ");
        lengthLabel = new JLabel("Length: ");
        successMessage = new JLabel();
        titleField = new JTextField();
        genreField = new JTextField();
        languageField = new JTextField();
        lengthField = new JTextField();
        btn = new JButton("Submit");
        setLayout(new GridBagLayout());
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.WEST;
        // title
        gc.gridx = 0;
        gc.gridy = 0;
        add(titleLabel, gc);
        gc.weightx = 0.5;
        gc.gridx = 1;
        titleField.setColumns(20);
        add(titleField, gc);
        // genre
        reset(gc);
        gc.gridx = 0;
        gc.gridy = 1;
        add(genreLabel, gc);
        gc.weightx = 0.5;
        gc.weighty = 0.05;
        gc.gridx = 1;
        genreField.setColumns(20);
        add(genreField, gc);
        // language
        reset(gc);
        gc.gridx = 0;
        gc.gridy = 2;
        add(languageLabel, gc);
        gc.weightx = 0.5;
        gc.gridx = 1;
        languageField.setColumns(20);
        add(languageField, gc);
        // length
        reset(gc);
        gc.gridx = 0;
        gc.gridy = 3;
        add(lengthLabel, gc);
        gc.weightx = 0.5;
        gc.weighty = 0.05;
        gc.gridx = 1;
        lengthField.setColumns(20);
        add(lengthField, gc);
        // button
        reset(gc);
        gc.gridx = 0;
        gc.gridy = 4;
        gc.weightx = 0.05;
        gc.weighty = 0.05;
        add(btn, gc);
        // Success message
        reset(gc);
        gc.gridx = 0;
        gc.gridy = 4;
        gc.weightx = 0.05;
        gc.weighty = 0.05;
        add(successMessage, gc);
        btn.addActionListener(this);
    }

    public void setItems(String title, String genre, String language, int length) {
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.length = length;
    }

    public void reset(GridBagConstraints gc) {
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 0;
        gc.weighty = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.NONE;
    }
    public void actionPerformed(ActionEvent e) {
        if (titleField.getText().length() != 0 && genreField.getText().length() != 0
                && languageField.getText().length() != 0 && lengthField.getText().length() != 0) {
            setItems(titleField.getText(), genreField.getText(), languageField.getText(),
                    Integer.parseInt(lengthField.getText()));
            // System.out.println(this.title + " " + this.language + " " + this.genre);
            store();

        } else {
            System.out.println("All Fields are menadtory");
        }
    }

    public void store() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "gunace123");
            String sql = "INSERT INTO `mrs`(`title`, `genre`, `language`, `length`) VALUES(?, ?, ?, ?)";
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, this.title);
            psmt.setString(2, this.genre);
            psmt.setString(3, this.language);
            psmt.setInt(4, this.length);
            psmt.executeUpdate();
            successMessage.setText("Data inserted Successfully");
            remove(btn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Mrs();
    }
}
