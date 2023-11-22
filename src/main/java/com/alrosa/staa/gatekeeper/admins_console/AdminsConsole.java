package com.alrosa.staa.gatekeeper.admins_console;

import com.alrosa.staa.gatekeeper.StartGateKeeper;
import com.alrosa.staa.gatekeeper.Variables;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AdminsConsole extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(StartGateKeeper.class.getResource("admins_console/admins_console.fxml"));
        //Parent root = FXMLLoader.load(StartGateKeeper.class.getResource("admins_console/admins_console.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),700, 550);
        //Scene scene = new Scene(root);
        stage.setMaximized(true);
        stage.setTitle("Gatekeeper - Guard of Security");
        stage.getIcons().add(Variables.image);
        stage.setScene(scene);
        stage.show();
    }
}
