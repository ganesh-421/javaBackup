
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;

public class JavaFXApplication1 extends Application {
    @Override
    public void start(Stage  firstStage) throws Exception {
        Button btn = new Button("First button");
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene sc = new Scene(root, 400, 300);
        firstStage.setScene(sc);
        firstStage.setTitle("My First JFX Stage");
        firstStage.show();
        btn.setOnAction(new Handler());
    }
    class Handler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent ae)
        {
            System.out.println("Hello World");
        }
    }
    public static void main(String args[])
    {
        launch(args);
    }
}