package com.alrosa.staa.gatekeeper.admins_console;

import com.alrosa.staa.gatekeeper.StartGateKeeper;
import com.alrosa.staa.gatekeeper.Variables;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Container extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(StartGateKeeper.class.getResource("admins_console/containers/container.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),400, 400);
        stage.setTitle("Добавьте объект");
        stage.getIcons().add(Variables.image);
        stage.setScene(scene);
        stage.show();
    }
}
