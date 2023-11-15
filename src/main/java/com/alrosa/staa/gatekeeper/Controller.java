package com.alrosa.staa.gatekeeper;

import com.alrosa.staa.gatekeeper.admins_console.AdminsConsole;
import com.alrosa.staa.gatekeeper.admins_console.AdminsConsoleController;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ProgressBar progressBar = new ProgressBar();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressBar.getStyleClass().add("progress-bar");
        progressBar.setProgress(0.0);
        Timeline timeLine = new Timeline();
        KeyValue keyValue = new KeyValue(progressBar.progressProperty(), 1);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(5), onFinished, keyValue);
        timeLine.getKeyFrames().add(keyFrame);
        timeLine.play();
    }
    EventHandler<ActionEvent> onFinished = e-> {
        Stage stage = (Stage) progressBar.getScene().getWindow();
        stage.close();
        AdminsConsole adminsConsole = new AdminsConsole();
        try {
           adminsConsole.start(new Stage());
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    };
}