package com.alrosa.staa.gatekeeper.admins_console;

import com.alrosa.staa.gatekeeper.StartGateKeeper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AdminsConsole extends Application {
    private Image image = new Image(StartGateKeeper.class.getResource("favicon/knight.png").toString());
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(StartGateKeeper.class.getResource("admins_console/admins_console.fxml"));
        //Parent root = FXMLLoader.load(StartGateKeeper.class.getResource("admins_console/admins_console.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),450, 450);
        //Scene scene = new Scene(root);
        stage.setMaximized(true);
        stage.setTitle("Gatekeeper - guard of security");
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }
}
