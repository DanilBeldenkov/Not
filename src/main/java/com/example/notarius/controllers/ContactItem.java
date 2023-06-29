package com.example.notarius.controllers;

import com.example.notarius.model.Contact;
import javafx.fxml.Initializable;
import java.net .URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.fxml.FXML;

public class ContactItem implements Initializable {

    @FXML
    private Label email;

    @FXML
    private ImageView img;

    @FXML
    private Label name;

    @FXML
    private Label phone;

    public void setData(Contact contact) {
        Image imgProfile = new Image(getClass().getResourceAsStream(contact.getImgSrc()));
        img.setImage(imgProfile);
        name.setText(contact.getName());
        phone.setText(contact.getPhoneNumber());
        email.setText(contact.getEmail());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}