package com.example.notarius;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class
Window_User extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Window_User.class.getResource("start_add_1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1310, 845);
        stage.setTitle("Notarius");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}