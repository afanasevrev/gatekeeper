package com.alrosa.staa.gatekeeper;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ImageView logo = new ImageView();
    @FXML
    private ProgressBar progressBar = new ProgressBar();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressBar.setProgress(0.0);
        Timeline timeLine = new Timeline();
        KeyValue keyValue = new KeyValue(progressBar.progressProperty(), 1);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(5),keyValue);
        timeLine.getKeyFrames().add(keyFrame);
        timeLine.play();
    }
}