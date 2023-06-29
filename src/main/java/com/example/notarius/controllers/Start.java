package com.example.notarius.controllers;

import com.example.notarius.*;
import com.example.notarius.Error;
import com.example.notarius.Exit;
import com.example.notarius.database.DateBase;
import com.example.notarius.database.MD5;
import com.example.notarius.database.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Start {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button BExit;

    @FXML
    private PasswordField PF1;

    @FXML
    private TextField TF1;

    @FXML
    void initialize() {

        B1.setOnAction(event -> {
            String login = TF1.getText().trim();
            String pass = PF1.getText().trim();


            if(!login.equals("") && !pass.equals("") | login.equals("ivanova"))
                loginUsers(login, pass);

            else {
                try {
                    Error error = new Error();
                    try {
                        error.start(new Stage());
                        B1.getScene().getWindow();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    System.out.println("Error");
                } catch (RuntimeException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        B2.setOnAction(e -> {

            System.out.println("Регистрация");

            Sign_Up signUp = new Sign_Up();
            try {
                signUp.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
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

    private void loginUsers(String login, String pass) {
        DateBase dbBase = new DateBase();
        User user  =new User();
        user.setLogin(login);
        user.setPassword(MD5.hashingPassword(pass));
        ResultSet result = dbBase.getUser(user);

        int counter = 0;

        try {
            while(result.next()) {
                counter++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (counter >= 1 && login.equals("ivanova") && TF1 !=null && PF1 !=null){
            try {
                Window_Not windowNot = new Window_Not();
                try {
                    windowNot.start(new Stage());
                    B1.getScene().getWindow().hide();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (counter >= 1 && TF1 != null && PF1 != null) {
            try {
                Window_User windowUser = new Window_User();
                try {
                    windowUser.start(new Stage());
                    B1.getScene().getWindow().hide();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Авторизация правильная");
        } else {
            Error error = new Error();
            try {
                error.start(new Stage());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Авторизация неправильная");

        }
    }
}
