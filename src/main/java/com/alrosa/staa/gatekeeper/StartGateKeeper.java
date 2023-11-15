package com.alrosa.staa.gatekeeper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
public class StartGateKeeper extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartGateKeeper.class.getResource("gatekeeper.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 450);
        scene.getStylesheets().add(getClass().getResource("css/logo.css").toExternalForm());
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Gatekeeper - guard of security");
        //stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}