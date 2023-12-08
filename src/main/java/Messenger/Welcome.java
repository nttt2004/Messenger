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

public class Welcome implements Initializable {

    @FXML
    private JFXButton AntifanButton1;

    @FXML
    private JFXButton AntifanButton2;

    @FXML
    private JFXButton SuhoButton;

    @FXML
    private AnchorPane chatPane;

    @FXML
    private JFXButton emilyButton1;

    @FXML
    private JFXButton emilyButton2;

    @FXML
    private TextField searchField;

    @FXML
    void AntifanButtonOnAction(ActionEvent event) {
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
    void SuhoButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Antifan.class.getResource("suho.fxml"));
            AnchorPane gamepane = fxmlLoader.load();
            chatPane.getChildren().setAll(gamepane);
            Suho antifanController = fxmlLoader.getController();
            antifanController.setChatPane(chatPane);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void emilyButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Antifan.class.getResource("emily.fxml"));
            AnchorPane gamepane = fxmlLoader.load();
            chatPane.getChildren().setAll(gamepane);
            Emily antifanController = fxmlLoader.getController();
            antifanController.setChatPane(chatPane);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setChatPane(AnchorPane chatPane) {
        this.chatPane = chatPane;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        searchField.setFocusTraversable(false);
    }
}
