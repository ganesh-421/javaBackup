import javafx.application.Application;
//import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.FlowPane;

import javafx.stage.Stage;
public class MyFxProgram extends Application {
    @Override
    public void start(Stage primaryStage) {
        MenuItem itm1 = new MenuItem("menu1");
        MenuItem itm2 = new MenuItem("menu2");
        Menu[] m = new Menu[2];
        m[0] = new Menu("My menu");
        m[1] = new Menu("My second menu");
        m[0].getItems().addAll(itm1, itm2);        
        MenuBar mb = new MenuBar(m);
        Button btn = new Button();
//        Button btn2 = new Button();
        Label uname = new Label("User Name:");
        Label pass = new Label("Password:");
        TextField username = new TextField();
        PasswordField password = new PasswordField();
        RadioButton rem = new RadioButton("Remember me");
        btn.setText("Login");
        btn.setOnAction(new Handlers.LoginHandler());
        
//        StackPane root = new StackPane();
//        FlowPane root = new FlowPane(Orientation.VERTICAL, 50, 5);
        GridPane root = new GridPane();
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        root.setVgap(5);
        root.setHgap(5);
//        root.add(mb, 0, 0);
        root.add(uname, 0, 1);
        root.add(username, 1, 1);
        root.add(pass, 0, 2);
        root.add(password, 1, 2);
        root.add(btn, 0, 3);
        root.add(rem, 1, 3);
//        root.add(btn);
//        btn2.setText("I am new Button");
//        root.getChildren().add(btn2);
//        root.add(btn2, 0, 0);
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
