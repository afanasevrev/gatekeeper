package com.alrosa.staa.gatekeeper.admins_console.boxes.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private AnchorPane mainPane = new AnchorPane();
    @FXML
    private Button buttonCreate = new Button();
    @FXML
    private Button buttonCancel = new Button();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AnchorPane.setRightAnchor(mainPane, 0.0);
        AnchorPane.setLeftAnchor(mainPane, 0.0);
        AnchorPane.setTopAnchor(mainPane, 0.0);
        AnchorPane.setBottomAnchor(mainPane, 0.0);

        AnchorPane.setBottomAnchor(buttonCreate, 0.0);
        AnchorPane.setBottomAnchor(buttonCancel, 0.0);
    }
}
