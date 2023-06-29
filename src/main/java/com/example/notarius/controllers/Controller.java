package com.example.notarius.controllers;

import com.example.notarius.model.Contact;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ResourceBundle;
import java.net .URL;
import java. util.ArrayList;
import java.util. List;

public class Controller {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button Exit;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private TextField email;

    @FXML
    private TextField name;

    @FXML
    private TextField phone;

    @FXML
    private Button up;

    @FXML
    private Button up1;

    @FXML
    private Button up11;

    @FXML
    private Button up111;

    @FXML
    private Button up2;

    @FXML
    private Button green;


    @FXML
    private Button red;

    @FXML
    private Button yel;


    @FXML
    void initialize() {

        green.setOnMousePressed(mouseEvent -> {
            red.setStyle("-fx-background-color: white");
            yel.setStyle("-fx-background-color: white");
        });

        red.setOnMousePressed(mouseEvent -> {
            green.setStyle("-fx-background-color: white");
            yel.setStyle("-fx-background-color: white");
        });

        yel.setOnMousePressed(mouseEvent -> {
            red.setStyle("-fx-background-color: white");
            green.setStyle("-fx-background-color: white");
        });

    }
}
