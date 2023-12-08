package Messenger;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Antifan implements Initializable {

    @FXML
    private JFXButton CallButton;

    @FXML
    private JFXButton VideoButton;

    @FXML
    private AnchorPane chatPane;

    @FXML
    private JFXButton giveButton;

    @FXML
    private JFXButton imageButton;

    @FXML
    private JFXButton returnButton;

    @FXML
    private JFXButton speakButton;

    @FXML
    private TextField messageField;

    @FXML
    void CallButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Antifan.class.getResource("antifanCall.fxml"));
            AnchorPane gamepane = fxmlLoader.load();
            chatPane.getChildren().setAll(gamepane);
            AntifanCall antifanController = fxmlLoader.getController();
            antifanController.setChatPane(chatPane);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void VideoButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Antifan.class.getResource("antifanVideo.fxml"));
            AnchorPane gamepane = fxmlLoader.load();
            chatPane.getChildren().setAll(gamepane);
            AntifanVideo antifanController = fxmlLoader.getController();
            antifanController.setChatPane(chatPane);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void giveButtonOnAction(ActionEvent event) {

    }

    @FXML
    void imageButtonOnAction(ActionEvent event) {

    }

    @FXML
    void returnButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Antifan.class.getResource("welcome.fxml"));
            AnchorPane gamepane = fxmlLoader.load();
            chatPane.getChildren().setAll(gamepane);
            Welcome antifanController = fxmlLoader.getController();
            antifanController.setChatPane(chatPane);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void speakButtonOnAction(ActionEvent event) {

    }

    public void setChatPane(AnchorPane chatPane) {
        this.chatPane = chatPane;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        messageField.setFocusTraversable(false);
    }
}
