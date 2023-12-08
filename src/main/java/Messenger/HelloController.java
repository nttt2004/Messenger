package Messenger;

import com.jfoenix.controls.JFXButton;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private AnchorPane chatPane;

    @FXML
    private JFXButton startButton;

    @FXML
    private Label timeLabel;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Welcome.class.getResource("welcome.fxml"));
            AnchorPane welcomepane = fxmlLoader.load();
            chatPane.getChildren().setAll(welcomepane);
            Welcome welcomeController = fxmlLoader.getController();
            welcomeController.setChatPane(chatPane);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> {
                    LocalTime currentTime = LocalTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                    String formattedTime = currentTime.format(formatter);
                    timeLabel.setText(formattedTime);
                }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
}
