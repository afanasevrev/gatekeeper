package com.alrosa.staa.gatekeeper.admins_console.boxes;

import com.alrosa.staa.gatekeeper.Direction;
import com.alrosa.staa.gatekeeper.StartGateKeeper;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class Boxes {
    public static Parent loaderDefault;
    public static Parent loaderMain;
    public static Parent loaderServer;

    static {
        try {
            loaderMain = new FXMLLoader(). load(StartGateKeeper.class.getResource("admins_console/boxes/main.fxml"));
            loaderDefault = new FXMLLoader().load(StartGateKeeper.class.getResource("admins_console/default.fxml"));
            loaderServer = new FXMLLoader().load(StartGateKeeper.class.getResource("admins_console/boxes/server.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
