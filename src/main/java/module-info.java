module com.example.notarius {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.notarius to javafx.fxml;
    exports com.example.notarius;
    exports com.example.notarius.database;
    opens com.example.notarius.database to javafx.fxml;
    exports com.example.notarius.controllers;
    opens com.example.notarius.controllers to javafx.fxml;
    exports com.example.notarius.model;
    opens com.example.notarius.model to javafx.fxml;
}