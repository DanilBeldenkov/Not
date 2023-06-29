package com.example.notarius.controllers;

import com.example.notarius.database.User;
import com.example.notarius.Exit;
import com.example.notarius.Start_Add;
import com.example.notarius.database.DateBase;
import com.example.notarius.database.MD5;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUp {

    @FXML
    private Button B1;

    @FXML
    private Button BExit;

    @FXML
    private TextField TF1;

    @FXML
    private TextField TF2;

    @FXML
    private PasswordField PF3;

    @FXML
    private TextField TF4;

    @FXML
    void initialize(){

        B1.setOnAction(e -> {

            signUpNewUser();

            Start_Add startAdd = new Start_Add();
            try {
                startAdd.start(new Stage());
                B1.getScene().getWindow().hide();
                System.out.println("Авторизация");
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        BExit.setOnAction(e -> {
            System.out.println("Выход из приложения");

            Exit exit = new Exit();
            try {
                exit.start(new Stage());
                BExit.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    private void signUpNewUser() {
        DateBase dbBase = new DateBase();

        String FirstName = TF1.getText();
        String Login = TF2.getText();
        String Password = PF3.getText();
        String Phone = TF4.getText();

        Password = MD5.hashingPassword(Password);

        User user = new User(FirstName, Login, Password, Phone);

        dbBase.signUpUser(user);
    }
}
