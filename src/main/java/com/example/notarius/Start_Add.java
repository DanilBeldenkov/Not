package com.example.notarius;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Start_Add extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start_Add.class.getResource("Start_Add.fxml"));
        Scene scene = new Scene( fxmlLoader.load(), 800, 400);
        stage.setTitle("Notarius");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}