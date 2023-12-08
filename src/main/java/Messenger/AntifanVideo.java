package Messenger;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class AntifanVideo {

    @FXML
    private AnchorPane chatPane;

    @FXML
    private JFXButton endButton;

    @FXML
    private JFXButton returnButton;

    @FXML
    private JFXButton speakButton;

    @FXML
    void endButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Antifan.class.getResource("antifan.fxml"));
            AnchorPane gamepane = fxmlLoader.load();
            chatPane.getChildren().setAll(gamepane);
            Antifan antifanController = fxmlLoader.getController();
            antifanController.setChatPane(chatPane);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void returnButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Antifan.class.getResource("antifan.fxml"));
            AnchorPane gamepane = fxmlLoader.load();
            chatPane.getChildren().setAll(gamepane);
            Antifan antifanController = fxmlLoader.getController();
            antifanController.setChatPane(chatPane);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private boolean isSpeak = true;

    @FXML
    private ImageView speakImage;

    @FXML
    void speakButtonOnAction(ActionEvent event) {
        if (isSpeak) {
            Image image = new Image(getClass().getResourceAsStream("offmic.png"));
            speakImage.setImage(image);
            isSpeak = false;
        } else {
            Image image = new Image(getClass().getResourceAsStream("micro.png"));
            speakImage.setImage(image);
            isSpeak = true;
        }
    }

    public void setChatPane(AnchorPane chatPane) {
        this.chatPane = chatPane;
    }
}
