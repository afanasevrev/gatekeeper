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

public class MainController implements Initializable {
    @FXML
    private Label label = new Label();
    @FXML
    TextField textField = new TextField();
    @FXML
    private AnchorPane mainPane = new AnchorPane();
    @FXML
    private Button buttonSave = new Button();
    @FXML
    private Button buttonCancel = new Button();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textField.setText(Variables.adminsConsoleItem.getValue().getCompleteName());
        label.setText("1");

        AnchorPane.setTopAnchor(mainPane, 0.0);
        AnchorPane.setLeftAnchor(mainPane, 0.0);
        AnchorPane.setBottomAnchor(mainPane, 0.0);
        AnchorPane.setRightAnchor(mainPane, 0.0);

        AnchorPane.setBottomAnchor(buttonSave, 0.0);
        AnchorPane.setBottomAnchor(buttonCancel, 0.0);
    }
    @FXML
    private void setButtonSave() {
        if (!Variables.adminsConsoleItem.getValue().getCompleteName().equals(textField.getText())) {
            Variables.adminsConsoleItem.getValue().setCompleteName(textField.getText());
            System.out.println("Is created");
        } else {
            System.out.println("Not create");
        }
    }
    @FXML
    private void setButtonCancel() {
        System.out.println("Operation is canceled!");
    }
}
