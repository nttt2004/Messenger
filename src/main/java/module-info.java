module com.example.hello {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;


    opens Messenger to javafx.fxml;
    exports Messenger;
}