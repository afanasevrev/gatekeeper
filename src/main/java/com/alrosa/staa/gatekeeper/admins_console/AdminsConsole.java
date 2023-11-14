package com.alrosa.staa.gatekeeper.admins_console;

import com.alrosa.staa.gatekeeper.StartGateKeeper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminsConsole extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(StartGateKeeper.class.getResource("admins_console/admins_console.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 450);
        stage.setTitle("Gatekeeper - guard of security");
        stage.setScene(scene);
        stage.show();
    }
}
