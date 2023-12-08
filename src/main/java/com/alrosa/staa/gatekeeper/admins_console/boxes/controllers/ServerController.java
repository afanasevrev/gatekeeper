package com.alrosa.staa.gatekeeper.admins_console.boxes.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ServerController implements Initializable {
    @FXML
    private Label label = new Label();
    @FXML
    private TextField textFieldName = new TextField();
    @FXML
    private TextField textFieldIP = new TextField();
    @FXML
    private TextField textFieldPort = new TextField();
    @FXML
    private Button buttonSave = new Button();
    @FXML
    private Button buttonCancel = new Button();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
