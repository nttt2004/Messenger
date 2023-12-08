package Messenger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage window;

    @Override
    public void start(Stage stage) {
        window = stage;
        initUI();
    }

    private void initUI() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);

            window.setTitle("Messenger");
            window.setScene(scene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}
