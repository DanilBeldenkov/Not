package com.example.notarius;

import com.example.notarius.model.Contact;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ConUs {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Button up;


    @FXML
    private Button up2;

    @FXML
    void initialize() {
        up.setOnMousePressed(mouseEvent -> {
            B1.setStyle("-fx-background-color: #54D39D");
            B2.setStyle("-fx-background-color: #EBC95E");
            B3.setStyle("-fx-background-color: #E37A7A");
        });

        up2.setOnAction(e -> {
            L1.setText("Отправлена");
            L2.setText("на почту");
            B1.setStyle("-fx-background-color: white");
            B2.setStyle("-fx-background-color: white");
            B3.setStyle("-fx-background-color: white");
        });
    }

}
