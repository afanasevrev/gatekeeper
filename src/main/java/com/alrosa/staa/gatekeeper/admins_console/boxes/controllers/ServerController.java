package com.alrosa.staa.gatekeeper.admins_console.boxes.controllers;

import com.alrosa.staa.gatekeeper.Variables;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ServerController implements Initializable {
    @FXML
    private AnchorPane serverPane = new AnchorPane();
    @FXML
    private Label labelID = new Label();
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
        textFieldName.setText(Variables.adminsConsoleItem.getValue().getCompleteName());
        labelID.setText("2");
        textFieldIP.setText("0.0.0.0");
        textFieldPort.setText("8080");

        AnchorPane.setTopAnchor(serverPane, 0.0);
        AnchorPane.setLeftAnchor(serverPane, 0.0);
        AnchorPane.setBottomAnchor(serverPane, 0.0);
        AnchorPane.setRightAnchor(serverPane, 0.0);

        AnchorPane.setBottomAnchor(buttonSave, 0.0);
        AnchorPane.setBottomAnchor(buttonCancel, 0.0);
    }
}
